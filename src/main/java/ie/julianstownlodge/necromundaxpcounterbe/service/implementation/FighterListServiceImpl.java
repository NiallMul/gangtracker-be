package ie.julianstownlodge.necromundaxpcounterbe.service.implementation;

import ie.julianstownlodge.necromundaxpcounterbe.dao.FighterListRepository;
import ie.julianstownlodge.necromundaxpcounterbe.dao.entities.FighterEntity;
import ie.julianstownlodge.necromundaxpcounterbe.mappers.FighterMapper;
import ie.julianstownlodge.necromundaxpcounterbe.model.Fighter;
import ie.julianstownlodge.necromundaxpcounterbe.service.FighterListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class FighterListServiceImpl implements FighterListService {
    private final FighterMapper mapper;
    private final FighterListRepository fighterListRepository;

    @Autowired
    public FighterListServiceImpl(FighterMapper mapper, FighterListRepository fighterListRepository) {
        this.mapper = mapper;
        this.fighterListRepository = fighterListRepository;
    }

    @Override
    public List<Fighter> getFighterList() {
        var fighterList = fighterListRepository.findAll();
        return fighterList.stream().map(mapper::entityToModel).collect(Collectors.toList());
    }
}
