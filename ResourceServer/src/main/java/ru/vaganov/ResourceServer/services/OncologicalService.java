package ru.vaganov.ResourceServer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vaganov.ResourceServer.models.ParameterResult;
import ru.vaganov.ResourceServer.repositories.OncologicalTestRepo;
import ru.vaganov.ResourceServer.repositories.ParameterResultRepo;

@Service
public class OncologicalService {
    @Autowired
    ParameterResultRepo parameterResultRepo;
    @Autowired
    OncologicalTestRepo oncologicalTestRepo;


    public ParameterResult findResultById(ParameterResult res){
        return parameterResultRepo.save(res);
    }

    public ParameterResult saveResult(ParameterResult result){
        return parameterResultRepo.save(result);
    }

}
