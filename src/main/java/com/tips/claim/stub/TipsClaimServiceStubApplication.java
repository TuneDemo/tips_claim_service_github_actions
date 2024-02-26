package com.tips.claim.stub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="TIPS Middleware Endpoints"))
public class TipsClaimServiceStubApplication {

	public static void main(String[] args) {
		SpringApplication.run(TipsClaimServiceStubApplication.class, args);
	}

}
