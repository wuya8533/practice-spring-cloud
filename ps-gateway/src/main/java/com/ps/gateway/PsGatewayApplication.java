package com.ps.gateway;

import com.ps.gateway.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class PsGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsGatewayApplication.class, args);
	}

	@Bean
	public TokenFilter tokenFilter(){
		return new TokenFilter();
	}
}
