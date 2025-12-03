/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seasaver;

import java.util.ArrayList;

/**
 *
 * @author Seán
 */
public class Calculations {
    
     ArrayList<String> result;

    public Calculations() {
        result = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            result.add("No");
        }
    }

    public ArrayList<String> getResult() {
        return result;
    }
    
    public int getScore() {
         return calculateScore();
}
    

    public int calculateScore() {
     int score = 0;
    for (int i = 0; i < result.size(); i++) {
        if (result.get(i).equals("Yes")) {
            score++;
        }
    }
    return score;
}
    
    
    public String getResultMessage() {
        int score = calculateScore();
        String message;
        if(score == 5){
            message = "Excellent";
        }else if(score >= 3){
            message = "Progressive";
        }else{
             message  = "Alarming";
        }
        return message;
    }
    
    
    public ArrayList<String> getAnswers() {
        return result;
    }

    
    public String submitAnswers(ArrayList<String> guiAnswers) {
        for(int i = 0; i < guiAnswers.size(); i++) {
             result.set(i, guiAnswers.get(i));
        }
        int score = calculateScore();
        String message = getResultMessage();
        return  "Your sustainability score is: " + message + ", with a score of " + score + " out of 5.";
    }
    
   
}

