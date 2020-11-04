package pl.edu.pjwstk.simulator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.pjwstk.simulator.models.platform.Platform;
import pl.edu.pjwstk.simulator.services.BoardService;

import java.util.List;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board")
    public List<Platform> createBoard() {
        return boardService.createBoard();
    }

    @GetMapping("/board/platform/{stationId}")
    public Platform getPlatformById (@PathVariable int stationId) {
        return boardService.getPlatform(stationId);
    }
}
