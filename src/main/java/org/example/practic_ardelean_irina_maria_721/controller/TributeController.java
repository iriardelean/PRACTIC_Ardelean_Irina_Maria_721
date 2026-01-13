package org.example.practic_ardelean_irina_maria_721.controller;

import org.example.practic_ardelean_irina_maria_721.model.Tribute;
import org.example.practic_ardelean_irina_maria_721.service.TributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class TributeController {
    private TributeService service;

    @Autowired
    public TributeController(TributeService service) {
        this.service = service;
    }

    // Aufgabe 1
    public void loadTributes(String filePath) throws IOException {
        service.loadTributes(filePath);
    }

    public int getNumberOfTributes() {
        return service.getNumberOfTributes();
    }

    public List<Tribute> getAllTributes() {
        return service.getAllTributes();
    }

    public void printTributes(List<Tribute> tributes) {
        for (Tribute tribute : tributes) {
            System.out.println(tribute);
        }
    }

    // Aufgabe 2
    public void getAliveTributesByDistrictNumber(int d) {
        List<Tribute> tributes = service.getAliveTributesByDistrictNumber(d);
        for (Tribute tribute : tributes) {
            System.out.println(tribute);
        }
    }

    // Aufgabe 3
    public void getTributesSortedBySkillLevel() {
        List<Tribute> tributes = service.getTributesSortedBySkillLevel();
        for (Tribute tribute : tributes) {
            System.out.println(tribute);
        }
    }

    //Aufgabe 4
    public void writeTributesSortedToFile(String outputFile) throws IOException {
        service.writeTributesSortedToFile(outputFile);
    }
}
