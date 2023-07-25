package snow.day5.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileOutputStreamTest {
    public static void main(String[] args) {
         String content = "this is content한글";

         try(FileOutputStream writer = new FileOutputStream("src/snow/day5/file/stream_output.txt");
             OutputStreamWriter ioWriter = new OutputStreamWriter(System.out);
         ){
             ioWriter.write(content.toCharArray());
             byte[] bytes = content.getBytes();
             writer.write(bytes);
         } catch (IOException e) {
             e.printStackTrace();
         }
    }
}
