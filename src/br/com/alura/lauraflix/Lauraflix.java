package br.com.alura.lauraflix;
import br.com.alura.lauraflix.models.Movie;
import br.com.alura.lauraflix.models.Serie;

public class Lauraflix {
    public static void main(String[] args) throws Exception {
        Movie myMovie = new Movie(); 
        myMovie.setName("Velozes e Furiosos"); 
        myMovie.setYearRelease(2001); 
        myMovie.setTimeInMinutes(130); 
        
        System.out.println("Duracao do filme: " + myMovie.getTimeInMinutes() + " minutos"); 

        Serie serie = new Serie();
        serie.setName("Breaking Bad");
        serie.setYearRelease(2008);
        serie.setIncludedPlan(true);
        serie.setSeasons(5);
        serie.setEpisodesPerSeason(10);
        serie.setMinutesPerEpisode(30);
        
        System.out.println("Duracao total da serie: " + serie.getTimeInMinutes() + " minutos");

        
    }


}
