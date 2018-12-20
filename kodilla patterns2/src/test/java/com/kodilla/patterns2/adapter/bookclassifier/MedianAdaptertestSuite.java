package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdaptee;
import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.libraryA.Book;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

public class MedianAdaptertestSuite {
    @Test
    public void testPublicationYearMedian(){
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();

        Set<Book> theBookSet = new HashSet<>();
        theBookSet.add(new com.kodilla.patterns2.adapter.bookclasifier.libraryA.Book(
                "Paulo Coelho", "Brida", 2008,"1111"));
        theBookSet.add(new com.kodilla.patterns2.adapter.bookclasifier.libraryA.Book(
                "Paulo Coelho", "O Alquimista", 1995, "2222"));
        theBookSet.add(new com.kodilla.patterns2.adapter.bookclasifier.libraryA.Book(
                "Paulo Coelho", "Veronika decide morrer", 2000, "3333"));
        theBookSet.add(new com.kodilla.patterns2.adapter.bookclasifier.libraryA.Book(
                "Paulo Coelho", "O Demônio e a srta Prym", 2002, "4444"));

        //When
        int publYearMed = medianAdapter.publicationYearMadian(theBookSet);
        System.out.println(publYearMed);

        //Then
        assertEquals(publYearMed,2018);
    }
}
