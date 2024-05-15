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
    public static float calculoValorMedio1 (float preço1, float quant1, String unidade){
        if(unidade.equalsIgnoreCase("Kilograma") || unidade.equalsIgnoreCase("kg")) quant1*=1000;
        if(unidade.equalsIgnoreCase("Litros") || unidade.equalsIgnoreCase("L")) quant1*=1000;
        float valormedio1 = preço1/quant1;
        return valormedio1;
    }
    
    public static float calculoValorMedio2 (float preço2, float quant2, String unidade){  
        if(unidade.equalsIgnoreCase("Kilograma") || unidade.equalsIgnoreCase("kg")) quant2*=1000;
        if(unidade.equalsIgnoreCase("Litros") || unidade.equalsIgnoreCase("L")) quant2*=1000;
        float valormedio2 = preço2/quant2;
        return valormedio2;
    }
}
