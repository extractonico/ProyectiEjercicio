import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

    public class WriteFileUtil {
        public WriteFileUtil() {
        }

        public static void writeFile(File file, String contenido) {
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException var4) {
                    throw new RuntimeException(var4);
                }
            }

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write(contenido);
                writer.close();
            } catch (IOException var3) {
                var3.printStackTrace();
            }

        }
    }

