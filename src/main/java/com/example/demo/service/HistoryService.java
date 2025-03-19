import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class HistoryService {
    private List<String> calculationHistory = new ArrayList<>();
    
    public void logCalculation(String calculation) {
        calculationHistory.add(calculation);
    }
    
    public List<String> getHistory() {
        return new ArrayList<>(calculationHistory);
    }
    
    public void clearHistory() {
        calculationHistory.clear();
    }
}

