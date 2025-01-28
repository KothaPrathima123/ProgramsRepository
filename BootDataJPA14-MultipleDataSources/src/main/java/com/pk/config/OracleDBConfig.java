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
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@EnableTransactionManagement
@Configuration
@EnableJpaRepositories(basePackages="com.pk.repo.prod",entityManagerFactoryRef = "oracleEMF",transactionManagerRef = "oracleTxMgmr")
public class OracleDBConfig {
@Bean
@ConfigurationProperties(prefix="oracle.datasource")//for bulk injection from properties file prefix must match
@Primary
	public DataSource createOracleDs() {
	return DataSourceBuilder.create().build();//creates Oracle ds as spring bean pointing to oracle jdbc con pool 	
	}
@Bean(name="oracleEMF")
@Primary
//LCEMFB is predefinrd class
public LocalContainerEntityManagerFactoryBean createOracleEntityManager(EntityManagerFactoryBuilder builder)//EMFB is autocnfiguration obj
{
	//craete map obj having hibernate properties
	Map<String, Object> props=new HashMap();
	props.put("hbernate.dielect", "org.hiberante.dialect.Oracle10gdialect");
	props.put("hibernate.hb2ddl.auto","update");
	//create and reurn LocalContainerEMF bean class obj which makesEMF as the spring bean
	return builder.dataSource(createOracleDs())//datasource
			.packages("com.pk.model.prod")//model cls pkg
			.properties(props)//hibernate properties
			.build();
}
@Bean(name="oracleTxMgmr")
@Primary//to container to ue our txmgmr obj not the txmgmr obj givven by sppring boots autoconfiguration 
public PlatformTransactionManager createOracleTxMgmr(@Qualifier("oracleEMF")
															EntityManagerFactory factory) {
	return new JpaTransactionManager(factory);
}

}
