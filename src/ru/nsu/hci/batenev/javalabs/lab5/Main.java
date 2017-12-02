package ru.nsu.hci.batenev.javalabs.lab5;

public class Main {
    public static void main(String[] args) {
        String yourName = "Igor";
        String name = "jarvis";
        String description = "AI from some movie";
        System.out.println(Formatter.format("Hello, ${0}. My name is ${1}.\nI am ${1} - ${2}.",
                yourName,
                name,
                description));
    }
}
