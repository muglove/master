package com.muglove.projcet.muglove.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Slf4j
@Configuration
public class DBConfig {

    @Bean(name = "DataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource DataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "sessionFactory")
    @Primary
    public SqlSessionFactory sessionFactory(@Qualifier("DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/*.xml"));
        sqlSessionFactoryBean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:/mapper/config/mybatisConfig.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "transactionManager")
    @Primary
    public DataSourceTransactionManager transactionManager(@Qualifier("DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "sessionTemplate")
    @Primary
    public SqlSessionTemplate sessionTemplate(@Qualifier("sessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }


}
