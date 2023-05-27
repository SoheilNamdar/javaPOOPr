package io;

import org.junit.jupiter.api.Test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static java.lang.System.out;
import static org.assertj.core.api.Assertions.assertThat;

public class FileWriterTest {

    public static final String FILE_NAME = "test.txt";
    public static final String SENTENCE = "Hello World ! ";

    @Test
    void should_write_in_a_file() {
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
             FileInputStream fileInputStream = new FileInputStream(FILE_NAME)) {

            fileOutputStream.write(SENTENCE.getBytes(StandardCharsets.UTF_8));
            //out.println(read);
            int read;
            StringBuilder helloWorld = new StringBuilder();
            while ((read = fileInputStream.read()) != -1) {
                // out.print((char) read);
                helloWorld.append((char) read);
            }
            assertThat((helloWorld.toString()).equals("Hello World !"));

        } catch (IOException e) {
            out.println("There is a issue with test.txt file.");
            e.printStackTrace();
        }
    }
}
