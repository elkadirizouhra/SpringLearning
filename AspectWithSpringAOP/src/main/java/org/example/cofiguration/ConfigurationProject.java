package org.example.cofiguration;

import org.example.AOP.LoggingAspect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "org.example.services")
@EnableAspectJAutoProxy
public class ConfigurationProject {
    @Bean
    public LoggingAspect aspect(){
        return new LoggingAspect();
    }

}
