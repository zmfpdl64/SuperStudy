package naver_webtoon.design_pattern.singleton;

import java.io.FileWriter;

public class FileWriterSingleton {
    private static FileWriterSingleton instance;
    private FileWriter fileWriter;

    public FileWriterSingleton() {
        try{
            this.fileWriter = new FileWriter("src/naver_webtoon/design_pattern/file.txt");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static FileWriterSingleton getInstance() {
        if(instance == null) {
            instance = new FileWriterSingleton();
        }
        return instance;
    }

    public void writeToFile(String message) {
        try{
            fileWriter.write(message + "\n");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
