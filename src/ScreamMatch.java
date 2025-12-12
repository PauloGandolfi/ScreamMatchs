public class ScreamMatch {
    public static void main(String[] args) throws Exception {
        Film myFilm = new Film(); 
        myFilm.name = "Velozes e Furiosos";
        myFilm.yearRelease = 2001;
        myFilm.timeInMinutos = 130;

        myFilm.showInfo();
        myFilm.rate(5);
        myFilm.rate(7);
        myFilm.rate(6);
        myFilm.rate(10);
        myFilm.rate(9);

        System.out.println(myFilm.avaliations);
        System.out.println(myFilm.totalAvaliation);
        System.out.println(myFilm.searchAvarage());
    }


}
