package com.example.mobilelele.service.offer;

import com.example.mobilelele.repositories.OfferRepository;
import com.example.mobilelele.service.init.DataBaseInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfferServiceImpl implements OfferService, DataBaseInitService {
    private OfferRepository offerRepository;

    @Autowired
    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean isDbInit() {
        return offerRepository.count() > 0;
    }
}
