package ciaenergia;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Opera {
    
    public int leituraAntes;
    public int leituraAtual;
    public int consumo;    
    public double valorParcial;
    public double valorTotal;
    public String bandeira;
    public double tarifa;
        
    //----------------------------------------------------

    public void setLeituraAntes(int leituraAntes) {
        this.leituraAntes = leituraAntes;
    }
    
    public int getLeituraAntes(){ 
    return leituraAntes;
    }
    
    //----------------------------------------------------
    
    public void setLeituraAtual(int leituraAtual) {
        this.leituraAtual = leituraAtual;
    }
    
    public int getLeituraAtual(){
    return leituraAtual;
    }
    
     //----------------------------------------------------
    
    public double getValorTotal() {
        return valorTotal;
    }
    
    public double getValorParcial() {
        return valorParcial;
    }
    
    public double getTarifa() {
        return tarifa;
    }
    
    //----------------------------------------------------
    
    public int getConsumo() {
        return consumo;
    }
    
    //----------------------------------------------------
    
    public int consumos (int leituraAntes, int leituraAtual){
    consumo = leituraAtual - leituraAntes;
    return consumo;
    }
    
    //----------------------------------------------------
    
    public double parcial (int consumo){
    double te = (consumo * 0.3);
    double tusd = (consumo * 0.29);
    
    valorParcial = (((te + tusd)*25)/100) + (te + tusd);
    return valorParcial;
    }
    
    //----------------------------------------------------
    
    public String vBandeira (int consumo){
        if (consumo <100){
            bandeira = "Bandeira Verde";     
        }    
        else if (consumo >=100 && consumo <150 ){
            bandeira = "Bandeira Amarela";
        }    
        else if (consumo >=150 && consumo <=200 ){
            bandeira = "Bandeira Vermelha 1"; 
        }    
        else{
            bandeira = "Bandeira Vermelha 2"; 
        }       
        
        return bandeira;
    }
    
    //----------------------------------------------------
    
    public double calculo (int consumo){
        if (consumo <= 100){
            //bandeira = "Bandeira Verde";
        tarifa = 0;
        }    
        else if (consumo >=101 && consumo <150 ){
           //bandeira = "Bandeira Amarela";
            tarifa = ((consumo * 0.01343)*25)/100 + (consumo * 0.01343);
        }    
        else if (consumo >=150 && consumo <=200 ){
            //bandeira = "Bandeira Vermelha 1"; 
            tarifa = ((consumo * 0.04169)*25)/100 + (consumo * 0.04169);
        }    
        else{
            //bandeira = "Bandeira Vermelha 2"; 
            tarifa = ((consumo * 0.06243)*25)/100 + (consumo * 0.06243);        
        }
           
    return tarifa;
    }
    
    //----------------------------------------------------
    
    public double calculoFinal (){
        valorTotal = (valorParcial + tarifa);
        return valorTotal;
    }
    //----------------------------------------------------
    
    
    public void nota (){
        //teste
        System.out.println("parcial   " + valorParcial);
        System.out.println("total   " + valorTotal);
        System.out.println("tarifa   " + tarifa);
        System.out.println("bandeira   " + bandeira);
        
        DecimalFormat df = new DecimalFormat("#.00");
        JOptionPane.showMessageDialog(null, "---- Cia Energia ----\n"
                + "--------------------------------\n"
                + "Letura Anterior: " + leituraAntes +" KW\n"
                + "Leitura Atual: " + leituraAtual + " KW\n"
                + "Consumo: " + consumo + " KW\n"
                + "--------------------------------\n"
                + "Bandeira: " + bandeira + "\n"
                + "Valor Parcial: " + df.format(this.getValorParcial()) + " Reais \n"
                + "Valor Total: " + df.format(this.getValorTotal()) + " Reais \n");
                        
    }

    

    

    

    

  

    
}
