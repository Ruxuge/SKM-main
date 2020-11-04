package pl.edu.pjwstk.simulator.controllers.passenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.pjwstk.simulator.models.passenger.Passenger;
import pl.edu.pjwstk.simulator.services.passenger.PassengerService;

import java.util.List;

@RestController
public class PassengerController {

    @Autowired
    private PassengerService passengerService;


    @GetMapping("")
    public List<Passenger> passengersOnPlatform (@PathVariable int stationId) {
       return passengerService.passengersOnPlatform();
    }
}
