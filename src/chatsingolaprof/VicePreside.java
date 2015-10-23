package chatsingola;
import java.io.*;

public class VicePreside {
    private String nomeFile="Professore.txt";
    private String riga;
    private FileReader reader;
    private FileWriter writer;
    private StreamTokenizer t;
    
    public VicePreside(String nomeFile, FileReader reader)
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
