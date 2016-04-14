/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package electronic.devices;

/**
 *
 * @author becar1504
 */
abstract class Portable extends Computer{
    private int batteryCharge;
    private boolean pluggedIn;
    
    public Portable(){
        super();
    }
    public Portable(double storage,boolean internet,String madeBy,boolean power){
        super(storage,internet,madeBy,power);
    }
    
    public void charge(){
        batteryCharge=100;
    }
    
    public void charge(int time){
        int chargeGained=time*2;
        int newCharge=batteryCharge+chargeGained;
        if(newCharge>100){
            batteryCharge=100;
        }
        else{
            batteryCharge=batteryCharge+chargeGained;
        }
    }
    
    public int getBatteryCharge(){
        return batteryCharge;
    } 
    
    public void plugIn(){
        pluggedIn=true;
    }
    public void unPlug(){
        pluggedIn=false;
    }
   
    abstract boolean drop();        
    
}
