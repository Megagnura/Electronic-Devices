/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package whiteboardtesting;



/**
 *
 * @author becar1504
 */
public class WhiteBoard {
    private String writingColour;
    private String words;
    private int boardlength;
    private int boardwidth;
    private int spaceleft;
    private int area;
    
    
    public WhiteBoard(){
        boardlength=1;
        boardwidth=1;
        writingColour="black";
        words="";
        area=1;
        spaceleft=1;
    }
    
    public void setLength(int l){
        boardlength=l;
    }
    
    public void setWidth(int w){
        boardwidth=w;
    }
    
    public int getLength(){
        return boardlength;
    }
    
    public int getWidth(){
        return boardwidth;
    }
    
    public int getArea(){
        return area;
    }
    public int area(int boardlength,int boardwidth){
        area=boardlength*boardwidth;
        return area;
    }
    public void setColour(String c){
        writingColour=c;
    }
    public String getColour(){
        return writingColour;
    }
    public int spaceLeft(){
        int spaceleft=boardlength*boardwidth;
        return spaceleft;
    }
    //find out how to add string onto other strings
    public void write(String in){
        words=in;
               
    }
    public int percentUsed(){
        double temporarypercent=spaceleft/area*100;
        int percent=(int)temporarypercent;
        return percent;
    }
    
}
