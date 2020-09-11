package com.jb4dc.qcsystem.webserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created with IntelliJ IDEA.
 * User: zhuangrb
 * Date: 2019/7/7
 * To change this template use File | Settings | File Templates.
 */

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients("com.jb4dc")
@ComponentScan("com.jb4dc")
public class ApplicationQCSystemWebServer {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationQCSystemWebServer.class, args);
    }

}
