package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("To be, or not to be, that is the question", (sentence) -> "*** " + sentence + " ***");
        poemBeautifier.beautify("To be, or not to be, that is the question", (sentence) -> sentence.toUpperCase());
        poemBeautifier.beautify("To be, or not to be, that is the question", (sentence) -> sentence.replace('n','N'));
        poemBeautifier.beautify("To be, or not to be, that is the question", (sentence) -> "ABC " + sentence + " ABC");

    }
}
