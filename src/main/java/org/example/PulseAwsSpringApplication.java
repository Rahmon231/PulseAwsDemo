package org.example;



import org.example.domain.Pulse;
import org.example.repo.PulseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@SpringBootApplication
public class PulseAwsSpringApplication {

    @Autowired
    private PulseDao pulseDao;

    @Bean
    public Supplier<List<Pulse>> pulse() {
        return () -> pulseDao.buildOrders();
    }




    public static void main(String[] args) {
        SpringApplication.run(PulseAwsSpringApplication.class, args);
    }

}
