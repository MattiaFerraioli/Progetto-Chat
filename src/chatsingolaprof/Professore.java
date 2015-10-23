/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatsingolaprof;

/**
 *
 * @author tagliabue_giovanni
 */
import java.io.*;

public class Professore {
    private String nomeFile="VicePreside.txt";
    private String riga;
    private FileReader reader;
    private FileWriter writer;
    private StreamTokenizer t;
    
    public Professore(String nomeFile, FileReader reader)
    {
        this.nomeFile=nomeFile;
        try{
        reader= new FileReader(nomeFile);
        }catch(FileNotFoundException e){
            System.out.println("File non Trovato");
        }
    }
    
    public void scrivi(String mess) throws IOException
    {
        writer=new FileWriter(nomeFile);
    }
    
    public String leggi() throws IOException
    {
        t=new StreamTokenizer(reader);
        t.whitespaceChars('\0', ';');
        int res=-1;
        String mess;
        do{
           try{
                res=t.nextToken();
           }catch(IOException e){}
        mess=t.sval;
            
        }while(res!=StreamTokenizer.TT_EOL && res!=StreamTokenizer.TT_EOF);
       reader.close();
        return mess;
    }
}