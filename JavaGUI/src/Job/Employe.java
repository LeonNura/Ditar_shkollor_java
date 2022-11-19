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
public class Employe {
    private String emri;
    private String mbiemri;
    private Job job;
    private int nrStafit;

    public Employe(String emri, String mbiemri, Job job, int nrStafit) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.job = job;
        this.nrStafit = nrStafit;
    }

    public String getEmri() {
        return emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public Job getJob() {
        return job;
    }

    public int getNrStafit() {
        return nrStafit;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public void setNrStafit(int nrStafit) {
        this.nrStafit = nrStafit;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employe other = (Employe) obj;
        if (this.nrStafit != other.nrStafit) {
            return false;
        }
        return true;
    }
    
}
