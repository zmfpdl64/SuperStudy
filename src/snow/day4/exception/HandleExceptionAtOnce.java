package snow.day4.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HandleExceptionAtOnce {
    public static void main(String[] args) {
        try{
            System.out.println("메소드 시작");
            printFile("src/snow/day4/exception/text.txt");
            printFile("src/snow/day4/exception/text.csv");
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    static void printFile(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fs = getFileStream(fileName);
        System.out.println("printFile");
        int i;
        while((i = fs.read()) != -1){
            System.out.print((char)i);
        }
    }
    static FileInputStream getFileStream(String fileName) throws FileNotFoundException {
        FileInputStream fs = new FileInputStream(fileName);
        System.out.println("getFileStream");
        return fs;
    }
}
