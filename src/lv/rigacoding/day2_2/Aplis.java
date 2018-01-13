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
public class Aplis implements GeometriskaFigura {
    private String krasa;
    private double radius;

    @Override
    public double laukums() {
        return 3.14*this.radius*this.radius;
        
    }

    @Override
    public String krāsa() {
        return this.krasa;    
    }

    @Override
    public double perimetrs() {
        return 2*3.14*this.radius;
    }
    
    
}
