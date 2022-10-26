package TournamentManager;

import static java.lang.String.valueOf;

/**
 *
 * @author jaydenetheridge
 */
public class Results implements java.io.Serializable {
    
    //  Creating Variables
    private String GameID;
    private int RoundNum;
    private int GameNum;
    private String Team1Name;
    private String Team1Score;
    private String Team2Name;
    private String Team2Score;
    private String WinnerName;
    private String WinnerScore;
    
    
//   Constructor that takes arguments
    public Results( String gameID, int roundNum, int gameNum, String team1Name, int team1Score, String team2Name, int team2Score, String winnerName, int winnerScore){
        this.GameID = gameID;
        this.RoundNum = roundNum;
        this.GameNum = gameNum;
        this.Team1Name = team1Name;
        this.Team1Score = valueOf(team1Score);
        this.Team2Name = team2Name;
        this.Team2Score = valueOf(team2Score);
        this.WinnerName = winnerName;
        this.WinnerScore = valueOf(winnerScore);        
    } 
    
//    Getter/Setter Methods
    public String getGameID(){
        return GameID;
    }
    
    public void setGameID(){
        this.GameID = GameID;
    }
    
    
    
    public int getRoundNum(){
        return RoundNum;
    }
    
    public void setRoundNum(){
        this.RoundNum = RoundNum;
    }
    
    
    
    public int getGameNum(){
        return GameNum;
    }
    
    public void setGameNum(){
        this.GameNum = GameNum;
    }
    
    
    
    public String getTeam1(){
        return Team1Name;
    }
    
    public void setTeam1(){
        this.Team1Name = Team1Name;
    }
    
    
    
    public String getTeam1Score(){
        return Team1Score;
    }
    
    public void setTeam1Score(){
        this.Team1Score = Team1Score;
    }
    
    
    
    public String getTeam2(){
        return Team2Name;
    }
    
    public void setTeam2(){
        this.Team2Name = Team2Name;
    }
    
    
    
    public String getTeam2Score(){
        return Team2Score;
    }
    
    public void setTeam2Score(){
        this.Team2Score = Team2Score;
    }
    
    
    
    public String getWinner(){
        return WinnerName;
    }
    
    public void setWinner(){
        this.WinnerName = WinnerName;
    }
    
    
    
    public String getWinnerScore(){
        return WinnerScore;
    }
    
    public void setWinnerScore(){
        this.WinnerScore = WinnerScore;
    }  
}
