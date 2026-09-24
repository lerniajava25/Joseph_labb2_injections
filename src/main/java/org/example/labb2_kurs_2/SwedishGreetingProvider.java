package org.example.labb2_kurs_2;

public class SwedishGreetingProvider implements GreetingProvider {
    @Override
    public String greetingFor(String name) {
        return "Hej, " + name + "!";
    }
}
