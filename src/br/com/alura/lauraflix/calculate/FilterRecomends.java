package br.com.alura.lauraflix.calculate;

public class FilterRecomends {

    public void filter(Classification classification) {
        if (classification.getClassification() >= 4) {
            System.out.println("Highly Recommended");
        } else if (classification.getClassification() >= 1) {
            System.out.println("Recommended");
        } else {
            System.out.println("Not Recommended");
        } 
    }
}
