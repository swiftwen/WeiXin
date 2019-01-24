package com.aitravelba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Launcher */
@SpringBootApplication
@MapperScan("com.aitravelba.orm")
public class AppLauncher{

  public static void main(String[] args) {
    System.out.println("Hello, JavaPoet!");
    SpringApplication.run(AppLauncher.class, args);
  }
}
