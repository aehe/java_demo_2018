package com.example.demo;

public class TennisGame2 implements TennisGame
{
    private int player1Point;
    private int player2Point;    
    private String player1Result = "";
    private String player2Result = "";
//    private String player1Name;
//    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
//        this.player1Name = player1Name;
//        this.player2Name = player2Name;
    }
    
    private String sayScore(int point) {
        // TODO Auto-generated method stub
        String[] scores = {"Love", "Fifteen", "Thirty", "Forty"};
        if (point >=0 && point < scores.length) {
            return scores[point];
        }
        else {
            return null;
        }
    }

    public String getScore(){
        String score = "";
        
        //Win
        if (player1Point>=4 && player2Point>=0 && (player1Point-player2Point)>=2)
        {
            score = "Win for player1";
        }
        if (player2Point>=4 && player1Point>=0 && (player2Point-player1Point)>=2)
        {
            score = "Win for player2";
        }
        
        //Advantage
        if (player1Point > player2Point && player2Point >= 3)
        {
            score = "Advantage player1";
        }
        
        if (player2Point > player1Point && player1Point >= 3)
        {
            score = "Advantage player2";
        }
        
      //Deuce
        if (player1Point==player2Point && player1Point>=3)
            score = "Deuce";
        
        //All
        if (isAll())
        {            
           /* 0-0 Love-All
            1-1 Fifteen-All
            2-2 Thirty-All            */            
            return sayScore(player1Point) + "-All";
        }              
        
        //Love
        if (player1Point > 0  && player1Point < 4 && player2Point==0)
        {
            /*
             * 1-0 Fifteen-Love
             * 2-0 Thirty-Love
             * 3-0 Forty-Love
             */
            return sayScore(player1Point) + "-" + sayScore(player2Point);
        }
        if (player2Point > 0 && player2Point < 4 && player1Point==0)
        {
            return sayScore(player1Point) + "-" + sayScore(player2Point);
        }
        
       
        
       
        
       /* public String getScore(){
            String score = "";
            if (player1Point == player2Point && player1Point < 3)
            {                
                if (player1Point==0)
                    score = "Love";
                if (player1Point==1)
                    score = "Fifteen";
                if (player1Point==2)
                    score = "Thirty";
                score += "-All";
            }*/
        
//        if (player1Point==player2Point && player1Point>=3)
//            score = "Deuce";
        
//        if (player1Point > 0 && player2Point==0)
//        {
//            if (player1Point==1)
//                player1Result = "Fifteen";
//            if (player1Point==2)
//                player1Result = "Thirty";
//            if (player1Point==3)
//                player1Result = "Forty";
//            
//            player2Result = "Love";
//            score = player1Result + "-" + player2Result;
//        }
//        if (player2Point > 0 && player1Point==0)
//        {
//            if (player2Point==1)
//                player2Result = "Fifteen";
//            if (player2Point==2)
//                player2Result = "Thirty";
//            if (player2Point==3)
//                player2Result = "Forty";
//            
//            player1Result = "Love";
//            score = player1Result + "-" + player2Result;
//        }
        
//        if (player1Point>player2Point && player1Point < 4)
//        {
//            if (player1Point==2)
//                player1Result="Thirty";
//            if (player1Point==3)
//                player1Result="Forty";
//            if (player2Point==1)
//                player2Result="Fifteen";
//            if (player2Point==2)
//                player2Result="Thirty";
//            score = player1Result + "-" + player2Result;
//        }
//        if (player2Point>player1Point && player2Point < 4)
//        {
//            if (player2Point==2)
//                player2Result="Thirty";
//            if (player2Point==3)
//                player2Result="Forty";
//            if (player1Point==1)
//                player1Result="Fifteen";
//            if (player1Point==2)
//                player1Result="Thirty";
//            score = player1Result + "-" + player2Result;
//        }
        
//        if (player1Point > player2Point && player2Point >= 3)
//        {
//            score = "Advantage player1";
//        }
//        
//        if (player2Point > player1Point && player1Point >= 3)
//        {
//            score = "Advantage player2";
//        }
//        
//        if (player1Point>=4 && player2Point>=0 && (player1Point-player2Point)>=2)
//        {
//            score = "Win for player1";
//        }
//        if (player2Point>=4 && player1Point>=0 && (player2Point-player1Point)>=2)
//        {
//            score = "Win for player2";
//        }
        return score;
    }
    
    

    private boolean isAll() {
        // TODO Auto-generated method stub
        return false;
    }

    public void SetP1Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P1Score();
        }
            
    }
    
    public void SetP2Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P2Score();
        }
            
    }
    
    public void P1Score(){
        player1Point++;
    }
    
    public void P2Score(){
        player2Point++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}