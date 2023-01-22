package com.example.mobilelele.service.model;

import com.example.mobilelele.repositories.ModelRepository;
import com.example.mobilelele.service.init.DataBaseInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelServiceImpl implements ModelService, DataBaseInitService {
    private ModelRepository modelRepository;

    @Autowired
    public ModelServiceImpl(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean isDbInit() {
        return this.modelRepository.count() >0;
    }
}
