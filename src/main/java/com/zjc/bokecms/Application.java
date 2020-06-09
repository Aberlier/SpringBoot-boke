package com.zjc.bokecms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Application {
	//启动入口
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}

}
