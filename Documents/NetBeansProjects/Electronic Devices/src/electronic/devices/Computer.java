/*
All comments pertain to thge code below them
*/

package electronic.devices;

/**
 *
 * @author becar1504
 */
abstract class Computer {
    private double storageSpace;
    private boolean internetConnection;
    private String developper;
    private boolean pluggedIn;
    private String files;
    private boolean broken;
    
    public Computer(){
        //Gigabytes
        storageSpace=500;
        internetConnection=true;
        developper="Microsoft";
        pluggedIn=true;
        files="";
        broken=false;
    }
    public Computer(double storage,boolean internet,String madeBy,boolean power){
        storageSpace=storage;
        internetConnection=internet;
        developper=madeBy;
        pluggedIn=power;
        files="";
        broken=false;   
    }
    public void makeFile(String fileName){
        files=(fileName+"\n"+files);
    }
    
    public String getFile(){
        return files;
    }
    public boolean checkInternet(){
        return internetConnection;
    }
    public double checkSpace(){
        return storageSpace;
    }
    public boolean checkPowerCord(){
        return pluggedIn;
    }
    /*
    reasoning you can and will procrastinate on every electronic device you have access
    to at one point or another
    
    shelved atm drop will be taking its place most likely
    */
    //abstract String Procrastinate();
        
    
}
