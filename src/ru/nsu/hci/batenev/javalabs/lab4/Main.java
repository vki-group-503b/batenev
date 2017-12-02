package ru.nsu.hci.batenev.javalabs.lab4;

public class Main {
    public static void main(String[] args) {
        FileStatistic parc = new FileStatistic("src/ru/nsu/hci/batenev/javalabs/lab4/alice.txt");
        System.out.println("Количество букв: " + parc.letterCount());
        System.out.println("Количество слов: " + parc.wordCount());
        System.out.println("Количество строк: " + parc.lineCount());
        System.out.println("Частотная характеристика:\n" + parc.letterFrequency());
    }
}
