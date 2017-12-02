package ru.nsu.hci.batenev.javalabs.lab5;

public class Formatter {
    public static String format(String text, Object... place) {
        int c = 0;
        for (Object s : place) {
            text = text.replaceAll("[$][{][" + c + "][}]", s.toString());
            c++;
        }
        return text;
    }
}
