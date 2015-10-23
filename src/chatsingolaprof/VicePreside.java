package chatsingola;
import java.io.*;

public class VicePreside {
    private String name;
    private String riga;
    
    
    public VicePreside(String nomeFile)
    {
        this.name=nomeFile;
    }
    
    public void scrivi() 
    {
        InputStreamReader input=new InputStreamReader(System.in);
       BufferedReader tastiera=new BufferedReader(input);
       String nRighe="";
       int riga;
       try{
           System.out.print("Vice Preside: ");
           String mex= tastiera.readLine();
           
           FileReader reader=new FileReader(name);
           BufferedReader buffer1= new BufferedReader(reader);
           
           nRighe=buffer1.readLine();
          // riga=Integer.parseInt(nRighe);
          // riga++;
           
           FileOutputStream out= new FileOutputStream(name);
           PrintStream print= new PrintStream(out);
           print.append(mex);
           }
           catch(IOException e)
           {
              System.out.println("Errore in scrittura");
           }
           
    }

    public void leggi() 
     {
         try{
             FileReader reader= new FileReader(name);
             BufferedReader buffer = new BufferedReader(reader);

             while(true)
             {
                 String stringa= buffer.readLine();
                 if(stringa==null)break;
                 else
                 {
                 System.out.print("Professore: ");
                 System.out.println(stringa);
                 }
             }
             reader.close();
         }catch(IOException e)
         {
             System.out.println("Errore in lettura");
         }
     }
 }
