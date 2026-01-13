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

    // Aufgabe 1
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

    // Aufgabe 5
    public void computeEventPoints(List<Event> events) {
        for (int i = 0; i < 5 && i < events.size(); i++) {
            Event event = events.get(i);
            int computedPoints = service.computeEventPoints(event);

            System.out.println("Event " + event.getId() +
                    " -> rawPoints = " + event.getPoints() +
                    " -> computedPoints = " + computedPoints);
        }

    }

}
