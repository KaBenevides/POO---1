package banco;

import javax.swing.JOptionPane;

public class Operações {
    
    public int numConta;
    public int agencia;
    public String nomeCliente;
    private String senha;
    private double saldo;   
    private boolean logado = false;
    
    double saque;
    double deposito;
    
    public void saque(double qtde){
        if (qtde>this.saldo) {
            System.out.println("Quantidade de saldo insuficiente.");
        }
        else{
            this.saldo = this.saldo - qtde;
                    }
    }
    
    public void deposito (double valor){
               this.saldo = this.saldo + valor;
                   }
    
    public double getSaldo() {
        return saldo;
    }
    
    public int getAgencia(){
        return agencia;    
    }
    
    public void setAgencia(int agencia){
        this.agencia = agencia;    
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean isLogado(){
        return logado;    
    }
    
    public void setLogado(boolean logado){
        this.logado = logado;    
    }

    public String getSenha (){
        return senha;        
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta; 
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public boolean logar (int agencia, int numConta, String senha){
        if (agencia == 1234 && numConta==1 && "abcd123".equals(senha)){
            this.logado = true;
            System.out.println("Login efetuado com sucesso!");
            System.out.println("Valor da variável logado: " + this.isLogado());
            atual (this.logado);
        }else{
        JOptionPane.showMessageDialog(null, "Dados incoerentes");
        this.logado = false;
        }
    return this.logado;
    }
    
    public void atual (boolean logado){
    if (logado == true){
        int opcao;
    opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite:\n"
    + "1 - Depósito\n"
    + "2 - Saque\n"
    + "3 - Consultar saldo\n"
    + "4 - Sair\n"));
    
    switch(opcao){
        case 1:
    deposito (Double.parseDouble(JOptionPane.showInputDialog("Digite valor a ser depositado")), this.logado);
            break;
        case 2:
    saque (Double.parseDouble(JOptionPane.showInputDialog("Digite valor a ser sacado")), this.logado);
            break;
        case 3:
    consulta (this.logado);
            break;
        case 4:
    JOptionPane.showMessageDialog(null, "Obrigadx!");
    System.exit(0);
            break;
        default:
    JOptionPane.showMessageDialog(null, "A opção digitada foi inválida");       
    }
    }       
    
    }
    
    public void saque (double valor, boolean logado){
       
        this.saldo = this.saldo - valor;
        
        String opcao;
        opcao = JOptionPane.showInputDialog("Deseja realizar outra operação?\n"
                + "1 - Sim\n"
                + "2 - Não");
        switch (opcao){
            case "1":
        atual(this.logado);
        break;
            case "2":
        JOptionPane.showMessageDialog(null, "Obrigadx!");
        System.exit(0);
        break;
            default:
                JOptionPane.showMessageDialog(null, "A opção digitada foi inválida");
        }
    }
    
    public void deposito (double valor, boolean logado){
        this.saldo = this.saldo + valor;
        String opcao;
        opcao = JOptionPane.showInputDialog("Deseja realizar outra operação?\n"
                + "1 - Sim\n"
                + "2 - Não");
        switch (opcao){
            case "1":
        atual(this.logado);
        break;
            case "2":
        JOptionPane.showMessageDialog(null, "Obrigadx!");
        System.exit(0);
        break;
            default:
                JOptionPane.showMessageDialog(null, "A opção digitada foi inválida");
        }
        }
          
    public void consulta (boolean logado){
        JOptionPane.showMessageDialog(null, "Seu saldo atual é\n"
                + "R$" + getSaldo());
        String opcao;
        opcao = JOptionPane.showInputDialog("Deseja realizar outra operação?\n"
                + "1 - Sim\n"
                + "2 - Não");
        switch (opcao){
            case "1":
        atual(this.logado);
        break;
            case "2":
        JOptionPane.showMessageDialog(null, "Obrigadx!");
        System.exit(0);
        break;
            default:
                JOptionPane.showMessageDialog(null, "A opção digitada foi inválida");
        }
        
    }
    }
