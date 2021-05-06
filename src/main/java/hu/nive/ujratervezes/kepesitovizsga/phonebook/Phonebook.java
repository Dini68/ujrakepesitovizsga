package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        checkParamsWithNull(contacts, output);
        Path file = Path.of(output);
        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            for (Map.Entry<String, String> entry: contacts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    private void checkParamsWithNull(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException("contacts or output is null.");
        }
    }
}
