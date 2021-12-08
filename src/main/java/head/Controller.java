package head;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/abc")
    public String abc(@RequestParam String name)
    {
        return name + " is good!";
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello()
    {
        return ResponseEntity.ok("Hello to you too!");
    }
}
