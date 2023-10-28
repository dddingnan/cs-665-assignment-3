/**
 * Name: Dingnan Hsu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/28/2023
 * File Name: Main.java
 * Description:
 * The Main class serves as the entry point for the email generation application.
 * Its primary responsibility is to load email templates from a CSV file and then
 * create various customer instances based on these templates. 
 */
package edu.bu.met.cs665;

import edu.bu.met.cs665.exception.InvalidDataException;
import edu.bu.met.cs665.factory.CustomerFactory;
import edu.bu.met.cs665.loader.FileLoader;
import edu.bu.met.cs665.customer.Customer;
import edu.bu.met.cs665.customer.CustomerType;
import edu.bu.met.cs665.email.*;

import java.util.List;

public class Main {

  /**
   * Entry point method for the application. This method initializes the system
   * by:
   * 1. Using the FileLoader class to load email templates from a designated CSV
   * file.
   * 2. Looping through all available customer types as defined in the
   * CustomerType enum.
   * 3. For each customer type, it fetches the corresponding email template.
   * 4. Utilizing the CustomerFactory, it then creates an instance of the
   * respective customer.
   * 5. Finally, it displays the type of the customer and the tailored email
   * message.
   * 
   * @throws InvalidDataException If there's an issue loading data.
   * @throws InterruptedException If there's an interrupted exception.
   */
  public static void main(String[] args) throws InvalidDataException, InterruptedException {
    FileLoader loader = new FileLoader();
    List<EmailTemplate> templates = loader.loadEmailTemplates("src/data/email_templates.csv");
    System.out.println("---------------------------");
    for (CustomerType type : CustomerType.values()) {
      EmailTemplate template = EmailTemplate.getTemplateByType(templates, type);
      Customer customer = CustomerFactory.createCustomer(type, template);
      System.out.println("Customer Type: " + customer.getType());
      System.out.println("Email: " + customer.getEmailMessage());
      System.out.println("---------------------------");
    }

  }
}
