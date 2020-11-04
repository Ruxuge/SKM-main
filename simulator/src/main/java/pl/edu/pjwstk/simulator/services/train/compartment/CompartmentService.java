package pl.edu.pjwstk.simulator.services.train.compartment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import pl.edu.pjwstk.simulator.MainConfiguration;
import pl.edu.pjwstk.simulator.models.train.compartment.Compartment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
@Configuration
@EnableConfigurationProperties(MainConfiguration.class)
public class CompartmentService {

    @Autowired
    private MainConfiguration mainConfiguration;

    private final List<Compartment> trainsCompartment = new ArrayList<>();

    @Bean
    public void puttingCompartmentsToTrain() {

        for (int trainIdMaster = 0; trainIdMaster < mainConfiguration.getNumberOfTrains(); trainIdMaster++) {
            for (int comIdSlave = 0; comIdSlave <= mainConfiguration.getNumberOfCompartments() - 1; comIdSlave++) {
                new Compartment(comIdSlave + 1, trainIdMaster + 1, 0, mainConfiguration.getCompartmentCapacity());
            }
        }
    }

    public Stream<Compartment> getCompartmentsByTrainId(int id) {
        return trainsCompartment
                .stream()
                .filter(e -> e.getTrainId() == id);
    }

    public Stream<Compartment> getCompartmentById(int trainId, int compartmentId) {
        return trainsCompartment
                .stream()
                .filter(e -> e.getTrainId() == trainId && e.getCompartmentId() == compartmentId);
    }

}
