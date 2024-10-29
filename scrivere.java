import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class scrivere{
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

}

    public static void main(String[] args) throws Exception{

    }
}