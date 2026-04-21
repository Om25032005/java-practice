import java.io.*;

public class ThrowsExample {
    public static void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt"); // file may not exist
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        br.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
