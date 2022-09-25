import static org.junit.jupiter.api.Assertions.*;

class ReadFileUtilTest {

    @org.junit.jupiter.api.Test
    void readFile() {
        String contenido = ReadFileUtil.readFile("C:\\Users\\user\\Desktop\\ProyectiReader.txt");
        assertEquals( "esto es una lineaesto es otra linea", contenido);
    }
}
