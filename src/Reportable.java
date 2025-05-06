import java.io.IOException;

public interface Reportable {
    void generateReport(String filename) throws IOException;
}
