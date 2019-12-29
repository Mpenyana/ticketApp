package com.vince.ticketapp;

public class Event {
    private String eventName;
    private String eventPrice;
    private String eventDate;
    private int eventPoster;

    public Event(String eventName, String eventPrice, String eventDate, int eventPoster) {
        this.eventName = eventName;
        this.eventPrice = eventPrice;
        this.eventDate = eventDate;
        this.eventPoster = eventPoster;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventPrice() {
        return eventPrice;
    }

    public void setEventPrice(String eventPrice) {
        this.eventPrice = eventPrice;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public int getEventPoster() {
        return eventPoster;
    }

    public void setEventPoster(int eventPoster) {
        this.eventPoster = eventPoster;
    }
}
