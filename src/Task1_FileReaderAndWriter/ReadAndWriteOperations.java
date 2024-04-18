package Task1_FileReaderAndWriter;

import java.io.*;

public class ReadAndWriteOperations {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("cloneText.txt"));) {
            String str;
            int wordCount = 0;
            while ((str = reader.readLine()) != null) {
                String[] words = str.split("\\s+");
                wordCount += words.length;
            }
            writer.write("Number of words in text.txt: " + wordCount);
            System.out.println("Transfer is successful");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
