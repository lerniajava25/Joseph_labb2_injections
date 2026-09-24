package org.example.labb2_kurs_2;

public class EnglishGreetingProvider implements GreetingProvider {
    @Override
    public String greetingFor(String name) {
        return "Hello, " + name + "!";
    }
}
