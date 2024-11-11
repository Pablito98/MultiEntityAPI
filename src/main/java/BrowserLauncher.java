import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.net.URI;

@Component
public class BrowserLauncher implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        String url = "http://localhost:8080/index.html";
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(new URI(url));
        } else {
            System.out.println("Apertura automatica del browser non supportata.");
        }
    }
}
