package com.bexpe.config;

import com.bexpe.api.ICasserole;
import com.bexpe.api.ICook;
import com.bexpe.aspects.CasseroleAspect;
import com.bexpe.aspects.Comunication;
import com.bexpe.aspects.WarehouseControl;
import com.bexpe.impl.CasseroleImpl;
import com.bexpe.impl.Cook;
import com.bexpe.impl.CooksHelper;
import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableAspectJAutoProxy //niezbedna adnotacja przy aspektach musimy o niej pamietac
public class AppConfig {

    @Bean
    public ICasserole casseroleInterface() {
        return new CasseroleImpl();
    }

    @Bean
    public CasseroleAspect casseroleAspect(){
        return new CasseroleAspect();
    }

    @Bean
    @Qualifier("cook")
    public ICook cook() {
        return new Cook();
    }

    @Bean
    @Qualifier("cooks_helper")
    public ICook cooksHelper() {
        return new CooksHelper();
    }

    @Bean
    public Comunication comunication() {
        return new Comunication();
    }

    @Bean
    public WarehouseControl warehouseControl() {
        return new WarehouseControl();
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan(
                "com.baeldung.hibernate.bootstrap.model");
        sessionFactory.setHibernateProperties(hibernateProperties());

        return sessionFactory;
    }

    @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:db;DB_CLOSE_DELAY=-1");
        dataSource.setUsername("sa");
        dataSource.setPassword("sa");

        return dataSource;
    }

    @Bean
    public PlatformTransactionManager hibernateTransactionManager() {
        HibernateTransactionManager transactionManager
                = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());
        return transactionManager;
    }

    private final Properties hibernateProperties() {
        Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty(
                "hibernate.hbm2ddl.auto", "create-drop");
        hibernateProperties.setProperty(
                "hibernate.dialect", "org.hibernate.dialect.H2Dialect");

        return hibernateProperties;
    }
}
