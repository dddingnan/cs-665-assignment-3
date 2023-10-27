/**
 * Name: Dingnan Hsu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/03/2023
 * File Name: Main.java
 * Description: The main driver class of the application. It simulates the functionality of a delivery request system
 * where retailers can send out delivery requests to drivers. This application utilizes the Observer design pattern
 * to notify drivers of new delivery requests.
 */
package edu.bu.met.cs665;

import edu.bu.met.cs665.observer.*;
import edu.bu.met.cs665.subject.*;
import edu.bu.met.cs665.exception.InvalidDataException;
import edu.bu.met.cs665.loader.FileLoader;
import edu.bu.met.cs665.model.*;

import java.util.List;

public class Main {

  /**
   * Entry point method for the application. This method initializes the system
   * by:
   * 1. Loading driver details from a CSV file.
   * 2. Registering the drivers as observers to a shop.
   * 3. Broadcasting a delivery request to the drivers.
   * 4. Modifying the list of drivers.
   * 5. Broadcasting another delivery request.
   * 
   * @param args The command line arguments.
   * @throws InvalidDataException If there's an issue loading data.
   * @throws InterruptedException If there's an interrupted exception.
   */
  public static void main(String[] args) throws InvalidDataException, InterruptedException {
    Shop shop = new Shop();
    FileLoader loader = new FileLoader();
    List<Driver> drivers = loader.loadDriverFile("src/data/driver.csv");

    for (Driver driver : drivers) {
      shop.registerObserver(driver);
    }

    printOrderHeader();
    DeliveryRequest request1 = new DeliveryRequest(
        "Deliver Electronics",
        "Laptop Model XYZ",
        "123 Tech Street, Downtown",
        "456 Electronics Avenue, City Center",
        "John Doe",
        "555-1234");
    shop.newDeliveryRequest(request1);

    // Remove the last driver from the list of drivers
    Driver lastDriver = drivers.remove(drivers.size() - 1);
    shop.removeObserver(lastDriver);
    System.out.println("Removed the last driver: " + lastDriver.getName());
    System.out.println("--------------------------------------------------------");

    printOrderHeader();
    DeliveryRequest request2 = new DeliveryRequest(
        "Deliver Groceries",
        "Assorted fruits and vegetables",
        "789 Green Lane, Suburbia",
        "101 Fresh Market, Main Street",
        "Jane Smith",
        "555-5678");
    shop.newDeliveryRequest(request2);

    System.out.println("---------------------------END--------------------------");
  }

  /**
   * Utility function to print the order request header.
   */
  private static void printOrderHeader() {
    System.out.println("********************************************************");
    System.out.println("********************************************************");
    System.out.println("New Order Request: ");
    System.out.println("********************************************************");
    System.out.println("********************************************************");
  }
}
