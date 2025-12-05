/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package seasaver;
import HomePage.SeaSaverHomeGUI;
import RyanProjectSea.ProjectGUI;   
import java.io.BufferedReader;  //BufferedWriter import
import java.io.BufferedWriter;  //BufferedWriter import
import java.io.FileReader;  //FileReader import
import java.io.FileWriter;  //FielWriter import
import java.io.IOException; //IoException import
import java.util.ArrayList; //Arraylist import
import javax.swing.ImageIcon;   //ImageIcon import
import javax.swing.JOptionPane; //joptionpane import

/**
 *
 * @author Seán
 */
public class SustainGUI extends javax.swing.JFrame {
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SustainGUI.class.getName());
       Calculations calc = new Calculations(); //Creating and declaring the class Calculations
       ArrayList<String> result;    //Declaring ArrayList result
       ArrayList<ScoreRecord> scoreList;    //Decalring arraylist scorelist
    /**
     */
    public SustainGUI() {   //Constructor
        initComponents();   
        result = new ArrayList<>();     //arraylist the show to the String result
        scoreList = new ArrayList<>(); //arraylist to store the number score
        imgLBL.setVisible(false);   //image is set to false when the page opens
    }

       
    /**
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        pagePanel = new javax.swing.JPanel();
        question1LBL = new javax.swing.JLabel();
        question2LBL = new javax.swing.JLabel();
        question3LBL = new javax.swing.JLabel();
        question4LBL = new javax.swing.JLabel();
        question5LBL = new javax.swing.JLabel();
        answerBox = new javax.swing.JScrollPane();
        scoreTA = new javax.swing.JTextArea();
        scoreLBL = new javax.swing.JLabel();
        q1YES = new javax.swing.JRadioButton();
        q1NO = new javax.swing.JRadioButton();
        q3YES = new javax.swing.JRadioButton();
        q2YES = new javax.swing.JRadioButton();
        q2NO = new javax.swing.JRadioButton();
        q3NO = new javax.swing.JRadioButton();
        q4YES = new javax.swing.JRadioButton();
        q4NO = new javax.swing.JRadioButton();
        q5YES = new javax.swing.JRadioButton();
        q5NO = new javax.swing.JRadioButton();
        submitBTN = new javax.swing.JButton();
        tryAgainBTN = new javax.swing.JButton();
        displayBTN = new javax.swing.JButton();
        imgPanel = new javax.swing.JPanel();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        subheadingPanel = new javax.swing.JPanel();
        navigationPanel = new javax.swing.JPanel();
        infrographicGUI = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();
        quizBTN = new javax.swing.JButton();
        homePageGUI = new javax.swing.JButton();
        nameLBL = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        searchBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        imgLBL = new javax.swing.JLabel();
        titleLBL = new javax.swing.JLabel();
        subheadingimgPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        pagePanel.setBackground(new java.awt.Color(102, 204, 255));

        question1LBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        question1LBL.setText(" Do you use single-use plastics?");

        question2LBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        question2LBL.setText("Do you choose sustainably sourced food?");

        question3LBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        question3LBL.setText("Do you take part in beach clean-ups?");

        question4LBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        question4LBL.setText("Do you use reusable water bottles?");

        question5LBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        question5LBL.setText("Do you choose water-efficient appliances?");

        scoreTA.setColumns(20);
        scoreTA.setRows(5);
        answerBox.setViewportView(scoreTA);

        scoreLBL.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        scoreLBL.setText("Your sustainability score:");

        buttonGroup1.add(q1YES);
        q1YES.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q1YES.setText("Yes");
        q1YES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1YESActionPerformed(evt);
            }
        });

        buttonGroup1.add(q1NO);
        q1NO.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q1NO.setText("No");

        buttonGroup3.add(q3YES);
        q3YES.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q3YES.setText("Yes");

        buttonGroup2.add(q2YES);
        q2YES.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q2YES.setText("Yes");

        buttonGroup2.add(q2NO);
        q2NO.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q2NO.setText("No");

        buttonGroup3.add(q3NO);
        q3NO.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q3NO.setText("No");

        buttonGroup5.add(q4YES);
        q4YES.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q4YES.setText("Yes");

        buttonGroup5.add(q4NO);
        q4NO.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q4NO.setText("No");

        buttonGroup4.add(q5YES);
        q5YES.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q5YES.setText("Yes");

        buttonGroup4.add(q5NO);
        q5NO.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q5NO.setText("No");

        submitBTN.setBackground(new java.awt.Color(153, 204, 0));
        submitBTN.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        submitBTN.setText("SUBMIT");
        submitBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        submitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBTNActionPerformed(evt);
            }
        });

        tryAgainBTN.setBackground(new java.awt.Color(255, 204, 204));
        tryAgainBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tryAgainBTN.setText("Try Again");
        tryAgainBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryAgainBTNActionPerformed(evt);
            }
        });

        displayBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        displayBTN.setText("Past Attempts");
        displayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBTNActionPerformed(evt);
            }
        });

        imgPanel.setBackground(new java.awt.Color(102, 204, 255));
        imgPanel.setForeground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout imgPanelLayout = new javax.swing.GroupLayout(imgPanel);
        imgPanel.setLayout(imgPanelLayout);
        imgPanelLayout.setHorizontalGroup(
            imgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );
        imgPanelLayout.setVerticalGroup(
            imgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        q1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q1.setText("1)");

        q2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q2.setText("2)");

        q3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q3.setText("3)");

        q4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q4.setText("4)");

        q5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        q5.setText("5)");

        subheadingPanel.setBackground(new java.awt.Color(204, 204, 204));

        navigationPanel.setBackground(new java.awt.Color(0, 0, 204));
        navigationPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        infrographicGUI.setBackground(new java.awt.Color(204, 204, 204));
        infrographicGUI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        infrographicGUI.setText("Infographic");
        infrographicGUI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        infrographicGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infrographicGUIActionPerformed(evt);
            }
        });

        exitBTN.setBackground(new java.awt.Color(204, 204, 204));
        exitBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitBTN.setText("Exit");
        exitBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        quizBTN.setBackground(new java.awt.Color(204, 204, 204));
        quizBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quizBTN.setText("Quiz");
        quizBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        homePageGUI.setBackground(new java.awt.Color(204, 204, 204));
        homePageGUI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        homePageGUI.setText("Homepage");
        homePageGUI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        homePageGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageGUIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navigationPanelLayout = new javax.swing.GroupLayout(navigationPanel);
        navigationPanel.setLayout(navigationPanelLayout);
        navigationPanelLayout.setHorizontalGroup(
            navigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationPanelLayout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(infrographicGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quizBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homePageGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        navigationPanelLayout.setVerticalGroup(
            navigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homePageGUI)
                    .addComponent(quizBTN)
                    .addComponent(infrographicGUI))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout subheadingPanelLayout = new javax.swing.GroupLayout(subheadingPanel);
        subheadingPanel.setLayout(subheadingPanelLayout);
        subheadingPanelLayout.setHorizontalGroup(
            subheadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subheadingPanelLayout.createSequentialGroup()
                .addComponent(navigationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        subheadingPanelLayout.setVerticalGroup(
            subheadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subheadingPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(navigationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        nameLBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nameLBL.setText("Enter your name :");

        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });

        searchBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchBTN.setText("Search Attempts");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        deleteBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBTN.setText("Delete Attempts");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        imgLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seasaver/excellence.png"))); // NOI18N

        javax.swing.GroupLayout pagePanelLayout = new javax.swing.GroupLayout(pagePanel);
        pagePanel.setLayout(pagePanelLayout);
        pagePanelLayout.setHorizontalGroup(
            pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagePanelLayout.createSequentialGroup()
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(q1)
                            .addComponent(q5)
                            .addComponent(q4)
                            .addComponent(q3)
                            .addComponent(q2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pagePanelLayout.createSequentialGroup()
                                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(question4LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(question5LBL)
                                    .addComponent(question3LBL)
                                    .addComponent(question2LBL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pagePanelLayout.createSequentialGroup()
                                .addComponent(question1LBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pagePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(subheadingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(q2YES)
                                .addComponent(q2NO)
                                .addComponent(q3YES)
                                .addComponent(q3NO)
                                .addComponent(q5YES))
                            .addGroup(pagePanelLayout.createSequentialGroup()
                                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(q1NO)
                                    .addComponent(q1YES))
                                .addGap(2, 2, 2))
                            .addComponent(q5NO))
                        .addGap(148, 148, 148))
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(q4YES)
                            .addComponent(q4NO))
                        .addGap(150, 150, 150))))
            .addGroup(pagePanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(nameLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pagePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pagePanelLayout.createSequentialGroup()
                        .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pagePanelLayout.createSequentialGroup()
                                .addComponent(tryAgainBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteBTN))
                            .addGroup(pagePanelLayout.createSequentialGroup()
                                .addComponent(scoreLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(answerBox, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgLBL))
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pagePanelLayout.createSequentialGroup()
                        .addComponent(submitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271))))
        );
        pagePanelLayout.setVerticalGroup(
            pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(subheadingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLBL)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(q1YES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(q1)
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(question1LBL)
                            .addComponent(q1NO))
                        .addGap(19, 19, 19)
                        .addComponent(q2YES)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q2NO)
                    .addComponent(question3LBL)
                    .addComponent(q2))
                .addGap(18, 18, 18)
                .addComponent(q3YES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q3NO)
                    .addComponent(question2LBL)
                    .addComponent(q3))
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(q5YES)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(q5NO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(q4YES)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(q4NO)
                        .addGap(70, 70, 70)
                        .addComponent(imgLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(question4LBL)
                            .addComponent(q4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q5)
                            .addComponent(question5LBL))
                        .addGap(21, 21, 21)
                        .addComponent(submitBTN)
                        .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pagePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(answerBox, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pagePanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(scoreLBL)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tryAgainBTN)
                            .addComponent(displayBTN)
                            .addComponent(searchBTN)
                            .addComponent(deleteBTN))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        titleLBL.setBackground(new java.awt.Color(153, 153, 153));
        titleLBL.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        titleLBL.setForeground(new java.awt.Color(0, 51, 153));
        titleLBL.setText("   Sustainability score");

        subheadingimgPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seasaver/speedometer.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout subheadingimgPanelLayout = new javax.swing.GroupLayout(subheadingimgPanel);
        subheadingimgPanel.setLayout(subheadingimgPanelLayout);
        subheadingimgPanelLayout.setHorizontalGroup(
            subheadingimgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subheadingimgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );
        subheadingimgPanelLayout.setVerticalGroup(
            subheadingimgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(132, Short.MAX_VALUE)
                        .addComponent(titleLBL)
                        .addGap(44, 44, 44)
                        .addComponent(subheadingimgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(subheadingimgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        System.exit(0); //exits the web page
    }//GEN-LAST:event_exitBTNActionPerformed

    private void homePageGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageGUIActionPerformed
        // TODO add your handling code here:
        new SeaSaverHomeGUI().setVisible(true); //setting the homepage to visible
        
        this.dispose(); //page disappears when user exits the page
    }//GEN-LAST:event_homePageGUIActionPerformed

    private void infrographicGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infrographicGUIActionPerformed
        // TODO add your handling code here:
        new ProjectGUI().setVisible(true);  //infographic page set to visible
        
        this.dispose(); //page disappears when the user exits the page
    }//GEN-LAST:event_infrographicGUIActionPerformed

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
        // TODO add your handling code here:
        if(scoreList.isEmpty()){    //is no data is stored in the scorelist array
            JOptionPane.showMessageDialog(null, "No previous answers saved");   //this message will display
            return; //return stops so nothing else runs
        }else{
             StringBuffer allRecords = new StringBuffer();  
          for (ScoreRecord record : scoreList) {    //for each record saved you add the users name to the output
             allRecords.append("Name: ").append(record.getName()).append("\n"); //gets the stored answers
                     ArrayList<String> answers = record.getAnswers();
          for (int i = 0; i < answers.size(); i++) {    //loops through the 5 answers and displays them
              allRecords.append("Q").append(i + 1).append(": ").append(answers.get(i)).append("\n");
            }
                 allRecords.append("\n");
            }

        JOptionPane.showMessageDialog(null, allRecords.toString()); //dispalys all the stored data 
             try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) { //Reads file called output.txt
                 String line;   
             while ((line = reader.readLine()) != null) {   //reads every line
                  System.out.println(line); 
             }
             } catch (IOException e) {
                    System.out.println("An error occured " + e);
            }
        }
    }//GEN-LAST:event_displayBTNActionPerformed

    private void tryAgainBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tryAgainBTNActionPerformed
        // TODO add your handling code here:
        buttonGroup1.clearSelection();  
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup4.clearSelection();
        buttonGroup5.clearSelection();  //When the user trys again the buttons are reset
        nameTF.setText("");     //name is reset
        scoreTA.setText("");    //test area reset
        imgLBL.setIcon(null);   //image is reset

    }//GEN-LAST:event_tryAgainBTNActionPerformed

    private void submitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBTNActionPerformed
        // TODO add your handling code here:
        String name = nameTF.getText();
        if(name.isEmpty()){ //if no name is entered by the user the text will display below
            JOptionPane.showMessageDialog(null, "Error, please enter your name");
            return; 
        }
        scoreList.add(new ScoreRecord(name, new ArrayList<>(result)));  //creates new scoreRecord object and stores scoreRecord inside scorelist
        
         result.clear();    //removes the old answers
        if (q1YES.isSelected()) {
           result.add("Yes");
        } else {
           result.add("No");
            }

        if (q2YES.isSelected()) {
           result.add("Yes");
        } else {
              result.add("No");
        }

        if (q3YES.isSelected()) {
            result.add("Yes");
        } else {
            result.add("No");
        }

        if (q4YES.isSelected()) {
            result.add("Yes");
        } else {
            result.add("No");
        }

        if (q5YES.isSelected()) {
            result.add("Yes");
        } else {
            result.add("No");
        }       //repeats from question 1 - 5 , if selected the answer is yes else the answer is no
        
        String output = calc.submitAnswers(result); //sedns the answers to the calculaltions class
        
        scoreTA.setText(output);        //retrieves back a score message
        String message = calc.getResultMessage();   //stores the message 
        
    String image = "";
    if (message.equals("Excellent")) {  //based on the output text it will display the image based on the result
        imgLBL.setIcon(new ImageIcon(getClass().getResource("/excellence.png")));//Converts the laoded image into an imageicon object 
        imgLBL.setVisible(true);    //image is then set to true
    }
    else if (message.equals("Progressive")) {
         imgLBL.setIcon(new ImageIcon(getClass().getResource("/like.png")));   //Accesses the images by using the .getResource method
         imgLBL.setVisible(true);
    }
    else if (message.equals("Alarming")) {
        imgLBL.setIcon(new ImageIcon(getClass().getResource("/alarm.png")));    //setIcon replaces exisiting text in the image
        imgLBL.setVisible(true);
    }
    else {
         imgLBL.setIcon(null);  //no image will appear if no text result is displayed
    }
    
    
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true))) {  //creates a folder called output.txt
        writer.write("Name: " + name);
        writer.newLine();

    for (String ans : result) {
        writer.write(ans);  //writes the 5 answers
        writer.newLine();   //line break
    }
         writer.close();    //saves the data 

    } catch (IOException e) {
        System.out.println("An error occurred" + e);        
    }
    
    
   
    
        
        
    }//GEN-LAST:event_submitBTNActionPerformed

    private void q1YESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1YESActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_q1YESActionPerformed

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        // TODO add your handling code here:
           String searchName = JOptionPane.showInputDialog(null, "Enter the name you want to search");
            boolean nameFound = false; 
          if (searchName.isEmpty()) { //if search is empty displays nothing
               return;  
          }
        for(int i = 0; i < scoreList.size(); i++) {
                ScoreRecord record = scoreList.get(i);  //loops through the scoreList

        if (record.getName().equalsIgnoreCase(searchName)) {    //if the name stored is the same as the name searched
            JOptionPane.showMessageDialog(null, record.toString()); //displays the name and data
            nameFound = true; 
            
                 }
            }
            if (!nameFound) {
                JOptionPane.showMessageDialog(null, "This name is not saved  in our files"); //if name is not found this will display
             }

       
        
    }//GEN-LAST:event_searchBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
       String nameDelete = JOptionPane.showInputDialog(null, "Enter a name to delete");
       if(nameDelete.isEmpty()){    //if Delete button is empty returns nothing 
           return;
       }
        for(int i = 0; i < scoreList.size(); i++){  //loops though the scoreList
            ScoreRecord score = scoreList.get(i);   //goes to position i index and return the value i stored in scoreList and stores it in score
            if(score.getName().equalsIgnoreCase(nameDelete)){   //if the name stored is equal to the name displayed to delete by the user
                scoreList.remove(i);    //Then the name is removed from the scoreList arrayList
                JOptionPane.showMessageDialog(null, "Record for " + nameDelete + ", has been deleted"); //displays the message when name is deleted
                return;
            }else{
                JOptionPane.showMessageDialog(null, "No record of " + nameDelete + ", has been recorded"); //if name does not match this will display 
            }
        }
                
                
    }//GEN-LAST:event_deleteBTNActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new SustainGUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane answerBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton displayBTN;
    private javax.swing.JButton exitBTN;
    private javax.swing.JButton homePageGUI;
    private javax.swing.JLabel imgLBL;
    private javax.swing.JPanel imgPanel;
    private javax.swing.JButton infrographicGUI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nameLBL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JPanel navigationPanel;
    private javax.swing.JPanel pagePanel;
    private javax.swing.JLabel q1;
    private javax.swing.JRadioButton q1NO;
    private javax.swing.JRadioButton q1YES;
    private javax.swing.JLabel q2;
    private javax.swing.JRadioButton q2NO;
    private javax.swing.JRadioButton q2YES;
    private javax.swing.JLabel q3;
    private javax.swing.JRadioButton q3NO;
    private javax.swing.JRadioButton q3YES;
    private javax.swing.JLabel q4;
    private javax.swing.JRadioButton q4NO;
    private javax.swing.JRadioButton q4YES;
    private javax.swing.JLabel q5;
    private javax.swing.JRadioButton q5NO;
    private javax.swing.JRadioButton q5YES;
    private javax.swing.JLabel question1LBL;
    private javax.swing.JLabel question2LBL;
    private javax.swing.JLabel question3LBL;
    private javax.swing.JLabel question4LBL;
    private javax.swing.JLabel question5LBL;
    private javax.swing.JButton quizBTN;
    private javax.swing.JLabel scoreLBL;
    private javax.swing.JTextArea scoreTA;
    private javax.swing.JButton searchBTN;
    private javax.swing.JPanel subheadingPanel;
    private javax.swing.JPanel subheadingimgPanel;
    private javax.swing.JButton submitBTN;
    private javax.swing.JLabel titleLBL;
    private javax.swing.JButton tryAgainBTN;
    // End of variables declaration//GEN-END:variables
}
