/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Job;

/**
 *
 * @author arberdemhasaj
 */
public class Job {
    private double rroga;
    private String profesioni;
    
    public Job(double rr, String p){
        rroga = rr;
        profesioni = p;
    }
    
    public void setRroga(double newRroga){
        rroga = newRroga;
    }
    
    public void setProfestioni (String newProfesioni) {
        profesioni = newProfesioni;
    }
    
    public double getRroga(){
        return rroga;
    }
    
    public String getProfesioni(){
        return profesioni;
    }
    
    public boolean equals(Job j){
        if(this.rroga == j.rroga && this.profesioni.equals(j.profesioni)){
            return true;
        }
        else 
            return false;
    }
    
}
