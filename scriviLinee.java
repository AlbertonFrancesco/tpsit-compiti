import java.io.*;

public class scriviLinee{
    public scriviLinee (String file) throws IOException{
    PrintWriter uscita=new PrintWriter(new FileWriter(file));
    BufferedReader ingresso = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Inserire ");
    String linea = ingresso.readLine();
        while (!linea.equals("")) {
            uscita.println(linea);
            linea = ingresso.readLine();
        }
        uscita.close();
        ingresso.close();
    }


    public static void main(String[] args) throws Exception{
        if (args.length == 0) {
            System.out.println("Errore: specifica il nome del file come argomento.");
            System.exit(1);
        }
        try {
            new scriviLinee(args[0]);
            System.out.println("Scrittura completata con successo.");
        } catch (IOException ex) {
            System.out.println("Errore di I/O.");
            System.exit(1);
        }
    }
}