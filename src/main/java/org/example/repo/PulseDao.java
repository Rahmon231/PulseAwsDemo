package org.example.repo;

import org.example.domain.Pulse;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class PulseDao {


    public List<Pulse> buildOrders(){
        return Stream.of(
                new Pulse(101, 1.21, 120),
                new Pulse(101, 1.24, 124),
                new Pulse(101, 1.23, 130),
                new Pulse(101, 1.26, 111)

        ).collect(Collectors.toList());
    }
}
