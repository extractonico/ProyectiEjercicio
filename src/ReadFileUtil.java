import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
    public ReadFileUtil() {
    }

    public static List<String> readFile(String path) {
        List<String> contenido = new ArrayList();

        try {
            File myFile = new File(path);
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = "";

            while((line = reader.readLine()) != null) {
                contenido.add(line);
            }

            reader.close();
        } catch (IOException var6) {
            var6.printStackTrace();
        }

        return contenido;
    }
}