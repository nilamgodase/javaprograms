package com.bridgelabz.CoreAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig1 {
	@Bean
	public Principal principalBean()
	{
		return new Principal();
	}
	@Bean
	public College2 collegeBean2()
	{
		College2 college2=new College2(principalBean());
		return college2;
	}

}
