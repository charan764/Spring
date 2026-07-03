package com.app;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.app")
@PropertySource("classpath:application.properties")
    public class AppConfig {
        @Value("${driver.partner.type}")
        private String driverpartnertype;

        @Bean
        public TransportServices transportServices(){
            TransportServices transportServices = null;
            if(driverpartnertype.equalsIgnoreCase("Rapido")){
                return new Rapido();
            }
            else if(driverpartnertype.equalsIgnoreCase("Uber")){
                return new Uber();
            }

            return transportServices;
        }

}
