package com.kodilla.testing.forum.Statistics;

import com.kodilla.testing.forum.statistics.StatisticsCalculation;
import com.kodilla.testing.forum.statistics.Statistics;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.ArrayList;

public class StatisticsTestSuite {

    @Test
    public void testCalculateAdvStatistics(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Kodi");
        usersNames.add("lla20");
        usersNames.add("Rac_2.0");
        usersNames.add("Szagii");
        usersNames.add("Miruna");
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(100);

        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);

        //When
        statisticsCalculation.calculateAdvStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(10);

        //Then
        Assert.assertEquals(10,statisticsCalculation.getAvgPostsPerUser(),0.00001);

    }

    @Test
    public void testMoge(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Kodi");
        usersNames.add("lla20");
        usersNames.add("Rac_2.0");
        usersNames.add("Szagii");
        usersNames.add("Miruna");
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(10);


        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);

        //When
        statisticsCalculation.calculateAdvStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(200);

        //Then
        Assert.assertEquals(40,statisticsCalculation.getAvgCommentsPerUser(),0.00001);

    }

}
