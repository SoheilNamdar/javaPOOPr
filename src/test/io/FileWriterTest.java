package io;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWriterTest {
    @Test
    void should_write_in_a_file() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
            fileOutputStream.write("Hello World ! ".getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            System.out.println("The test.txt file doesn't exists.");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
