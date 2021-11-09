/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author Rara Deninda
 */
public class Manusia {
    public void nyalakanPerangkat (Elektronik perangkat){
        if ( perangkat instanceof TelevisiJadul){
            System.out.println("Nyalakan relevisi jadul dengan input : DVI");
        } else if ( perangkat instanceof TelevisiModern){
            System.out.println("Nyalakan televisi modern dengan input: HDMI");
        }
        System.out.println("Voltase televisi: 220");
    }
}
