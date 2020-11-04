package pl.edu.pjwstk.simulator.controllers.train;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.edu.pjwstk.simulator.models.train.Train;
import pl.edu.pjwstk.simulator.services.train.TrainService;

import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainController {

    @Autowired
    private TrainService trainService;

    @GetMapping("")
    public List<Train> getTrainsOnBoard() {
        return trainService.getTrainsOnBoard();
    }

    @GetMapping("/{trainId}")
    public Train getTrainById(@PathVariable int trainId) {
        return trainService.getTrainById(trainId);
    }


    @PatchMapping("/forward")
    public List<Train> moveTrainsForward(@RequestBody Train train) {
        return trainService.moveTrainsForward(train);
    }
}
