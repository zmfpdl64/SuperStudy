package snow.day4.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PushExceptionTest {
    public static void main(String[] args) {
        try{
            printFile("src/snow/day4/exception/text.txt");
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    static void printFile(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fs = getFileStream(fileName);
        int i;
        while((i = fs.read())!=-1){
            System.out.write(i);
        }
    }
    static FileInputStream getFileStream(String fileName) throws FileNotFoundException {
        FileInputStream fs = new FileInputStream(fileName);
        return fs;
    }
}
