package com.store.pos.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class JdbcTemplateBean {

    private final DataSource dataSource;

    @Autowired
    public JdbcTemplateBean(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Bean
    public JdbcTemplate getTemplate(){
        return new JdbcTemplate(dataSource);
    }
}
