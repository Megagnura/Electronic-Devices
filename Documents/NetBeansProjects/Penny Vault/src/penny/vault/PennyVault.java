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
    private int coinNum;
    private double coinNumLeft,coinSpaceLeft;
    private double coinSize,spaceLeft;
    private static double totalSize;
    private double coinValue,coinTotalValue;
        
    public PennyVault(double size,int count,double value){
        coinSize=size;
        coinNum=count;
        coinValue=value;
    }
   public void addCoin(int add){
       double nextTotalSize=(totalSize-=(((double)add)*coinSize));
       if(vaultSize<nextTotalSize){
        //spaceLeft=vaultSize-coinTotalValue;
        //coinSpaceLeft=spaceleft/coinSize   
           coinNumLeft=spaceLeft/coinSize;
           System.out.println("You only have room for "+coinSpaceLeft);
       }
       else{
       coinNum+=add;
       coinTotalValue+=(((double)add)*coinValue);
       totalSize-=(((double)add)*coinSize);
       }
    }
    public void takeCoin(int take){
        coinNum-=take;
        coinTotalValue-=(((double)take)*coinSize);
    }
    
}
