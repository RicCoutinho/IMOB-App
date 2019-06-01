/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package command;
import view.TelaRegistroListagem;

/**
 *
 * @author dinho
 
public class RegistroCommand extends Command {

    private Object nome;
    private Object endereco;
    private Object sindico;
    private Object valor;    
    
    
    
    
    
    @Override
    public void execute() {
         if(jTCliente.getSelectedRow() !=  -1){
             
            jTCliente.setValueAt(txtNome, jTCliente.getSelectedRow(), 0);
            jTCliente.setValueAt(txtEndereco, jTCliente.getSelectedRow(), 0);
            jTCliente.setValueAt(txtSindico, jTCliente.getSelectedRow(), 0);
            jTCliente.setValueAt(txtValor, jTCliente.getSelectedRow(), 0);
        }
    }
    
}*/