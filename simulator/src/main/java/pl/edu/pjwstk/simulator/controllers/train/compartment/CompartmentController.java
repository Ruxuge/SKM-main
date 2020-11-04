package pl.edu.pjwstk.simulator.controllers.train.compartment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.pjwstk.simulator.models.train.compartment.Compartment;
import pl.edu.pjwstk.simulator.services.train.compartment.CompartmentService;

import java.util.stream.Stream;

@RestController
@RequestMapping("/trains/{trainId}")
public class CompartmentController {

    @Autowired
    private CompartmentService compartmentService;

    @GetMapping("/compartments")
    public Stream<Compartment> getCompartmentsByTrainId(@PathVariable int trainId) {
        return compartmentService.getCompartmentsByTrainId(trainId);
    }

    @GetMapping("/compartments/{compartmentId}")
    public Stream<Compartment> getCompartmentById(@PathVariable int trainId, @PathVariable int compartmentId) {
        return compartmentService.getCompartmentById(trainId, compartmentId);
    }
}
