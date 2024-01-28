import java.io.*;

class MultipleCatchBlockExample {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}