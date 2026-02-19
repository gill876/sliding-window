package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * 
     * @param reference_string
     * @return
     */
    public static String[] decrementingSlidingWindow(String reference_string) {
        int reference_string_length = reference_string.length();
        int window_start = 0;
        int window_end = reference_string.length();
        int window_length = window_end - window_start;

        ArrayList<String> output = new ArrayList<>();

        while (window_length > 1) {
            while (reference_string_length >= window_start + window_length) {
                String window_value = reference_string.substring(window_start, window_start + window_length);

                output.add(window_value);

                window_start++;
            }
            window_length--;
            window_start = 0;
        }

        return output.toArray(new String[0]);
    }
}
