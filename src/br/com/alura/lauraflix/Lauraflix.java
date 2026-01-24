package br.com.alura.lauraflix;

import br.com.alura.lauraflix.calculate.CalculateOfTime;
import br.com.alura.lauraflix.models.Movie;
import br.com.alura.lauraflix.models.Serie;

public class Lauraflix {
    public static void main(String[] args) throws Exception {

        Movie velozesFuriosos = new Movie(); 
        velozesFuriosos.setName("Velozes e Furiosos"); 
        velozesFuriosos.setYearRelease(2001); 
        velozesFuriosos.setTimeInMinutes(130); 

        Serie breakingBad = new Serie();
        breakingBad.setName("Breaking Bad");
        breakingBad.setYearRelease(2008);
        breakingBad.setIncludedPlan(true);
        breakingBad.setSeasons(5);
        breakingBad.setEpisodesPerSeason(10);
        breakingBad.setMinutesPerEpisode(30);
        
        Movie jhonWick = new Movie();
        jhonWick.setName("John Wick");
        jhonWick.setYearRelease(2014);
        jhonWick.setTimeInMinutes(120);

        CalculateOfTime calculatorOfTime = new CalculateOfTime();
        calculatorOfTime.included(velozesFuriosos);
        calculatorOfTime.included(jhonWick);
        calculatorOfTime.included(breakingBad);

        System.out.println("Tempo necessario assistido: " + calculatorOfTime.getTotalTime() + " minutos");
    }


}
