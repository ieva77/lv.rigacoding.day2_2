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
public class LvRigacodingDay2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kvadrats kv1 = new Kvadrats();
        kv1.setKrasa("melns");
        kv1.setMalasGarums(50);
        
        System.out.println("Kvadrāta laukums ir " + kv1.laukums());
        
        Aplis a1 = new Aplis();
        a1.setKrasa("zils");
        a1.setRadius(5);
        
    }
    
}
