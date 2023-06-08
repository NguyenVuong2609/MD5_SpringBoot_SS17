package vuong.nguyen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JV10Controller {
    @GetMapping("/jv10")
    public String jv10(){
        return "jv10";
    }
}