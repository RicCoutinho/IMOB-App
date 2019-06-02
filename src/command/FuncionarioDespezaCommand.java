
package command;
import control.ControleFuncionario;



public class FuncionarioDespezaCommand extends Command {
    
    
    private String[] funcionario = new String[15];
    private double[] salario = new double[15];
    private String[] nomeCliente = new String[15];
    private int n = 0;


    public String[] getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String[] funcionario, int i) {
        
        
        
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String[] getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String[] nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    
    
    
    
    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
    
    
}
