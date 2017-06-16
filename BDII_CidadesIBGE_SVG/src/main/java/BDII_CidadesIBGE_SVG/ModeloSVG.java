package BDII_CidadesIBGE_SVG;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ModeloSVG {
    
    private final File modelo;
    
    public ModeloSVG() throws IOException{
        this.modelo = new File("Modelo.svg");
        if(!modelo.exists()){
            modelo.createNewFile();
        }
    }
    
    public String readFile() throws FileNotFoundException, IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader(modelo));
        String retorno = "", linha = reader.readLine();
        
        while(linha!=null){
            retorno += linha;
            linha = reader.readLine();
        }
        reader.close();
 
        return retorno;   
    }
 
}

