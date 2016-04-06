/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penny.vault;

import java.util.Scanner;

/**
 *
 * @author becar1504
 */
public class PennyVaultTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coin penny=new Coin(0.41,0.01);
        Coin nickel=new Coin(0.66,0.05);
        Coin dime=new Coin(0.31,0.1);
        Coin quarter=new Coin(0.71,0.25);
        Coin loonie=new Coin(1.08,1);
        Coin toonie=new Coin(1.11,2);
        
        Scanner in=new Scanner(System.in);
        
        int choice=in.nextInt();
        System.out.println("Vault space is 1000 cubic cm");
        System.out.println("1.  add coin\n2.  take coin\n3.  Total Value\n4.  Number of a coin type\5.  Space used");
        
        switch(choice){
            case 1: 
                
                    System.out.println("Type the corresponding numer to chose the type of coin you would like to add");
                    int coinChoice=in.nextInt();
                    int addNum;
                    switch(coinChoice){
                        case 1:addChoice="penny";
                            break;
                        case 2:addChoice="nickel";
                            break;
                        case 3:addChoice="dime";
                            break;
                        case 4
                    }
                }
                break;
            case 2: choice=in.nextLine();
                if
        }
    }
    
}
