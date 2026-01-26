package br.com.alura.lauraflix.models;

import br.com.alura.lauraflix.calculate.Classification;

public class Movie extends Titles implements Classification {
    private String director;

    public String getDirector(){
        return director;
    }

    public void setDirector(String director){
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) searchAvarage() / 2;
    }
}
        
