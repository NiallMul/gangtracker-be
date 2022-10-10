package ie.julianstownlodge.necromundaxpcounterbe.controllers;

import ie.julianstownlodge.necromundaxpcounterbe.model.Fighter;
import ie.julianstownlodge.necromundaxpcounterbe.service.FighterListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/list")
public class FighterListController {
    private final FighterListService fighterListService;

    public FighterListController(FighterListService fighterListService) {
        this.fighterListService = fighterListService;
    }

    @GetMapping(value = "/getList")
    public List<Fighter> getFighterList() {
        return fighterListService.getFighterList();
    }
}
