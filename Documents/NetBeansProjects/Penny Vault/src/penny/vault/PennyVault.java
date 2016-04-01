/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penny.vault;

/**
 *
 * @author becar1504
 */
public class PennyVault {
    //vaultSize is in cubic cm
    private final double vaultSize=1000;
    private double spaceUsed;
    private double coinSize;
    private int coinNum;
    private double coinValue;
    
    public PennyVault(double size,int count,double value){
        coinSize=size;
        coinNum=count;
        coinValue=value;
    }
   public void addCoin(int add){
       coinNum+=add;
       coinValue+=(((double)add)*coinValue);
       spaceUsed-=(((double)add)*coinSize);
    }
    
    
}
