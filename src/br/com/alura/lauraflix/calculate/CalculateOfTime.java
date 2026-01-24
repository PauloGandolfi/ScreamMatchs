package br.com.alura.lauraflix.calculate;

import br.com.alura.lauraflix.models.Titles;


public class CalculateOfTime {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void included(Titles title) {
        this.totalTime += title.getTimeInMinutes();
    }
}
