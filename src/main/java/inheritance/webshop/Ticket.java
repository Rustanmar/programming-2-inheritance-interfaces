package inheritance.webshop;

import java.time.LocalDateTime;

/**
 * The Ticket class represents a concert or sports event ticket in a webshop.
 * Like the Vehicle class, the Ticket class should inherit the Product class.
 *
 * In real life a ticket would likely have additional properties, such as the
 * event date and time (LocalDateTime). In this exercise, you can decide
 * yourself which properties you want to add. You can also decide yourself how
 * the toString() method should look like.
 *
 * This class will not be autograded, so it is up to you to test it. You can
 * also skip this class and continue with the next part of the exercise if you
 * feel that you have understood the concept of inheritance.
 */
public class Ticket extends Product {

    private LocalDateTime eventTime;
    private String venue;

    public Ticket(String title, String description, double price, LocalDateTime eventTime, String venue){
        super(title, description, price);
        this.eventTime = eventTime;
        this.venue = venue;
    }

    public void setEventTime(LocalDateTime eventTime){
        this.eventTime = eventTime;
    }

    public void setVenue(String venue){
        this.venue = venue;
    }

    public LocalDateTime getEventTime(){
        return eventTime;
    }

    public String getVenue(){
        return venue;
    }

    @Override 
    public String toString(){
        return super.toString() + ", " + eventTime + ", " + venue;
    }

}
