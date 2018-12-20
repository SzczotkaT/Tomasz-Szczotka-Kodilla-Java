package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryB.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryB.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryB.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryB.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics theAveragePublYear = new Statistics();
        return theAveragePublYear.averagePublicationYear(books);
    }
    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books){
        Statistics theMedianPublYear = new Statistics();
        return theMedianPublYear.medianPublicationYear(books);
    }
}
