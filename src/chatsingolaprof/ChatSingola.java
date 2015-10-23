
package chatsingola;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;


public class ChatSingola {

    public static void main(String[] args) throws IOException{
       
       String nomeFile="D:\\NetBeand Project\\ChatSingola\\src\\chatsingola\\Chat.txt";
       VicePreside p= new VicePreside(nomeFile);
       Professore pr=new Professore(nomeFile);
       
       System.out.println("Digita per avviare la chat");
       
       pr.scrivi();
       pr.leggi();
       
       p.scrivi();
       p.leggi();
       
       
       
    }
    
}
