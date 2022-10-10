package ie.julianstownlodge.necromundaxpcounterbe.controllers;

import ie.julianstownlodge.necromundaxpcounterbe.model.Fighter;
import ie.julianstownlodge.necromundaxpcounterbe.service.FighterListService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/saveList")
    public void saveList(@RequestBody List<Fighter> newFighterList) {
        fighterListService.saveFighterList(newFighterList);
    }
}
