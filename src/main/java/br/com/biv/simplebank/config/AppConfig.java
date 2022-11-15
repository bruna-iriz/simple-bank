package br.com.biv.simplebank.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.Connection;

@Slf4j
public class AppConfig {

    @Bean
    public ApplicationRunner runner(DataSource dataSource) {

        return args -> {
            Connection connection = dataSource.getConnection();
        };
    }
}
