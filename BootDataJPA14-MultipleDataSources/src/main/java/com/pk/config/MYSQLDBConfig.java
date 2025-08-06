package com.pk.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages="com.pk.repo.promotions",
							entityManagerFactoryRef = "mysqlEMF",
							transactionManagerRef = "mysqlTxMgmr")
public class MYSQLDBConfig {

	@Bean
	@ConfigurationProperties("mysql.datasource")
	public DataSource createMYSQLDs() {
		return DataSourceBuilder.create().build();
	}
	@Bean(name="mysqlEMF")
	public LocalContainerEntityManagerFactoryBean createMYSQLEntityManagerFactoryBean(EntityManagerFactoryBuilder builder) {
	    // Create map object with Hibernate properties
	    Map<String, Object> props = new HashMap<>();
	    props.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
	    props.put("hibernate.hbm2ddl.auto", "update");

	    // Create and return LCEMFB object which makes EMF a Spring bean
	    return builder
	            .dataSource(createMYSQLDs()) // DataSource
	            .packages("com.pk.model.promotions") // Correct method for scanning packages
	            .properties(props) // Hibernate properties
	            .build();
	}

	@Bean(name="mysqlTxMgmr")
	public PlatformTransactionManager createMysqlTxMgmr(@Qualifier("mysqlEMF")
	EntityManagerFactory factory) {
		return new JpaTransactionManager(factory);
	}
	
	
}
