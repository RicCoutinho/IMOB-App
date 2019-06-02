package control;
import command.FuncionarioDespezaCommand;


public abstract class ControleFuncionario {
    
    double[] salario = new double[15];
    int i;
    int n;
    double total;
    
    
    public double calcular(){
        for (i = 0; i < n; i ++){
    
        total = total + salario[i];  
}
        return total;
        } 
    
    }
