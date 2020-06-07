package estacionamento;

import javax.swing.JOptionPane;


public class Opera {
    
    public String placa ;
    public String modelo;
    public String cliente;
    public double horaEntrada;
    public double minEntrada;
    public double horaSaida;
    public double minSaida;
    public double tempoFinal;
    public double preco;
    
    //---------------------------------------------------------
    
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public String getCliente() {
        return cliente;
    }
    
    //---------------------------------------------------------

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    //---------------------------------------------------------

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getPlaca() {
        return placa;
    }
    
    //---------------------------------------------------------

    public void setHoraEntrada(double horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    
    public double getHoraEntrada(){
    return horaEntrada;
            }
    
    //---------------------------------------------------------

    public void setMinEntrada(double minEntrada) {
        this.minEntrada = minEntrada;
    }
    
    public double getMinEntrada(){
    return minEntrada;
            }
    
    //---------------------------------------------------------

    public void setHoraSaida(double horaSaida) {
        this.horaSaida = horaSaida;
    }
    
    public double getHoraSaida(){
    return horaSaida;
            }
    
    //---------------------------------------------------------
    
    public void setMinSaida(double minSaida) {
        this.minSaida = minSaida;
    }

    public double getMinSaida(){
    return minSaida;
            }
    
    //---------------------------------------------------------
    
    public double getTempoFinal(){
    return tempoFinal;
    }
     //---------------------------------------------------------
    
    public double tempo (double horaEntrada, double minEntrada, double horaSaida, double minSaida){
    
    double converterEntrada = (horaEntrada + (minEntrada/60));
    double converterSaida = (horaSaida + (minSaida/60));
    
    tempoFinal = Math.ceil (converterSaida - converterEntrada);
            
        return tempoFinal;
   
            }
    
    //---------------------------------------------------------
    
    public double preco (double tempoFinal){
        
        preco = (tempoFinal * 4);
    
    return preco;    
   
            }
    
    //---------------------------------------------------------

   
    void nota() {
    JOptionPane.showMessageDialog(null, "---- Estacionamento ----\n"
                + "Cliente:" + cliente + "\n"
                + "Modelo: " + modelo + "\n" 
                + "Placa: " + placa + "\n"
                + "-------------------------\n"
                + "---- Horários ----\n"
                + "Entrada: " + horaEntrada + " hora(s) " + minEntrada + "minutos\n"
                + "Saida: " + horaSaida + "hora (s)" + minSaida + "minutos\n"
                + "-------------------------\n"
                + "Preço por hora: R$:4,00\n"
                + "Tempo Total: " + tempoFinal + "\n"
                + "Preço Total: " + preco);
    }

    

    
}
