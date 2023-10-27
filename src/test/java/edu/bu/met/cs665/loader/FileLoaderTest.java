package edu.bu.met.cs665.loader;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import edu.bu.met.cs665.exception.*;
import edu.bu.met.cs665.observer.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class FileLoaderTest {

    private FileLoader fileLoader;

    @Before
    public void setUp() {
        fileLoader = new FileLoader();
    }

    @Test
    public void testLoadDriverFileSuccess() throws FileNotFoundException, InvalidDataException, IOException {
        // Provide a path to a known existing file for this test
        String filePath = "src/data/driver.csv";

        List<Driver> drivers = fileLoader.loadDriverFile(filePath);

        // Assert that the list is not null and not empty
        assertNotNull(drivers);
        assertFalse(drivers.isEmpty());
    }

    @Test
    public void testLoadDriverFileFailure() throws FileNotFoundException,
            InvalidDataException, IOException {
        // Provide a path to a non-existing file for this test
        String filePath = "src/data/abc.csv";

        List<Driver> drivers = fileLoader.loadDriverFile(filePath);

        // Assert that the list is either null or empty
        assertTrue(drivers == null || drivers.isEmpty());
    }
}
