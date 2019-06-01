/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import view.TelaListaClientes;

/**
 *
 * @author Wellington Junior
 */
/*public class ControleCliente {
    TelaListaClientes tlc = new TelaListaClientes();
    
    public void importListaClientes(){
        File file = new File("Clientes.txt");
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            DefaultTableModel model = (DefaultTableModel) tlc.jTabelaClientes.getModel();
            model.setNumRows(0);
            
            Object[] dadosCliente = reader.lines().toArray();
            String linha;
            String[] linhaTabela;
            
            for(int i = 0; i < dadosCliente.length; i++){
                linha = dadosCliente[i].toString().trim();
                linhaTabela = linha.split(";");
                model.addRow(dadosCliente);
            }    
        } catch (Exception ex) {
            Logger.getLogger(TelaListaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}*/
