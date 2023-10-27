/**
 * Name: Dingnan Hsu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/03/2023
 * File Name: FileLoader.java
 * Description: The FileLoader class provides utility functions to read driver data from CSV files.
 * Each method is loading data from a provided file and returning a list of corresponding objects.
 */

package edu.bu.met.cs665.loader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.bu.met.cs665.exception.InvalidDataException;
import edu.bu.met.cs665.observer.*;

public class FileLoader {

    public String line = "";
    public String splitBy = ",";

    /**
     * Loads drivers data from a given CSV file.
     * The CSV file format: "<driver_id>,<driver_name>,<is_available>".
     *
     * @param fileName Name of the file to be read.
     * @return A list of Driver objects.
     * @throws FileNotFoundException If the file does not exist.
     * @throws IOException           If an error occurs while reading the file.
     * @throws InvalidDataException  If data in the file is invalid.
     */
    public List<Driver> loadDriverFile(String fileName) throws InvalidDataException {
        List<Driver> drivers = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); // Split the line by commas
                if (data.length < 3) { // Ensure you have ID, name, and availability data
                    System.out.println("Invalid data format: " + line);
                    continue; // Skip this line and continue with the next line
                }
                int id = Integer.parseInt(data[0].trim()); // Parse the ID as an integer
                String name = data[1].trim();
                boolean isAvailable = Boolean.parseBoolean(data[2].trim()); // Convert the string to a boolean

                drivers.add(new Driver(id, name, isAvailable));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            return new ArrayList<>(); // Return an empty list if file not found
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return new ArrayList<>(); // Return an empty list in case of IO errors
        } catch (NumberFormatException e) {
            System.out.println("Error parsing driver ID: " + e.getMessage());
            return new ArrayList<>(); // Return an empty list in case of parsing errors
        }

        return drivers;
    }

}
