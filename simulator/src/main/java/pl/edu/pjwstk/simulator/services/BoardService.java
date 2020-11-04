package pl.edu.pjwstk.simulator.services;

import org.springframework.stereotype.Service;
import pl.edu.pjwstk.simulator.models.platform.Platform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BoardService {

    private final List<Platform> board = new ArrayList<>(Arrays.asList(
            new Platform(1, "Gdańsk Główny"),
            new Platform(2, "Gdańsk Stocznia"),
            new Platform(3, "Gdańsk Politechnika"),
            new Platform(4, "Gdańsk Wrzeszcz"),
            new Platform(5, "Gdańsk Zaspa"),
            new Platform(6, "Gdańsk Przymorze-Uniwer."),
            new Platform(7, "Gdańsk Oliwa"),
            new Platform(8, "Gdańsk Żabianka - Awfis"),

            new Platform(9, "Sopot Wyścigi"),
            new Platform(10, "Sopot"),
            new Platform(11, "Sopot Kamienny Potok"),

            new Platform(12, "Gdynia Orłowo"),
            new Platform(13, "Gdynia Redłowo"),
            new Platform(14, "Gdynia Wzgórze Św.Maksym."),
            new Platform(15, "Gdynia Główna")
    ));


    public List<Platform> createBoard() {
        return board;
    }

    public Platform getPlatform(int id) {
        return board
                .stream()
                .filter(p -> p.getPlatformId() == id)
                .findFirst().get();
    }
}
