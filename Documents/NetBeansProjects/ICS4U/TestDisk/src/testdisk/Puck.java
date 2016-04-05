/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testdisk;

/**
 *
 * @author becar1504
 */
public class Puck extends Disk{
    private double weight;
    private boolean youth;
    private boolean standard;
    public Puck(double w){
        super(1.5,1);
        weight=w;
        
    }
    public double getWeight(){
        return weight;
    }
    public String getDivision(){
        String division="unofficial";
        if(weight>=4.0||weight<=4.5){
            division="youth";
        }
        else if(weight>=5.0||weight<=5.5){
            division="standard";
        }
        return division;
    } 
    public boolean equals(Object obj){
        Puck testObj = (Puck)obj;
		
	 	if (testObj.getWeight() == PuckObj.getRadius())  {
			return(true);
		} else {
			return(false);
		}
    }
    public String toString(){
        String puckString;
        
        puckString="The "+Puck.getDivision()+" weighs "+Puck.getWeight;
    }
}
