package org.example.labb2_kurs_2;

import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class MessageFormatter {

    public String format(String name){
        return "Welcome, " + name + "!";
    }
}
