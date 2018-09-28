package com.kodilla.testing.forum.Statistics;

import com.kodilla.testing.forum.statistics.StatisticsCalculation;
import com.kodilla.testing.forum.statistics.Statistics;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.ArrayList;

public class StatisticsTestSuite {

    @Test
    public void testPostAmount0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        userList.add("Kodi");
        userList.add("lla20");
        userList.add("Rac_2.0");
        userList.add("Szagii");
        userList.add("Miruna");

        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(0);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);

        //When
        statisticsCalculation.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statisticsCalculation.getAvgPostsPerUser(), 0.00001);
        assertEquals(20, statisticsCalculation.getAvgCommentsPerUser(), 0.00001);
        assertEquals(0, statisticsCalculation.getAvgCommentPerPost(), 0.00001);
    }

    @Test
    public void testPostAmount1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        userList.add("Kodi");
        userList.add("lla20");
        userList.add("Rac_2.0");
        userList.add("Szagii");
        userList.add("Miruna");

        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);

        //When
        statisticsCalculation.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(200, statisticsCalculation.getAvgPostsPerUser(), 0.00001);
        assertEquals(20, statisticsCalculation.getAvgCommentsPerUser(), 0.00001);
        assertEquals(0, statisticsCalculation.getAvgCommentPerPost(), 0.00001);
    }

    @Test
    public void testCommentsAmount0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        userList.add("Kodi");
        userList.add("lla20");
        userList.add("Rac_2.0");
        userList.add("Szagii");
        userList.add("Miruna");

        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1000);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);

        //When
        statisticsCalculation.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(200, statisticsCalculation.getAvgPostsPerUser(), 0.00001);
        assertEquals(0, statisticsCalculation.getAvgCommentsPerUser(), 0.00001);
        assertEquals(0, statisticsCalculation.getAvgCommentPerPost(), 0.00001);
    }

    @Test
    public void testCommentsLessThenPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        userList.add("Kodi");
        userList.add("lla20");
        userList.add("Rac_2.0");
        userList.add("Szagii");
        userList.add("Miruna");

        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.commentsCount()).thenReturn(1);
        when(statisticsMock.postsCount()).thenReturn(1000);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);

        //When
        statisticsCalculation.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(200, statisticsCalculation.getAvgPostsPerUser(), 0.00001);
        assertEquals(0, statisticsCalculation.getAvgCommentsPerUser(), 0.00001);
        assertEquals(0, statisticsCalculation.getAvgCommentPerPost(), 0.00001);
    }

    @Test
    public void testCommentsBiggerThenPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        userList.add("Kodi");
        userList.add("lla20");
        userList.add("Rac_2.0");
        userList.add("Szagii");
        userList.add("Miruna");

        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(100);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);

        //When
        statisticsCalculation.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(20, statisticsCalculation.getAvgPostsPerUser(), 0.00001);
        assertEquals(200, statisticsCalculation.getAvgCommentsPerUser(), 0.00001);
        assertEquals(10, statisticsCalculation.getAvgCommentPerPost(), 0.00001);
    }

    @Test
    public void testUsersAmount0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(100);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);

        //When
        statisticsCalculation.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statisticsCalculation.getAvgPostsPerUser(), 0.00001);
        assertEquals(0, statisticsCalculation.getAvgCommentsPerUser(), 0.00001);
        assertEquals(10, statisticsCalculation.getAvgCommentPerPost(), 0.00001);
    }

    @Test
    public void testUsersAmount100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            userList.add("Kodi" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(100);
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);

        //When
        statisticsCalculation.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1, statisticsCalculation.getAvgPostsPerUser(), 0.00001);
        assertEquals(10, statisticsCalculation.getAvgCommentsPerUser(), 0.00001);
        assertEquals(10, statisticsCalculation.getAvgCommentPerPost(), 0.00001);
    }

}
