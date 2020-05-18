package hellospringboot.code;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("message","Greetings from Eric");
        return "hello";
    }
}
