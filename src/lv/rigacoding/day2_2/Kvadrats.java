/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day2_2;

/**
 *
 * @author user
 */
public class Kvadrats implements GeometriskaFigura {
    // pirmā metode atgriezt kvadrāta krāsa
    // mēs to definējam jaunā mainīgajā "private string krasa;"
    private String krasa;
    // lai dabūtu kvadrata laukumu un perimetru nepieciešams malas garums
    // definējam jaunu mainīgo
    private double malasGarums;
    
    @Override
    public double laukums() {
        // atgriežam funkciju malasGarums * malasGraums
       return malasGarums * malasGarums;
    }

    @Override
    public String krāsa() {
        // un atgriežam krāsu "return this.krasa"
        return this.krasa; 
    }

    @Override
    public double perimetrs() {
        return malasGarums * 4;
        
    }
    public void setKrasa(String krasa) {
        this.krasa = krasa;
    }

    public double getMalasGarums() {
        return malasGarums;
    }

    public void setMalasGarums(double malasGarums) {
        this.malasGarums = malasGarums;
    }
    
}
