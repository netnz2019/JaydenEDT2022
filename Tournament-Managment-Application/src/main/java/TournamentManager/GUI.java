package TournamentManager;

import com.opencsv.CSVReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jaydenetheridge
 */
public class GUI extends javax.swing.JFrame {
    ArrayList<String> TeamNames = new ArrayList<>();
    List<Results> GameResults = new ArrayList<>();
    List<String[]> Resultslist = new ArrayList<>();
    Results game;
    String[] nextline;
    
    
    
    static String Team1;
    static String Team2;
    static String Team3;
    static String Team4;
    static String Team5;
    static String Team6;
    static String Team7;
    static String Team8;
    
    final String HockeyResultsFile = "/Users/jaydenetheridge/Documents/GitHub/JaydenEDT2022/Tournament-Managment-Application/CSV files/HockeyResults.csv";
    Path HockeyResultsPath = Paths.get("/Users/jaydenetheridge/Documents/GitHub/JaydenEDT2022/Tournament-Managment-Application/CSV files/HockeyResults.csv");
    final String HockeyTeamsFile = "/Users/jaydenetheridge/Documents/GitHub/JaydenEDT2022/Tournament-Managment-Application/CSV files/HockeyTournament.csv";
    
    /**
     * Creates new form Main
     */
    public GUI() {        
        initComponents();
        hideElements();
        
        
    }
    
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
    
    public void writeHockeyResults() throws IOException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException{
        
        try(FileWriter fw = new FileWriter(HockeyResultsFile, true);
            ){   
            
            
            // Create Mapping Strategy to arrange the 
            // column name in order
            ColumnPositionMappingStrategy mappingStrategy = new ColumnPositionMappingStrategy();
         
                        
            mappingStrategy.setType(Results.class);
  
            // Arrange column name as provided in below array.
            String[] columns = new String[] {"GameID", "RoundNum", "GameNum", "Team1", "Team1Score", "Team2", "Team2Score", "Winner", "WinnerScore"};
            mappingStrategy.setColumnMapping(columns);
  
            // Creating StatefulBeanToCsv object
            StatefulBeanToCsv beanWriter = new StatefulBeanToCsvBuilder(fw)
            .withMappingStrategy(mappingStrategy)
            .build();
            
            // Write list to StatefulBeanToCsv object
            beanWriter.write(GameResults);
            beanWriter.write(nextline);
       
            
            // closing the writer object
            fw.close();
            GameResults.clear();
        }       
        
        catch (IOException e) {
        }  
        
    }
    
    public void WriteResults(Results Game) throws FileNotFoundException, IOException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException{
        GameResults.add(Game);
        try{
            CSVReader reader = new CSVReader(new FileReader(HockeyResultsFile));
            
            while ((nextline = reader.readNext()) != null){
                if (nextline != null){
                    System.out.println(Arrays.toString(nextline));
                    
                }
            }
        }
        
        catch (IOException e){
            System.out.println(e);
        }
        
        writeHockeyResults();
    }   
    
    
    /**
     *
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public int lineCount() throws FileNotFoundException, IOException{
        String input;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(HockeyResultsFile));       
        int count = 0;
        while((input = bufferedReader.readLine()) != null){
            count++;
        }
        
        System.out.println("Count : " + count);
        return count;
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
        SelectSport = new javax.swing.JLabel();
        SportsComboBox = new javax.swing.JComboBox<>();
        TournamentTree = new javax.swing.JLabel();
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
        ScoreFinalsT1 = new javax.swing.JTextField();
        ScoreFinalsT2 = new javax.swing.JTextField();
        FIrstRoundLabel = new javax.swing.JLabel();
        SemiFinalsLabel = new javax.swing.JLabel();
        FinalsLabel = new javax.swing.JLabel();
        WinnerLabel = new javax.swing.JLabel();
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
        jTextField2 = new javax.swing.JTextField();
        T2EnterScore1 = new javax.swing.JTextField();
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
        jTextField1 = new javax.swing.JTextField();
        Team1Label2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
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

        SelectSport.setText("Select Sports Tournament");

        SportsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Sport", "Hockey", "Football", "Rugby", "Netball" }));
        SportsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SportsComboBoxActionPerformed(evt);
            }
        });

        TournamentTree.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        TournamentTree.setText("Tournament Tree");

        ViewTourButtton.setText("View Tournament");
        ViewTourButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTourButttonActionPerformed(evt);
            }
        });

        R1T1.setEditable(false);

        R1T2.setEditable(false);

        R1T3.setEditable(false);
        R1T3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T3ActionPerformed(evt);
            }
        });

        R1T4.setEditable(false);

        R1T5.setEditable(false);
        R1T5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T5ActionPerformed(evt);
            }
        });

        R1T6.setEditable(false);

        R1T7.setEditable(false);

        R1T8.setEditable(false);

        SemiT1.setEditable(false);

        SemiT2.setEditable(false);

        SemiT3.setEditable(false);

        SemiT4.setEditable(false);
        SemiT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemiT4ActionPerformed(evt);
            }
        });

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

        ScoreFinalsT1.setEditable(false);
        ScoreFinalsT1.setText("0");

        ScoreFinalsT2.setEditable(false);
        ScoreFinalsT2.setText("0");

        FIrstRoundLabel.setText("First Round");

        SemiFinalsLabel.setText("Semi-Finals");

        FinalsLabel.setText("Finals");

        WinnerLabel.setText("Winner");

        javax.swing.GroupLayout ViewTourLayout = new javax.swing.GroupLayout(ViewTour);
        ViewTour.setLayout(ViewTourLayout);
        ViewTourLayout.setHorizontalGroup(
            ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewTourLayout.createSequentialGroup()
                .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewTourLayout.createSequentialGroup()
                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewTourLayout.createSequentialGroup()
                                .addGap(301, 301, 301)
                                .addComponent(ViewTourButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ViewTourLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(FIrstRoundLabel)
                                .addGap(74, 74, 74)
                                .addComponent(SelectSport)))
                        .addGap(0, 313, Short.MAX_VALUE))
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
                                .addGap(270, 596, Short.MAX_VALUE))
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
                                            .addComponent(ScoreFinalsT2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ScoreFinalsT1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(48, 48, 48)
                                        .addComponent(TourWinner, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ViewTourLayout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addComponent(SemiFinalsLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(ViewTourLayout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(SportsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                                .addComponent(FinalsLabel)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(WinnerLabel)
                                        .addGap(38, 38, 38)))))))
                .addContainerGap())
            .addGroup(ViewTourLayout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(TournamentTree)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ViewTourLayout.setVerticalGroup(
            ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewTourLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TournamentTree)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(SelectSport)
                        .addComponent(FIrstRoundLabel))
                    .addComponent(SportsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                            .addComponent(ScoreFinalsT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ViewTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(FinalT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ScoreFinalsT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(2, 2, 2)
                .addComponent(ViewTourButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        TabbedPanel.addTab("View Tournament", ViewTour);

        SelectSport1.setText("Select Sport first then Round Number");

        SportsComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Sport", "Hockey", "Football", "Rugby", "Netball" }));
        SportsComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SportsComboBox1ActionPerformed(evt);
            }
        });

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
        SelectGameNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectGameNumberActionPerformed(evt);
            }
        });

        RoundNumber.setText("Round Number");

        GameNumber.setText("Game Number");

        Team1Label.setText("Team 1 -");

        Team2Label.setText("Team 2 - ");

        nameGame5.setText("Game 1");

        R1T17.setEditable(false);

        R1T18.setEditable(false);

        R1T19.setEditable(false);
        R1T19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T19ActionPerformed(evt);
            }
        });

        R1T20.setEditable(false);

        nameGame6.setText("Game 2");

        R1T21.setEditable(false);

        R1T22.setEditable(false);

        nameGame7.setText("Game 4");

        nameGame8.setText("Game 3");

        R1T23.setEditable(false);
        R1T23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T23ActionPerformed(evt);
            }
        });

        R1T24.setEditable(false);

        Team1Label2.setText("Winner");

        WinnerScoreLabel1.setText("Score");

        javax.swing.GroupLayout ViewGameLayout = new javax.swing.GroupLayout(ViewGame);
        ViewGame.setLayout(ViewGameLayout);
        ViewGameLayout.setHorizontalGroup(
            ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewGameLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewGameLayout.createSequentialGroup()
                        .addComponent(RoundNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SelectRoundNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewGameLayout.createSequentialGroup()
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R1T17, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R1T18, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R1T23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R1T24, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ViewGameLayout.createSequentialGroup()
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R1T20, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R1T19, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(R1T21, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R1T22, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ViewGameLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewGameLayout.createSequentialGroup()
                                .addComponent(nameGame5)
                                .addGap(118, 118, 118)
                                .addComponent(nameGame8))
                            .addGroup(ViewGameLayout.createSequentialGroup()
                                .addComponent(nameGame6)
                                .addGap(118, 118, 118)
                                .addComponent(nameGame7)))))
                .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewGameLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewGameLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(Team1Label)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewGameLayout.createSequentialGroup()
                                .addComponent(Team2Label)
                                .addGap(64, 64, 64)))
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T2EnterScore1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 157, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewGameLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewGameLayout.createSequentialGroup()
                                .addComponent(GameNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SelectGameNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewGameLayout.createSequentialGroup()
                                .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewGameLayout.createSequentialGroup()
                                        .addComponent(Team1Label2)
                                        .addGap(23, 23, 23))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(WinnerScoreLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(37, 37, 37))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewGameLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SportsComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ViewGameLayout.createSequentialGroup()
                .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewGameLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(SelectSport1))
                    .addGroup(ViewGameLayout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(ViewResultsButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(RoundNumber))
                        .addGap(18, 18, 18)
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameGame5)
                            .addComponent(nameGame8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewGameLayout.createSequentialGroup()
                                .addComponent(R1T23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R1T24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ViewGameLayout.createSequentialGroup()
                                .addComponent(R1T17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R1T18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameGame6)
                            .addComponent(nameGame7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewGameLayout.createSequentialGroup()
                                .addComponent(R1T22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R1T21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ViewGameLayout.createSequentialGroup()
                                .addComponent(R1T19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R1T20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ViewGameLayout.createSequentialGroup()
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SelectGameNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GameNumber))
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ViewGameLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Team1Label))
                                .addGap(80, 80, 80))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewGameLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Team1Label2)
                                    .addComponent(WinnerScoreLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)))
                        .addGroup(ViewGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T2EnterScore1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Team2Label))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(ViewResultsButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        TabbedPanel.addTab("View Round/Game", ViewGame);

        SelectSport2.setText("Select Sport first then Round Number");

        SportsComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Sport", "Hockey", "Football", "Rugby", "Netball" }));
        SportsComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SportsComboBox2ActionPerformed(evt);
            }
        });

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

        T2EnterScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2EnterScoreActionPerformed(evt);
            }
        });

        ErrorPreventionResultsEnter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ErrorPreventionResultsEnter.setToolTipText("");

        R1T9.setEditable(false);

        R1T10.setEditable(false);

        R1T11.setEditable(false);
        R1T11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T11ActionPerformed(evt);
            }
        });

        R1T12.setEditable(false);

        R1T13.setEditable(false);
        R1T13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1T13ActionPerformed(evt);
            }
        });

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
                            .addComponent(R1T9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R1T10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R1T13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R1T14, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(EnterResultsLayout.createSequentialGroup()
                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R1T12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R1T11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(R1T16, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R1T15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(EnterResultsLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EnterResultsLayout.createSequentialGroup()
                                .addComponent(nameGame1)
                                .addGap(118, 118, 118)
                                .addComponent(nameGame3))
                            .addGroup(EnterResultsLayout.createSequentialGroup()
                                .addComponent(nameGame2)
                                .addGap(118, 118, 118)
                                .addComponent(nameGame4)))))
                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnterResultsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GameNumber1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SelectGameNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(EnterResultsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Team2Label1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(Team1Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnterResultsLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
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
                                        .addGap(32, 32, 32))))
                            .addGroup(EnterResultsLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(T2EnterScore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(T1EnterScore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
            .addGroup(EnterResultsLayout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(SportsComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(291, 291, 291))
            .addGroup(EnterResultsLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(SelectSport2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnterResultsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ErrorPreventionResultsEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EnterResultsLayout.createSequentialGroup()
                        .addComponent(EnterResultsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(ClearResultsFile, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(170, 170, 170))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameGame1)
                    .addComponent(nameGame3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnterResultsLayout.createSequentialGroup()
                        .addComponent(R1T9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R1T10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
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
                        .addComponent(R1T13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R1T14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(EnterResultsLayout.createSequentialGroup()
                                .addComponent(T1EnterScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(WinnerEnterLabel)
                                    .addComponent(WinnerScoreLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(WinnerEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WinnerScoreEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(T2EnterScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Team2Label1)))
                            .addComponent(Team1Label1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(ErrorPreventionResultsEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EnterResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterResultsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearResultsFile, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        TabbedPanel.addTab("Enter Round Results", EnterResults);

        SelectSport3.setText("Select Sports Tournament");

        SportsComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Sport", "Hockey", "Football", "Rugby", "Netball" }));
        SportsComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SportsComboBox3ActionPerformed(evt);
            }
        });

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
        Team1Enter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Team1EnterFocusLost(evt);
            }
        });
        Team1Enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Team1EnterMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Team1EnterMouseReleased(evt);
            }
        });
        Team1Enter.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Team1EnterInputMethodTextChanged(evt);
            }
        });
        Team1Enter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Team1EnterKeyTyped(evt);
            }
        });

        Team2Enter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Team2Enter.setText("Team 2");
        Team2Enter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Team2EnterFocusLost(evt);
            }
        });

        Team3Enter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Team3Enter.setText("Team 3");

        Team4Enter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Team4Enter.setText("Team 4");
        Team4Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Team4EnterActionPerformed(evt);
            }
        });

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
                        .addContainerGap(189, Short.MAX_VALUE)
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
                    .addContainerGap(323, Short.MAX_VALUE)
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
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(SetupTourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SetupTourLayout.createSequentialGroup()
                    .addContainerGap(336, Short.MAX_VALUE)
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

    private void SportsComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SportsComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SportsComboBox1ActionPerformed

    private void ViewResultsButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewResultsButttonActionPerformed
        try {
            lineCount();
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ViewResultsButttonActionPerformed

    private void SportsComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SportsComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SportsComboBox3ActionPerformed
    
    private void SetupTourButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetupTourButttonActionPerformed
        TeamNames.clear();
        
        TeamNames.add(Team1Enter.getText());
        TeamNames.add(Team2Enter.getText());
        TeamNames.add(Team3Enter.getText());
        TeamNames.add(Team4Enter.getText());
        TeamNames.add(Team5Enter.getText());
        TeamNames.add(Team6Enter.getText());
        TeamNames.add(Team7Enter.getText());
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
    }//GEN-LAST:event_SetupTourButttonActionPerformed

    private void SelectRoundNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectRoundNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectRoundNumberActionPerformed

    private void SelectGameNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectGameNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectGameNumberActionPerformed

    private void SportsComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SportsComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SportsComboBox2ActionPerformed

    private void EnterResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterResultsButtonActionPerformed
        String SportType = SportsComboBox2.getSelectedItem().toString();
        String RoundNum = SelectRoundNumber1.getSelectedItem().toString();
        String GameNum = SelectGameNumber1.getSelectedItem().toString();
        
        if (SportType.equals("Select a Sport")){
            ErrorPreventionResultsEnter.setText("Please select a sport.");
        }
        
        else if (SportType.equals("Hockey")){
            if (RoundNum.equals("Select Round Number")){
                ErrorPreventionResultsEnter.setText("Please select a Round Number.");
            }
            
            else if (RoundNum.equals("First Round")){
                if (GameNum.equals("Select Game Number")){
                    ErrorPreventionResultsEnter.setText("Please select a Game Number.");
                }
                else if (GameNum.equals("1")){
                    String Team1Score = T1EnterScore.getText();
                    int team1Score = Integer.parseInt(Team1Score);
                    
                    String Team2Score = T2EnterScore.getText();
                    int team2Score = Integer.parseInt(Team2Score);
                    
                    String WinnerName = WinnerEnter.getText();
                    
                    String WinnerScore = WinnerScoreEnter.getText();
                    int winnerScoreEnter = Integer.parseInt(WinnerScore);
                    
                    game = new Results(1, 1, 1, Team1, team1Score, Team2, team2Score, WinnerName, winnerScoreEnter);
                    
                    ErrorPreventionResultsEnter.setText("Game Results Entered.");
                                                          
                    try {
                        WriteResults(game);
                    } 
                    
                    catch (IOException | CsvRequiredFieldEmptyException | CsvDataTypeMismatchException ex) {
                        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                else if (GameNum.equals("2")){
                    String Team1Score = T1EnterScore.getText();
                    int team1Score = Integer.parseInt(Team1Score);
                    
                    String Team2Score = T2EnterScore.getText();
                    int team2Score = Integer.parseInt(Team2Score);
                    
                    String WinnerName = WinnerEnter.getText();
                    
                    String WinnerScore = WinnerScoreEnter.getText();
                    int winnerScoreEnter = Integer.parseInt(WinnerScore);
                    
                    game = new Results(2, 1, 2, Team3, team1Score, Team4, team2Score, WinnerName, winnerScoreEnter);                
                    
                    ErrorPreventionResultsEnter.setText("Game Results Entered.");
                                                          
                    try {
                        WriteResults(game);
                    } 
                    
                    catch (IOException | CsvRequiredFieldEmptyException | CsvDataTypeMismatchException ex) {
                        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                else if (GameNum.equals("3")){
                    String Team1Score = T1EnterScore.getText();
                    int team1Score = Integer.parseInt(Team1Score);
                    
                    String Team2Score = T2EnterScore.getText();
                    int team2Score = Integer.parseInt(Team2Score);
                    
                    String WinnerName = WinnerEnter.getText();
                    
                    String WinnerScore = WinnerScoreEnter.getText();
                    int winnerScoreEnter = Integer.parseInt(WinnerScore);
                    
                    game = new Results(3, 1, 3, Team5, team1Score, Team6, team2Score, WinnerName, winnerScoreEnter);
                    
                    ErrorPreventionResultsEnter.setText("Game Results Entered.");
                                                          
                    try {
                        WriteResults(game);
                    } 
                    
                    catch (IOException | CsvRequiredFieldEmptyException | CsvDataTypeMismatchException ex) {
                        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                else if (GameNum.equals("4")){
                    String Team1Score = T1EnterScore.getText();
                    int team1Score = Integer.parseInt(Team1Score);
                    
                    String Team2Score = T2EnterScore.getText();
                    int team2Score = Integer.parseInt(Team2Score);
                    
                    String WinnerName = WinnerEnter.getText();
                    
                    String WinnerScore = WinnerScoreEnter.getText();
                    int winnerScoreEnter = Integer.parseInt(WinnerScore);
                    
                    game = new Results(4, 1, 4, Team7, team1Score, Team8, team2Score, WinnerName, winnerScoreEnter);
                    
                    ErrorPreventionResultsEnter.setText("Game Results Entered.");
                                                          
                    try {
                        WriteResults(game);
                    } 
                    
                    catch (IOException | CsvRequiredFieldEmptyException | CsvDataTypeMismatchException ex) {
                        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        
    }//GEN-LAST:event_EnterResultsButtonActionPerformed

    private void SelectRoundNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectRoundNumber1ActionPerformed
        String SportType = SportsComboBox2.getSelectedItem().toString();
        String RoundNum = SelectRoundNumber1.getSelectedItem().toString();
        
        if (SportType.equals("Select a Sport")){
            ErrorPreventionResultsEnter.setText("Please select a sport.");
        }
        
        else if (SportType.equals("Hockey")){               
            if (RoundNum.equals("Select Round Number")){
                nameGame1.setVisible(false);
                nameGame2.setVisible(false);
                nameGame3.setVisible(false);
                nameGame4.setVisible(false);
                
                R1T9.setVisible(false);
                R1T10.setVisible(false);
                R1T11.setVisible(false);
                R1T12.setVisible(false);
                R1T13.setVisible(false);
                R1T14.setVisible(false);
                R1T15.setVisible(false);
                R1T16.setVisible(false);
            }
            
            else if (RoundNum.equals("First Round")){
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
            
            else if (RoundNum.equals("Semi Finals")){
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
                
                Main Main = new Main();
                try {
                    Main.readHockeyTeams();
                    R1T9.setText(Team1);
                    R1T10.setText(Team2);
                    R1T11.setText(Team3);
                    R1T12.setText(Team4);
                } 
        
                catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if (RoundNum.equals("Finals")){
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
                
                Main Main = new Main();
                try {
                    Main.readHockeyTeams();
                    R1T9.setText(Team1);
                    R1T10.setText(Team2);
                } 
        
                catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_SelectRoundNumber1ActionPerformed

    private void SelectGameNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectGameNumber1ActionPerformed
        String SportType = SportsComboBox2.getSelectedItem().toString();
        String RoundNum = SelectRoundNumber1.getSelectedItem().toString();
        String GameNum = SelectGameNumber1.getSelectedItem().toString();
        
        if (SportType.equals("Select a Sport")){
            ErrorPreventionResultsEnter.setText("Please select a sport.");
        }
        
        else if (SportType.equals("Hockey")){               
            if (RoundNum.equals("Select Round Number")){
               ErrorPreventionResultsEnter.setText("Please select a Round Number.");
            }
            
            else if (RoundNum.equals("First Round")){
                if (GameNum.equals("Select Game Number")){
                    Team1Label1.setText("Team 1 - ");
                    Team2Label1.setText("Team 2 - ");
                    ErrorPreventionResultsEnter.setText("");
                }
            
                else if (GameNum.equals("1")){
                    Team1Label1.setText("Team 1 - " + Team1);
                    Team2Label1.setText("Team 2 - " + Team2);
                    ErrorPreventionResultsEnter.setText("");
                }
            
                else if (GameNum.equals("2")){
                    Team1Label1.setText("Team 1 - " + Team3);
                    Team2Label1.setText("Team 2 - " + Team4);
                    ErrorPreventionResultsEnter.setText("");
                }
            
                else if (GameNum.equals("3")){
                    Team1Label1.setText("Team 1 - " + Team5);
                    Team2Label1.setText("Team 2 - " + Team6);
                    ErrorPreventionResultsEnter.setText("");
                }
            
                else if (GameNum.equals("4")){
                    Team1Label1.setText("Team 1 - " + Team7);
                    Team2Label1.setText("Team 2 - " + Team8);
                    ErrorPreventionResultsEnter.setText("");
                }
            }
            
            else if (RoundNum.equals("Semi Finals")){
                if (GameNum.equals("Select Game Number")){
                    Team1Label1.setText("Team 1 - ");
                    Team2Label1.setText("Team 2 - ");
                    ErrorPreventionResultsEnter.setText("");
                }
            
                else if (GameNum.equals("1")){
                    Team1Label1.setText("Team 1 - " + Team1);
                    Team2Label1.setText("Team 2 - " + Team2);
                    ErrorPreventionResultsEnter.setText("");
                }
            
                else if (GameNum.equals("2")){
                    Team1Label1.setText("Team 1 - " + Team3);
                    Team2Label1.setText("Team 2 - " + Team4);
                    ErrorPreventionResultsEnter.setText("");
                }
            
                else {
                    Team1Label1.setText("Team 1 - ");
                    Team2Label1.setText("Team 2 - ");
                    ErrorPreventionResultsEnter.setText("Game Number Not Found in Currently Selected Round");
                }
            }
            
            else if (RoundNum.equals("Finals")){
                if (GameNum.equals("Select Game Number")){
                    Team1Label1.setText("Team 1 - ");
                    Team2Label1.setText("Team 2 - ");
                    ErrorPreventionResultsEnter.setText("");
                }
            
                else if (GameNum.equals("1")){
                    Team1Label1.setText("Team 1 - " + Team1);
                    Team2Label1.setText("Team 2 - " + Team2);
                    ErrorPreventionResultsEnter.setText("");
                }
            
                else {
                    Team1Label1.setText("Team 1 - ");
                    Team2Label1.setText("Team 2 - ");
                    ErrorPreventionResultsEnter.setText("Game Number Not Found in Currently Selected Round");
                }
            }
        }
    }//GEN-LAST:event_SelectGameNumber1ActionPerformed

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

    private void Team4EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Team4EnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Team4EnterActionPerformed

    private void ViewTourButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTourButttonActionPerformed
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
    }//GEN-LAST:event_ViewTourButttonActionPerformed

    private void SportsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SportsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SportsComboBoxActionPerformed

    private void R1T5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T5ActionPerformed

    private void R1T3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T3ActionPerformed

    private void SemiT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemiT4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SemiT4ActionPerformed

    private void Team1EnterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Team1EnterKeyTyped
        
    }//GEN-LAST:event_Team1EnterKeyTyped

    private void Team1EnterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Team1EnterMouseExited
        
    }//GEN-LAST:event_Team1EnterMouseExited

    private void Team1EnterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Team1EnterMouseReleased
        
    }//GEN-LAST:event_Team1EnterMouseReleased

    private void Team1EnterInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Team1EnterInputMethodTextChanged
        
    }//GEN-LAST:event_Team1EnterInputMethodTextChanged

    private void Team1EnterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Team1EnterFocusLost
        
    }//GEN-LAST:event_Team1EnterFocusLost

    private void Team2EnterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Team2EnterFocusLost
            
    }//GEN-LAST:event_Team2EnterFocusLost

    private void R1T11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T11ActionPerformed

    private void R1T13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T13ActionPerformed

    private void R1T19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T19ActionPerformed

    private void R1T23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1T23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1T23ActionPerformed

    private void T2EnterScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2EnterScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T2EnterScoreActionPerformed

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
    
    private void hideElements(){
        nameGame1.setVisible(false);
        nameGame2.setVisible(false);
        nameGame3.setVisible(false);
        nameGame4.setVisible(false);
        
        R1T9.setVisible(false);
        R1T10.setVisible(false);
        R1T11.setVisible(false);
        R1T12.setVisible(false);
        R1T13.setVisible(false);
        R1T14.setVisible(false);
        R1T15.setVisible(false);
        R1T16.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearResultsFile;
    private javax.swing.JButton ClearTourButtton;
    private javax.swing.JPanel EnterResults;
    private javax.swing.JButton EnterResultsButton;
    private javax.swing.JLabel ErrorPreventionResultsEnter;
    private javax.swing.JLabel ErrorPreventionTeamSetup;
    private javax.swing.JLabel ErrorPreventionTeamSetup1;
    private javax.swing.JLabel FIrstRoundLabel;
    private javax.swing.JTextField FinalT1;
    private javax.swing.JTextField FinalT2;
    private javax.swing.JLabel FinalsLabel;
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
    private javax.swing.JTextField ScoreFinalsT1;
    private javax.swing.JTextField ScoreFinalsT2;
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
    private javax.swing.JTextField T2EnterScore;
    private javax.swing.JTextField T2EnterScore1;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
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
