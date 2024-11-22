package com.java21;

public class PatternCaseLabels {

    public static void main(String[] args) {
        System.out.println(processInputOld("Yes"));
        System.out.println(processInputNew("Yes"));
    }

    static String processInputOld(String input) {
        String output;
        switch (input) {
        case null -> output = "Oops, null";
        case String s -> {
            if ("Yes".equalsIgnoreCase(s)) {
                output = "It's Yes";
            } else if ("No".equalsIgnoreCase(s)) {
                output = "It's No";
            } else {
                output = "Try Again";
            }
        }
        }
        return output;
    }

    static String processInputNew(String input) {
        String output;
        switch (input) {
        case null -> output = "Oops, null";
        case String s when "Yes".equalsIgnoreCase(s) -> output = "It's Yes";
        case String s when "No".equalsIgnoreCase(s) -> output = "It's No";
        case String s -> output = "Try Again";
        }
        return output;
    }
}