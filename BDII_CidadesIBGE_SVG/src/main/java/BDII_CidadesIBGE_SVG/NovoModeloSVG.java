
package BDII_CidadesIBGE_SVG;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NovoModeloSVG {
    
    public static File novoModelo;
            
    public NovoModeloSVG() throws IOException{
        NovoModeloSVG.novoModelo = new File("NovoModelo.svg");
        if(novoModelo.exists()){
            novoModelo.delete();
            novoModelo.createNewFile();
        } else novoModelo.createNewFile();
    }
    
    public boolean writeFile(StringBuilder fileModified) throws IOException{
        BufferedWriter writer;
        writer = new BufferedWriter(new PrintWriter(new FileWriter(novoModelo, true), true));
        writer.write(fileModified.toString());
        writer.newLine();
        writer.close();
        return true;
    }
    
     
    public String readFile() throws FileNotFoundException, IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader(novoModelo));
        String retorno = "", linha = reader.readLine();
        
        while(linha!=null){
            retorno += linha;
            linha = reader.readLine();
        }
        reader.close();
 
        return retorno;   
    }
    
    
}
