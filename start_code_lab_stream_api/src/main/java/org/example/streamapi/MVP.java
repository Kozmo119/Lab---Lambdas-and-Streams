package org.example.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MVP {

    /*
        Convert a List<String> to an object stream and for each element -> System,out.println.
     */

    public void printNames(List<String> names) {
        names.stream().forEach(el -> System.out.println(el));

    }

    /*
        Given a List<Integers>, return a List<Integer> with even numbers.
     */
    public List<Integer> returnEvenNumbers(List<Integer> numbers) {
        List<Integer> stream2 = numbers
                .stream()
                .filter(el -> el % 2 ==0)
                .collect(Collectors.toList());
        return stream2;
    }


    /*
        Given an int [], double the value of each int and return an int [].
    */
    public int[] doubleInts(int[] numbers) {
       int[] ns = Arrays.stream(numbers).map(n -> n*2).toArray();
        return ns;
    }

    /*
        Given a String, return a List<String>, all caps.
     */
    public List<String> splitToAllCapsList(String input) {

        return Stream.of(input.split(","))
               .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */
    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {
      List<String> test1 = list
              .stream()
              .filter(el -> el.startsWith(letter))
              .map(String::toUpperCase)
              .sorted()
              .collect(Collectors.toList());
        return test1;
    }

    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {
        List<String> test2 = words
                .stream()
                .filter(word -> word.startsWith(firstLetter) && word.length()< maxLength)
                .collect(Collectors.toList());
        return test2;
    }
}