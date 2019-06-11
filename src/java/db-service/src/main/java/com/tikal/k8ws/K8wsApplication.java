package com.tikal.k8ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class K8wsApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8wsApplication.class, args);
    }

    @PostConstruct
    public void postLoad(){
        System.out.println("env = " +env.getProperty("MYSQL_HOST"));
        System.out.println("env = " +env.getProperty("MYSQL_USER"));
    }

    @Autowired
    private Environment env;
}
