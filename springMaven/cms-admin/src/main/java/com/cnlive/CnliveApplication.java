package com.cnlive;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.cnlive.mapper")
public class CnliveApplication {

	public static void main(String[] args) {
		SpringApplication.run(CnliveApplication.class, args);
	}

}
