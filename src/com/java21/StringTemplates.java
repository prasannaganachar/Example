package com.java21;


import java.text.MessageFormat;


public class StringTemplates {
    public static void main(String[] args) {
        String name = "John";
        String strFormat1 = "";// STR."Welcome to \{name}";

        int age = 25;

        String greeting = stringTemplate(name, age);
        System.out.println(greeting);

        System.out.println(composeUsingMessageFormatter("cloudy", 78, "F"));

        System.out.println(composeUsingFormatters("Sunny", "78", "F"));

        System.out.println(composeUsingStringBuilder("rain", "78", "F"));

        System.out.println(composeUsingPlus("Bright", "78", "F"));

    }

    private static String stringTemplate(String name, int age) {
       // return STR."Hello, my name is \{name} and I am \{age} years old.";
        return "";
    }

    static String composeUsingFormatters(String feelsLike, String temperature, String unit) {
        return String.format("Today's weather is %s, with a temperature of %s degrees %s",
                feelsLike, temperature, unit);
    }

    static String composeUsingMessageFormatter(String feelsLike, Integer temperature, String unit) {
        return MessageFormat.format("Today''s weather is {0}, with a temperature of {1} degrees {2}",
                feelsLike, temperature, unit);
    }

    static String composeUsingStringBuilder(String feelsLike, String temperature, String unit) {
        return new StringBuilder()
                .append("Today's weather is ")
                .append(feelsLike)
                .append(", with a temperature of ")
                .append(temperature)
                .append(" degrees ")
                .append(unit)
                .toString();
    }

    static String composeUsingPlus(String feelsLike, String temperature, String unit){
        return "Today's weather is " + feelsLike +
                ", with a temperature of " + temperature + " degrees " + unit;
    }
}
