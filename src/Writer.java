import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Writer implements Writable{

    @Override
    public void writeContent(String content) {
        Path path = Paths.get("content.txt");
        try {
            Files.writeString(path, content + System.lineSeparator(),
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
            System.out.println("Saved to " + path.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Could not write to file: " + e.getMessage());
        }
    }
    
}
