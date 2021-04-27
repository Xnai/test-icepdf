package com.local.testicepdf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TestIcepdfApplication extends SpringBootServletInitializer {


    public TestIcepdfApplication() {
        super();
        this.setRegisterErrorPageFilter(false);
    }

    public static void main(String[] args) {
        SpringApplication.run(TestIcepdfApplication.class, args);
    }

}
