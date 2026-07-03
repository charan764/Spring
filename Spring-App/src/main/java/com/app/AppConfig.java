package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;


import java.util.Map;
@Configuration
@ComponentScan("com.app")
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Value("${driver.partner.type}")
    private String driverpartnertype;

    @Autowired
    private Map<String,TransportServices> map;

    @Bean
    @Primary
    public TransportServices transportServices(){
        System.out.println("Spring is showing both available beans in the map:");
        System.out.println(map);
        return map.get(driverpartnertype);
    }


}
