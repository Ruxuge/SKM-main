package pl.edu.pjwstk.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.edu.pjwstk.client.models.train.Train;
import pl.edu.pjwstk.client.models.train.compartment.Compartment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/trains")
public class ClientController {

    @GetMapping("")
    public List<Stream<Train>> getTrainsByClient(@PathVariable int trainId) {
        RestTemplate restTemplate = new RestTemplate();

        String trainURI = "http://simulator:22222/trains";
        Train[] trains = restTemplate.getForObject(trainURI, Train[].class);

        return Arrays.asList(Arrays
                .stream(trains)
                .filter(e -> e.getTrainId() == trainId));
    }

    @GetMapping("/{trainId}")
    public List<Compartment> getTrainById(@PathVariable int trainId) {
        RestTemplate restTemplate = new RestTemplate();

        String compartmentURI = "http://simulator:22222/trains/{trainId}/compartments";
        Compartment[] compartments = restTemplate.getForObject(compartmentURI, Compartment[].class);

        return Arrays.asList(compartments);
    }
}
