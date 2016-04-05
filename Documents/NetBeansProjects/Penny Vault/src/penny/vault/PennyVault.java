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
    private int coinNum,coinNumLeft;
    private double coinSize,spaceLeft,coinSpaceLeft;
    private double coinValue;
    private static double totalSize,totalValue,countNum;
    
    //creates new coin with the monetary value and size of a single coin of that type   
    public PennyVault(double size,double value){
        coinSize=size;
        coinNum=0;
        coinValue=value;
    }
   public void addCoin(int add){
       double nextTotalSize=(totalSize+=(((double)add)*coinSize));
       if(vaultSize<nextTotalSize){
            spaceLeft=vaultSize-totalSize;
            coinNumLeft=(int)(spaceLeft/coinSize);
            System.out.println("You only have room for "+coinNumLeft);
            System.out.println("Would you like to put in "+coinNumLeft+" anyways?");
       }
       else{
       coinNum+=add;
       totalValue+=(((double)add)*coinValue);
       totalSize+=(((double)add)*coinSize);
       }
    }
    public void takeCoin(int take){
        double nextTotalSize=(totalSize-=(((double)take)*coinSize));
        if(totalSize<=0){
            System.out.println("Your penny vault is completely empty and as such you are unable to withdraw "+take+" coins");
        }
        else if(nextTotalSize<0){
            System.out.println("There is only "+coinNum+" of that coin left");
        }
        else{
            coinNum-=take;
            totalValue-=(((double)take)*coinSize);
            totalSize-=(((double)take)*coinSize);
        }
    }
    
    public double getTotalValue(){
        return totalValue;
    }
    public int coinNum(){
        
    }
    
}
