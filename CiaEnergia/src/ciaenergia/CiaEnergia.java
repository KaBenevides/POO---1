package ciaenergia;

import javax.swing.JOptionPane;


public class CiaEnergia {

    
    
    public static void main(String[] args) {
       
        Opera conta = new Opera ();
    
        conta.setLeituraAntes(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da leitura anterior: ")));
        conta.setLeituraAtual(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da leitura atual: ")));
        
        
                        
        int consumo = conta.consumos(conta.getLeituraAntes(), conta.getLeituraAtual());
        String bandeira = conta.vBandeira(conta.getConsumo());
        double tarifa = conta.calculo(conta.getConsumo());
        double valorParcial = conta.parcial(conta.getConsumo());
        double valorTotal = conta.calculoFinal();        
        
        conta.nota();       
        
        
    }
    
}
