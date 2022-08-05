package TournamentManager;

// Importing Required APIs
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author jaydenetheridge
 */
public class Main {
    GUI gui = new GUI();
    
    public static void main(String[] args) throws IOException {       
//      Initializing GUI
        GUI window = new GUI();
//      Displaying the GUI
        window.setVisible(true);
        window.setDefaultCloseOperation(GUI.EXIT_ON_CLOSE);
        
        
    }
        
    public void clearHockeyTeams() throws IOException{
        try(FileWriter fw = new FileWriter("/Users/jaydenetheridge/Documents/GitHub/JaydenEDT2022/Tournament-Managment-Application/CSV files/HockeyTournament.csv", false); 
            PrintWriter pw = new PrintWriter(fw, false)){ 
                
                pw.flush();
                pw.close();
                fw.close();
                
        }
        
        catch (IOException e) {
        }
    }
    
    public void readHockeyTeams() throws IOException{
        String filename = "/Users/jaydenetheridge/Documents/GitHub/JaydenEDT2022/Tournament-Managment-Application/CSV files/HockeyTournament.csv";
        ArrayList<String> fileData = new ArrayList<String>();
        readHockeyFile(filename, fileData);
        
    }       

    public static void readHockeyFile(String filename, ArrayList<String> fileData){
            File file = new File(filename);
            try {
                Scanner fileScan = new Scanner(file);      
                String[] eachItem = fileScan.nextLine().split(",");
                    
                String team1 = eachItem[0].trim();
                String team2 = eachItem[1].trim();
                String team3 = eachItem[2].trim();
                String team4 = eachItem[3].trim();
                String team5 = eachItem[4].trim();
                String team6 = eachItem[5].trim();
                String team7 = eachItem[6].trim();
                String team8 = eachItem[7].trim();
                showHockeyTeams(team1, team2, team3, team4, team5, team6, team7, team8);
 
            }
        
            catch(FileNotFoundException e){
                System.out.println("File not found");
            }
        }
    
    public static void showHockeyTeams(String team1, String team2, String team3, String team4, String team5, String team6, String team7, String team8){
        GUI.Team1 = team1;
        GUI.Team2 = team2;
        GUI.Team3 = team4;
        GUI.Team4 = team4;
        GUI.Team5 = team5;
        GUI.Team6 = team6;
        GUI.Team7 = team7;
        GUI.Team8 = team8;
        
        
    }   
}
