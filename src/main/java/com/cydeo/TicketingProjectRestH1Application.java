package com.cydeo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TicketingProjectRestH1Application {

    public static void main(String[] args) {
        SpringApplication.run(TicketingProjectRestH1Application.class, args);
    }

    @Bean
    public ModelMapper mapper(){

        return new ModelMapper();
    }

}
