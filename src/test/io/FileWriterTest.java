package io;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWriterTest {
    @Test
    void should_write_in_a_file() {
        try (FileOutputStream fileOutputStream = new FileOutputStream("test.txt")) {
            fileOutputStream.write("Hello World ! ".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            System.out.println("There is a issue with test.txt file.");
            e.printStackTrace();
        }
    }
}
