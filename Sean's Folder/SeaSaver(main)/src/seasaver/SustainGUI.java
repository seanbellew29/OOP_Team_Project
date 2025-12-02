/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package seasaver;
import HomePage.SeaSaverHomeGUI;
import Frame2.ProjectGUI;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Seán
 */
public class SustainGUI extends javax.swing.JFrame {
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SustainGUI.class.getName());
       Calculations calc = new Calculations();
       ArrayList<String> result;
       ArrayList<ScoreRecord> scoreList;
    /**
     */
    public SustainGUI() {
        initComponents();
        result = new ArrayList<>();
        scoreList = new ArrayList<>();
        imgLBL.setVisible(false);
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
        navigationPanel = new javax.swing.JPanel();
        homePageGUI = new javax.swing.JButton();
        infrographicGUI = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();
        quizBTN = new javax.swing.JButton();
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
        imgLBL = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        subheadingPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        subheadingimgPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameLBL = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        searchBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        titleLBL = new javax.swing.JLabel();

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

        navigationPanel.setBackground(new java.awt.Color(0, 0, 204));
        navigationPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        homePageGUI.setBackground(new java.awt.Color(204, 204, 204));
        homePageGUI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        homePageGUI.setText("Homepage");
        homePageGUI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        homePageGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageGUIActionPerformed(evt);
            }
        });

        infrographicGUI.setBackground(new java.awt.Color(204, 204, 204));
        infrographicGUI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        infrographicGUI.setText("Infographic");
        infrographicGUI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        infrographicGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infrographicGUIActionPerformed(evt);
            }
        });

        exitBTN.setBackground(new java.awt.Color(204, 204, 204));
        exitBTN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exitBTN.setText("Exit");
        exitBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        quizBTN.setBackground(new java.awt.Color(204, 204, 204));
        quizBTN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quizBTN.setText("Quiz");
        quizBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout navigationPanelLayout = new javax.swing.GroupLayout(navigationPanel);
        navigationPanel.setLayout(navigationPanelLayout);
        navigationPanelLayout.setHorizontalGroup(
            navigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homePageGUI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infrographicGUI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quizBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        navigationPanelLayout.setVerticalGroup(
            navigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navigationPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(navigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(navigationPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(quizBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(homePageGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(infrographicGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

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

        imgLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seasaver/excellence.png"))); // NOI18N

        javax.swing.GroupLayout imgPanelLayout = new javax.swing.GroupLayout(imgPanel);
        imgPanel.setLayout(imgPanelLayout);
        imgPanelLayout.setHorizontalGroup(
            imgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLBL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        imgPanelLayout.setVerticalGroup(
            imgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setText("SEE HOW YOUR CHOICES AFFECT LIFE BENEATH THE SEA");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout subheadingPanelLayout = new javax.swing.GroupLayout(subheadingPanel);
        subheadingPanel.setLayout(subheadingPanelLayout);
        subheadingPanelLayout.setHorizontalGroup(
            subheadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subheadingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        subheadingPanelLayout.setVerticalGroup(
            subheadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subheadingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(question4LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(question5LBL)
                            .addComponent(question3LBL)
                            .addComponent(question2LBL)
                            .addComponent(question1LBL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pagePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(subheadingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(q1NO)
                            .addComponent(q2YES)
                            .addComponent(q2NO)
                            .addComponent(q3YES)
                            .addComponent(q3NO))
                        .addGap(148, 148, 148))
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(q5NO)
                            .addComponent(q5YES)
                            .addComponent(q4YES)
                            .addComponent(q4NO))
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pagePanelLayout.createSequentialGroup()
                        .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(q1YES, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subheadingimgPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pagePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294))
            .addGroup(pagePanelLayout.createSequentialGroup()
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(nameLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(tryAgainBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBTN)
                        .addGap(12, 12, 12)
                        .addComponent(deleteBTN)))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pagePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(scoreLBL)
                .addGap(0, 0, 0)
                .addComponent(answerBox, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        pagePanelLayout.setVerticalGroup(
            pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subheadingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subheadingimgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLBL)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(q1YES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(q1)
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q1NO)
                            .addComponent(question1LBL))
                        .addGap(18, 18, 18)
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
                        .addGap(35, 35, 35)
                        .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(question4LBL)
                            .addComponent(q4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q5)
                            .addComponent(question5LBL))
                        .addGap(58, 58, 58)
                        .addComponent(submitBTN))
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(q5YES)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(q5NO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addComponent(q4YES)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(q4NO)
                        .addGap(76, 76, 76)))
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(scoreLBL))
                    .addGroup(pagePanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(answerBox, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBTN)
                    .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(displayBTN)
                        .addComponent(tryAgainBTN)
                        .addComponent(searchBTN)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        titleLBL.setBackground(new java.awt.Color(0, 153, 153));
        titleLBL.setFont(new java.awt.Font("Magneto", 1, 48)); // NOI18N
        titleLBL.setForeground(new java.awt.Color(0, 51, 153));
        titleLBL.setText("   Sustainability score");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLBL)
                .addGap(18, 18, 18)
                .addComponent(navigationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navigationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void homePageGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageGUIActionPerformed
        // TODO add your handling code here:
        new SeaSaverHomeGUI().setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_homePageGUIActionPerformed

    private void infrographicGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infrographicGUIActionPerformed
        // TODO add your handling code here:
        new ProjectGUI().setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_infrographicGUIActionPerformed

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
        // TODO add your handling code here:
        if(scoreList.isEmpty()){
            JOptionPane.showMessageDialog(null, "No previous answers saved");
            return;
        }else{
             StringBuffer allRecords = new StringBuffer();
          for (ScoreRecord record : scoreList) {
             allRecords.append("Name: ").append(record.getName()).append("\n");
                     ArrayList<String> answers = record.getAnswers();
          for (int i = 0; i < answers.size(); i++) {
              allRecords.append("Q").append(i + 1).append(": ").append(answers.get(i)).append("\n");
            }
                 allRecords.append("\n");
            }

        JOptionPane.showMessageDialog(null, allRecords.toString());
//            for(int i = 0 ; i < scoreList.size(); i++){
//                ScoreRecord record = scoreList.get(i);
//            JOptionPane.showMessageDialog(null, "name"  + nameTF.getName() + "\n " + "Previous Answers:" + "\n" + "Q1: " + result.get(0) + "\n" +
//            "Q2: " + result.get(1) + "\n" + "Q3: " + result.get(2) + "\n" + "Q4: " + result.get(3) + "\n" +
//            "Q5: " + result.get(4));
//            }
             try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
                 String line;
             while ((line = reader.readLine()) != null) {
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
        buttonGroup5.clearSelection();
        nameTF.setText("");
        scoreTA.setText("");
        imgLBL.setIcon(null);

    }//GEN-LAST:event_tryAgainBTNActionPerformed

    private void submitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBTNActionPerformed
        // TODO add your handling code here:
        String name = nameTF.getText();
        scoreList.add(new ScoreRecord(name, new ArrayList<>(result)));
        
         result.clear();
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
        }
        
        String output = calc.submitAnswers(result);
        
        scoreTA.setText(output);
        String message = calc.getResultMessage();
        
    String image = "";
    if (message.equals("Excellent")) {
        imgLBL.setIcon(new ImageIcon(getClass().getResource("/excellence.png")));
        imgLBL.setVisible(true);
    }
    else if (message.equals("Progressive")) {
         imgLBL.setIcon(new ImageIcon(getClass().getResource("/like.png")));
         imgLBL.setVisible(true);
    }
    else if (message.equals("Alarming")) {
        imgLBL.setIcon(new ImageIcon(getClass().getResource("/alarm.png")));
        imgLBL.setVisible(true);
    }
    else {
         imgLBL.setIcon(null);  
    }
    
    
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true))) {
        writer.write("Name: " + name);
        writer.newLine();

    for (String ans : result) {
        writer.write(ans);
        writer.newLine();
    }
         writer.close();

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
          if (searchName.isEmpty()) {
               return;
          }
        for(int i = 0; i < scoreList.size(); i++) {
                ScoreRecord record = scoreList.get(i);

        if (record.getName().equalsIgnoreCase(searchName)) {
            JOptionPane.showMessageDialog(null, record.toString());
            nameFound = true;
            
                 }
            }
            if (!nameFound) {
                JOptionPane.showMessageDialog(null, "This name is not saved  in our files");
             }

       
        
    }//GEN-LAST:event_searchBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
       String nameDelete = JOptionPane.showInputDialog(null, "Enter a name to delete");
       if(nameDelete.isEmpty()){
           return;
       }
        for(int i = 0; i < scoreList.size(); i++){
            ScoreRecord score = scoreList.get(i);
            if(score.getName().equalsIgnoreCase(nameDelete)){
                scoreList.remove(i);
                JOptionPane.showMessageDialog(null, "Record for " + nameDelete + ", has been deleted");
                return;
            }else{
                JOptionPane.showMessageDialog(null, "No record of " + nameDelete + ", has been recorded");
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
    private javax.swing.JLabel jLabel2;
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
