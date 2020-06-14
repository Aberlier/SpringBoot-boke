package com.zjc.bokecms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.zjc.bokecms.mapper")
public class Application {
	//启动入口
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}

}
