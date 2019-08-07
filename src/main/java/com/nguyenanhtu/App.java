package com.nguyenanhtu;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nguyenanhtu.controller.Bean;
import com.nguyenanhtu.controller.WelcomeController;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(App.class, args);
		Bean bean = appContext.getBean(Bean.class);
		System.out.println(bean.name);
		WelcomeController welcome = appContext.getBean(WelcomeController.class);
		System.out.println(welcome.z);
	}
}


