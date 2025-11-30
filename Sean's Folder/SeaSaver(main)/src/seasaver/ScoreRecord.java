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
    public class ScoreRecord{
     String name;
     ArrayList<String> answers;
     StringBuffer buff = new StringBuffer();

    public ScoreRecord(String name, ArrayList<String> answers) {
        this.name = name;
        this.answers = new ArrayList<>(answers);
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    @Override
    public String toString(){
        buff.append("Name: ").append(name).append("\n");
        buff.append("Answers:\n");
    
         for (int i = 0; i < answers.size(); i++) {
        buff.append("Q")
          .append(i + 1).append(": ") .append(answers.get(i)) .append("\n");
        }
         return buff.toString();
    }
    
}

