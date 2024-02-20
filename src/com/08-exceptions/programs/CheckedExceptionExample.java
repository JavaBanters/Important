import java.io.File;
import java.io.FileReader;

class CheckedExceptionExample {
    public static void main(String[] args) {
        File file = new File("file.txt");
        //un-comment this line to see that the compiler notifies you to handle the exception
        //FileReader fr = new FileReader(file);
    }
}