package banco;

import javax.swing.JOptionPane;

public class Banco {

    public static void main(String[] args) {
        
           
        Operações conta = new Operações ();
    
        conta.setAgencia(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a agência: ")));
        conta.setNumConta(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da conta: ")));
        conta.setSenha((JOptionPane.showInputDialog(null, "Digite a senha: ")));
        conta.logar(conta.getAgencia(), conta.getNumConta(), conta.getSenha());
                
        }
}