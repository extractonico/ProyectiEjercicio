import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class WriteFileUtilTest {

    @Test
    void writeFile() {
        File file = new File("C:\\Users\\user\\Desktop\\ProyectiWriter.txt");
        if (file.exists()){
            file.delete();
        }
        assertTrue(!file.exists());
        WriteFileUtil.writeFile(file,"unit test");
        assertTrue(file.exists());
    }
}