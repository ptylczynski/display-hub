package cloud.ptl.displayhub.buses;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/bus")
public class BusDisplayController {
    @GetMapping("/")
    public String getBuses() {
        return "bus bus bus";
    }
}
