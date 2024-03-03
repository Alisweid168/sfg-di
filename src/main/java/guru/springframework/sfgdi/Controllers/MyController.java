package guru.springframework.sfgdi.Controllers;

import org.springframework.stereotype.Controller;

import java.time.Clock;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Helloworld!!!");

        return "Hi folks";
    }
}
