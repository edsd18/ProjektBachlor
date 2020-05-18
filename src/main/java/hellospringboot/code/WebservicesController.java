package hellospringboot.code;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebservicesController {

    @GetMapping("/baum.rz-housing.tu-clausthal.de/trip-api/v1/trips")
    public String sayRest()
    {
        return "Great ,let's take a Rest with Spring Boot";
    }


}
