package com.java21;


record Point(int x, int y) {}

enum Color {RED, GREEN, BLUE}

//we can also nest records within records and deconstruct them
record ColoredPoint(Point point, Color color) {}

record RandomPoint(ColoredPoint cp) {}

record Person(String name, int age) {}

public class RecordMain {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        System.out.println(person.name()); // prints "Alice"
        System.out.println(person.age()); // prints 25

        RandomPoint randomPoint = new RandomPoint(new ColoredPoint(new Point(10, 20), Color.RED));
        ColoredPoint coloredPoint = new ColoredPoint(new Point(10, 20), Color.RED);
        System.out.println(coloredPoint.point().x()); // prints 10
        System.out.println(coloredPoint.color()); // prints RED
        System.out.println(randomPoint.cp().point().x());
    }


}