/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hockeytesting;

/**
 *
 * @author becar1504
 */
public class HockeyTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puck youthPuck=new Puck(4);
        Puck standardPuck=new Puck(5.5);
        
        System.out.println(youthPuck.getDivision());
        System.out.println("The youth puck has weight "+youthPuck.getWeight());
        System.out.println("the youth puck has radius "+youthPuck.getRadius());
        System.out.println(youthPuck.toString());
        System.out.println(standardPuck.getDivision());
        System.out.println("The stadard puck has weight "+standardPuck.getWeight());
        System.out.println("The standard puck has radius "+standardPuck.getRadius());
        System.out.println(standardPuck.toString());
        System.out.println("Do objects equal each other?  "+standardPuck.equals(youthPuck));
    }
    
}
