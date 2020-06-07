
package estacionamento;

import javax.swing.JOptionPane;

public class Estacionamento {

    public static void main(String[] args) {
        
        Opera estaciona = new Opera ();
    
        estaciona.setCliente((JOptionPane.showInputDialog(null, "Digite o nome do cliente: ")));
        estaciona.setModelo((JOptionPane.showInputDialog(null, "Digite o modelo do carro: ")));
        estaciona.setPlaca((JOptionPane.showInputDialog(null, "Digite a placa do carro: ")));
        estaciona.setHoraEntrada(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a hora de entrada: ")));
        estaciona.setMinEntrada(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o minuto de entrada: ")));
        estaciona.setHoraSaida(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a hora de saída: ")));
        estaciona.setMinSaida(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o minuto de saída: ")));
        
        double tempoFinal = estaciona.tempo(estaciona.getHoraEntrada(), estaciona.getMinEntrada(), estaciona.getHoraSaida (), estaciona.getMinSaida());
        double precoFinal = estaciona.preco(estaciona.getTempoFinal()); 

        estaciona.nota();
       
    }
    
}
