/*
 * File Name            :    Rest.java com.exa.rest
 * Project Title        :    spring-boot-example
 * Copyright            :    Copyright (c) 2018-2019 NCR Corporation
 * Author               :    dk185222
 * Date					:	 Jun 8, 2021
 *
 */
package com.exa.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

/**
 * Rest.java
 */
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class Rest {

	@ApiOperation(value = "getStock", notes = "getStock")
	@RequestMapping(value = "/get-stock", method = RequestMethod.GET)
	public ResponseEntity<String> getStock() throws Exception {

		return new ResponseEntity<String>("Rest call works..!", HttpStatus.OK);
	}
}
