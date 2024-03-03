package guru.springframework.sfgdi.Controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class ConstructedInjectedController {
    private final GreetingService greetingService;

    public ConstructedInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
