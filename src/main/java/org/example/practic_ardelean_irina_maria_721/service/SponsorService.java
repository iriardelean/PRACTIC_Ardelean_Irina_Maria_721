package org.example.practic_ardelean_irina_maria_721.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.practic_ardelean_irina_maria_721.model.SponsorGift;
import org.example.practic_ardelean_irina_maria_721.model.Tribute;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class SponsorService {
    private List<SponsorGift> gifts = new ArrayList<>();

    // Load gift from gifts.json
    public void loadGifts(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        this.gifts = mapper.readValue(new File(filePath), new TypeReference<List<SponsorGift>>() {
        });
    }

    // Number of gifts loaded
    public int getNumberOfGifts() {
        return gifts.size();
    }

    // Get all gifts
    public List<SponsorGift> getAllGifts() {
        return gifts;
    }
}
