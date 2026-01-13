package org.example.practic_ardelean_irina_maria_721;

import org.example.practic_ardelean_irina_maria_721.controller.EventController;
import org.example.practic_ardelean_irina_maria_721.controller.SponsorController;
import org.example.practic_ardelean_irina_maria_721.controller.TributeController;
import org.example.practic_ardelean_irina_maria_721.model.Event;
import org.example.practic_ardelean_irina_maria_721.model.Tribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class PracticArdeleanIrinaMaria721Application implements CommandLineRunner {
    @Autowired
    private EventController eventController;

    @Autowired
    private TributeController tributeController;

    @Autowired
    private SponsorController sponsorController;

    public static void main(String[] args) {
        SpringApplication.run(PracticArdeleanIrinaMaria721Application.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("--- HUNGER GAMES SPRING BOOT APPLICATION ---");

        try {
            // Aufgabe 1
            String eventsFilePath = "events.json";
            String tributesFilePath = "tributes.json";
            String sponsorsFilePath = "gifts.json";

            tributeController.loadTributes(tributesFilePath);
            List<Tribute> tributes = tributeController.getAllTributes();
            System.out.println("Tributes loaded: " + tributeController.getNumberOfTributes());

            eventController.loadEvents(eventsFilePath);
            System.out.println("Events loaded: " + eventController.getNumberOfEvents());

            sponsorController.loadGifts(sponsorsFilePath);
            System.out.println("Gifts loaded: " + sponsorController.getNumberOfGifts());

            tributeController.printTributes(tributes);

            // Aufgabe 2
            System.out.println("Enter district number to get alive tributes:");
            Scanner scanner = new Scanner(System.in);
            int number = Integer.parseInt(scanner.nextLine());
            tributeController.getAliveTributesByDistrictNumber(number);

            // Aufgabe 3
            System.out.println("Tributes sorted by skill level:");
            tributeController.getTributesSortedBySkillLevel();

            // Aufgabe 4
            String outputFile = "tributes_sorted.txt";
            tributeController.writeTributesSortedToFile(outputFile);
            System.out.println("Sorted tributes written to " + outputFile);

            // Aufgabe 5
            System.out.println("Computed points for the first 5 events: ");
            List<Event> events = eventController.getAllEvents();
            eventController.computeEventPoints(events);


        } catch (Exception e) {
            System.err.println("CRITICAL ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
