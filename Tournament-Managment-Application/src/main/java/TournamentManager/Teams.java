package TournamentManager;

import java.util.ArrayList;

/**
 *
 * @author jaydenetheridge
 */
public class Teams {
    ArrayList<String> TeamNames = new ArrayList<String>();
    
//  Creating Variables
    private String teamName1;
    private String teamName2;
    private String teamName3;
    private String teamName4;
    private String teamName5;
    private String teamName6;
    private String teamName7;
    private String teamName8;
    
//  Constructor that takes arguments
    public Teams(String TeamName1, String TeamName2, String TeamName3, String TeamName4, String TeamName5, String TeamName6, String TeamName7, String TeamName8){
        this.teamName1 = TeamName1;
        this.teamName2 = TeamName2;
        this.teamName3 = TeamName3;
        this.teamName4 = TeamName4;
        this.teamName5 = TeamName5;
        this.teamName6 = TeamName6;
        this.teamName7 = TeamName7;
        this.teamName8 = TeamName8;
        
        TeamNames.clear();
        TeamNames.add(TeamName1);
        TeamNames.add(TeamName2);
        TeamNames.add(TeamName3);
        TeamNames.add(TeamName4);
        TeamNames.add(TeamName5);
        TeamNames.add(TeamName6);
        TeamNames.add(TeamName7);
        TeamNames.add(TeamName8);
        
    }
    
//  getter method
    public ArrayList getTeamlist(){
        return TeamNames;
    }

//  Setter method to change the pre-set variable
    public void setTeamlist(ArrayList teamNames){
        this.TeamNames = teamNames;
    }

}
