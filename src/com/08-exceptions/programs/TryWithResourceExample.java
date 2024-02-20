import java.io.FileReader;
import java.io.IOException;

class TryWithResourceExample {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("file.txt")) {
            fr.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}