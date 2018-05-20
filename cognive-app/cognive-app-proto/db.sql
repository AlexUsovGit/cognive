create sequence hibernate_sequence start 1 increment 1
create table AddressEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, building varchar(255), city varchar(255), countryCode varchar(255), extraString varchar(255), postCode varchar(255), region varchar(255), room varchar(255), state varchar(255), street varchar(255), primary key (id))
create table BaseAttachmentEntity (kind varchar(31) not null, id int8 not null, createdBy varchar(255), createdOn timestamp, contentType varchar(255), data oid, name varchar(255), ownerId int8, type varchar(255), primary key (id))
create table basic (id int8 not null, createdBy varchar(255), createdOn timestamp, ext jsonb, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, value varchar(255), primary key (id))
create table CustomerEntity (id varchar(255) not null, name varchar(255), primary key (id))
create table dict_cities (code varchar(255) not null, description varchar(255), name varchar(255) not null, countryId varchar(255), primary key (code))
create table dict_countries (code varchar(255) not null, description varchar(255), name varchar(255) not null, primary key (code))
create table DocumentEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, documentIssueDate timestamp, documentNumber varchar(255), documentSeries varchar(255), documentType varchar(255), expirationDate timestamp, issuer varchar(255), issuerCode varchar(255), owner_id int8, primary key (id))
create table EmploymentEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, details varchar(255), from timestamp, position varchar(255), type varchar(255), organization_id int8, primary key (id))
create table IndividualCommonApplicationEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, kind varchar(255), name varchar(255), status varchar(255), type varchar(255), financialStatus varchar(255), relationshipWithBank int4 not null, relationshipWithBankOther varchar(255), reputation varchar(255), sourceOfFounds int4 not null, sourceOfFoundsOther varchar(255), primary key (id))
create table OrganizationEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, name varchar(255), primary key (id))
create table person_phone (person_id int8 not null, phone_id int8 not null)
create table PersonEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, birthCountry varchar(255), birthDate varchar(255), birthPlace varchar(255), citizenshipCountry varchar(255), email varchar(255), firstName varchar(255), lastName varchar(255), middleName varchar(255), socialSecurityNumber varchar(255), taxIdentificationNumber varchar(255), postalAddressId int8, registrationAddressId int8, residenceAddressId int8, primary key (id))
create table PersonRelationshipEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, details varchar(255), grade varchar(255), kind varchar(255), PERSON_FROM_ID int8, PERSON_TO_ID int8, type varchar(255), primary key (id))
create table PhoneNumberEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, number varchar(255), organizationId int8 not null, personId int8 not null, type varchar(255), primary key (id))
alter table BaseAttachmentEntity add constraint FKesokm9arfe56o20r5qt9quxtp foreign key (ownerId) references IndividualCommonApplicationEntity
alter table DocumentEntity add constraint FK336a72wfycepb6ltom2sgelyo foreign key (owner_id) references PersonEntity
alter table EmploymentEntity add constraint FKe6a0nkk6snlnlk9gbsu3pbfr5 foreign key (organization_id) references OrganizationEntity
alter table person_phone add constraint FKms3xvqbh34m7xak9v2pfdlqfp foreign key (phone_id) references PhoneNumberEntity
alter table person_phone add constraint FK99ldens7tf0egjy3lwys7w5ut foreign key (person_id) references PersonEntity
alter table PersonEntity add constraint FKqmxrapv0l0sla69l0e0rk83qv foreign key (postalAddressId) references AddressEntity
alter table PersonEntity add constraint FK9dahonqwtg1alwumol0328oth foreign key (registrationAddressId) references AddressEntity
alter table PersonEntity add constraint FKt0kbcmp2ek4hjptf6ao8asv19 foreign key (residenceAddressId) references AddressEntity
alter table PersonRelationshipEntity add constraint FKswbexv4nuh6dmorcgpuifk4f3 foreign key (PERSON_FROM_ID) references PersonEntity
alter table PersonRelationshipEntity add constraint FKl87unn86bdd83rbi6d79hplgh foreign key (PERSON_TO_ID) references PersonEntity
create sequence hibernate_sequence start 1 increment 1
create table AddressEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, building varchar(255), city varchar(255), countryCode varchar(255), extraString varchar(255), postCode varchar(255), region varchar(255), room varchar(255), state varchar(255), street varchar(255), primary key (id))
create table BaseAttachmentEntity (kind varchar(31) not null, id int8 not null, createdBy varchar(255), createdOn timestamp, contentType varchar(255), data oid, name varchar(255), ownerId int8, type varchar(255), primary key (id))
create table basic (id int8 not null, createdBy varchar(255), createdOn timestamp, ext jsonb, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, value varchar(255), primary key (id))
create table CustomerEntity (id varchar(255) not null, name varchar(255), primary key (id))
create table dict_cities (code varchar(255) not null, description varchar(255), name varchar(255) not null, countryId varchar(255), primary key (code))
create table dict_countries (code varchar(255) not null, description varchar(255), name varchar(255) not null, primary key (code))
create table DocumentEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, documentIssueDate timestamp, documentNumber varchar(255), documentSeries varchar(255), documentType varchar(255), expirationDate timestamp, issuer varchar(255), issuerCode varchar(255), owner_id int8, primary key (id))
create table EmploymentEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, details varchar(255), from timestamp, position varchar(255), type varchar(255), organization_id int8, primary key (id))
create table IndividualCommonApplicationEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, kind varchar(255), name varchar(255), status varchar(255), type varchar(255), financialStatus varchar(255), relationshipWithBank int4 not null, relationshipWithBankOther varchar(255), reputation varchar(255), sourceOfFounds int4 not null, sourceOfFoundsOther varchar(255), primary key (id))
create table OrganizationEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, name varchar(255), primary key (id))
create table person_phone (person_id int8 not null, phone_id int8 not null)
create table PersonEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, birthCountry varchar(255), birthDate varchar(255), birthPlace varchar(255), citizenshipCountry varchar(255), email varchar(255), firstName varchar(255), lastName varchar(255), middleName varchar(255), socialSecurityNumber varchar(255), taxIdentificationNumber varchar(255), postalAddressId int8, registrationAddressId int8, residenceAddressId int8, primary key (id))
create table PersonRelationshipEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, details varchar(255), grade varchar(255), kind varchar(255), PERSON_FROM_ID int8, PERSON_TO_ID int8, type varchar(255), primary key (id))
create table PhoneNumberEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, number varchar(255), organizationId int8 not null, personId int8 not null, type varchar(255), primary key (id))
alter table BaseAttachmentEntity add constraint FKesokm9arfe56o20r5qt9quxtp foreign key (ownerId) references IndividualCommonApplicationEntity
alter table DocumentEntity add constraint FK336a72wfycepb6ltom2sgelyo foreign key (owner_id) references PersonEntity
alter table EmploymentEntity add constraint FKe6a0nkk6snlnlk9gbsu3pbfr5 foreign key (organization_id) references OrganizationEntity
alter table person_phone add constraint FKms3xvqbh34m7xak9v2pfdlqfp foreign key (phone_id) references PhoneNumberEntity
alter table person_phone add constraint FK99ldens7tf0egjy3lwys7w5ut foreign key (person_id) references PersonEntity
alter table PersonEntity add constraint FKqmxrapv0l0sla69l0e0rk83qv foreign key (postalAddressId) references AddressEntity
alter table PersonEntity add constraint FK9dahonqwtg1alwumol0328oth foreign key (registrationAddressId) references AddressEntity
alter table PersonEntity add constraint FKt0kbcmp2ek4hjptf6ao8asv19 foreign key (residenceAddressId) references AddressEntity
alter table PersonRelationshipEntity add constraint FKswbexv4nuh6dmorcgpuifk4f3 foreign key (PERSON_FROM_ID) references PersonEntity
alter table PersonRelationshipEntity add constraint FKl87unn86bdd83rbi6d79hplgh foreign key (PERSON_TO_ID) references PersonEntity
create sequence hibernate_sequence start 1 increment 1
create table AddressEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, building varchar(255), city varchar(255), countryCode varchar(255), extraString varchar(255), postCode varchar(255), region varchar(255), room varchar(255), state varchar(255), street varchar(255), primary key (id))
create table BaseAttachmentEntity (kind varchar(31) not null, id int8 not null, createdBy varchar(255), createdOn timestamp, contentType varchar(255), data oid, name varchar(255), ownerId int8, type varchar(255), primary key (id))
create table basic (id int8 not null, createdBy varchar(255), createdOn timestamp, ext jsonb, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, value varchar(255), primary key (id))
create table CustomerEntity (id varchar(255) not null, name varchar(255), primary key (id))
create table dict_cities (code varchar(255) not null, description varchar(255), name varchar(255) not null, countryId varchar(255), primary key (code))
create table dict_countries (code varchar(255) not null, description varchar(255), name varchar(255) not null, primary key (code))
create table DocumentEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, documentIssueDate timestamp, documentNumber varchar(255), documentSeries varchar(255), documentType varchar(255), expirationDate timestamp, issuer varchar(255), issuerCode varchar(255), owner_id int8, primary key (id))
create table EmploymentEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, details varchar(255), from timestamp, position varchar(255), type varchar(255), organization_id int8, primary key (id))
create table IndividualCommonApplicationEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, kind varchar(255), name varchar(255), status varchar(255), type varchar(255), financialStatus varchar(255), relationshipWithBank int4 not null, relationshipWithBankOther varchar(255), reputation varchar(255), sourceOfFounds int4 not null, sourceOfFoundsOther varchar(255), primary key (id))
create table OrganizationEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, name varchar(255), primary key (id))
create table person_phone (person_id int8 not null, phone_id int8 not null)
create table PersonEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, birthCountry varchar(255), birthDate varchar(255), birthPlace varchar(255), citizenshipCountry varchar(255), email varchar(255), firstName varchar(255), lastName varchar(255), middleName varchar(255), socialSecurityNumber varchar(255), taxIdentificationNumber varchar(255), postalAddressId int8, registrationAddressId int8, residenceAddressId int8, primary key (id))
create table PersonRelationshipEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, details varchar(255), grade varchar(255), kind varchar(255), PERSON_FROM_ID int8, PERSON_TO_ID int8, type varchar(255), primary key (id))
create table PhoneNumberEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, number varchar(255), organizationId int8 not null, personId int8 not null, type varchar(255), primary key (id))
alter table if exists BaseAttachmentEntity add constraint FKesokm9arfe56o20r5qt9quxtp foreign key (ownerId) references IndividualCommonApplicationEntity
alter table if exists DocumentEntity add constraint FK336a72wfycepb6ltom2sgelyo foreign key (owner_id) references PersonEntity
alter table if exists EmploymentEntity add constraint FKe6a0nkk6snlnlk9gbsu3pbfr5 foreign key (organization_id) references OrganizationEntity
alter table if exists person_phone add constraint FKms3xvqbh34m7xak9v2pfdlqfp foreign key (phone_id) references PhoneNumberEntity
alter table if exists person_phone add constraint FK99ldens7tf0egjy3lwys7w5ut foreign key (person_id) references PersonEntity
alter table if exists PersonEntity add constraint FKqmxrapv0l0sla69l0e0rk83qv foreign key (postalAddressId) references AddressEntity
alter table if exists PersonEntity add constraint FK9dahonqwtg1alwumol0328oth foreign key (registrationAddressId) references AddressEntity
alter table if exists PersonEntity add constraint FKt0kbcmp2ek4hjptf6ao8asv19 foreign key (residenceAddressId) references AddressEntity
alter table if exists PersonRelationshipEntity add constraint FKswbexv4nuh6dmorcgpuifk4f3 foreign key (PERSON_FROM_ID) references PersonEntity
alter table if exists PersonRelationshipEntity add constraint FKl87unn86bdd83rbi6d79hplgh foreign key (PERSON_TO_ID) references PersonEntity
create sequence hibernate_sequence start 1 increment 1
create table AddressEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, building varchar(255), city varchar(255), countryCode varchar(255), extraString varchar(255), postCode varchar(255), region varchar(255), room varchar(255), state varchar(255), street varchar(255), primary key (id))
create table BaseAttachmentEntity (kind varchar(31) not null, id int8 not null, createdBy varchar(255), createdOn timestamp, contentType varchar(255), data oid, name varchar(255), ownerId int8, type varchar(255), primary key (id))
create table basic (id int8 not null, createdBy varchar(255), createdOn timestamp, ext jsonb, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, value varchar(255), primary key (id))
create table CustomerEntity (id varchar(255) not null, name varchar(255), primary key (id))
create table dict_cities (code varchar(255) not null, description varchar(255), name varchar(255) not null, countryId varchar(255), primary key (code))
create table dict_countries (code varchar(255) not null, description varchar(255), name varchar(255) not null, primary key (code))
create table DocumentEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, documentIssueDate timestamp, documentNumber varchar(255), documentSeries varchar(255), documentType varchar(255), expirationDate timestamp, issuer varchar(255), issuerCode varchar(255), owner_id int8, primary key (id))
create table EmploymentEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, details varchar(255), from timestamp, position varchar(255), type varchar(255), organization_id int8, primary key (id))
create table IndividualCommonApplicationEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, kind varchar(255), name varchar(255), status varchar(255), type varchar(255), financialStatus varchar(255), relationshipWithBank int4 not null, relationshipWithBankOther varchar(255), reputation varchar(255), sourceOfFounds int4 not null, sourceOfFoundsOther varchar(255), primary key (id))
create table OrganizationEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, name varchar(255), primary key (id))
create table person_phone (person_id int8 not null, phone_id int8 not null)
create table PersonEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, birthCountry varchar(255), birthDate varchar(255), birthPlace varchar(255), citizenshipCountry varchar(255), email varchar(255), firstName varchar(255), lastName varchar(255), middleName varchar(255), socialSecurityNumber varchar(255), taxIdentificationNumber varchar(255), postalAddressId int8, registrationAddressId int8, residenceAddressId int8, primary key (id))
create table PersonRelationshipEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, details varchar(255), grade varchar(255), kind varchar(255), PERSON_FROM_ID int8, PERSON_TO_ID int8, type varchar(255), primary key (id))
create table PhoneNumberEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, number varchar(255), organizationId int8 not null, personId int8 not null, type varchar(255), primary key (id))
alter table if exists BaseAttachmentEntity add constraint FKesokm9arfe56o20r5qt9quxtp foreign key (ownerId) references IndividualCommonApplicationEntity
alter table if exists DocumentEntity add constraint FK336a72wfycepb6ltom2sgelyo foreign key (owner_id) references PersonEntity
alter table if exists EmploymentEntity add constraint FKe6a0nkk6snlnlk9gbsu3pbfr5 foreign key (organization_id) references OrganizationEntity
alter table if exists person_phone add constraint FKms3xvqbh34m7xak9v2pfdlqfp foreign key (phone_id) references PhoneNumberEntity
alter table if exists person_phone add constraint FK99ldens7tf0egjy3lwys7w5ut foreign key (person_id) references PersonEntity
alter table if exists PersonEntity add constraint FKqmxrapv0l0sla69l0e0rk83qv foreign key (postalAddressId) references AddressEntity
alter table if exists PersonEntity add constraint FK9dahonqwtg1alwumol0328oth foreign key (registrationAddressId) references AddressEntity
alter table if exists PersonEntity add constraint FKt0kbcmp2ek4hjptf6ao8asv19 foreign key (residenceAddressId) references AddressEntity
alter table if exists PersonRelationshipEntity add constraint FKswbexv4nuh6dmorcgpuifk4f3 foreign key (PERSON_FROM_ID) references PersonEntity
alter table if exists PersonRelationshipEntity add constraint FKl87unn86bdd83rbi6d79hplgh foreign key (PERSON_TO_ID) references PersonEntity
create sequence hibernate_sequence start 1 increment 1
create table AddressEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, building varchar(255), city varchar(255), countryCode varchar(255), extraString varchar(255), postCode varchar(255), region varchar(255), room varchar(255), state varchar(255), street varchar(255), primary key (id))
create table BaseAttachmentEntity (kind varchar(31) not null, id int8 not null, createdBy varchar(255), createdOn timestamp, contentType varchar(255), data oid, name varchar(255), ownerId int8, type varchar(255), primary key (id))
create table basic (id int8 not null, createdBy varchar(255), createdOn timestamp, ext jsonb, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, value varchar(255), primary key (id))
create table CustomerEntity (id varchar(255) not null, name varchar(255), primary key (id))
create table dict_cities (code varchar(255) not null, description varchar(255), name varchar(255) not null, countryId varchar(255), primary key (code))
create table dict_countries (code varchar(255) not null, description varchar(255), name varchar(255) not null, primary key (code))
create table DocumentEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, documentIssueDate timestamp, documentNumber varchar(255), documentSeries varchar(255), documentType varchar(255), expirationDate timestamp, issuer varchar(255), issuerCode varchar(255), owner_id int8, primary key (id))
create table EmploymentEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, details varchar(255), started timestamp, position varchar(255), type varchar(255), organization_id int8, primary key (id))
create table IndividualCommonApplicationEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, kind varchar(255), name varchar(255), status varchar(255), type varchar(255), financialStatus varchar(255), relationshipWithBank int4 not null, relationshipWithBankOther varchar(255), reputation varchar(255), sourceOfFounds int4 not null, sourceOfFoundsOther varchar(255), primary key (id))
create table OrganizationEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, name varchar(255), primary key (id))
create table person_phone (person_id int8 not null, phone_id int8 not null)
create table PersonEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, birthCountry varchar(255), birthDate varchar(255), birthPlace varchar(255), citizenshipCountry varchar(255), email varchar(255), firstName varchar(255), lastName varchar(255), middleName varchar(255), socialSecurityNumber varchar(255), taxIdentificationNumber varchar(255), postalAddressId int8, registrationAddressId int8, residenceAddressId int8, primary key (id))
create table PersonRelationshipEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, details varchar(255), grade varchar(255), kind varchar(255), PERSON_FROM_ID int8, PERSON_TO_ID int8, type varchar(255), primary key (id))
create table PhoneNumberEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, number varchar(255), organizationId int8 not null, personId int8 not null, type varchar(255), primary key (id))
alter table if exists BaseAttachmentEntity add constraint FKesokm9arfe56o20r5qt9quxtp foreign key (ownerId) references IndividualCommonApplicationEntity
alter table if exists DocumentEntity add constraint FK336a72wfycepb6ltom2sgelyo foreign key (owner_id) references PersonEntity
alter table if exists EmploymentEntity add constraint FKe6a0nkk6snlnlk9gbsu3pbfr5 foreign key (organization_id) references OrganizationEntity
alter table if exists person_phone add constraint FKms3xvqbh34m7xak9v2pfdlqfp foreign key (phone_id) references PhoneNumberEntity
alter table if exists person_phone add constraint FK99ldens7tf0egjy3lwys7w5ut foreign key (person_id) references PersonEntity
alter table if exists PersonEntity add constraint FKqmxrapv0l0sla69l0e0rk83qv foreign key (postalAddressId) references AddressEntity
alter table if exists PersonEntity add constraint FK9dahonqwtg1alwumol0328oth foreign key (registrationAddressId) references AddressEntity
alter table if exists PersonEntity add constraint FKt0kbcmp2ek4hjptf6ao8asv19 foreign key (residenceAddressId) references AddressEntity
alter table if exists PersonRelationshipEntity add constraint FKswbexv4nuh6dmorcgpuifk4f3 foreign key (PERSON_FROM_ID) references PersonEntity
alter table if exists PersonRelationshipEntity add constraint FKl87unn86bdd83rbi6d79hplgh foreign key (PERSON_TO_ID) references PersonEntity
create sequence hibernate_sequence start 1 increment 1
create table AddressEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, building varchar(255), city varchar(255), countryCode varchar(255), extraString varchar(255), postCode varchar(255), region varchar(255), room varchar(255), state varchar(255), street varchar(255), primary key (id))
create table BaseAttachmentEntity (kind varchar(31) not null, id int8 not null, createdBy varchar(255), createdOn timestamp, contentType varchar(255), data oid, name varchar(255), ownerId int8, type varchar(255), primary key (id))
create table basic (id int8 not null, createdBy varchar(255), createdOn timestamp, ext jsonb, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, value varchar(255), primary key (id))
create table CustomerEntity (id varchar(255) not null, name varchar(255), primary key (id))
create table dict_cities (code varchar(255) not null, description varchar(255), name varchar(255) not null, countryId varchar(255), primary key (code))
create table dict_countries (code varchar(255) not null, description varchar(255), name varchar(255) not null, primary key (code))
create table DocumentEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, documentIssueDate timestamp, documentNumber varchar(255), documentSeries varchar(255), documentType varchar(255), expirationDate timestamp, issuer varchar(255), issuerCode varchar(255), owner_id int8, primary key (id))
create table EmploymentEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, details varchar(255), started timestamp, position varchar(255), type varchar(255), organization_id int8, primary key (id))
create table IndividualCommonApplicationEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, kind varchar(255), name varchar(255), status varchar(255), type varchar(255), financialStatus varchar(255), relationshipWithBank int4 not null, relationshipWithBankOther varchar(255), reputation varchar(255), sourceOfFounds int4 not null, sourceOfFoundsOther varchar(255), primary key (id))
create table OrganizationEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, name varchar(255), primary key (id))
create table person_phone (person_id int8 not null, phone_id int8 not null)
create table PersonEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, birthCountry varchar(255), birthDate varchar(255), birthPlace varchar(255), citizenshipCountry varchar(255), email varchar(255), firstName varchar(255), lastName varchar(255), middleName varchar(255), socialSecurityNumber varchar(255), taxIdentificationNumber varchar(255), postalAddressId int8, registrationAddressId int8, residenceAddressId int8, primary key (id))
create table PersonRelationshipEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, details varchar(255), grade varchar(255), kind varchar(255), PERSON_FROM_ID int8, PERSON_TO_ID int8, type varchar(255), primary key (id))
create table PhoneNumberEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, number varchar(255), organizationId int8 not null, personId int8 not null, type varchar(255), primary key (id))
alter table if exists BaseAttachmentEntity add constraint FKesokm9arfe56o20r5qt9quxtp foreign key (ownerId) references IndividualCommonApplicationEntity
alter table if exists DocumentEntity add constraint FK336a72wfycepb6ltom2sgelyo foreign key (owner_id) references PersonEntity
alter table if exists EmploymentEntity add constraint FKe6a0nkk6snlnlk9gbsu3pbfr5 foreign key (organization_id) references OrganizationEntity
alter table if exists person_phone add constraint FKms3xvqbh34m7xak9v2pfdlqfp foreign key (phone_id) references PhoneNumberEntity
alter table if exists person_phone add constraint FK99ldens7tf0egjy3lwys7w5ut foreign key (person_id) references PersonEntity
alter table if exists PersonEntity add constraint FKqmxrapv0l0sla69l0e0rk83qv foreign key (postalAddressId) references AddressEntity
alter table if exists PersonEntity add constraint FK9dahonqwtg1alwumol0328oth foreign key (registrationAddressId) references AddressEntity
alter table if exists PersonEntity add constraint FKt0kbcmp2ek4hjptf6ao8asv19 foreign key (residenceAddressId) references AddressEntity
alter table if exists PersonRelationshipEntity add constraint FKswbexv4nuh6dmorcgpuifk4f3 foreign key (PERSON_FROM_ID) references PersonEntity
alter table if exists PersonRelationshipEntity add constraint FKl87unn86bdd83rbi6d79hplgh foreign key (PERSON_TO_ID) references PersonEntity
create sequence hibernate_sequence start 1 increment 1
create table AddressEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, building varchar(255), city varchar(255), countryCode varchar(255), extraString varchar(255), postCode varchar(255), region varchar(255), room varchar(255), state varchar(255), street varchar(255), primary key (id))
create table BaseAttachmentEntity (kind varchar(31) not null, id int8 not null, createdBy varchar(255), createdOn timestamp, contentType varchar(255), data oid, name varchar(255), ownerId int8, type varchar(255), primary key (id))
create table basic (id int8 not null, createdBy varchar(255), createdOn timestamp, ext jsonb, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, value varchar(255), primary key (id))
create table CustomerEntity (id varchar(255) not null, name varchar(255), primary key (id))
create table dict_cities (code varchar(255) not null, description varchar(255), name varchar(255) not null, countryId varchar(255), primary key (code))
create table dict_countries (code varchar(255) not null, description varchar(255), name varchar(255) not null, primary key (code))
create table DocumentEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, documentIssueDate timestamp, documentNumber varchar(255), documentSeries varchar(255), documentType varchar(255), expirationDate timestamp, issuer varchar(255), issuerCode varchar(255), owner_id int8, primary key (id))
create table EmploymentEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, details varchar(255), started timestamp, position varchar(255), type varchar(255), organization_id int8, primary key (id))
create table IndividualCommonApplicationEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, kind varchar(255), name varchar(255), status varchar(255), type varchar(255), financialStatus varchar(255), relationshipWithBank int4 not null, relationshipWithBankOther varchar(255), reputation varchar(255), sourceOfFounds int4 not null, sourceOfFoundsOther varchar(255), primary key (id))
create table OrganizationEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, name varchar(255), primary key (id))
create table person_phone (person_id int8 not null, phone_id int8 not null)
create table PersonEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, birthCountry varchar(255), birthDate varchar(255), birthPlace varchar(255), citizenshipCountry varchar(255), email varchar(255), firstName varchar(255), lastName varchar(255), middleName varchar(255), socialSecurityNumber varchar(255), taxIdentificationNumber varchar(255), postalAddressId int8, registrationAddressId int8, residenceAddressId int8, primary key (id))
create table PersonRelationshipEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, details varchar(255), grade varchar(255), kind varchar(255), PERSON_FROM_ID int8, PERSON_TO_ID int8, type varchar(255), primary key (id))
create table PhoneNumberEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, number varchar(255), organizationId int8 not null, personId int8 not null, type varchar(255), primary key (id))
alter table if exists BaseAttachmentEntity add constraint FKesokm9arfe56o20r5qt9quxtp foreign key (ownerId) references IndividualCommonApplicationEntity
alter table if exists DocumentEntity add constraint FK336a72wfycepb6ltom2sgelyo foreign key (owner_id) references PersonEntity
alter table if exists EmploymentEntity add constraint FKe6a0nkk6snlnlk9gbsu3pbfr5 foreign key (organization_id) references OrganizationEntity
alter table if exists person_phone add constraint FKms3xvqbh34m7xak9v2pfdlqfp foreign key (phone_id) references PhoneNumberEntity
alter table if exists person_phone add constraint FK99ldens7tf0egjy3lwys7w5ut foreign key (person_id) references PersonEntity
alter table if exists PersonEntity add constraint FKqmxrapv0l0sla69l0e0rk83qv foreign key (postalAddressId) references AddressEntity
alter table if exists PersonEntity add constraint FK9dahonqwtg1alwumol0328oth foreign key (registrationAddressId) references AddressEntity
alter table if exists PersonEntity add constraint FKt0kbcmp2ek4hjptf6ao8asv19 foreign key (residenceAddressId) references AddressEntity
alter table if exists PersonRelationshipEntity add constraint FKswbexv4nuh6dmorcgpuifk4f3 foreign key (PERSON_FROM_ID) references PersonEntity
alter table if exists PersonRelationshipEntity add constraint FKl87unn86bdd83rbi6d79hplgh foreign key (PERSON_TO_ID) references PersonEntity
create sequence hibernate_sequence start 1 increment 1
create table AddressEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, building varchar(255), city varchar(255), countryCode varchar(255), extraString varchar(255), postCode varchar(255), region varchar(255), room varchar(255), state varchar(255), street varchar(255), primary key (id))
create table BaseAttachmentEntity (kind varchar(31) not null, id int8 not null, createdBy varchar(255), createdOn timestamp, contentType varchar(255), data oid, name varchar(255), ownerId int8, type varchar(255), primary key (id))
create table basic (id int8 not null, createdBy varchar(255), createdOn timestamp, ext jsonb, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, value varchar(255), primary key (id))
create table CustomerEntity (id varchar(255) not null, name varchar(255), primary key (id))
create table dict_cities (code varchar(255) not null, description varchar(255), name varchar(255) not null, countryId varchar(255), primary key (code))
create table dict_countries (code varchar(255) not null, description varchar(255), name varchar(255) not null, primary key (code))
create table DocumentEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, documentIssueDate timestamp, documentNumber varchar(255), documentSeries varchar(255), documentType varchar(255), expirationDate timestamp, issuer varchar(255), issuerCode varchar(255), owner_id int8, primary key (id))
create table EmploymentEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, details varchar(255), started timestamp, position varchar(255), type varchar(255), organization_id int8, primary key (id))
create table IndividualCommonApplicationEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, kind varchar(255), name varchar(255), status varchar(255), type varchar(255), financialStatus varchar(255), relationshipWithBank int4 not null, relationshipWithBankOther varchar(255), reputation varchar(255), sourceOfFounds int4 not null, sourceOfFoundsOther varchar(255), primary key (id))
create table OrganizationEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, name varchar(255), primary key (id))
create table person_phone (person_id int8 not null, phone_id int8 not null)
create table PersonEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, modificationComment varchar(255), modifiedBy varchar(255), modifiedOn timestamp, birthCountry varchar(255), birthDate varchar(255), birthPlace varchar(255), citizenshipCountry varchar(255), email varchar(255), firstName varchar(255), lastName varchar(255), middleName varchar(255), socialSecurityNumber varchar(255), taxIdentificationNumber varchar(255), postalAddressId int8, registrationAddressId int8, residenceAddressId int8, primary key (id))
create table PersonRelationshipEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, details varchar(255), grade varchar(255), kind varchar(255), PERSON_FROM_ID int8, PERSON_TO_ID int8, type varchar(255), primary key (id))
create table PhoneNumberEntity (id int8 not null, createdBy varchar(255), createdOn timestamp, number varchar(255), organizationId int8 not null, personId int8 not null, type varchar(255), primary key (id))
alter table if exists BaseAttachmentEntity add constraint FKesokm9arfe56o20r5qt9quxtp foreign key (ownerId) references IndividualCommonApplicationEntity
alter table if exists DocumentEntity add constraint FK336a72wfycepb6ltom2sgelyo foreign key (owner_id) references PersonEntity
alter table if exists EmploymentEntity add constraint FKe6a0nkk6snlnlk9gbsu3pbfr5 foreign key (organization_id) references OrganizationEntity
alter table if exists person_phone add constraint FKms3xvqbh34m7xak9v2pfdlqfp foreign key (phone_id) references PhoneNumberEntity
alter table if exists person_phone add constraint FK99ldens7tf0egjy3lwys7w5ut foreign key (person_id) references PersonEntity
alter table if exists PersonEntity add constraint FKqmxrapv0l0sla69l0e0rk83qv foreign key (postalAddressId) references AddressEntity
alter table if exists PersonEntity add constraint FK9dahonqwtg1alwumol0328oth foreign key (registrationAddressId) references AddressEntity
alter table if exists PersonEntity add constraint FKt0kbcmp2ek4hjptf6ao8asv19 foreign key (residenceAddressId) references AddressEntity
alter table if exists PersonRelationshipEntity add constraint FKswbexv4nuh6dmorcgpuifk4f3 foreign key (PERSON_FROM_ID) references PersonEntity
alter table if exists PersonRelationshipEntity add constraint FKl87unn86bdd83rbi6d79hplgh foreign key (PERSON_TO_ID) references PersonEntity
