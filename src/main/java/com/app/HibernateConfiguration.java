package com.app;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class HibernateConfiguration {

	@Value("${hibernate.dialect}")
	private String DIALECT;

	@Value("${db.driver}")
	private String DRIVER;

	@Value("${hibernate.hbm2ddl.auto}")
	private String HBM2DDL_AUTO;

	@Value("${entitymanager.packagesToScan}")
	private String PACKAGES_TO_SCAN;

	@Value("${db.password}")
	private String PASSWORD;

	@Value("${hibernate.show_sql}")
	private String SHOW_SQL;

	@Value("${db.url}")
	private String URL;

	@Value("${db.username}")
	private String USERNAME;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(DRIVER);
		dataSource.setUrl(URL);
		System.out.println(URL);
		System.out.println(USERNAME);
		dataSource.setUsername(USERNAME);
		dataSource.setPassword(PASSWORD);
		return dataSource;
	}

	/*
	 * @Bean(name = "multipartResolver") public CommonsMultipartResolver
	 * multipartResolver() { CommonsMultipartResolver multipartResolver = new
	 * CommonsMultipartResolver();
	 * multipartResolver.setMaxUploadSize(1000000000); return multipartResolver;
	 * }
	 */
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(PACKAGES_TO_SCAN);
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.dialect", DIALECT);
		hibernateProperties.put("hibernate.show_sql", SHOW_SQL);
		hibernateProperties.put("hibernate.hbm2ddl.auto", HBM2DDL_AUTO);
		sessionFactory.setHibernateProperties(hibernateProperties);

		return sessionFactory;
	}

	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}

}
