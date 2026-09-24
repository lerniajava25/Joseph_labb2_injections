package org.example.labb2_kurs_2;

public class Main {
    public static void main(String[] args) {
        GreetingProvider englishProvider = new EnglishGreetingProvider();
        GreetingProvider swedishProvider = new SwedishGreetingProvider();

        GreetingService standardEnglishGreeting =
                new StandardGreetingService(englishProvider);
        GreetingService enthusiasticSwedishGreeting =
                new EnthusiasticGreetingService(swedishProvider);

        System.out.println(standardEnglishGreeting.greet("Joseph"));
        System.out.println(enthusiasticSwedishGreeting.greet("Joseph"));
    }
}
