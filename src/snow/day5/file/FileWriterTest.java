package snow.day5.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        String content = "파일에 이 구문을 작성해줘";
        try(FileWriter writer = new FileWriter("src/snow/day5/file/output.txt")){
            writer.write(content);
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }
}
