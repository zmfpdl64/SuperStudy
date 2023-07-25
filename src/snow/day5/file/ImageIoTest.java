package snow.day5.file;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class ImageIoTest {
    public static void main(String[] args) {
        String filePath = "src/snow/day5/file/output.txt";
        try{
            BufferedImage image = ImageIO.read(new File(filePath));

            ImageIO.write(image, "png",new File("src/snow/day5/file/output2.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
