package com.green.servertoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ServerToServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerToServerApplication.class, args);
    }

}
