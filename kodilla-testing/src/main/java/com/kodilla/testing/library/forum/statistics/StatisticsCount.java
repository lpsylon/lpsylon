package com.kodilla.testing.library.forum.statistics;

public class StatisticsCount {


    public int userQuantity;
    public int averagePostPerUser;
    public int averageCommentsPerPost;
    Statistics statistics;
    int postQuantity;
    int commentsQuantity;
    int averageCommentsPerUser;

    public StatisticsCount(Statistics statistics) {
        this.statistics = statistics;
    }


    //method 1
    public void calculateAdvStatistics (Statistics statistics){


        userQuantity = statistics.usersNames().size();
        postQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();

        if(statistics.usersNames().size()==0){
            averagePostPerUser = 0;
            averageCommentsPerUser =0;
        } else {
            averagePostPerUser = statistics.postsCount() / statistics.usersNames().size();
            averageCommentsPerUser = statistics.commentsCount()/statistics.usersNames().size();
        }

        if(statistics.postsCount()==0){
            averageCommentsPerPost = 0;
        }else {
            averageCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
        }

    }

    //method 2
    public void showStatistics(){
        System.out.println("Statistics:");
        System.out.println("Number of Users: "+ userQuantity +".");
        System.out.println("Number of Posts: "+ postQuantity +".");
        System.out.println("Number of Comments: "+ commentsQuantity +".");
        System.out.println("Average Quantity of Posts per User: "+ averagePostPerUser +".");
        System.out.println("Average Quantity of Comments per User: "+ averageCommentsPerUser +".");
        System.out.println("Average Quantity of Comments per Posts: "+ averageCommentsPerPost +".");
    }


}
