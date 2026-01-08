package br.com.alura.screeanmatch;


public class Movie {
    private String name;
    private int yearRelease;
    private boolean includedPlan;
    private double avaliations;
    private int totalAvaliations;
    private int timeInMinutes;

    public int getTotalAvalations(){
        return totalAvaliations;
    }

    public String getName(){
        return name;
    }

    public int getYearRelease(){
        return yearRelease;
    }

    public boolean isIncludedPlan(){
        return includedPlan;
    }

    public int getTimeInMinutes(){
        return timeInMinutes;
    }

    public void setName(String name){
        this.name = name; 
    }

    public void setIncludedPlan(boolean includedPlan){
        this.includedPlan = includedPlan;
    }

    public void setTimeInMinutes(int timeInMinutes){
        this.timeInMinutes = timeInMinutes;
    }

    public void setYearRelease(int yearRelease){
        this.yearRelease = yearRelease;
    }

    public void rate(double rating){
        avaliations += rating;
        totalAvaliations++;
    }

    public double searchAvarage(){
        return avaliations / totalAvaliations;
    }
}
        
