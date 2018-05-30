package com.mcipay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ImportResource(locations={"classpath:application-infrastructure.xml"})
public class BootstrapAdmin {

    public static void main(String[] args) {
        SpringApplication.run(BootstrapAdmin.class, args);
    }

}
