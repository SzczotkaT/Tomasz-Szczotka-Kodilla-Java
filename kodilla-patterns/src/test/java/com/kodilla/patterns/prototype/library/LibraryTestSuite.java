package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Books library 1");
        IntStream.iterate(1, b -> b + 1)
                .limit(5)
                .forEach(b -> library.getBooks().add(new Book("title" + b,"author" + b, LocalDate.now().minusDays((long)b))));
        System.out.println(library);

        //When
        //Then
        Assert.assertEquals(5,library.getBooks().size());
    }
}
