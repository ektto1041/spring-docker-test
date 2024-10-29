package com.karpo.spring_docker_test;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MySQLConfiguration {
    @Bean
    public DataSource dataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariConfig.setJdbcUrl("jdbc:mysql://host.docker.internal:3306/spring_docker_test?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8");
        hikariConfig.setUsername("root");
        hikariConfig.setPassword("1234");
        hikariConfig.setMaximumPoolSize(3);

        return new HikariDataSource(hikariConfig);
    }
}




