/**
 * Name: Dingnan Hsu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/03/2023
 * File Name: Observer.java
 * Description: The Observer interface represents entities that can observe subjects (like shops) for changes.
 */
package edu.bu.met.cs665.observer;

import edu.bu.met.cs665.model.DeliveryRequest;

public interface Observer {

    /**
     * Update method to notify the observer of a new delivery request.
     *
     * @param deliveryRequest The delivery request that the observer is being
     *                        notified about.
     */
    void update(DeliveryRequest deliveryRequest);

    /**
     * Checks if the observer (driver) is available for deliveries.
     *
     * @return true if the observer is available, false otherwise.
     */
    boolean isAvailable();

    /**
     * Sets the availability of the observer (driver).
     *
     * @param availability true if setting the observer to be available, false
     *                     otherwise.
     */
    void setAvailability(boolean availability);

    /**
     * Retrieves the name or identifier of the observer.
     *
     * @return The name of the observer.
     */
    String getName();
}
