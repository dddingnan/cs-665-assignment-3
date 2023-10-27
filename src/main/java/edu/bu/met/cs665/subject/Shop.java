/**
 * Name: Dingnan Hsu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/03/2023
 * File Name: Shop.java
 * Description: The Shop class represents a retail shop or store. It acts as a subject in the Observer design pattern.
 * When a new delivery request is created at the shop, all registered and available drivers (observers) are notified.
 */
package edu.bu.met.cs665.subject;

import java.util.ArrayList;
import java.util.List;
import edu.bu.met.cs665.observer.Observer;
import edu.bu.met.cs665.model.DeliveryRequest;

public class Shop implements Subject {

    private List<Observer> observers;
    private DeliveryRequest deliveryRequest;

    /**
     * Default constructor initializes the list of observers.
     */
    public Shop() {
        observers = new ArrayList<>();
    }

    /**
     * Register a new observer to be notified of delivery requests.
     * 
     * @param observer The observer (driver) to be added.
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Remove a registered observer so it no longer receives
     * notifications.
     *
     * @param observer The observer (driver) to be removed.
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notify all registered and available observers of the latest delivery request.
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            if (observer.isAvailable()) {
                observer.update(deliveryRequest);
            }
        }
    }

    /**
     * Create a new delivery request and notify all registered observers.
     * 
     * @param request The new delivery request.
     */
    public void newDeliveryRequest(DeliveryRequest request) {
        this.deliveryRequest = request;
        notifyObservers();
    }
}
