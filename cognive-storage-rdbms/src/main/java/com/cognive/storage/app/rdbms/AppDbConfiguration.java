package com.cognive.storage.app.rdbms;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.cognive.storage.app.rdbms.service", "com.cognive.storage.app.rdbms.mapper"})
@PropertySource({ "classpath:cgn-databases.properties", "classpath:cgn-app-database.properties" })
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "appDbEntityManagerFactory", 
        transactionManagerRef = "appDbTransactionManager", 
        basePackages = { 
        		"com.cognive.storage.app.rdbms.repo" 
        	}
        )
public class AppDbConfiguration {
	@Primary
	@Bean(name = "appDataSource")
	@ConfigurationProperties(prefix = "app.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Primary
	@Bean(name = "appDbEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(
			EntityManagerFactoryBuilder builder,
			@Qualifier("appDataSource") DataSource dataSource) {
		
		return builder.dataSource(dataSource)
				.packages("com.cognive.storage.app.rdbms.entity")
				.persistenceUnit("app")
				.build();
	}

	@Primary
	@Bean(name = "appDbTransactionManager")
	public PlatformTransactionManager transactionManager(
			@Qualifier("appDbEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
		
		return new JpaTransactionManager(entityManagerFactory);
	}
}
