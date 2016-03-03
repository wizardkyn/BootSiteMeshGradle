package com.example.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.example.web.config.MySiteMeshFilter;

@SpringBootApplication
public class BootSiteMeshGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSiteMeshGradleApplication.class, args);
	}
	@Bean
	public FilterRegistrationBean siteMeshFilter() {
		FilterRegistrationBean filter = new FilterRegistrationBean();
		filter.setFilter(new MySiteMeshFilter()); 
		return filter;
	}
}
