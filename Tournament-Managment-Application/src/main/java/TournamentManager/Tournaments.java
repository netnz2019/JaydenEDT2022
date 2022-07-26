/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TournamentManager;

/**
 *
 * @author jaydenetheridge
 */
public class Tournaments {
    
    //  Creating Variables
    private int teamNum;
    private int teamScore;
    private int roundNum;
    
//  Constructor that takes arguments
    public Tournaments(int teamNum, int teamScore, int roundNum){
        this.teamNum = teamNum;
        this.teamScore = teamScore;
        this.roundNum = roundNum;
    }
    

    
//  getter methods
    public int getteamNum(){
        return this.teamNum;
    }
  
    public int getteamScore(){
        return this.teamScore;
     } 
    
    public int getroundNum(){
        return this.roundNum;
     } 
    
//  Setter methods to change the instance variables
  
    public void setteamNum(int teamNum){
        this.teamNum = teamNum;
    }

    public void setteamScore(int teamScore){
     this.teamScore = teamScore;
    }
    
    public void setroundNum(int roundNum){
     this.roundNum = roundNum;
    }
}
