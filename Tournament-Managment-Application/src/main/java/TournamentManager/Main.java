package TournamentManager;

// Importing Required APIs
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;
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
 
    public void writeHockeyTeams() throws IOException{
        try(FileWriter fw = new FileWriter("/Users/jaydenetheridge/Documents/GitHub/JaydenEDT2022/Tournament-Managment-Application/CSV files/HockeyTournament.csv", true); 
            BufferedWriter bw = new BufferedWriter(fw); 
            PrintWriter pw = new PrintWriter(bw)){                                  
                        
                gui.addTeams();
                ArrayList<String> TeamNames = gui.getTeamlist();
                String collectNames = TeamNames.stream().collect(Collectors.joining(","));                
        
                pw.write(collectNames);
        
        }       
        
        catch (IOException e) {
        }    
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
        
}
