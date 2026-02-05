package br.com.alura.lauraflix;

import br.com.alura.lauraflix.calculate.CalculateOfTime;
import br.com.alura.lauraflix.calculate.FilterRecomends;
import br.com.alura.lauraflix.models.Episodes;
import br.com.alura.lauraflix.models.Movie;
import br.com.alura.lauraflix.models.Serie;
import java.util.ArrayList;
import java.util.List;

public class Lauraflix {
    public static void main(String[] args) throws Exception {

        Movie velozesFuriosos = new Movie("Velozes e Furiosos", 2001);  
        velozesFuriosos.setTimeInMinutes(130);
        velozesFuriosos.rate(10);
         
        Movie jhonWick = new Movie("John Wick", 2014);
        jhonWick.setTimeInMinutes(120);
        jhonWick.rate(10);
    
        Movie oProtetor = new Movie("O Protetor", 2010);
        oProtetor.setTimeInMinutes(180);
        oProtetor.rate(10);

        Serie breakingBad = new Serie("Breaking Bad", 2008);
        breakingBad.setIncludedPlan(true);
        breakingBad.setSeasons(5);
        breakingBad.setEpisodesPerSeason(10);
        breakingBad.setMinutesPerEpisode(30);
        
        CalculateOfTime calculatorOfTime = new CalculateOfTime();
        calculatorOfTime.included(velozesFuriosos);
        calculatorOfTime.included(jhonWick);
        calculatorOfTime.included(breakingBad);

        System.out.println("Tempo necessario assistido: " + calculatorOfTime.getTotalTime() + " minutos");

        Episodes episode = new Episodes();
        episode.setNumber(1);
        episode.setName("Velozes e Furiosos");
        episode.setTotalViews(300);

        FilterRecomends filter = new FilterRecomends();
        filter.filter(velozesFuriosos);
        filter.filter(jhonWick);
        filter.filter(episode);

        List<Movie> listOfFilms = new ArrayList<>();
        listOfFilms.add(oProtetor);
        listOfFilms.add(jhonWick);
        listOfFilms.add(velozesFuriosos);

        System.out.println("Lista de filmes" + listOfFilms.size());
        System.out.println("Primeiro filme" + listOfFilms.get(1).getName());
        System.out.println(listOfFilms);

    }


}
