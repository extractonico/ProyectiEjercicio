import java.io.File;
import java.util.List;

public class TestDrive {
    public TestDrive() {
    }

    public static void main(String[] args) {
        String test = "This is  a test";
        File file = new File("C:\\Users\\user\\Desktop\\ProyectiWriter.txt");
        String path = "C:\\Users\\user\\Desktop\\ProyectiReader.txt";
        String contenido = ReadFileUtil.readFile(path);
        System.out.println(contenido);
        WriteFileUtil.writeFile(file, test);
    }
}
