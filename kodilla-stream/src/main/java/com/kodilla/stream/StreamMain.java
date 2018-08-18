package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.immutable.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("To be, or not to be, that is the question", (sentence) -> "*** " + sentence + " ***");
        poemBeautifier.beautify("To be, or not to be, that is the question", (sentence) -> sentence.toUpperCase());
        poemBeautifier.beautify("To be, or not to be, that is the question", (sentence) -> sentence.replace('n','N'));
        poemBeautifier.beautify("To be, or not to be, that is the question", (sentence) -> "ABC " + sentence + " ABC");


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}
