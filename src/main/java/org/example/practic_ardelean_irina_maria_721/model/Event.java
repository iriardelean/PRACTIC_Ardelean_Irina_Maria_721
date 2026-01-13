package org.example.practic_ardelean_irina_maria_721.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Event {
    @JsonProperty("id")
    private int id;

    @JsonProperty("tributeId")
    private int tributeId;

    @JsonProperty("type")
    private EventType type;

    @JsonProperty("points")
    private int points;

    @JsonProperty("day")
    private int day;

    public Event(int id, int tributeId, EventType type, int points, int day) {
        this.id = id;
        this.tributeId = tributeId;
        this.type = type;
        this.points = points;
        this.day = day;
    }

    // Parameterlosen Konstruktor fur Jackson
    public Event() {}

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", tributeId=" + tributeId +
                ", type=" + type +
                ", points=" + points +
                ", day=" + day +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTributeId() {
        return tributeId;
    }

    public void setTributeId(int tributeId) {
        this.tributeId = tributeId;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
