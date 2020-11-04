package pl.edu.pjwstk.simulator.services.train;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import pl.edu.pjwstk.simulator.MainConfiguration;
import pl.edu.pjwstk.simulator.models.train.Train;

import java.util.ArrayList;
import java.util.List;

@Service
@Configuration
@EnableConfigurationProperties(MainConfiguration.class)
public class TrainService {

    @Autowired
    private MainConfiguration mainConfiguration;

    private final List<Train> trainsOnBoard = new ArrayList<>();

    @Bean
    public void puttingTrains() {
        for (int trainId = 0; trainId < mainConfiguration.getNumberOfTrains(); trainId++) {
            new Train(trainId + 1, trainId + 1, mainConfiguration.getNumberOfCompartments());
        }
    }

    public List<Train> getTrainsOnBoard() { return trainsOnBoard; }

    public Train getTrainById(int id) {
        return trainsOnBoard
                .stream()
                .filter(p -> p.getTrainId() == id)
                .findFirst().get();
    }


    public List<Train> moveTrainsForward(Train train) {
        int step = train.getPosition() + 1;

        for (int i = 0; i < trainsOnBoard.size(); i++) {
            train = trainsOnBoard.get(i);
            train.setPosition(step);
            trainsOnBoard.set(i, train);
        }

        return trainsOnBoard;
    }
}
