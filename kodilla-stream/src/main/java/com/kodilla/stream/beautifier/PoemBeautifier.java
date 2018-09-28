package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String sentence, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(sentence);
        System.out.println(result);
    }
}
