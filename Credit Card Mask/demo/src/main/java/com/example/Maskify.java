package com.example;

public class Maskify {
    public static String maskify(String str) {
        int mask = str.length() - 4;
        if (mask <= 0) {
            return str;
        }
        return "#".repeat(mask) + str.substring(mask);
    }
}
