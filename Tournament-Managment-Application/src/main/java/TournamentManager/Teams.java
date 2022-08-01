package TournamentManager;

/**
 *
 * @author jaydenetheridge
 */
public class Teams {
    
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
        
    }
    
//  getter methods
    public String getTeam1(){
        return teamName1;
    }
    
    public String getTeam2(){
        return teamName2;
    }
    
    public String getTeam3(){
        return teamName3;
    }
    
    public String getTeam4(){
        return teamName4;
    }
    
    public String getTeam5(){
        return teamName5;
    }
    
    public String getTeam6(){
        return teamName6;
    }
    
    public String getTeam7(){
        return teamName7;
    }
    
    public String getTeam8(){
        return teamName8;
    }

//  Setter method to change the pre-set variable
    public void setTeam1(String TeamName1){
        this.teamName1 = TeamName1;
    }
    
    public void setTeam2(String TeamName2){
        this.teamName2 = TeamName2;
    }
    
    public void setTeam3(String TeamName3){
        this.teamName3 = TeamName3;
    }
    
    public void setTeam4(String TeamName4){
        this.teamName4 = TeamName4;
    }
    
    public void setTeam5(String TeamName5){
        this.teamName5 = TeamName5;
    }
    
    public void setTeam6(String TeamName6){
        this.teamName6 = TeamName6;
    }
    
    public void setTeam7(String TeamName7){
        this.teamName7 = TeamName7;
    }
    
    public void setTeam8(String TeamName8){
        this.teamName8 = TeamName8;
    }

}
