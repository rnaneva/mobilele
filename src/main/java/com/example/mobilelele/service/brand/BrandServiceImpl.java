package com.example.mobilelele.service.brand;

import com.example.mobilelele.repositories.BrandRepository;
import com.example.mobilelele.service.init.DataBaseInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService, DataBaseInitService {
    private BrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean isDbInit() {
        return this.brandRepository.count() > 0;
    }
}
