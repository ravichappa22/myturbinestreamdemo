package com.my.turbine.stream.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringBootApplication
@EnableTurbineStream
@EnableHystrixDashboard
public class MyturbinestreamdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyturbinestreamdemoApplication.class, args);
	}
	
	/*@RequestMapping("/")
    public String home() {
        return "forward:/turbine.stream";
    }*/
}
