package org.example.practic_ardelean_irina_maria_721.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.practic_ardelean_irina_maria_721.model.Tribute;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TributeService {
    private List<Tribute> tributes = new ArrayList<>();

    // Aufgabe 1
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

    // Aufgabe 2
    // get tributes by district number and status "alive"
    public List<Tribute> getAliveTributesByDistrictNumber(int district) {
        return tributes.stream()
                .filter(tribute -> !(tribute.getDistrikt() == 0) && tribute.getDistrikt() == district)
                .filter(tribute -> "alive".equalsIgnoreCase(String.valueOf(tribute.getStatus())))
                .collect(Collectors.toList());
    }

    //Aufgabe 3
    // sort tributes desc by skill level, for ties alphabetically by name
    public List<Tribute> getTributesSortedBySkillLevel() {
        return tributes.stream()
                .sorted((t1, t2) -> {
                    int skillComp = Integer.compare(t2.getSkillLevel(), t1.getSkillLevel());
                    return (skillComp != 0) ? skillComp : t1.getName().compareTo(t2.getName());
                })
                .collect(Collectors.toList());
    }

    // Aufgabe 4
    // print result from aufgabe 3 in file tributes_sorted.txt
    public void writeTributesSortedToFile(String outputFile) throws IOException {
        List<Tribute> sortedTributes = getTributesSortedBySkillLevel();
        try (var writer = new java.io.PrintWriter(outputFile)) {
            for (var tribute : sortedTributes) {
                writer.println(tribute);
            }
        }
    }


}
