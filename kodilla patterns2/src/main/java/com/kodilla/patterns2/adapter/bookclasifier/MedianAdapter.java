package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryA.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryA.Clasifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryB.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Clasifier {
    @Override
    public int publicationYearMadian(Set<com.kodilla.patterns2.adapter.bookclasifier.libraryA.Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryB.Book> booksMap = new HashMap<>();
        for (com.kodilla.patterns2.adapter.bookclasifier.libraryA.Book books : bookSet) {
            booksMap.put(new BookSignature("1"),
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryB.Book("Michelle Obama", "Becoming", 2018));
            booksMap.put(new BookSignature("2"),
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryB.Book("Craig Smith", "The Wonky Donkey", 2010));
            booksMap.put(new BookSignature("3"),
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryB.Book("Michael Wolff", "Fire and Fury: Inside the Trump White House", 2018));
        }
        return medianPublicationYear(booksMap);
    }
}
