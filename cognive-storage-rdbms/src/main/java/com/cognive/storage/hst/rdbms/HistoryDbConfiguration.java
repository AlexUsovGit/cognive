package com.cognive.storage.hst.rdbms;

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

//@Configuration
//@ComponentScan({"com.cognive.storage.hst.rdbms.service"})
//@PropertySource({ "classpath:cgn-databases.properties" })
//@EnableTransactionManagement
//@EnableJpaRepositories(
//        entityManagerFactoryRef = "hstDbEntityManagerFactory", 
//        transactionManagerRef = "hstDbTransactionManager", 
//        basePackages = { 
//        		"com.cognive.storage.hst.rdbms.repo" 
//        	}
//        )
public class HistoryDbConfiguration {

	@Bean(name = "hstDataSource")
	@ConfigurationProperties(prefix = "history.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "hstDbEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(
			EntityManagerFactoryBuilder builder,
			@Qualifier("hstDataSource") DataSource dataSource) {
		
		return builder.dataSource(dataSource)
				.packages("com.cognive.storage.hst.rdbms.entity")
				.persistenceUnit("hst")
				.build();
	}

	@Bean(name = "hstDbTransactionManager")
	public PlatformTransactionManager transactionManager(
			@Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory) {
		
		return new JpaTransactionManager(entityManagerFactory);
	}
}
