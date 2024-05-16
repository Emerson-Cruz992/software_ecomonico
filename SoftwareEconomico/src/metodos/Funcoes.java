/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author emera
 */
public class Funcoes {
    public static float calculoCustoMedio1 (float preço1, float quant1){
        
        float valormedio1 = preço1/quant1;
        return valormedio1;
    }
    
    public static float calculoCustoMedio2 (float preço2, float quant2){  
        
        float valormedio2 = preço2/quant2;
        return valormedio2;
    }
    
    public static float CustoProduto1 (float valorMedio1, float valorMedio2, float quant1, float quant2){    
        if(quant1 < quant2) return valorMedio1*=quant2;
        return valorMedio1;     
    }
    
    public static float CustoProduto2 (float valorMedio1, float valorMedio2, float quant1, float quant2){    
        if(quant1 > quant2) return valorMedio2*=quant1;
        return valorMedio2;     
    }
    
}
