import br.com.alura.screeanmatch.Movie;

public class ScreeanMatch {
    public static void main(String[] args) throws Exception {
        Movie myMovie = new Movie(); // criando um novo filme usando new Movie
        myMovie.setName("Velozes e Furiosos"); // Setando o nome do filme usando metodos setters
        myMovie.setYearRelease(2001); // setando o ano de lançamento usando setters
        myMovie.setTimeInMinutes(130); // setando o tempo em minutos usando setters

        myMovie.showInfo();
        myMovie.rate(5);
        myMovie.rate(7);
        myMovie.rate(6);
        myMovie.rate(10);
        myMovie.rate(9);

        System.out.println("Total de avaliações: " + myMovie.getTotalAvalations());
        System.out.println(myMovie.searchAvarage());
    }


}
