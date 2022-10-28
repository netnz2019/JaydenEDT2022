/*
    General Sports Tournament Manager Program made by Jayden Etheridge
    
    This Main.java file is the main class file and its main method initates my GUI.java file and enables 
    my gui for use. It holds the methods for reading and clearing HockeyTournament.csv file 
    and its content it also holds a singular method for clearing HockeyResults.ser file.
    
*/

package TournamentManager;

// Importing Required APIs
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 *
 * @author Jayden Etheridge - 2022 DGT Project
 * 
 */

public class Main {
    GUI gui = new GUI();

//    Method to Initialize the GUI
    public static void main(String[] args) throws IOException {       
        GUI window = new GUI();
        window.setVisible(true);
        window.setDefaultCloseOperation(GUI.EXIT_ON_CLOSE);
    }
    
//    Method to clear hockey teams from HockeyTournament.csv file
    public void clearHockeyTeams() throws IOException{
        try(FileWriter fw = new FileWriter("/Users/jaydenetheridge/Documents/GitHub/JaydenEDT2022/Tournament-Managment-Application/Files/HockeyTournament.csv", false); 
            PrintWriter pw = new PrintWriter(fw, false)){ 
                
                pw.flush();
                pw.close();
                fw.close();
                
        }
        
        catch (IOException e) {
        }
    }
    
//    Method to clear hockey game results from HockeyResults.ser file
    public void clearHockeyResults() throws IOException{
        try(FileWriter fw = new FileWriter("/Users/jaydenetheridge/Documents/GitHub/JaydenEDT2022/Tournament-Managment-Application/Files/HockeyResults.ser", false); 
            PrintWriter pw = new PrintWriter(fw, false)){ 
                
                pw.flush();
                pw.close();
                fw.close();
                
        }
        
        catch (IOException e) {
        }
    }
    
//    Method to intiate readHockeyFile method   
    public void readHockeyTeams() throws IOException{
        String filename = "/Users/jaydenetheridge/Documents/GitHub/JaydenEDT2022/Tournament-Managment-Application/Files/HockeyTournament.csv";
        ArrayList<String> fileData = new ArrayList<String>();
        readHockeyFile(filename, fileData);
        
    }       

//    Method to read each name from HockeyTournament.csv and assign them to variables
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
    
//    Method to send the read Hockey Team names from Main.Java to GUI.java   
    public static void showHockeyTeams(String team1, String team2, String team3, String team4, String team5, String team6, String team7, String team8){
        GUI.Team1 = team1;
        GUI.Team2 = team2;
        GUI.Team3 = team3;
        GUI.Team4 = team4;
        GUI.Team5 = team5;
        GUI.Team6 = team6;
        GUI.Team7 = team7;
        GUI.Team8 = team8;
        
        
    }   
}
