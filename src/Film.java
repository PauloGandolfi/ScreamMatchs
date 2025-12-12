public class Film {
    String name;
    int yearRelease;
    boolean includedPlan;
    double avaliations;
    int totalAvaliation;
    int timeInMinutos;

    public void showInfo(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento" + yearRelease);
        // System.out.println(includedPlan);
        // System.out.println(avaliation);
        // System.out.println(totalAvaliation);
        // System.out.println(timeInMinutos);
    }

    public void rate(double rating){
        avaliations += rating;
        totalAvaliation++;
    }

    public double searchAvarage(){
        return avaliations / totalAvaliation;
    }
}
