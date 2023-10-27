/**
 * Name: Dingnan Hsu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/03/2023
 * File Name: Subject.java
 * Description: This interface defines the contract for subjects in the Observer design pattern. 
 * Implementing classes can register, remove, or notify observers (such as drivers) of changes or updates.
 */
package edu.bu.met.cs665.subject;

import edu.bu.met.cs665.model.DeliveryRequest;
import edu.bu.met.cs665.observer.Observer;

public interface Subject {

    /**
     * Register an observer to be notified of changes.
     *
     * @param observer The observer to register.
     */
    void registerObserver(Observer observer);

    /**
     * Remove a registered observer, so it no longer receives
     * notifications.
     *
     * @param observer The observer to remove.
     */
    void removeObserver(Observer observer);

    /**
     * Notify all registered observers of a change or update.
     */
    void notifyObservers();

    /**
     * Create a new delivery request and notify all registered observers.
     */
    void newDeliveryRequest(DeliveryRequest request);
}
