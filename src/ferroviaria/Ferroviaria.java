/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferroviaria;

import java.util.ArrayList;

/**
 *
 * @author maicon
 */
public class Ferroviaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<Maquinista> lista = new ArrayList<>();
        
        Maquinista maq = new Maquinista();
        Maquinista maq2 = new Maquinista();
       
        maq.setNome("Jovenildo");
        maq2.setNome("teste");
        maq.setCargo("maquinista");
        
        
        lista.add(maq);
        lista.add(maq2);
        for (Maquinista maquinista : lista) {
            
            System.out.println(maquinista);
            
        }
        

    }

}
