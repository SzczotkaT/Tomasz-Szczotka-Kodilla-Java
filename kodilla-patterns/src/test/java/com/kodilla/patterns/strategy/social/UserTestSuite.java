package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User jack = new Milenials("Jack Daniels");
        User jim = new YGeneration("Jim Beam");
        User johnnie = new ZGeneration("Johnnie Walker");

        //When
        String jackShare = jack.sharedPost();
        System.out.println("Jack Daniels published on: " + jackShare);
        String jimShared = jim.sharedPost();
        System.out.println("Jim Beam published on: " + jimShared);
        String johnnieShare = johnnie.sharedPost();
        System.out.println("Johnnie Walker published on: " + johnnieShare);

        Assert.assertEquals("Facebook", jackShare);
        Assert.assertEquals("Twitter", jimShared );
        Assert.assertEquals("Snapchat", johnnieShare );
    }

    @Test
    public void testIndividualInvestingStrategy() {
        //Given
        User jack = new Milenials("Jack Daniels");

        //When
        String jackShare = jack.sharedPost();
        System.out.println("Jack Daniels published on: " + jackShare);
        jack.setSocialPublishing(new TwitterPublisher());
        jackShare = jack.sharedPost();
        System.out.println("Jack Daniels published on: " + jackShare);

        //Then
        Assert.assertEquals("Twitter", jackShare);
    }
}
