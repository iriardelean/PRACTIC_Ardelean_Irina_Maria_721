package org.example.practic_ardelean_irina_maria_721.controller;

import org.example.practic_ardelean_irina_maria_721.model.Event;
import org.example.practic_ardelean_irina_maria_721.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class EventController {
    private EventService service;

    @Autowired
    public EventController(EventService service) {
        this.service = service;
    }

    public void loadEvents(String filePath) throws IOException {
        service.loadEvents(filePath);
    }

    public int getNumberOfEvents() {
        return service.getNumberOfEvents();
    }

    public List<Event> getAllEvents() {
        return service.getAllEvents();
    }

}
