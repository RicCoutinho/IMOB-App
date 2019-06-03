package control;
//import command.FuncionarioDespezaCommand;

import java.util.ArrayList;



public class ControleFuncionario {
    
    private static final ArrayList<Object[]> funcionarios = new ArrayList();
    
    public void salvarFuncionario(Object[] funcionario) {
        funcionarios.add(funcionario);
    } 
    
    public double calcularTotal(){
        double total = 0.0d;
        for (int i = 0; i < funcionarios.size(); i ++){
            total = total + (Double) funcionarios.get(i)[2];
        }
        return total;
    }
    
    public ArrayList<Object[]> getFuncionarios() {
        return funcionarios;
    }
}
