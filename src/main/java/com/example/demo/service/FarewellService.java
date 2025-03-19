import org.springframework.stereotype.Service;

@Service
public class FarewellService {
    public String getFarewell() {
        return "Goodbye, Spring Boot!";
    }
}

