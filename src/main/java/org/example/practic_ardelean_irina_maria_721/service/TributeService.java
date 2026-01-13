package org.example.practic_ardelean_irina_maria_721.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.practic_ardelean_irina_maria_721.model.Tribute;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class TributeService {
    private List<Tribute> tributes = new ArrayList<>();

    // Load data from tributes.json file
    public void loadTributes(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        this.tributes = mapper.readValue(new File(filePath), new TypeReference<List<Tribute>>() {
        });
    }

    // Number of tributes loaded from file
    public int getNumberOfTributes() {
        return tributes.size();
    }

    // Get all tributes
    public List<Tribute> getAllTributes() {
        return tributes;
    }




}
