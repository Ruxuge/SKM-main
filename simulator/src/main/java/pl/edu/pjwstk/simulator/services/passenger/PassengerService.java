package pl.edu.pjwstk.simulator.services.passenger;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import pl.edu.pjwstk.simulator.models.passenger.Passenger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class PassengerService {

    private final List<Passenger> passengers = new ArrayList<>();

    Random random = new Random();
    private final int passengersOnPlatform = random.nextInt(8 - 2) + 2;

    @Bean
    public void addPassengersToPlatform() {
        for (int i = 0; i <= passengersOnPlatform - 1; i++) {

        }
    }

    public List<Passenger> passengersOnPlatform() {
        return passengers;
    }
}