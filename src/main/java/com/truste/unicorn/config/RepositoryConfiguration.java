package com.truste.unicorn.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan(basePackages = "com.truste.unicorn.domain")
@EnableJpaRepositories(basePackages = "com.truste.unicorn.dao")
@EnableTransactionManagement
public class RepositoryConfiguration
{
}
