package TournamentManager;

import static java.lang.String.valueOf;

/**
 *
 * @author jaydenetheridge
 */
public class Results {
    
    //  Creating Variables
    private String GameID;
    private String RoundNum;
    private String GameNum;
    private String Team1Name;
    private String Team1Score;
    private String Team2Name;
    private String Team2Score;
    private String WinnerName;
    private String WinnerScore;
    
    
//   Constructor that takes arguments
    public Results( int gameID, int roundNum, int gameNum, String team1Name, int team1Score, String team2Name, int team2Score, String winnerName, int winnerScore){
        this.GameID = valueOf(gameID);
        this.RoundNum = valueOf(roundNum);
        this.GameNum = valueOf(gameNum);
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
    
    public String getRoundNum(){
        return RoundNum;
    }
    
    public void setRoundNum(){
        this.RoundNum = RoundNum;
    }
    
    public String getGameNum(){
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
    
    @Override
    public String toString(){
        return "Results{" + 
                "GameID='" + GameID + '\'' + 
                ", RoundNum='" + RoundNum + '\'' + 
                ", GameNum='" + GameNum + '\'' +
                ", Team1='" + Team1Name + '\'' +
                ", Team1Score='" + Team1Score + '\'' +
                ", Team2='" + Team2Name + '\'' +
                ", Team2Score='" + Team2Score + '\'' +
                ", Winner='" + WinnerName + '\'' +
                ", WinnerScore='" + WinnerScore + '\'' +
                '}';
    }
    
//    @Override
//    public String toString(){
//        StringBuilder dataBuilder = new StringBuilder();
//        appendFieldValue(dataBuilder, RoundNum);
//        appendFieldValue(dataBuilder, GameNum);
//        appendFieldValue(dataBuilder, Team1Name);
//        appendFieldValue(dataBuilder, Team1Score);
//        appendFieldValue(dataBuilder, Team2Name);
//        appendFieldValue(dataBuilder, Team2Score);
//        appendFieldValue(dataBuilder, WinnerName);
//        appendFieldValue(dataBuilder, WinnerScore);
//        
//        
//
//        return dataBuilder.toString();
//    }
//
//    private void appendFieldValue(StringBuilder dataBuilder, String fieldValue) {
//        if(fieldValue != null) {
//            dataBuilder.append(fieldValue).append(", ");
//        } else {
//            dataBuilder.append("").append(",");
//        }
//    }
    
}
