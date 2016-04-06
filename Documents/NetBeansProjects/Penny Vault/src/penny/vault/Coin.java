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
public class Coin {
    //vaultSize is in cubic cm
    private final double vaultSize=1000;
    private int coinNum,coinNumLeft;
    private double coinSize,spaceLeft,coinSpaceLeft;
    private double coinValue,coinTotalValue;
    private static double totalSize,totalValue,countNum;
    
    //creates new coin with the monetary value and size of a single coin of that type   
    public Coin(double size,double value){
        coinSize=size;
        coinNum=0;
        coinValue=value;
        totalSize=0;
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
       totalValue+=(((double)add)*coinValue);
       coinTotalValue+=(((double)add)*coinValue);
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
            totalValue-=(((double)take)*coinValue);
            totalSize-=(((double)take)*coinSize);
            coinTotalValue-=(((double)take)*coinValue);
        }
    }
    
    public double getTotalValue(){
        return totalValue;
    }
    public int coinNum(){
     return coinNum;   
    }
    public double spaceUsed(){
        return totalSize;
    }
    
}
