package com.kodilla.testing.forum.statistics;

public class StatisticsCalculation {
    private int usersAmount;
    private int postsAmount;
    private int commentsAmount;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentPerPost;

    public StatisticsCalculation(Statistics statistics) {
    }


    public int getUsersAmount() {
        return usersAmount;
    }

    public int getPostsAmount() {
        return postsAmount;
    }

    public int getCommentsAmount() {
        return commentsAmount;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentPerPost() {
        return avgCommentPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        usersAmount = statistics.usersNames().size();
        postsAmount = statistics.postsCount();
        commentsAmount = statistics.commentsCount();
        avgPostsPerUser = postsAmount/usersAmount;
        avgCommentsPerUser = commentsAmount/usersAmount;
        avgCommentPerPost = commentsAmount/postsAmount;
    }

    public void showStatistics(){
        System.out.println("Amount of users is: " + usersAmount);
        System.out.println("Amount of posts is: " + postsAmount);
        System.out.println("Amount of comments is: " + commentsAmount);
        System.out.println("Average  posts per user is: " + avgPostsPerUser);
        System.out.println("Average comments per user is: " + avgCommentsPerUser);
        System.out.println("Average  comment per post is: " + avgCommentPerPost);
    }
}
