package com.example.SupplyCore.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

        @Bean
        public OpenAPI supplyCoreOpenAPI() {
                return new OpenAPI()
                        .info(new Info()
                                .title("SupplyCore API Documentation")
                                .description("Dokumentasi API untuk Sistem SupplyCore - Spring Boot 4.0.1")
                                .version("v1.0.0")
                                .license(new License().name("Apache 2.0").url("http://springdoc.org")));
        }
}