/*
    General Sports Tournament Manager Program made by Jayden Etheridge
    
    This GUI.java file contains the auto generated code and variables for the construction of the gui.
    It also contains the methods and code for all the user interactable elements within the gui such as 
    buttons, combo boxes and text fields and the outputs they send when the user interacts with 
    the specified elements.
    
*/

package TournamentManager;

// Importing Required APIs
import java.awt.Color;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.List;
import javax.swing.border.LineBorder;

/*
 *
 * @author Jayden Etheridge - 2022 DGT Project
 * 
 */

public class GUI extends javax.swing.JFrame implements java.io.Serializable {
    ArrayList<String> TeamNames = new ArrayList<>();
    
    static List<Results> GameResults = new ArrayList<>();
    Results IntialResult = new Results("0", 0, 0, "Null", 0, "Null", 0, "Null", 0);
    
    Results game;
    
    String team1Name;
    String team1Score;
    String team2Name;
    String team2Score;
    String winnerName;
    String winnerScore; 

    static String Team1;
    static String Team2;
    static String Team3;
    static String Team4;
    static String Team5;
    static String Team6;
    static String Team7;
    static String Team8;
    
    
    final String HockeyResultsFile = "/Users/jaydenetheridge/Documents/GitHub/JaydenEDT2022/Tournament-Managment-Application/Files/HockeyResults.ser";
    final String HockeyTeamsFile = "/Users/jaydenetheridge/Documents/GitHub/JaydenEDT2022/Tournament-Managment-Application/Files/HockeyTournament.csv";
    
    
    
    /*
       Creates new form GUI
     */
    public GUI() {        
        initComponents();
        setElements();
        
        GameResults.add(IntialResult);
        
    }
    
//    Method to write hockey tournament teams into CSV file 
    public void writeHockeyTeams() throws IOException{
        
        try(FileWriter fw = new FileWriter(HockeyTeamsFile, true); 
            BufferedWriter bw = new BufferedWriter(fw); 
            PrintWriter pw = new PrintWriter(bw)){                                  
                String collectNames = TeamNames.stream().collect(Collectors.joining(","));                
        
                pw.write(collectNames);
        
        }       
        
        catch (IOException e) {
        } 
    }
    
//    Method to serilize GameResults Arraylist
    public void writeHockeyResults(){
        try {
            try (FileOutputStream fileOut = new FileOutputStream(HockeyResultsFile); 
                 ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(GameResults);
            }
        }   
        
        catch(IOException i) {
        }

        GameResults.clear();
        GameResults.add(IntialResult);
        
    }
    
//    Method to load serilized/saved game results
    public void loadSavedGameResults() throws ClassNotFoundException{
        try{
            try (FileInputStream fileIn = new FileInputStream(HockeyResultsFile); 
                 ObjectInputStream in = new ObjectInputStream(fileIn)) {
                GameResults = (ArrayList) in.readObject();
            }
            
        }
    
        catch(IOException ioe){
        } 
    }
    
//    Method to search and identify if game Results exist
    public boolean findResult(String gameid) throws ClassNotFoundException{
        GameResults.clear();
        GameResults.add(IntialResult);
        loadSavedGameResults();
        
        boolean search = false;
        for (int index = 0; index < GameResults.size(); index++){
            search = GameResults.get(index).getGameID().equals(gameid);
            
        }
        return search;
    }
    
//    Method to search & read game individual game results
    public void getResults(String gameid) throws ClassNotFoundException{
        team1Name = "";
        team1Score = "";
        team2Name = "";
        team2Score = "";
        winnerName = "";
        winnerScore = "";
        
        GameResults.clear();
        GameResults.add(IntialResult);
        loadSavedGameResults();
        
        for (int index = 0; index < GameResults.size(); index++){
            if (GameResults.get(index).getGameID().equals(gameid)){
                
                team1Name = GameResults.get(index).getTeam1();
                team1Score = GameResults.get(index).getTeam1Score();
                team2Name = GameResults.get(index).getTeam2();
                team2Score = GameResults.get(index).getTeam2Score();
                winnerName = GameResults.get(index).getWinner();
                winnerScore = GameResults.get(index).getWinnerScore(); 
                
            }
        }
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabbedPanel = new javax.swing.JTabbedPane();
        ViewTour = new javax.swing.JPanel();
        TournamentTree = new javax.swing.JLabel();
        SelectSport = new javax.swing.JLabel();
        SportsComboBox = new javax.swing.JComboBox<>();
        ViewTourButtton = new javax.swing.JButton();
        R1T1 = new javax.swing.JTextField();
        R1T2 = new javax.swing.JTextField();
        R1T3 = new javax.swing.JTextField();
        R1T4 = new javax.swing.JTextField();
        R1T5 = new javax.swing.JTextField();
        R1T6 = new javax.swing.JTextField();
        R1T7 = new javax.swing.JTextField();
        R1T8 = new javax.swing.JTextField();
        SemiT1 = new javax.swing.JTextField();
        SemiT2 = new javax.swing.JTextField();
        SemiT3 = new javax.swing.JTextField();
        SemiT4 = new javax.swing.JTextField();
        FinalT1 = new javax.swing.JTextField();
        FinalT2 = new javax.swing.JTextField();
        TourWinner = new javax.swing.JTextField();
        ScoreR1T1 = new javax.swing.JTextField();
        ScoreR1T2 = new javax.swing.JTextField();
        ScoreR1T3 = new javax.swing.JTextField();
        ScoreR1T4 = new javax.swing.JTextField();
        ScoreR1T5 = new javax.swing.JTextField();
        ScoreR1T6 = new javax.swing.JTextField();
        ScoreR1T7 = new javax.swing.JTextField();
        ScoreR1T8 = new javax.swing.JTextField();
        ScoreSemiT1 = new javax.swing.JTextField();
        ScoreSemiT2 = new javax.swing.JTextField();
        ScoreSemiT3 = new javax.swing.JTextField();
        ScoreSemiT4 = new javax.swing.JTextField();
        ScoreFinalT1 = new javax.swing.JTextField();
        ScoreFinalT2 = new javax.swing.JTextField();
        FirstRoundLabel = new javax.swing.JLabel();
        SemiFinalsLabel = new javax.swing.JLabel();
        FinalsLabel = new javax.swing.JLabel();
        WinnerLabel = new javax.swing.JLabel();
        ErrorPreventionViewTour = new javax.swing.JLabel();
        ViewGame = new javax.swing.JPanel();
        SelectSport1 = new javax.swing.JLabel();
        SportsComboBox1 = new javax.swing.JComboBox<>();
        ViewResultsButtton = new javax.swing.JButton();
        SelectRoundNumber = new javax.swing.JComboBox<>();
        SelectGameNumber = new javax.swing.JComboBox<>();
        RoundNumber = new javax.swing.JLabel();
        GameNumber = new javax.swing.JLabel();
        Team1Label = new javax.swing.JLabel();
        Team2Label = new javax.swing.JLabel();
        T1ViewScore = new javax.swing.JTextField();
        T2ViewScore = new javax.swing.JTextField();
        nameGame5 = new javax.swing.JLabel();
        R1T17 = new javax.swing.JTextField();
        R1T18 = new javax.swing.JTextField();
        R1T19 = new javax.swing.JTextField();
        R1T20 = new javax.swing.JTextField();
        nameGame6 = new javax.swing.JLabel();
        R1T21 = new javax.swing.JTextField();
        R1T22 = new javax.swing.JTextField();
        nameGame7 = new javax.swing.JLabel();
        nameGame8 = new javax.swing.JLabel();
        R1T23 = new javax.swing.JTextField();
        R1T24 = new javax.swing.JTextField();
        WinnerView = new javax.swing.JTextField();
        Team1Label2 = new javax.swing.JLabel();
        WinnerScoreView = new javax.swing.JTextField();
        WinnerScoreLabel1 = new javax.swing.JLabel();
        EnterResults = new javax.swing.JPanel();
        SelectSport2 = new javax.swing.JLabel();
        SportsComboBox2 = new javax.swing.JComboBox<>();
        EnterResultsButton = new javax.swing.JButton();
        SelectRoundNumber1 = new javax.swing.JComboBox<>();
        SelectGameNumber1 = new javax.swing.JComboBox<>();
        RoundNumber1 = new javax.swing.JLabel();
        GameNumber1 = new javax.swing.JLabel();
        Team1Label1 = new javax.swing.JLabel();
        Team2Label1 = new javax.swing.JLabel();
        T1EnterScore = new javax.swing.JTextField();
        T2EnterScore = new javax.swing.JTextField();
        ErrorPreventionResultsEnter = new javax.swing.JLabel();
        R1T9 = new javax.swing.JTextField();
        R1T10 = new javax.swing.JTextField();
        R1T11 = new javax.swing.JTextField();
        R1T12 = new javax.swing.JTextField();
        R1T13 = new javax.swing.JTextField();
        R1T14 = new javax.swing.JTextField();
        R1T15 = new javax.swing.JTextField();
        R1T16 = new javax.swing.JTextField();
        nameGame1 = new javax.swing.JLabel();
        nameGame2 = new javax.swing.JLabel();
        nameGame3 = new javax.swing.JLabel();
        nameGame4 = new javax.swing.JLabel();
        WinnerEnter = new javax.swing.JTextField();
        WinnerEnterLabel = new javax.swing.JLabel();
        WinnerScoreEnter = new javax.swing.JTextField();
        WinnerScoreLabel = new javax.swing.JLabel();
        ClearResultsFile = new javax.swing.JButton();
        SetupTour = new javax.swing.JPanel();
        SelectSport3 = new javax.swing.JLabel();
        SportsComboBox3 = new javax.swing.JComboBox<>();
        TournamentTree3 = new javax.swing.JLabel();
        SetupTourButtton = new javax.swing.JButton();
        ClearTourButtton = new javax.swing.JButton();
        Team1Enter = new javax.swing.JTextField();
        Team2Enter = new javax.swing.JTextField();
        Team3Enter = new javax.swing.JTextField();
        Team4Enter = new javax.swing.JTextField();
        Team5Enter = new javax.swing.JTextField();
        Team6Enter = new javax.swing.JTextField();
        Team7Enter = new javax.swing.JTextField();
        Team8Enter = new javax.swing.JTextField();
        ErrorPreventionTeamSetup = new javax.swing.JLabel();
        ErrorPreventionTeamSetup1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TabbedPanel.setForeground(new java.awt.Color(0, 0, 0));

        TournamentTree.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        TournamentTree.setText("Tournament Tree");

        SelectSport.setText("Select Sports Tournament");

        SportsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Sport", "Hockey", "Football", "Rugby", "Netball" }));
        SportsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SportsComboBoxActionPerformed(evt);
            }
        });

        ViewTourButtton.setText("View Tournament");
        ViewTourButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTourButttonActionPerformed(evt);
            }
        });

        R1T1.setEditable(false);

        R1T2.setEditable(false);

        R1T3.setEditable(false);

        R1T4.setEditable(false);

        R1T5.setEditable(false);

        R1T6.setEditable(false);

        R1T7.setEditable(false);

        R1T8.setEditable(false);

        SemiT1.setEditable(false);

        SemiT2.setEditable(false);

        SemiT3.setEditable(false);

        SemiT4.setEditable(false);

        FinalT1.setEditable(false);

        FinalT2.setEditable(false);

        TourWinner.setEditable(false);

        ScoreR1T1.setEditable(false);
        ScoreR1T1.setText("0");

        ScoreR1T2.setEditable(false);
        ScoreR1T2.setText("0");

        ScoreR1T3.setEditable(false);
        ScoreR1T3.setText("0");

        ScoreR1T4.setEditable(false);
        ScoreR1T4.setText("0");

        ScoreR1T5.setEditable(false);
        ScoreR1T5.setText("0");

        ScoreR1T6.setEditable(false);
        ScoreR1T6.setText("0");

        ScoreR1T7.setEditable(false);
        ScoreR1T7.setText("0");

        ScoreR1T8.setEditable(false);
        ScoreR1T8.setText("0");

        ScoreSemiT1.setEditable(false);
        ScoreSemiT1.setText("0");

        ScoreSemiT2.setEditable(false);
        ScoreSemiT2.setText("0");

        ScoreSemiT3.setEditable(false);
        ScoreSemiT3.setText("0");

        ScoreSemiT4.setEditable(false);
        ScoreSemiT4.setText("0");

        ScoreFinalT1.setEditable(false);
        ScoreFinalT1.setText("0");

        ScoreFinalT2.setEditable(false);
        ScoreFinalT2.setText("0");

        FirstRoundLabel.setText("First Round");

        SemiFinalsLabel.setText("Semi-Finals");

        FinalsLabel.setText("Finals");

        WinnerLabel.setText("Winner");

        ErrorPreventionViewTour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout ViewTourLayout = new javax.swing.GroupLayout(ViewTour);
        ViewTour.setLayout(ViewTourLayout);
        ViewTourLayout.setHorizontalGroup(
            ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewTourLayout.createSequentialGroup()
                .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewTourLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewTourLayout.createSequentialGroup()
                                .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewTourLayout.createSequentialGroup()
                                            .addComponent(R1T5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ScoreR1T5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(ViewTourLayout.createSequentialGroup()
                                            .addComponent(R1T6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ScoreR1T6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(ViewTourLayout.createSequentialGroup()
                                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(R1T8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(R1T7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ScoreR1T7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ScoreR1T8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(270, 617, Short.MAX_VALUE))
                            .addGroup(ViewTourLayout.createSequentialGroup()
                                .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ViewTourLayout.createSequentialGroup()
                                        .addComponent(R1T4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ScoreR1T4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ViewTourLayout.createSequentialGroup()
                                        .addComponent(R1T1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ScoreR1T1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ViewTourLayout.createSequentialGroup()
                                        .addComponent(R1T2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ScoreR1T2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ViewTourLayout.createSequentialGroup()
                                        .addComponent(R1T3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ScoreR1T3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ViewTourLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(FinalT1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FinalT2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ScoreFinalT2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ScoreFinalT1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(48, 48, 48)
                                        .addComponent(TourWinner, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ViewTourLayout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addComponent(SemiFinalsLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(ViewTourLayout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(ViewTourLayout.createSequentialGroup()
                                                .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(ViewTourLayout.createSequentialGroup()
                                                        .addComponent(SemiT1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ScoreSemiT1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewTourLayout.createSequentialGroup()
                                                        .addComponent(SemiT2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ScoreSemiT2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(ViewTourLayout.createSequentialGroup()
                                                        .addComponent(SemiT3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ScoreSemiT3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(ViewTourLayout.createSequentialGroup()
                                                        .addComponent(SemiT4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ScoreSemiT4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(106, 106, 106)
                                                .addComponent(FinalsLabel))
                                            .addGroup(ViewTourLayout.createSequentialGroup()
                                                .addComponent(SelectSport)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(SportsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(WinnerLabel)
                                        .addGap(38, 38, 38))))))
                    .addGroup(ViewTourLayout.createSequentialGroup()
                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewTourLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(FirstRoundLabel))
                            .addGroup(ViewTourLayout.createSequentialGroup()
                                .addGap(331, 331, 331)
                                .addComponent(TournamentTree)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewTourLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewTourLayout.createSequentialGroup()
                        .addComponent(ErrorPreventionViewTour, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewTourLayout.createSequentialGroup()
                        .addComponent(ViewTourButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(304, 304, 304))))
        );
        ViewTourLayout.setVerticalGroup(
            ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewTourLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TournamentTree)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FirstRoundLabel)
                    .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SportsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SelectSport)))
                .addGap(18, 18, 18)
                .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ViewTourLayout.createSequentialGroup()
                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewTourLayout.createSequentialGroup()
                                .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ViewTourLayout.createSequentialGroup()
                                        .addComponent(FinalsLabel)
                                        .addGap(18, 18, 18)
                                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(FinalT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ScoreFinalT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(FinalT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ScoreFinalT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(70, 70, 70))
                                    .addGroup(ViewTourLayout.createSequentialGroup()
                                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(SemiT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ScoreSemiT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(SemiT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ScoreSemiT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(100, 100, 100)
                                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(SemiT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ScoreSemiT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(SemiT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ScoreSemiT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewTourLayout.createSequentialGroup()
                                .addComponent(WinnerLabel)
                                .addGap(18, 18, 18)
                                .addComponent(TourWinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)))
                        .addGap(12, 12, 12))
                    .addGroup(ViewTourLayout.createSequentialGroup()
                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(R1T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ScoreR1T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SemiFinalsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(R1T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ScoreR1T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(R1T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ScoreR1T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(R1T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ScoreR1T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(R1T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ScoreR1T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(R1T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ScoreR1T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(R1T7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ScoreR1T7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(R1T8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ScoreR1T8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addComponent(ErrorPreventionViewTour, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewTourButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        TabbedPanel.addTab("View Tournament", ViewTour);

        SelectSport1.setText("Select Sport first then Round Number");

        SportsComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Sport", "Hockey", "Football", "Rugby", "Netball" }));

        ViewResultsButtton.setText("View Results");
        ViewResultsButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewResultsButttonActionPerformed(evt);
            }
        });

        SelectRoundNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Round Number", "First Round", "Semi Finals", "Finals" }));
        SelectRoundNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectRoundNumberActionPerformed(evt);
            }
        });

        SelectGameNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Game Number", "1", "2", "3", "4" }));

        RoundNumber.setText("Round Number");

        GameNumber.setText("Game Number");

        Team1Label.setText("Team 1 -");

        Team2Label.setText("Team 2 - ");

        T1ViewScore.setEditable(false);

        T2ViewScore.setEditable(false);

        nameGame5.setText("Game 1");

        R1T17.setEditable(false);

        R1T18.setEditable(false);

        R1T19.setEditable(false);

        R1T20.setEditable(false);

        nameGame6.setText("Game 2");

        R1T21.setEditable(false);

        R1T22.setEditable(false);

        nameGame7.setText("Game 3");

        nameGame8.setText("Game 4");

        R1T23.setEditable(false);

        R1T24.setEditable(false);

        WinnerView.setEditable(false);

        Team1Label2.setText("Winner");

        WinnerScoreView.setEditable(false);

        WinnerScoreLabel1.setText("Score");

        javax.swing.GroupLayout ViewGameLayout = new javax.swing.GroupLayout(ViewGame);
        ViewGame.setLayout(ViewGameLayout);
        ViewGameLayout.setHorizontalGroup(
            ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewGameLayout.createSequentialGroup()
                .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewGameLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewGameLayout.createSequentialGroup()
                                .addComponent(RoundNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SelectRoundNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(R1T20, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R1T19, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R1T17, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R1T18, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ViewGameLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameGame6)
                                    .addGroup(ViewGameLayout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(R1T23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(R1T24, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(ViewGameLayout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(nameGame8))))
                                    .addGroup(ViewGameLayout.createSequentialGroup()
                                        .addComponent(nameGame5)
                                        .addGap(84, 84, 84)
                                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(R1T21, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(R1T22, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(ViewGameLayout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(nameGame7)))))))
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewGameLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(GameNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SelectGameNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewGameLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewGameLayout.createSequentialGroup()
                                        .addComponent(Team2Label)
                                        .addGap(18, 18, 18)
                                        .addComponent(T2ViewScore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ViewGameLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(Team1Label)
                                        .addGap(18, 18, 18)
                                        .addComponent(T1ViewScore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35)
                                .addComponent(Team1Label2)
                                .addGap(29, 29, 29))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewGameLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(WinnerView, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(WinnerScoreLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WinnerScoreView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE))
                .addGap(36, 36, 36))
            .addGroup(ViewGameLayout.createSequentialGroup()
                .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewGameLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(SelectSport1))
                    .addGroup(ViewGameLayout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(ViewResultsButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewGameLayout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(SportsComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ViewGameLayout.setVerticalGroup(
            ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewGameLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(SelectSport1)
                .addGap(18, 18, 18)
                .addComponent(SportsComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewGameLayout.createSequentialGroup()
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SelectRoundNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RoundNumber)
                            .addComponent(SelectGameNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GameNumber))
                        .addGap(18, 18, 18)
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ViewGameLayout.createSequentialGroup()
                                .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ViewGameLayout.createSequentialGroup()
                                        .addComponent(nameGame5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R1T17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R1T18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ViewGameLayout.createSequentialGroup()
                                        .addComponent(nameGame7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R1T22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R1T21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(54, 54, 54)
                                .addComponent(nameGame6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R1T19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R1T20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ViewGameLayout.createSequentialGroup()
                                .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ViewGameLayout.createSequentialGroup()
                                        .addComponent(nameGame8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R1T23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(ViewGameLayout.createSequentialGroup()
                                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(T1ViewScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Team1Label))
                                        .addGap(67, 67, 67)
                                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(T2ViewScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Team2Label))
                                        .addGap(16, 16, 16)))
                                .addComponent(R1T24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ViewGameLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Team1Label2)
                            .addComponent(WinnerScoreLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WinnerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WinnerScoreView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(ViewResultsButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        TabbedPanel.addTab("View Round/Game", ViewGame);

        SelectSport2.setText("Select Sport first then Round Number");

        SportsComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Sport", "Hockey", "Football", "Rugby", "Netball" }));

        EnterResultsButton.setText("Enter Round Results");
        EnterResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterResultsButtonActionPerformed(evt);
            }
        });

        SelectRoundNumber1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Round Number", "First Round", "Semi Finals", "Finals" }));
        SelectRoundNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectRoundNumber1ActionPerformed(evt);
            }
        });

        SelectGameNumber1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Game Number", "1", "2", "3", "4" }));
        SelectGameNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectGameNumber1ActionPerformed(evt);
            }
        });

        RoundNumber1.setText("Round Number");

        GameNumber1.setText("Game Number");

        Team1Label1.setText("Team 1 - ");

        Team2Label1.setText("Team 2 - ");

        ErrorPreventionResultsEnter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ErrorPreventionResultsEnter.setToolTipText("");

        R1T9.setEditable(false);

        R1T10.setEditable(false);

        R1T11.setEditable(false);

        R1T12.setEditable(false);

        R1T13.setEditable(false);

        R1T14.setEditable(false);

        R1T15.setEditable(false);

        R1T16.setEditable(false);

        nameGame1.setText("Game 1");

        nameGame2.setText("Game 2");

        nameGame3.setText("Game 3");

        nameGame4.setText("Game 4");

        WinnerEnterLabel.setText("Winner");

        WinnerScoreLabel.setText("Score");

        ClearResultsFile.setText("Clear Game Results File");
        ClearResultsFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearResultsFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EnterResultsLayout = new javax.swing.GroupLayout(EnterResults);
        EnterResults.setLayout(EnterResultsLayout);
        EnterResultsLayout.setHorizontalGroup(
            EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnterResultsLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnterResultsLayout.createSequentialGroup()
                        .addComponent(RoundNumber1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SelectRoundNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EnterResultsLayout.createSequentialGroup()
                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R1T12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R1T11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(R1T16, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R1T15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(EnterResultsLayout.createSequentialGroup()
                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R1T9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R1T10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R1T13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R1T14, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(EnterResultsLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EnterResultsLayout.createSequentialGroup()
                                .addComponent(nameGame2)
                                .addGap(118, 118, 118)
                                .addComponent(nameGame4))
                            .addGroup(EnterResultsLayout.createSequentialGroup()
                                .addComponent(nameGame1)
                                .addGap(118, 118, 118)
                                .addComponent(nameGame3)))))
                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnterResultsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GameNumber1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SelectGameNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(EnterResultsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Team1Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Team2Label1))
                        .addGap(18, 18, 18)
                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(T2EnterScore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T1EnterScore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(EnterResultsLayout.createSequentialGroup()
                                .addComponent(WinnerEnterLabel)
                                .addGap(18, 18, 18)
                                .addComponent(WinnerScoreLabel)
                                .addGap(42, 42, 42))
                            .addGroup(EnterResultsLayout.createSequentialGroup()
                                .addComponent(WinnerEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WinnerScoreEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnterResultsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnterResultsLayout.createSequentialGroup()
                        .addComponent(EnterResultsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(ClearResultsFile, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnterResultsLayout.createSequentialGroup()
                        .addComponent(ErrorPreventionResultsEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
            .addGroup(EnterResultsLayout.createSequentialGroup()
                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnterResultsLayout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(SportsComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EnterResultsLayout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(SelectSport2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EnterResultsLayout.setVerticalGroup(
            EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterResultsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(SelectSport2)
                .addGap(18, 18, 18)
                .addComponent(SportsComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectRoundNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectGameNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoundNumber1)
                    .addComponent(GameNumber1))
                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnterResultsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameGame1)
                            .addComponent(nameGame3))
                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EnterResultsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(EnterResultsLayout.createSequentialGroup()
                                        .addComponent(R1T9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R1T10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(EnterResultsLayout.createSequentialGroup()
                                        .addComponent(R1T13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R1T14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nameGame2)
                                    .addComponent(nameGame4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(EnterResultsLayout.createSequentialGroup()
                                        .addComponent(R1T15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R1T16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(EnterResultsLayout.createSequentialGroup()
                                        .addComponent(R1T11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R1T12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27))
                            .addGroup(EnterResultsLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(EnterResultsLayout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(T2EnterScore, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Team2Label1)))
                                    .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Team1Label1)
                                        .addComponent(T1EnterScore, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(EnterResultsLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WinnerEnterLabel)
                            .addComponent(WinnerScoreLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WinnerEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WinnerScoreEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)))
                .addComponent(ErrorPreventionResultsEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterResultsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearResultsFile, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        TabbedPanel.addTab("Enter Round Results", EnterResults);

        SelectSport3.setText("Select Sports Tournament");

        SportsComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Sport", "Hockey", "Football", "Rugby", "Netball" }));

        TournamentTree3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        TournamentTree3.setText("Tournament Tree");

        SetupTourButtton.setText("Setup Tournament");
        SetupTourButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetupTourButttonActionPerformed(evt);
            }
        });

        ClearTourButtton.setText("Clear Tournament");
        ClearTourButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearTourButttonActionPerformed(evt);
            }
        });

        Team1Enter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Team1Enter.setText("Team 1");

        Team2Enter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Team2Enter.setText("Team 2");

        Team3Enter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Team3Enter.setText("Team 3");

        Team4Enter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Team4Enter.setText("Team 4");

        Team5Enter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Team5Enter.setText("Team 5");

        Team6Enter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Team6Enter.setText("Team 6");

        Team7Enter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Team7Enter.setText("Team 7");

        Team8Enter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Team8Enter.setText("Team 8");

        ErrorPreventionTeamSetup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ErrorPreventionTeamSetup1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout SetupTourLayout = new javax.swing.GroupLayout(SetupTour);
        SetupTour.setLayout(SetupTourLayout);
        SetupTourLayout.setHorizontalGroup(
            SetupTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetupTourLayout.createSequentialGroup()
                .addGroup(SetupTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SetupTourLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(SelectSport3)
                        .addGap(30, 30, 30)
                        .addComponent(SportsComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SetupTourLayout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(TournamentTree3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SetupTourLayout.createSequentialGroup()
                .addGroup(SetupTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SetupTourLayout.createSequentialGroup()
                        .addContainerGap(210, Short.MAX_VALUE)
                        .addGroup(SetupTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(SetupTourLayout.createSequentialGroup()
                                .addComponent(Team1Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Team2Enter))
                            .addGroup(SetupTourLayout.createSequentialGroup()
                                .addComponent(Team5Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Team6Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))
                    .addGroup(SetupTourLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SetupTourButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(SetupTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClearTourButtton)
                    .addGroup(SetupTourLayout.createSequentialGroup()
                        .addComponent(Team7Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Team8Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SetupTourLayout.createSequentialGroup()
                        .addComponent(Team3Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Team4Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(161, 161, 161))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SetupTourLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ErrorPreventionTeamSetup, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
            .addGroup(SetupTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SetupTourLayout.createSequentialGroup()
                    .addContainerGap(344, Short.MAX_VALUE)
                    .addComponent(ErrorPreventionTeamSetup1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(270, 270, 270)))
        );
        SetupTourLayout.setVerticalGroup(
            SetupTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetupTourLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TournamentTree3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SetupTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectSport3)
                    .addComponent(SportsComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(SetupTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Team1Enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Team2Enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Team3Enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Team4Enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(SetupTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Team5Enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Team7Enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Team8Enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Team6Enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(ErrorPreventionTeamSetup)
                .addGap(18, 18, 18)
                .addGroup(SetupTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetupTourButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearTourButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(SetupTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SetupTourLayout.createSequentialGroup()
                    .addContainerGap(339, Short.MAX_VALUE)
                    .addComponent(ErrorPreventionTeamSetup1)
                    .addGap(152, 152, 152)))
        );

        TabbedPanel.addTab("Setup Tournament", SetupTour);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabbedPanel))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
//    Method for View Results button being pressed
    private void ViewResultsButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewResultsButttonActionPerformed
        String SportType = SportsComboBox1.getSelectedItem().toString();
        String RoundNum = SelectRoundNumber.getSelectedItem().toString();
        String GameNum = SelectGameNumber.getSelectedItem().toString();
        
        if (SportType.equals("Select a Sport")){
            ErrorPreventionResultsEnter.setText("Please select a sport.");
        }
        
        else if (SportType.equals("Hockey")){
            switch (RoundNum) {
                case "Select Round Number" -> ErrorPreventionResultsEnter.setText("Please select a Round Number.");
                case "First Round" -> {
                    Main Main = new Main();
                    try {
                        Main.readHockeyTeams();
                        R1T17.setText(Team1);
                        R1T18.setText(Team2);
                        R1T19.setText(Team3);
                        R1T20.setText(Team4);
                        R1T21.setText(Team5);
                        R1T22.setText(Team6);
                        R1T23.setText(Team7);
                        R1T24.setText(Team8);
                    }
                    
                    catch (IOException ex) {
                        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    
                    switch (GameNum) {
                        case "Select Game Number" -> {
                            Team1Label.setText("Team 1 - ");
                            Team2Label.setText("Team 2 - ");
                            
                            ErrorPreventionResultsEnter.setText("");
                            
                            T1ViewScore.setText("");
                            T2ViewScore.setText("");
                            WinnerView.setText("");
                            WinnerScoreView.setText("");
                        }
                        
                        case "1" -> {
                            Team1Label.setText("Team 1 - " + Team1);
                            Team2Label.setText("Team 2 - " + Team2);
                            ErrorPreventionResultsEnter.setText("");
                            
                            try {
                                getResults("1");
                                                            
                                T1ViewScore.setText(team1Score);
                                T2ViewScore.setText(team2Score);
                                WinnerView.setText(winnerName);
                                WinnerScoreView.setText(winnerScore);
                            
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                                ErrorPreventionResultsEnter.setText("Game is not found?");
                            }   
                        }
                        
                        case "2" -> {
                            Team1Label.setText("Team 1 - " + Team3);
                            Team2Label.setText("Team 2 - " + Team4);
                            ErrorPreventionResultsEnter.setText("");
                            
                            try {
                                getResults("2");
                                                            
                                T1ViewScore.setText(team1Score);
                                T2ViewScore.setText(team2Score);
                                WinnerView.setText(winnerName);
                                WinnerScoreView.setText(winnerScore);
                                
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                                ErrorPreventionResultsEnter.setText("Game is not found?");
                            }   
                        }
                        
                        case "3" -> {
                            Team1Label.setText("Team 1 - " + Team5);
                            Team2Label.setText("Team 2 - " + Team6);
                            ErrorPreventionResultsEnter.setText("");
                            
                            try {
                                getResults("3");
                                                            
                                T1ViewScore.setText(team1Score);
                                T2ViewScore.setText(team2Score);
                                WinnerView.setText(winnerName);
                                WinnerScoreView.setText(winnerScore);
                            
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                                ErrorPreventionResultsEnter.setText("Game is not found?");
                            }   
                        }
                        
                        case "4" -> {
                            Team1Label.setText("Team 1 - " + Team7);
                            Team2Label.setText("Team 2 - " + Team8);
                            ErrorPreventionResultsEnter.setText("");
                            
                            try {
                                getResults("4");
                                
                                T1ViewScore.setText(team1Score);
                                T2ViewScore.setText(team2Score);
                                WinnerView.setText(winnerName);
                                WinnerScoreView.setText(winnerScore);
                            
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                                ErrorPreventionResultsEnter.setText("Game is not found?");
                            }   
                        }
                        
                        default -> {
                            }
                    }
                }
                case "Semi Finals" -> {
                    switch (GameNum) {
                        case "Select Game Number" -> {
                            Team1Label.setText("Team 1 - ");
                            Team2Label.setText("Team 2 - ");
                            ErrorPreventionResultsEnter.setText("");
                        }
                        
                        case "1" -> {
                            try {
                                getResults("1");
                                Team1Label.setText("Team 1 - " + winnerName);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                
                            try {
                                getResults("2");
                                Team2Label.setText("Team 2 - " + winnerName);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            ErrorPreventionResultsEnter.setText("");
                            
                            try {
                                getResults("5");
                                
                                T1ViewScore.setText(team1Score);
                                T2ViewScore.setText(team2Score);
                                WinnerView.setText(winnerName);
                                WinnerScoreView.setText(winnerScore);
                            
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                                ErrorPreventionResultsEnter.setText("Game is not found?");
                            }   
                        }
                        
                        case "2" -> {
                            try {
                                getResults("3");
                                Team1Label.setText("Team 1 - " + winnerName);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                
                            try {
                                getResults("4");
                                Team2Label.setText("Team 2 - " + winnerName);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            ErrorPreventionResultsEnter.setText("");
                            
                            try {
                                getResults("6");
                                
                                T1ViewScore.setText(team1Score);
                                T2ViewScore.setText(team2Score);
                                WinnerView.setText(winnerName);
                                WinnerScoreView.setText(winnerScore);
                            
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                                ErrorPreventionResultsEnter.setText("Game is not found?");
                            }   
                        }
                        
                        default -> {
                            Team1Label.setText("Team 1 - ");
                            Team2Label.setText("Team 2 - ");
                            ErrorPreventionResultsEnter.setText("Game Number Not Found in Currently Selected Round");
                        }
                    }
                }
                case "Finals" -> {
                    
                    switch (GameNum) {
                        case "Select Game Number" -> {
                            Team1Label.setText("Team 1 - ");
                            Team2Label.setText("Team 2 - ");
                            ErrorPreventionResultsEnter.setText("");  
                        }
                        
                        case "1" -> {
                            try {
                                getResults("5");
                                Team1Label.setText("Team 1 - " + winnerName);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                
                            try {
                                getResults("6");
                                Team2Label.setText("Team 2 - " + winnerName);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            ErrorPreventionResultsEnter.setText("");
                            
                            try {
                                getResults("7");
                                
                                T1ViewScore.setText(team1Score);
                                T2ViewScore.setText(team2Score);
                                WinnerView.setText(winnerName);
                                WinnerScoreView.setText(winnerScore);
                                
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                            }   
                        }
                        
                        default -> {
                            Team1Label.setText("Team 1 - ");
                            Team2Label.setText("Team 2 - ");
                            ErrorPreventionResultsEnter.setText("Game Number Not Found in Currently Selected Round");
                        }
                    }
                }
                
                default -> {
                }
            }
        }
        try {
            loadSavedGameResults();
            System.out.print(GameResults.size());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ViewResultsButttonActionPerformed

//    Method for Setup Tournament Button being pressed    
    private void SetupTourButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetupTourButttonActionPerformed
        TeamNames.clear();
        
        ErrorPreventionTeamSetup.setText("");
        
        int T1 = Team1Enter.getText().length();
        int T2 = Team2Enter.getText().length();
        int T3 = Team3Enter.getText().length();
        int T4 = Team4Enter.getText().length();
        int T5 = Team5Enter.getText().length();               
        int T6 = Team6Enter.getText().length();                
        int T7 = Team7Enter.getText().length();
        int T8 = Team8Enter.getText().length();
        
        Team1Enter.setBorder(new LineBorder(Color.black,1));
        Team2Enter.setBorder(new LineBorder(Color.black,1));
        Team3Enter.setBorder(new LineBorder(Color.black,1));
        Team4Enter.setBorder(new LineBorder(Color.black,1));
        Team5Enter.setBorder(new LineBorder(Color.black,1));
        Team6Enter.setBorder(new LineBorder(Color.black,1));
        Team7Enter.setBorder(new LineBorder(Color.black,1));
        Team8Enter.setBorder(new LineBorder(Color.black,1));
        
            
        if (T1 < 10) {
            TeamNames.add(Team1Enter.getText());
            
            if (T2 < 10) {
                TeamNames.add(Team2Enter.getText());
            
                if (T3 < 10) {
                    TeamNames.add(Team3Enter.getText());
            
                    if (T4 < 10) {
                        TeamNames.add(Team4Enter.getText());
            
                        if (T5 < 10) {
                            TeamNames.add(Team5Enter.getText());
            
                            if (T6 < 10) {
                                TeamNames.add(Team6Enter.getText());
            
                                if (T7 < 10) {
                                    TeamNames.add(Team7Enter.getText());
            
                                    if (T8 < 10) {
                                        TeamNames.add(Team8Enter.getText());
                                        
                                        String SportType = SportsComboBox3.getSelectedItem().toString();
        
                                        if (SportType.equals("Select a Sport")){
                                            ErrorPreventionTeamSetup.setText("Please select a sport.");
                                        }
        
                                        else if (SportType.equals("Hockey")){
                                            try {  
                                                Main Main = new Main();
                                                Main.clearHockeyTeams();
                                                writeHockeyTeams(); 
            
                                                ErrorPreventionTeamSetup.setText("Teams have been Entered");
                                            } 
                                            
                                            catch (IOException ex) {
                                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        }
                    
                                    } else {
                                        Team8Enter.setBorder(new LineBorder(Color.red,1));
                                        ErrorPreventionTeamSetup.setText("Team name too Long");
                                    }
            
                                } else {
                                    Team7Enter.setBorder(new LineBorder(Color.red,1));
                                    ErrorPreventionTeamSetup.setText("Team name too Long");
                                }
                
                            } else {
                                Team6Enter.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionTeamSetup.setText("Team name too Long");
                            }   
            
                        } else {
                            Team5Enter.setBorder(new LineBorder(Color.red,1));
                            ErrorPreventionTeamSetup.setText("Team name too Long");
                        }
            
                    } else {
                        Team4Enter.setBorder(new LineBorder(Color.red,1));
                        ErrorPreventionTeamSetup.setText("Team name too Long");
                    }
                
                } else {
                    Team3Enter.setBorder(new LineBorder(Color.red,1));
                    ErrorPreventionTeamSetup.setText("Team name too Long");
                }
            
            } else {
                Team2Enter.setBorder(new LineBorder(Color.red,1));
                ErrorPreventionTeamSetup.setText("Team name too Long");
            }

        } else {
            Team1Enter.setBorder(new LineBorder(Color.red,1));
            ErrorPreventionTeamSetup.setText("Team name too Long");
        }
     
        
        
        
        
                       
    }//GEN-LAST:event_SetupTourButttonActionPerformed

//    Method for Select Round Number ComboBox being changed on View Tour Page
    private void SelectRoundNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectRoundNumberActionPerformed
        String SportType = SportsComboBox1.getSelectedItem().toString();
        String RoundNum = SelectRoundNumber.getSelectedItem().toString();
        
        if (SportType.equals("Select a Sport")){
            ErrorPreventionResultsEnter.setText("Please select a sport.");
        }
        
        else if (SportType.equals("Hockey")){
            ErrorPreventionResultsEnter.setText("");
            switch (RoundNum) {
                case "Select Round Number" -> {
                    nameGame5.setVisible(true);
                    nameGame6.setVisible(true);
                    nameGame7.setVisible(true);
                    nameGame8.setVisible(true);
                    
                    R1T17.setVisible(true);
                    R1T18.setVisible(true);
                    R1T19.setVisible(true);
                    R1T20.setVisible(true);
                    R1T21.setVisible(true);
                    R1T22.setVisible(true);
                    R1T23.setVisible(true);
                    R1T24.setVisible(true);
                    
                    R1T17.setText("");
                    R1T18.setText("");
                    R1T19.setText("");
                    R1T20.setText("");
                    R1T21.setText("");
                    R1T22.setText("");
                    R1T23.setText("");
                    R1T24.setText("");
                }
                
                case "First Round" ->   {
                    SelectGameNumber.removeAllItems();
                    SelectGameNumber.addItem("Select Game Number");
                    SelectGameNumber.addItem("1");
                    SelectGameNumber.addItem("2");
                    SelectGameNumber.addItem("3");
                    SelectGameNumber.addItem("4");
                    
                        nameGame5.setVisible(true);
                        nameGame6.setVisible(true);
                        nameGame7.setVisible(true);
                        nameGame8.setVisible(true);
                        
                        R1T17.setVisible(true);
                        R1T18.setVisible(true);
                        R1T19.setVisible(true);
                        R1T20.setVisible(true);
                        R1T21.setVisible(true);
                        R1T22.setVisible(true);
                        R1T23.setVisible(true);
                        R1T24.setVisible(true);
                        
                        Main Main = new Main();
                        try {
                            Main.readHockeyTeams();
                            R1T17.setText(Team1);
                            R1T18.setText(Team2);
                            R1T19.setText(Team3);
                            R1T20.setText(Team4);
                            R1T21.setText(Team5);
                            R1T22.setText(Team6);
                            R1T23.setText(Team7);
                            R1T24.setText(Team8);
                        }
                        
                        catch (IOException ex) {
                            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                        } 
                }
                
                case "Semi Finals" ->                     {
                    SelectGameNumber.removeAllItems();
                    SelectGameNumber.addItem("Select Game Number");
                    SelectGameNumber.addItem("1");
                    SelectGameNumber.addItem("2");
                    
                        nameGame5.setVisible(true);
                        nameGame6.setVisible(true);
                        nameGame7.setVisible(false);
                        nameGame8.setVisible(false);
                        
                        R1T17.setVisible(true);
                        R1T18.setVisible(true);
                        R1T19.setVisible(true);
                        R1T20.setVisible(true);
                        R1T21.setVisible(false);
                        R1T22.setVisible(false);
                        R1T23.setVisible(false);
                        R1T24.setVisible(false);
                        
                try {
                    getResults("1");
                    R1T17.setText(winnerName);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                    getResults("2");
                    R1T18.setText(winnerName);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                    getResults("3");
                    R1T19.setText(winnerName);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                    getResults("4");
                    R1T20.setText(winnerName);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }

                }
                
                case "Finals" ->                     {
                    SelectGameNumber.removeAllItems();
                    SelectGameNumber.addItem("Select Game Number");
                    SelectGameNumber.addItem("1");
                    
                        nameGame5.setVisible(true);
                        nameGame6.setVisible(false);
                        nameGame7.setVisible(false);
                        nameGame8.setVisible(false);
                        
                        R1T17.setVisible(true);
                        R1T18.setVisible(true);
                        R1T19.setVisible(false);
                        R1T20.setVisible(false);
                        R1T21.setVisible(false);
                        R1T22.setVisible(false);
                        R1T23.setVisible(false);
                        R1T24.setVisible(false);
                        
                try {
                    getResults("5");
                    R1T17.setText(winnerName);
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                    getResults("6");
                    R1T18.setText(winnerName);
              
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                
                default -> {
                }
            }
        }
    }//GEN-LAST:event_SelectRoundNumberActionPerformed

//    Method for Enter Results Button being pressed      
    private void EnterResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterResultsButtonActionPerformed
        String SportType = SportsComboBox2.getSelectedItem().toString();
        String RoundNum = SelectRoundNumber1.getSelectedItem().toString();
        String GameNum = SelectGameNumber1.getSelectedItem().toString();
        
        
        
        if (SportType.equals("Select a Sport")){
            ErrorPreventionResultsEnter.setText("Please select a sport.");
        }
        
        else if (SportType.equals("Hockey")){
            switch (RoundNum) {
                case "Select Round Number" -> ErrorPreventionResultsEnter.setText("Please select a Round Number.");
                case "First Round" -> {
                switch (GameNum) {
                    case "Select Game Number" -> ErrorPreventionResultsEnter.setText("Please select a Game Number.");
                    case "1" ->                         {
                        try {
                            T1EnterScore.setBorder(new LineBorder(Color.black,1));
                            T2EnterScore.setBorder(new LineBorder(Color.black,1));
                            WinnerScoreEnter.setBorder(new LineBorder(Color.black,1));
                            WinnerEnter.setBorder(new LineBorder(Color.black,1));
                            
                            String Team1Score = T1EnterScore.getText();
                            int Score1 = Integer.parseInt(Team1Score);
                            
                            String Team2Score = T2EnterScore.getText();
                            int Score2 = Integer.parseInt(Team2Score);
                            
                            String WinnerName = WinnerEnter.getText();
                            
                            String WinnerScore = WinnerScoreEnter.getText();
                            int winnerScoreEnter = Integer.parseInt(WinnerScore);
                            
                            if (Score1 < 0){
                                T1EnterScore.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                                break; 
                            }
                            
                            if (Score2 < 0){
                                T2EnterScore.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                                break; 
                            }
                            
                            if (winnerScoreEnter < 0){
                                WinnerScoreEnter.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only"); 
                                break; 
                            }
                            
                            if (WinnerName.length() > 10){
                                WinnerEnter.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Winner Name cannot be more than 10 Characters");
                                break; 
                            }
                        

                            try {
                                loadSavedGameResults();
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                            }                                                                  
                            
                            game = new Results("1", 1, 1, Team1, Score1, Team2, Score2, WinnerName, winnerScoreEnter);
                            
                            for (int index = 0; index < GameResults.size(); index++){
                                if (GameResults.get(index).getGameID().equals("1")){
                                    GameResults.set(index, game);
                                    writeHockeyResults();
                                    ErrorPreventionResultsEnter.setText("Your about to replace an already existing result would you like to continue?");
                                    break;
                                }
                                
                                else{
                                    GameResults.add(game);
                                    writeHockeyResults();
                                    ErrorPreventionResultsEnter.setText("Game Results Entered.");
                                    break;
                                }
                            }   
                            
                            T1EnterScore.setText("");
                            T2EnterScore.setText("");
                            WinnerEnter.setText("");
                            WinnerScoreEnter.setText("");
                            
                        }catch (NumberFormatException e) {
                            T1EnterScore.setBorder(new LineBorder(Color.red,1));
                            T2EnterScore.setBorder(new LineBorder(Color.red,1));
                            WinnerScoreEnter.setBorder(new LineBorder(Color.red,1));
                            ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                        }
                    }
                    
                    case "2" ->                         {
                            try {
                            T1EnterScore.setBorder(new LineBorder(Color.black,1));
                            T2EnterScore.setBorder(new LineBorder(Color.black,1));
                            WinnerScoreEnter.setBorder(new LineBorder(Color.black,1));
                            WinnerEnter.setBorder(new LineBorder(Color.black,1));
                            
                            String Team1Score = T1EnterScore.getText();
                            int Score1 = Integer.parseInt(Team1Score);
                            
                            String Team2Score = T2EnterScore.getText();
                            int Score2 = Integer.parseInt(Team2Score);
                            
                            String WinnerName = WinnerEnter.getText();
                            
                            String WinnerScore = WinnerScoreEnter.getText();
                            int winnerScoreEnter = Integer.parseInt(WinnerScore);
                            
                            if (Score1 < 0){
                                T1EnterScore.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                                break; 
                            }
                            
                            if (Score2 < 0){
                                T2EnterScore.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                                break; 
                            }
                            
                            if (winnerScoreEnter < 0){
                                WinnerScoreEnter.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only"); 
                                break; 
                            }
                            
                            if (WinnerName.length() > 10){
                                WinnerEnter.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Winner Name cannot be more than 10 Characters");
                                break; 
                            }
                        

                            try {
                                loadSavedGameResults();
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                            }                                                                  
                            
                            game = new Results("2", 1, 2, Team1, Score1, Team2, Score2, WinnerName, winnerScoreEnter);
                            
                            for (int index = 0; index < GameResults.size(); index++){
                                if (GameResults.get(index).getGameID().equals("2")){
                                    GameResults.set(index, game);
                                    writeHockeyResults();
                                    ErrorPreventionResultsEnter.setText("Your about to replace an already existing result would you like to continue?");
                                    break;
                                }
                                
                                else{
                                    GameResults.add(game);
                                    writeHockeyResults();
                                    ErrorPreventionResultsEnter.setText("Game Results Entered.");
                                    break;
                                }
                            }   
                            
                            T1EnterScore.setText("");
                            T2EnterScore.setText("");
                            WinnerEnter.setText("");
                            WinnerScoreEnter.setText("");
                            
                        }catch (NumberFormatException e) {
                            T1EnterScore.setBorder(new LineBorder(Color.red,1));
                            T2EnterScore.setBorder(new LineBorder(Color.red,1));
                            WinnerScoreEnter.setBorder(new LineBorder(Color.red,1));
                            ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                        }
                    }
                    
                    case "3" ->                         {
                            try {
                            T1EnterScore.setBorder(new LineBorder(Color.black,1));
                            T2EnterScore.setBorder(new LineBorder(Color.black,1));
                            WinnerScoreEnter.setBorder(new LineBorder(Color.black,1));
                            WinnerEnter.setBorder(new LineBorder(Color.black,1));
                            
                            String Team1Score = T1EnterScore.getText();
                            int Score1 = Integer.parseInt(Team1Score);
                            
                            String Team2Score = T2EnterScore.getText();
                            int Score2 = Integer.parseInt(Team2Score);
                            
                            String WinnerName = WinnerEnter.getText();
                            
                            String WinnerScore = WinnerScoreEnter.getText();
                            int winnerScoreEnter = Integer.parseInt(WinnerScore);
                            
                            if (Score1 < 0){
                                T1EnterScore.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                                break; 
                            }
                            
                            if (Score2 < 0){
                                T2EnterScore.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                                break; 
                            }
                            
                            if (winnerScoreEnter < 0){
                                WinnerScoreEnter.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only"); 
                                break; 
                            }
                            
                            if (WinnerName.length() > 10){
                                WinnerEnter.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Winner Name cannot be more than 10 Characters");
                                break; 
                            }
                        

                            try {
                                loadSavedGameResults();
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                            }                                                                  
                            
                            game = new Results("3", 1, 3, Team1, Score1, Team2, Score2, WinnerName, winnerScoreEnter);
                            
                            for (int index = 0; index < GameResults.size(); index++){
                                if (GameResults.get(index).getGameID().equals("3")){
                                    GameResults.set(index, game);
                                    writeHockeyResults();
                                    ErrorPreventionResultsEnter.setText("Your about to replace an already existing result would you like to continue?");
                                    break;
                                }
                                
                                else{
                                    GameResults.add(game);
                                    writeHockeyResults();
                                    ErrorPreventionResultsEnter.setText("Game Results Entered.");
                                    break;
                                }
                            }   
                            
                            T1EnterScore.setText("");
                            T2EnterScore.setText("");
                            WinnerEnter.setText("");
                            WinnerScoreEnter.setText("");
                            
                        }catch (NumberFormatException e) {
                            T1EnterScore.setBorder(new LineBorder(Color.red,1));
                            T2EnterScore.setBorder(new LineBorder(Color.red,1));
                            WinnerScoreEnter.setBorder(new LineBorder(Color.red,1));
                            ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                        }
                    }
                    
                    case "4" ->                         {
                            try {
                            T1EnterScore.setBorder(new LineBorder(Color.black,1));
                            T2EnterScore.setBorder(new LineBorder(Color.black,1));
                            WinnerScoreEnter.setBorder(new LineBorder(Color.black,1));
                            WinnerEnter.setBorder(new LineBorder(Color.black,1));
                            
                            String Team1Score = T1EnterScore.getText();
                            int Score1 = Integer.parseInt(Team1Score);
                            
                            String Team2Score = T2EnterScore.getText();
                            int Score2 = Integer.parseInt(Team2Score);
                            
                            String WinnerName = WinnerEnter.getText();
                            
                            String WinnerScore = WinnerScoreEnter.getText();
                            int winnerScoreEnter = Integer.parseInt(WinnerScore);
                            
                            if (Score1 < 0){
                                T1EnterScore.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                                break; 
                            }
                            
                            if (Score2 < 0){
                                T2EnterScore.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                                break; 
                            }
                            
                            if (winnerScoreEnter < 0){
                                WinnerScoreEnter.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only"); 
                                break; 
                            }
                            
                            if (WinnerName.length() > 10){
                                WinnerEnter.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Winner Name cannot be more than 10 Characters");
                                break; 
                            }
                        

                            try {
                                loadSavedGameResults();
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                            }                                                                  
                            
                            game = new Results("4", 1, 4, Team1, Score1, Team2, Score2, WinnerName, winnerScoreEnter);
                            
                            for (int index = 0; index < GameResults.size(); index++){
                                if (GameResults.get(index).getGameID().equals("4")){
                                    GameResults.set(index, game);
                                    writeHockeyResults();
                                    ErrorPreventionResultsEnter.setText("Your about to replace an already existing result would you like to continue?");
                                    break;
                                }
                                
                                else{
                                    GameResults.add(game);
                                    writeHockeyResults();
                                    ErrorPreventionResultsEnter.setText("Game Results Entered.");
                                    break;
                                }
                            }   
                            
                            T1EnterScore.setText("");
                            T2EnterScore.setText("");
                            WinnerEnter.setText("");
                            WinnerScoreEnter.setText("");
                            
                            }catch (NumberFormatException e) {
                                T1EnterScore.setBorder(new LineBorder(Color.red,1));
                                T2EnterScore.setBorder(new LineBorder(Color.red,1));
                                WinnerScoreEnter.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                            }
                    }
                
                }
            }
                
                case "Semi Finals" -> {
                    switch (GameNum) {                        
                        case "Select Game Number" -> ErrorPreventionResultsEnter.setText("Please select a Game Number.");
                        case "1" ->                         {
                            try {
                            T1EnterScore.setBorder(new LineBorder(Color.black,1));
                            T2EnterScore.setBorder(new LineBorder(Color.black,1));
                            WinnerScoreEnter.setBorder(new LineBorder(Color.black,1));
                            WinnerEnter.setBorder(new LineBorder(Color.black,1));
                            
                            String Team1Score = T1EnterScore.getText();
                            int Score1 = Integer.parseInt(Team1Score);
                            
                            String Team2Score = T2EnterScore.getText();
                            int Score2 = Integer.parseInt(Team2Score);
                            
                            String WinnerName = WinnerEnter.getText();
                            
                            String WinnerScore = WinnerScoreEnter.getText();
                            int winnerScoreEnter = Integer.parseInt(WinnerScore);
                            
                            if (Score1 < 0){
                                T1EnterScore.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                                break; 
                            }
                            
                            if (Score2 < 0){
                                T2EnterScore.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                                break; 
                            }
                            
                            if (winnerScoreEnter < 0){
                                WinnerScoreEnter.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only"); 
                                break; 
                            }
                            
                            if (WinnerName.length() > 10){
                                WinnerEnter.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Winner Name cannot be more than 10 Characters");
                                break; 
                            }
                        

                            try {
                                loadSavedGameResults();
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                            }                                                                  
                            
                            game = new Results("5", 2, 1, Team1, Score1, Team2, Score2, WinnerName, winnerScoreEnter);
                            
                            for (int index = 0; index < GameResults.size(); index++){
                                if (GameResults.get(index).getGameID().equals("5")){
                                    GameResults.set(index, game);
                                    writeHockeyResults();
                                    ErrorPreventionResultsEnter.setText("Your about to replace an already existing result would you like to continue?");
                                    break;
                                }
                                
                                else{
                                    GameResults.add(game);
                                    writeHockeyResults();
                                    ErrorPreventionResultsEnter.setText("Game Results Entered.");
                                    break;
                                }
                            }   
                            
                            T1EnterScore.setText("");
                            T2EnterScore.setText("");
                            WinnerEnter.setText("");
                            WinnerScoreEnter.setText("");
                            
                            }catch (NumberFormatException e) {
                                T1EnterScore.setBorder(new LineBorder(Color.red,1));
                                T2EnterScore.setBorder(new LineBorder(Color.red,1));
                                WinnerScoreEnter.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                            }
                        }
                        
                        case "2" ->                         {
                            try {
                            T1EnterScore.setBorder(new LineBorder(Color.black,1));
                            T2EnterScore.setBorder(new LineBorder(Color.black,1));
                            WinnerScoreEnter.setBorder(new LineBorder(Color.black,1));
                            WinnerEnter.setBorder(new LineBorder(Color.black,1));
                            
                            String Team1Score = T1EnterScore.getText();
                            int Score1 = Integer.parseInt(Team1Score);
                            
                            String Team2Score = T2EnterScore.getText();
                            int Score2 = Integer.parseInt(Team2Score);
                            
                            String WinnerName = WinnerEnter.getText();
                            
                            String WinnerScore = WinnerScoreEnter.getText();
                            int winnerScoreEnter = Integer.parseInt(WinnerScore);
                            
                            if (Score1 < 0){
                                T1EnterScore.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                                break; 
                            }
                            
                            if (Score2 < 0){
                                T2EnterScore.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                                break; 
                            }
                            
                            if (winnerScoreEnter < 0){
                                WinnerScoreEnter.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only"); 
                                break; 
                            }
                            
                            if (WinnerName.length() > 10){
                                WinnerEnter.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Winner Name cannot be more than 10 Characters");
                                break; 
                            }
                        

                            try {
                                loadSavedGameResults();
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                            }                                                                  
                            
                            game = new Results("6", 2, 2, Team1, Score1, Team2, Score2, WinnerName, winnerScoreEnter);
                            
                            for (int index = 0; index < GameResults.size(); index++){
                                if (GameResults.get(index).getGameID().equals("6")){
                                    GameResults.set(index, game);
                                    writeHockeyResults();
                                    ErrorPreventionResultsEnter.setText("Your about to replace an already existing result would you like to continue?");
                                    break;
                                }
                                
                                else{
                                    GameResults.add(game);
                                    writeHockeyResults();
                                    ErrorPreventionResultsEnter.setText("Game Results Entered.");
                                    break;
                                }
                            }   
                            
                            T1EnterScore.setText("");
                            T2EnterScore.setText("");
                            WinnerEnter.setText("");
                            WinnerScoreEnter.setText("");
                            
                        }catch (NumberFormatException e) {
                            T1EnterScore.setBorder(new LineBorder(Color.red,1));
                            T2EnterScore.setBorder(new LineBorder(Color.red,1));
                            WinnerScoreEnter.setBorder(new LineBorder(Color.red,1));
                            ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                        }
                        }
                    }
                }
                        
                case "Finals" -> {
                    switch (GameNum) {                        
                        case "Select Game Number" -> ErrorPreventionResultsEnter.setText("Please select a Game Number.");
                        case "1" ->                         {
                            try {
                            T1EnterScore.setBorder(new LineBorder(Color.black,1));
                            T2EnterScore.setBorder(new LineBorder(Color.black,1));
                            WinnerScoreEnter.setBorder(new LineBorder(Color.black,1));
                            WinnerEnter.setBorder(new LineBorder(Color.black,1));
                            
                            String Team1Score = T1EnterScore.getText();
                            int Score1 = Integer.parseInt(Team1Score);
                            
                            String Team2Score = T2EnterScore.getText();
                            int Score2 = Integer.parseInt(Team2Score);
                            
                            String WinnerName = WinnerEnter.getText();
                            
                            String WinnerScore = WinnerScoreEnter.getText();
                            int winnerScoreEnter = Integer.parseInt(WinnerScore);
                            
                            if (Score1 < 0){
                                T1EnterScore.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                                break; 
                            }
                            
                            if (Score2 < 0){
                                T2EnterScore.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                                break; 
                            }
                            
                            if (winnerScoreEnter < 0){
                                WinnerScoreEnter.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only"); 
                                break; 
                            }
                            
                            if (WinnerName.length() > 10){
                                WinnerEnter.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Winner Name cannot be more than 10 Characters");
                                break; 
                            }
                        

                            try {
                                loadSavedGameResults();
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                            }                                                                  
                            
                            game = new Results("7", 3, 1, Team1, Score1, Team2, Score2, WinnerName, winnerScoreEnter);
                            
                            for (int index = 0; index < GameResults.size(); index++){
                                if (GameResults.get(index).getGameID().equals("7")){
                                    GameResults.set(index, game);
                                    writeHockeyResults();
                                    ErrorPreventionResultsEnter.setText("Your about to replace an already existing result would you like to continue?");
                                    break;
                                }
                                
                                else{
                                    GameResults.add(game);
                                    writeHockeyResults();
                                    ErrorPreventionResultsEnter.setText("Game Results Entered.");
                                    break;
                                }
                            }   
                            
                            T1EnterScore.setText("");
                            T2EnterScore.setText("");
                            WinnerEnter.setText("");
                            WinnerScoreEnter.setText("");
                            
                            }catch (NumberFormatException e) {
                                T1EnterScore.setBorder(new LineBorder(Color.red,1));
                                T2EnterScore.setBorder(new LineBorder(Color.red,1));
                                WinnerScoreEnter.setBorder(new LineBorder(Color.red,1));
                                ErrorPreventionResultsEnter.setText("Positive numbers for scores only");
                            }
                           
                        }
                    }
                }     
            }
        }    
    }//GEN-LAST:event_EnterResultsButtonActionPerformed

//    Method for Select Round Number ComboBox being changed on Enter Results Page  
    private void SelectRoundNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectRoundNumber1ActionPerformed
        String SportType = SportsComboBox2.getSelectedItem().toString();
        String RoundNum = SelectRoundNumber1.getSelectedItem().toString();
        
        if (SportType.equals("Select a Sport")){
            ErrorPreventionResultsEnter.setText("Please select a sport.");
        }
        
        else if (SportType.equals("Hockey")){
            ErrorPreventionResultsEnter.setText("");
            switch (RoundNum) {
                case "Select Round Number" -> {
                    nameGame1.setVisible(true);
                    nameGame2.setVisible(true);
                    nameGame3.setVisible(true);
                    nameGame4.setVisible(true);
                    
                    R1T9.setVisible(true);
                    R1T10.setVisible(true);
                    R1T11.setVisible(true);
                    R1T12.setVisible(true);
                    R1T13.setVisible(true);
                    R1T14.setVisible(true);
                    R1T15.setVisible(true);
                    R1T16.setVisible(true);
                    
                    R1T9.setText("");
                    R1T10.setText("");
                    R1T11.setText("");
                    R1T12.setText("");
                    R1T13.setText("");
                    R1T14.setText("");
                    R1T15.setText("");
                    R1T16.setText("");
                }
                
                case "First Round" ->                     {
//                    SelectGameNumber1.removeAllItems();
//                    SelectGameNumber1.addItem("Select Game Number");
//                    SelectGameNumber1.addItem("1"); 
//                    SelectGameNumber1.addItem("2");
//                    SelectGameNumber1.addItem("3"); 
//                    SelectGameNumber1.addItem("4");
                    
                        nameGame1.setVisible(true);
                        nameGame2.setVisible(true);
                        nameGame3.setVisible(true);
                        nameGame4.setVisible(true);
                        
                        R1T9.setVisible(true);
                        R1T10.setVisible(true);
                        R1T11.setVisible(true);
                        R1T12.setVisible(true);
                        R1T13.setVisible(true);
                        R1T14.setVisible(true);
                        R1T15.setVisible(true);
                        R1T16.setVisible(true);
                        
                        Main Main = new Main();
                        try {
                            Main.readHockeyTeams();
                            R1T9.setText(Team1);
                            R1T10.setText(Team2);
                            R1T11.setText(Team3);
                            R1T12.setText(Team4);
                            R1T13.setText(Team5);
                            R1T14.setText(Team6);
                            R1T15.setText(Team7);
                            R1T16.setText(Team8);
                        }
                        
                        catch (IOException ex) {
                            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                        }  
                }
                
                case "Semi Finals" ->                     {
//                    SelectGameNumber1.removeAllItems();
//                    SelectGameNumber1.addItem("Select Game Number");
//                    SelectGameNumber1.addItem("1"); 
//                    SelectGameNumber1.addItem("2"); 
                    
                        nameGame1.setVisible(true);
                        nameGame2.setVisible(true);
                        nameGame3.setVisible(false);
                        nameGame4.setVisible(false);
                        
                        R1T9.setVisible(true);
                        R1T10.setVisible(true);
                        R1T11.setVisible(true);
                        R1T12.setVisible(true);
                        R1T13.setVisible(false);
                        R1T14.setVisible(false);
                        R1T15.setVisible(false);
                        R1T16.setVisible(false);
                        
                        try {
                            getResults("1");
                            R1T9.setText(winnerName);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                        }
                
                        try {
                            getResults("2");
                            R1T10.setText(winnerName);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                        }
                
                        try {
                            getResults("3");
                            R1T11.setText(winnerName);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                        }
                
                        try {
                            getResults("4");
                            R1T12.setText(winnerName);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                        }   
                }
                
                case "Finals" ->                     {
//                    SelectGameNumber1.removeAllItems();
//                    SelectGameNumber1.addItem("Select Game Number");
//                    SelectGameNumber1.addItem("1");   
                    
                        nameGame1.setVisible(true);
                        nameGame2.setVisible(false);
                        nameGame3.setVisible(false);
                        nameGame4.setVisible(false);
                        
                        R1T9.setVisible(true);
                        R1T10.setVisible(true);
                        R1T11.setVisible(false);
                        R1T12.setVisible(false);
                        R1T13.setVisible(false);
                        R1T14.setVisible(false);
                        R1T15.setVisible(false);
                        R1T16.setVisible(false);
                        
                        try {
                            getResults("5");
                            R1T9.setText(winnerName);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                        }
                
                        try {
                            getResults("6");
                            R1T10.setText(winnerName);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                        }
                              
                }
                
                default -> {
                }
            }
        }
    }//GEN-LAST:event_SelectRoundNumber1ActionPerformed

//    Method for Select Game Number ComboBox being changed on Enter Results Page     
    private void SelectGameNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectGameNumber1ActionPerformed
        String SportType = SportsComboBox2.getSelectedItem().toString();
        String RoundNum = SelectRoundNumber1.getSelectedItem().toString();
        String GameNum = SelectGameNumber1.getSelectedItem().toString();
        
                String WinnerG1 = "";
                String WinnerG2 = "";
                String WinnerG3 = "";
                String WinnerG4 = "";
                String WinnerSemiG1 = "";
                String WinnerSemiG2 = "";
        
                        try {
                            getResults("1");
                            WinnerG1 = winnerName;
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                        }
                
                        try {
                            getResults("2");
                            WinnerG2 = winnerName;
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                        }
                
                        try {
                            getResults("3");
                            WinnerG3 = winnerName;
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                        }
                
                        try {
                            getResults("4");
                            WinnerG4 = winnerName;
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        try {
                            getResults("5");
                            WinnerSemiG1 = winnerName;
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                        }
                
                        try {
                            getResults("6");
                            WinnerSemiG2 = winnerName;
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                        }                        
        
        if (SportType.equals("Select a Sport")){
            ErrorPreventionResultsEnter.setText("Please select a sport.");
        }
        
        else if (SportType.equals("Hockey")){               
            switch (RoundNum) {
                case "Select Round Number" -> ErrorPreventionResultsEnter.setText("Please select a Round Number.");
                case "First Round" -> {
                switch (GameNum) {
                    case "Select Game Number" -> {
                        Team1Label1.setText("Team 1 - ");
                        Team2Label1.setText("Team 2 - ");
                        ErrorPreventionResultsEnter.setText("");
                    }
                    
                    case "1" -> {
                        Team1Label1.setText("Team 1 - " + Team1);
                        Team2Label1.setText("Team 2 - " + Team2);
                        ErrorPreventionResultsEnter.setText("");
                    }
                    
                    case "2" -> {
                        Team1Label1.setText("Team 1 - " + Team3);
                        Team2Label1.setText("Team 2 - " + Team4);
                        ErrorPreventionResultsEnter.setText("");
                    }
                    
                    case "3" -> {
                        Team1Label1.setText("Team 1 - " + Team5);
                        Team2Label1.setText("Team 2 - " + Team6);
                        ErrorPreventionResultsEnter.setText("");
                    }
                    
                    case "4" -> {
                        Team1Label1.setText("Team 1 - " + Team7);
                        Team2Label1.setText("Team 2 - " + Team8);
                        ErrorPreventionResultsEnter.setText("");
                    }
                    
                    default -> {
                    }
                }
                }
                
                case "Semi Finals" -> {
                switch (GameNum) {
                    case "Select Game Number" -> {
                        Team1Label1.setText("Team 1 - ");
                        Team2Label1.setText("Team 2 - ");
                        ErrorPreventionResultsEnter.setText("");
                    }
                    
                    case "1" -> {
                        Team1Label1.setText("Team 1 - " + WinnerG1);
                        Team2Label1.setText("Team 2 - " + WinnerG2);
                        ErrorPreventionResultsEnter.setText("");
                    }
                    
                    case "2" -> {
                        Team1Label1.setText("Team 1 - " + WinnerG3);
                        Team2Label1.setText("Team 2 - " + WinnerG4);
                        ErrorPreventionResultsEnter.setText("");
                    }
                    
                    default -> {
                        Team1Label1.setText("Team 1 - ");
                        Team2Label1.setText("Team 2 - ");
                        ErrorPreventionResultsEnter.setText("Game Number Not Found in Currently Selected Round");
                    }
                }
                }
                case "Finals" -> {
                switch (GameNum) {
                    case "Select Game Number" -> {
                        Team1Label1.setText("Team 1 - ");
                        Team2Label1.setText("Team 2 - ");
                        ErrorPreventionResultsEnter.setText("");
                    }
                    
                    case "1" -> {
                        Team1Label1.setText("Team 1 - " + WinnerSemiG1);
                        Team2Label1.setText("Team 2 - " + WinnerSemiG2);
                        ErrorPreventionResultsEnter.setText("");
                    }
                    
                    default -> {
                        Team1Label1.setText("Team 1 - ");
                        Team2Label1.setText("Team 2 - ");
                        ErrorPreventionResultsEnter.setText("Game Number Not Found in Currently Selected Round");
                    }
                }
                }
                default -> {
                }
            }
        }
    }//GEN-LAST:event_SelectGameNumber1ActionPerformed

//    Method for Clear Tournament Button being pressed 
    private void ClearTourButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearTourButttonActionPerformed
       String SportType = SportsComboBox3.getSelectedItem().toString();
        
        if (SportType.equals("Select a Sport")){
            ErrorPreventionTeamSetup.setText("Please select a sport.");
        }
        
        else if (SportType.equals("Hockey")){
            try {
            Main Main = new Main();
            Main.clearHockeyTeams();
            
            ErrorPreventionTeamSetup.setText("Teams have been cleared");
            } 
            
            catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_ClearTourButttonActionPerformed

//    Method for View Tournament Button being pressed     
    private void ViewTourButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTourButttonActionPerformed
        String SportType = SportsComboBox.getSelectedItem().toString();
            R1T1.setText("");
            R1T2.setText("");
            R1T3.setText("");
            R1T4.setText("");
            R1T5.setText("");
            R1T6.setText("");
            R1T7.setText("");
            R1T8.setText("");        
        
        if (SportType.equals("Select a Sport")){
            ErrorPreventionViewTour.setText("Please select a sport.");
            R1T1.setText("");
            R1T2.setText("");
            R1T3.setText("");
            R1T4.setText("");
            R1T5.setText("");
            R1T6.setText("");
            R1T7.setText("");
            R1T8.setText("");
            ScoreR1T1.setText("0");
            ScoreR1T2.setText("0");
            ScoreR1T3.setText("0");
            ScoreR1T4.setText("0");
            ScoreR1T5.setText("0");
            ScoreR1T6.setText("0");
            ScoreR1T7.setText("0");
            ScoreR1T8.setText("0");
            
            SemiT1.setText("");
            SemiT2.setText("");
            SemiT3.setText("");
            SemiT4.setText("");
            ScoreSemiT1.setText("0");
            ScoreSemiT2.setText("0");
            ScoreSemiT3.setText("0");
            ScoreSemiT4.setText("0");
            
            FinalT1.setText("");
            FinalT2.setText("");
            ScoreFinalT1.setText("0");
            ScoreFinalT2.setText("0");
            
            TourWinner.setText("");

          
        }
        
        else if (SportType.equals("Hockey")){
            ErrorPreventionViewTour.setText("");
            Main Main = new Main();
            try {
                Main.readHockeyTeams();
                R1T1.setText(Team1);
                R1T2.setText(Team2);
                R1T3.setText(Team3);
                R1T4.setText(Team4);
                R1T5.setText(Team5);
                R1T6.setText(Team6);
                R1T7.setText(Team7);
                R1T8.setText(Team8);
            } 
        
            catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                getResults("1");
                                                            
                ScoreR1T1.setText(team1Score);
                ScoreR1T2.setText(team2Score);
                SemiT1.setText(winnerName);
                            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                getResults("2");
                                                            
                ScoreR1T3.setText(team1Score);
                ScoreR1T4.setText(team2Score);
                SemiT2.setText(winnerName);
                            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                getResults("3");
                                                            
                ScoreR1T5.setText(team1Score);
                ScoreR1T6.setText(team2Score);
                SemiT3.setText(winnerName);
                            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                getResults("4");
                                                            
                ScoreR1T7.setText(team1Score);
                ScoreR1T8.setText(team2Score);
                SemiT4.setText(winnerName);
                            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                getResults("5");
                                                            
                ScoreSemiT1.setText(team1Score);
                ScoreSemiT2.setText(team2Score);
                FinalT1.setText(winnerName);
                            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                getResults("6");
                                                            
                ScoreSemiT3.setText(team1Score);
                ScoreSemiT4.setText(team2Score);
                FinalT2.setText(winnerName);
                            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                getResults("7");
                                                            
                ScoreFinalT1.setText(team1Score);
                ScoreFinalT2.setText(team2Score);
                TourWinner.setText(winnerName);
                            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
    }//GEN-LAST:event_ViewTourButttonActionPerformed

//    Method for Select Game Type ComboBox being changed on View Tournament Page 
    private void SportsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SportsComboBoxActionPerformed
        String SportType = SportsComboBox.getSelectedItem().toString();
        
        if (SportType.equals("Select a Sport")){
            R1T1.setText("");
            R1T2.setText("");
            R1T3.setText("");
            R1T4.setText("");
            R1T5.setText("");
            R1T6.setText("");
            R1T7.setText("");
            R1T8.setText("");
            
            ScoreR1T1.setText("0");
            ScoreR1T2.setText("0");
            ScoreR1T3.setText("0");
            ScoreR1T4.setText("0");
            ScoreR1T5.setText("0");
            ScoreR1T6.setText("0");
            ScoreR1T7.setText("0");
            ScoreR1T8.setText("0");
            
            SemiT1.setText("");
            SemiT2.setText("");
            SemiT3.setText("");
            SemiT4.setText(""); 
            
            ScoreSemiT1.setText("0");
            ScoreSemiT2.setText("0");
            ScoreSemiT3.setText("0");
            ScoreSemiT4.setText("0");
            
            FinalT1.setText("");
            FinalT2.setText("");            
            ScoreFinalT1.setText("0");
            ScoreFinalT2.setText("0");
            
            TourWinner.setText("");
            
        }
    }//GEN-LAST:event_SportsComboBoxActionPerformed
    
//    Method for Clear Results File Button being pressed     
    private void ClearResultsFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearResultsFileActionPerformed
        String SportType = SportsComboBox2.getSelectedItem().toString();
        
        if (SportType.equals("Select a Sport")){
            ErrorPreventionResultsEnter.setText("Please select a sport.");
        }
        
            else if (SportType.equals("Hockey")){     
                try {
                    ErrorPreventionResultsEnter.setText("Team Results Cleared.");
                    Main Main = new Main();
                    Main.clearHockeyResults();
                    }           
                catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_ClearResultsFileActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
            
        
    }
    
    private void setElements(){
        nameGame1.setVisible(true);
        nameGame2.setVisible(true);
        nameGame3.setVisible(true);
        nameGame4.setVisible(true);
                
        R1T9.setVisible(true);
        R1T10.setVisible(true);
        R1T11.setVisible(true);
        R1T12.setVisible(true);
        R1T13.setVisible(true);
        R1T14.setVisible(true);
        R1T15.setVisible(true);
        R1T16.setVisible(true);
                
        R1T9.setText("");
        R1T10.setText("");
        R1T11.setText("");
        R1T12.setText("");
        R1T13.setText("");
        R1T14.setText("");
        R1T15.setText("");
        R1T16.setText("");
        
        T1EnterScore.setBorder(new LineBorder(Color.black,1));
        T2EnterScore.setBorder(new LineBorder(Color.black,1));
        WinnerScoreEnter.setBorder(new LineBorder(Color.black,1));
        WinnerEnter.setBorder(new LineBorder(Color.black,1));
        
        Team1Enter.setBorder(new LineBorder(Color.black,1));
        Team2Enter.setBorder(new LineBorder(Color.black,1));
        Team3Enter.setBorder(new LineBorder(Color.black,1));
        Team4Enter.setBorder(new LineBorder(Color.black,1));
        Team5Enter.setBorder(new LineBorder(Color.black,1));
        Team6Enter.setBorder(new LineBorder(Color.black,1));
        Team7Enter.setBorder(new LineBorder(Color.black,1));
        Team8Enter.setBorder(new LineBorder(Color.black,1));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearResultsFile;
    private javax.swing.JButton ClearTourButtton;
    private javax.swing.JPanel EnterResults;
    private javax.swing.JButton EnterResultsButton;
    private javax.swing.JLabel ErrorPreventionResultsEnter;
    private javax.swing.JLabel ErrorPreventionTeamSetup;
    private javax.swing.JLabel ErrorPreventionTeamSetup1;
    private javax.swing.JLabel ErrorPreventionViewTour;
    private javax.swing.JTextField FinalT1;
    private javax.swing.JTextField FinalT2;
    private javax.swing.JLabel FinalsLabel;
    private javax.swing.JLabel FirstRoundLabel;
    private javax.swing.JLabel GameNumber;
    private javax.swing.JLabel GameNumber1;
    private javax.swing.JTextField R1T1;
    private javax.swing.JTextField R1T10;
    private javax.swing.JTextField R1T11;
    private javax.swing.JTextField R1T12;
    private javax.swing.JTextField R1T13;
    private javax.swing.JTextField R1T14;
    private javax.swing.JTextField R1T15;
    private javax.swing.JTextField R1T16;
    private javax.swing.JTextField R1T17;
    private javax.swing.JTextField R1T18;
    private javax.swing.JTextField R1T19;
    private javax.swing.JTextField R1T2;
    private javax.swing.JTextField R1T20;
    private javax.swing.JTextField R1T21;
    private javax.swing.JTextField R1T22;
    private javax.swing.JTextField R1T23;
    private javax.swing.JTextField R1T24;
    private javax.swing.JTextField R1T3;
    private javax.swing.JTextField R1T4;
    private javax.swing.JTextField R1T5;
    private javax.swing.JTextField R1T6;
    private javax.swing.JTextField R1T7;
    private javax.swing.JTextField R1T8;
    private javax.swing.JTextField R1T9;
    private javax.swing.JLabel RoundNumber;
    private javax.swing.JLabel RoundNumber1;
    private javax.swing.JTextField ScoreFinalT1;
    private javax.swing.JTextField ScoreFinalT2;
    private javax.swing.JTextField ScoreR1T1;
    private javax.swing.JTextField ScoreR1T2;
    private javax.swing.JTextField ScoreR1T3;
    private javax.swing.JTextField ScoreR1T4;
    private javax.swing.JTextField ScoreR1T5;
    private javax.swing.JTextField ScoreR1T6;
    private javax.swing.JTextField ScoreR1T7;
    private javax.swing.JTextField ScoreR1T8;
    private javax.swing.JTextField ScoreSemiT1;
    private javax.swing.JTextField ScoreSemiT2;
    private javax.swing.JTextField ScoreSemiT3;
    private javax.swing.JTextField ScoreSemiT4;
    private javax.swing.JComboBox<String> SelectGameNumber;
    private javax.swing.JComboBox<String> SelectGameNumber1;
    private javax.swing.JComboBox<String> SelectRoundNumber;
    private javax.swing.JComboBox<String> SelectRoundNumber1;
    private javax.swing.JLabel SelectSport;
    private javax.swing.JLabel SelectSport1;
    private javax.swing.JLabel SelectSport2;
    private javax.swing.JLabel SelectSport3;
    private javax.swing.JLabel SemiFinalsLabel;
    private javax.swing.JTextField SemiT1;
    private javax.swing.JTextField SemiT2;
    private javax.swing.JTextField SemiT3;
    private javax.swing.JTextField SemiT4;
    private javax.swing.JPanel SetupTour;
    private javax.swing.JButton SetupTourButtton;
    private javax.swing.JComboBox<String> SportsComboBox;
    private javax.swing.JComboBox<String> SportsComboBox1;
    private javax.swing.JComboBox<String> SportsComboBox2;
    private javax.swing.JComboBox<String> SportsComboBox3;
    private javax.swing.JTextField T1EnterScore;
    private javax.swing.JTextField T1ViewScore;
    private javax.swing.JTextField T2EnterScore;
    private javax.swing.JTextField T2ViewScore;
    private javax.swing.JTabbedPane TabbedPanel;
    private javax.swing.JTextField Team1Enter;
    private javax.swing.JLabel Team1Label;
    private javax.swing.JLabel Team1Label1;
    private javax.swing.JLabel Team1Label2;
    private javax.swing.JTextField Team2Enter;
    private javax.swing.JLabel Team2Label;
    private javax.swing.JLabel Team2Label1;
    private javax.swing.JTextField Team3Enter;
    private javax.swing.JTextField Team4Enter;
    private javax.swing.JTextField Team5Enter;
    private javax.swing.JTextField Team6Enter;
    private javax.swing.JTextField Team7Enter;
    private javax.swing.JTextField Team8Enter;
    private javax.swing.JTextField TourWinner;
    private javax.swing.JLabel TournamentTree;
    private javax.swing.JLabel TournamentTree3;
    private javax.swing.JPanel ViewGame;
    private javax.swing.JButton ViewResultsButtton;
    private javax.swing.JPanel ViewTour;
    private javax.swing.JButton ViewTourButtton;
    private javax.swing.JTextField WinnerEnter;
    private javax.swing.JLabel WinnerEnterLabel;
    private javax.swing.JLabel WinnerLabel;
    private javax.swing.JTextField WinnerScoreEnter;
    private javax.swing.JLabel WinnerScoreLabel;
    private javax.swing.JLabel WinnerScoreLabel1;
    private javax.swing.JTextField WinnerScoreView;
    private javax.swing.JTextField WinnerView;
    private javax.swing.JLabel nameGame1;
    private javax.swing.JLabel nameGame2;
    private javax.swing.JLabel nameGame3;
    private javax.swing.JLabel nameGame4;
    private javax.swing.JLabel nameGame5;
    private javax.swing.JLabel nameGame6;
    private javax.swing.JLabel nameGame7;
    private javax.swing.JLabel nameGame8;
    // End of variables declaration//GEN-END:variables
}
