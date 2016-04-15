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
public class Handheld extends Portable{
    private boolean hasCase;
    private boolean hasData;
       
    
    public Handheld(){
        super();
        hasCase=true;
        hasData=true;
    }        
    public Handheld(double storage,boolean internet,String madeBy,boolean power,boolean data,boolean phoneCase){
        super(storage,internet,madeBy,power);
        hasCase=phoneCase;
        hasData=data;
    }
    
    
    
    public String call(String recipient){
         String callOutput;
         callOutput="Tough luck "+recipient+" can't answer your call right now and they don't have an answering machine!";
         return callOutput;
    }
            public String drop(){
                String didItBreak;
            if(checkDeveloper().equals("Nokia")||checkDeveloper().equals("nokia")){
            didItBreak="It is common knowledge that nokia's are indestructable";
            }
            else if(checkDeveloper().equals("apple")||checkDeveloper().equals("Apple")){
                didItBreak="Apple makes their products delicate"
            }
            else if(hasCase=true){
                didItBreak="Your case saves your phone, Houray!";
            }
            else{
                broken=true;
                didItBreak="Your devices breaks! Time to start begging your parent for a new one";
                }
            return didItBreak;
            }
            
}
