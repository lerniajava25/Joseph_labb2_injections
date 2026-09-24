package org.example.labb2_kurs_2;

public class Main {
    public static void main(String[] args) {
        SimpleContainer container = new SimpleContainer();

        WelcomeService welcomeService =
                container.getInstance(WelcomeService.class);

        System.out.println(welcomeService.welcome("Joseph"));
    }
}
