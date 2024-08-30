package com.example.purchaseproject.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ConfigProject {
    @Value("${custom.datasource.url}")
    private String dataSourceUrl;
    @Value("${custom.datasource.username}")
    private String username;
    @Value("${custom.datasource.password}")
    private String password;
    @Bean
    public DataSource dataSource(){
        HikariDataSource dataSource=new HikariDataSource();
        dataSource.setJdbcUrl(dataSourceUrl);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
