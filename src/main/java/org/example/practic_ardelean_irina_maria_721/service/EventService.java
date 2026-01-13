package org.example.practic_ardelean_irina_maria_721.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.practic_ardelean_irina_maria_721.model.Event;
import org.example.practic_ardelean_irina_maria_721.model.Tribute;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
    private List<Event> events = new ArrayList<>();

    // Load events from events.json file
    public void loadEvents(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        this.events = mapper.readValue(new File(filePath), new TypeReference<List<Event>>() {
        });
    }

    // Number of events loaded
    public int getNumberOfEvents() {
        return events.size();
    }

    // Get all events
    public List<Event> getAllEvents() {
        return events;
    }
}
