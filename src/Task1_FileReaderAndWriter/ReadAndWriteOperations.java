package Task1_FileReaderAndWriter;

import java.io.*;

public class ReadAndWriteOperations {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("cloneText.txt"));) {
            String str;
            while ((str = reader.readLine()) != null) {
                writer.write(str);
                writer.newLine();
            }
            System.out.println("Transfer is succesful");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
