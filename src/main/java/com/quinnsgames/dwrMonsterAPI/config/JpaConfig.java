package com.quinnsgames.dwrMonsterAPI.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
class JpaConfig {

    @Bean
    public DataSource getDataSource() {
        return DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url(getDataSourceUrl())
                .username(System.getenv("MYSQL_DB_USER"))
                .password(System.getenv("MYSQL_DB_USER_PASSWORD"))
                .build();
    }

    private String getDataSourceUrl() {
        return "jdbc:mysql://quinns-flexible-db-server.mysql.database.azure.com:3306/dwr_monster_api?useSSL=true";
    }
}