package com.client.controller.rest;

import org.springframework.web.client.RestTemplate;

public class Template {

	public RestTemplate getRest() {
		return new RestTemplate();
	}

}
