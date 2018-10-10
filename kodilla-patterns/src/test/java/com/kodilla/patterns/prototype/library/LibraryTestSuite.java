package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Book book1 = new Book("Title 1", "Author 1", LocalDate.now());
        Book book2 = new Book("Title 2", "Author 2", LocalDate.now().minusDays(10l));
        Book book3 = new Book("Title 3", "Author 3", LocalDate.now().minusDays(15l));
        Book book4 = new Book("Title 4", "Author 4", LocalDate.now().minusDays(30l));


        Library library = new Library("Books library 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        System.out.println(library);

        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Books libtaty 2");
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }
        System.out.println(clonedLibrary);

        Library deepClonedLibrary = null;

        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Books library 3");
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3,library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4,deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
