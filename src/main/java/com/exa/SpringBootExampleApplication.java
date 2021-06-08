/*
 * File Name            :    NisGetStockServicesApplication.java com.nis.data
 * Project Title        :    nis-getstock-service
 * Copyright            :    Copyright (c) 2018-2019 NCR Corporation
 * Author               :    dk185222
 * Date					:	 Jun 7, 2021
 *
 */
package com.exa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * NisGetStockServicesApplication.java
 */
@SpringBootApplication
@ComponentScan(basePackages = { "application-base-package", "com.exa" })
public class SpringBootExampleApplication {
	public static void main(final String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}
}
