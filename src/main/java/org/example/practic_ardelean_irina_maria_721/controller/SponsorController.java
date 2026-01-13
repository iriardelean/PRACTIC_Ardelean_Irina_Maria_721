package org.example.practic_ardelean_irina_maria_721.controller;

import org.example.practic_ardelean_irina_maria_721.model.SponsorGift;
import org.example.practic_ardelean_irina_maria_721.service.SponsorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class SponsorController {
    private final SponsorService service;

    @Autowired
    public SponsorController(SponsorService service) {
        this.service = service;
    }

    public void loadGifts(String filePath) throws IOException {
        service.loadGifts(filePath);
    }

    public int getNumberOfGifts() {
        return service.getNumberOfGifts();
    }

    public List<SponsorGift> getAllGifts() {
        return service.getAllGifts();
    }


}
