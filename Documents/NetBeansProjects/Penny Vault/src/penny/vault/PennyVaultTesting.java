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
        String choice;
        int methodChoice=in.nextInt();
        System.out.println("Vault space is 1000 cubic cm");
        System.out.println("1.  add coin\n2.  take coin\n3.  Total Value\n4.  Number of a coin type\5.  Space used");
        String []coinChoice=new String[6];
                coinChoice[0]="penny";
                coinChoice[1]="nickel";
                coinChoice[2]="dime";
                coinChoice[3]="quarter";
                coinChoice[4]="loonie";
                coinChoice[5]="toonie";
                choice="add";
        switch(methodChoice){
            case 1: 
                
                
                    System.out.println("Type the corresponding numer to chose the type of coin you would like to add");
                    int addChoice=in.nextInt();
                    
                    switch(addChoice){
                        case 1:System.out.println(coinChoice[0]);
                        break;
                        case 2:System.out.println(coinChoice[1]);
                        break;
                        case 3:System.out.println(coinChoice[2]);
                        break;
                        case 4:System.out.println(coinChoice[3]);
                        break;
                        case 5:System.out.println(coinChoice[4]);
                        break;
                        case 6:System.out.println(coinChoice[5]);
                        break;
                        default:System.out.println("unknown currentcy");
                        break;
                    }
                
                break;
            case 2: choice="take";
                System.out.println("Type the corresponding numer to chose the type of coin you would like to add");
                    int addChoice=in.nextInt();
                    
                    switch(addChoice){
                        case 1:System.out.println(coinChoice[0]);
                        break;
                        case 2:System.out.println(coinChoice[1]);
                        break;
                        case 3:System.out.println(coinChoice[2]);
                        break;
                        case 4:System.out.println(coinChoice[3]);
                        break;
                        case 5:System.out.println(coinChoice[4]);
                        break;
                        case 6:System.out.println(coinChoice[5]);
                        break;
                        default:System.out.println("unknown currentcy");
                        break;
            break;
            case 3:choice="totalValue";
            break;
            case 4:choice="spaceLeft";
            break;
            case 5:choice="coinNum";
            break;
            default:choice="Please enter a valid option";
            break;
        }
    }
    
}
