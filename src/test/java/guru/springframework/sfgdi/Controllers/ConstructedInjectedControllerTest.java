package guru.springframework.sfgdi.Controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructedInjectedControllerTest {
    ConstructedInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructedInjectedController(new GreetingServiceImpl());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}