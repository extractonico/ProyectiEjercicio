import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class ReadFileUtil {
    public ReadFileUtil() {
    }

    public static String readFile(String path) {
        String contenido = "";
        StringBuilder s1 = new StringBuilder("");
        try {
            File myFile = new File(path);
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = "";
            while((line = reader.readLine()) != null) {
                s1.append(line);
            }

            reader.close();
        } catch (IOException var6) {
            var6.printStackTrace();
        }
        contenido = s1.toString();

        return contenido;
    }
}