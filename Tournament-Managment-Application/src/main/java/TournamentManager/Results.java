/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TournamentManager;

/**
 *
 * @author jaydenetheridge
 */
public class Results {
    
    //  Creating Variables
    private int roundNum;
    private String team1Name;
    private int team1Score;
    private String team2Name;
    private int team2Score;
    private String winnerName;
    private int winnerScore;
    
    
//  Constructor that takes arguments
    public Results( int roundNum, String team1Name, int team1Score, String team2Name, int team2Score, String winnerName, int winnerScore){
        this.roundNum = roundNum;
        this.team1Name = team1Name;
        this.team1Score = team1Score;
        this.team2Name = team2Name;
        this.team2Score = team2Score;
        this.winnerName = winnerName;
        this.winnerScore = winnerScore;        
    }
    

    
//  getter methods
    public int getroundNum(){
        return this.roundNum;
    } 
    
    public String getteam1Name(){
        return this.team1Name;
    }
  
    public int getteam1Score(){
        return this.team1Score;
    }
    
    public String getteam2Name(){
        return this.team2Name;
    }
  
    public int getteam2Score(){
        return this.team2Score;
    }
    
    public String getwinnerName(){
        return this.winnerName;
    }
  
    public int getwinnerScore(){
        return this.winnerScore;
    } 
    
    
    
//  Setter methods to change the instance variables
    public void setroundNum(int roundNum){
        this.roundNum = roundNum;
    }
  
    public void setteam1Num(String team1Name){
        this.team1Name = team1Name;
    }

    public void setteam1Score(int team1Score){
        this.team1Score = team1Score;
    }
    
    public void setteam2Num(String team2Name){
        this.team2Name = team2Name;
    }

    public void setteam2Score(int team2Score){
        this.team2Score = team2Score;
    }
    
    public void setwinnerNum(String winnerName){
        this.winnerName = winnerName;
    }

    public void setwinnerScore(int winnerScore){
        this.winnerScore = winnerScore;
    }
    
    
}
