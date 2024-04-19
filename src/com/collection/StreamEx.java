package com.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamEx {

    public static void main(String[] args) {

        System.out.println("Stream Examle");

        List<Integer> nums = Arrays.asList(2,5,2,5,8,3,6,9,1);

        nums.stream().forEach(a-> System.out.println(a));

        //**************INTERMEDIATE FUNCTION ******************
        /**
         * FILTER
         * MAP
         * SORTED
         * FLATMAP
         */
        Predicate<Integer> prd = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n > 4;
            }
        };

        System.out.println("********Filter record*****");
        nums.stream().filter(prd).forEach(System.out::println);

        System.out.println("********Map*****");

        Function<Integer,Integer> func = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n) {
                return n*2;
            }
        };
        nums.stream().map(n-> n *2).forEach(System.out::println);


        System.out.println("********FLAT Map*****");

        Function<Integer,Integer> func2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n) {
                return n*2;
            }
        };
       // nums.stream().flatMap(n-> n *2).forEach(System.out::println);

        //**************REDUCE FUNCTION ******************
        /**
         * REDUCE
         * MIN
         * MAX
         * COUNT
         */
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return 01 > 02? 0:1;
            }
        };
        Optional<Integer> maxIn = nums.stream().max(Integer::compare);
        Optional<Integer> minIn = nums.stream().min(Double::compare);
        System.out.println("Max Number:"+ maxIn.get());

        long count1 = nums.stream().count();
        System.out.println("Number of element:"+ count1);

        Stream<Integer> ditnCount = nums.stream().distinct();

        ditnCount.forEach(System.out::println);


        System.out.println("********************COUNT METHOD************************");
        Integer[] intArray = {1, 2, 3, 4, 5};

        // Creating a List from an array of elements
        // using Arrays.asList() method
        List<Integer> list = Arrays.asList(intArray);

        // Collecting all elements of the list into a new
        // list using collect() method
        List<Integer> evenNumbersList = list.stream()
                .filter(i -> i%2 == 0)
                .collect(toList());
        System.out.println("Fnd the even Number:" +evenNumbersList);

        // finding the sum of all the values
        // in the stream
        Integer sum = list.stream()
                .collect(summingInt(i -> i));
        System.out.println("Fnd the Sum:" +sum);

        // finding the maximum of all the values
        // in the stream
        Integer max = list.stream()
                .collect(maxBy(Integer::compare)).get();
        System.out.println("Fnd the Max:" +max);

        // finding the minimum of all the values
        // in the stream
        Integer min = list.stream()
                .collect(minBy(Integer::compare)).get();
        System.out.println("Fnd the Min:"+min);

        // counting the values in the stream
        Long count = list.stream()
                .collect(counting());
        System.out.println("Fnd the Counting Number:"+count);

       //Optional<Integer> bitCount = Optional.of(5);

        Integer bitCount = new Integer(7);
        Integer.bitCount(bitCount);
        System.out.println("Fnd the 1s in binary Number:"+Integer.bitCount(bitCount));

        //System.out.println("Fnd the Reverse binary Number:"+Integer.reverse(bitCount));


    }
}
