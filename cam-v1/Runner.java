
 import javax.swing.*;
public class Runner{
    public Runner(){
        VirtualPet p = new VirtualPet();

        p.exercise();
        takeAbeat(1000);
        p.feed();
        takeAbeat(4000);
        p.exercise();
        String ans = getResponse("How was your day?");
        System.out.println(ans);
       

    }

    public String getResponse(String q){
        String s = (String)JOptionPane.showInputDialog(
         new JFrame(),
         q,
         "Get a response",
         JOptionPane.PLAIN_MESSAGE
        );
        return s;

    }
    
    public void takeAbeat(int millisec){
          try{
            Thread.sleep(millisec); 
        }catch(Exception e){
        }
    }

    public static void main(String[] args) {
        new Runner();
        
    }
}