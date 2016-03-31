/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package whiteboardtesting;

import java.util.Scanner;

/**
 *
 * @author becar1504
 */
public class WhiteBoardTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
        
          WhiteBoard board1=new WhiteBoard();
        
        int w;
        int l;
        String c;
        String in;
        
        System.out.println("Board length : "+board1.getLength());
        System.out.println("Board width : "+ board1.getWidth());
        System.out.println("The colour of selected marker : "+board1.getColour());
        System.out.println("Total writing space : "+board1.getArea());
        System.out.println("Remaining space : "+board1.spaceLeft());
        System.out.println("To change dimention of board type \"l\" to change length and \"w\" to change width and to change the colour type \"c\"");
        System.out.println("To write on the whiteboard type \"write\"");
        
        String choice=input.nextLine();
        
            if(choice.equalsIgnoreCase("l")){
                System.out.println("Enter desired integer");
                l=input.nextInt();
                board1.setLength(l);
            }
            else if(choice.equalsIgnoreCase("w")){
                System.out.println("Enter desired integer");
                w=input.nextInt();
                board1.setWidth(w);
            }
            else if(choice.equalsIgnoreCase("c")){
                System.out.println("Type int the desired colour");
                c=input.nextLine();
                board1.setColour(c);
            }
            else if(choice.equalsIgnoreCase("write")){
                System.out.println("Type the words you want to write");
                in=input.nextLine();
                board1.write(in);
            }
//            else if(choice.equals("%")){
//                percentUsed();
//            }
        
    }
    
}
