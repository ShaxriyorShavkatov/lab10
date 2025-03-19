import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public String getGreeting() {
        return "Hello, Spring Boot!";
    }
}

