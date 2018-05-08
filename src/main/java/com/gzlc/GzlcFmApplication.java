package com.gzlc;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GzlcFmApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(GzlcFmApplication.class);
		app.setBannerMode(Mode.CONSOLE);// 是否开启banner
		app.run(args);
	}

}
