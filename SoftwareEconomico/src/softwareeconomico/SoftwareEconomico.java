/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package softwareeconomico;
import javax.swing.JOptionPane;
import metodos.Funcoes;

public class SoftwareEconomico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Marca1 = "";
        String Marca2 = "";
        float Preço1 = 0;
        float Preço2 = 0;
        float Quantidade1 = 0;
        float Quantidade2 = 0;
        String unidadeDeMedida = ""; 
        String unidadeDeMedida2 = "";
        
        
        
        JOptionPane.showMessageDialog(null, "Calculo de melhor Custo Beneficio", "Menu", JOptionPane.INFORMATION_MESSAGE);
        boolean rep = true;
        
         String tipoProduto = JOptionPane.showInputDialog("Digite o nome o tipo Produto !");
           boolean Produto1 = true; 
            do {                
          
           Marca1 = JOptionPane.showInputDialog("Digite a Marca do Produto 1");
           
           Preço1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do Produto 1"));
           
           Quantidade1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade ou Volume Do Produto"));
           
           unidadeDeMedida = JOptionPane.showInputDialog("Determine a unidade de medida");
           
           JOptionPane.showMessageDialog(null,"Confirme o Primeiro Produto \n"+tipoProduto+" "+Marca1+"\n\nPreço R$ "+Preço1+"\n\nQuantidade ou Volumer : "+Quantidade1+unidadeDeMedida);
           
           int confirmacaoP1 = JOptionPane.showConfirmDialog(null, "O Primeiro Poduto está correto","Produto",JOptionPane.YES_NO_OPTION);
           Produto1 = (confirmacaoP1 == JOptionPane.YES_OPTION);
            
            } while (Produto1 == false);
            
            
            boolean Produto2 = true; 
            do {                
          
           Marca2 = JOptionPane.showInputDialog("Digite a Marca do Produto 2");
           
           Preço2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do Produto 2"));
           
           Quantidade2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade ou Volume Do Produto"));
           
           unidadeDeMedida2 = JOptionPane.showInputDialog("Determine a unidade de medida");
           
           JOptionPane.showMessageDialog(null,"Confirme o Segundo Produto \n"+tipoProduto+" "+Marca2+"\n\nPreço R$ "+Preço2+"\n\nQuantidade ou Volumer : "+Quantidade2+unidadeDeMedida2);
           
           int confirmacaoP2 = JOptionPane.showConfirmDialog(null, "O Segundo Poduto está correto","Produto",JOptionPane.YES_NO_OPTION);
           Produto2 = (confirmacaoP2 == JOptionPane.YES_OPTION);
            
            } while (Produto2 == false);
            
            if(unidadeDeMedida.equalsIgnoreCase("Kilograma") || unidadeDeMedida.equalsIgnoreCase("kg")) Quantidade1*=1000;
            if(unidadeDeMedida.equalsIgnoreCase("Litros") || unidadeDeMedida.equalsIgnoreCase("L")) Quantidade1*=1000;
            if(unidadeDeMedida2.equalsIgnoreCase("Kilograma") || unidadeDeMedida2.equalsIgnoreCase("kg")) Quantidade2*=1000;
            if(unidadeDeMedida2.equalsIgnoreCase("Litros") || unidadeDeMedida2.equalsIgnoreCase("L")) Quantidade2*=1000;
            
            
            float media1 = Funcoes.calculoCustoMedio1(Preço1, Quantidade1);
            float media2 = Funcoes.calculoCustoMedio2(Preço2, Quantidade2);
            float precoProduto1 = Funcoes.CustoProduto1(media1, media2, Quantidade1, Quantidade2);
            float precoProduto2 = Funcoes.CustoProduto2(media1, media2, Quantidade1, Quantidade2);
            
            if (Quantidade1 > Quantidade2) {
                if (Preço1 > precoProduto2) {                    
                JOptionPane.showMessageDialog(null,"O Produto Com o melhor Custo Benefio é \n"+"Segundo Produto \n\n"+tipoProduto+" "+Marca2+" "+Quantidade2+" "+unidadeDeMedida2+"\n\nPreço R$ "+Preço2);
                }else JOptionPane.showMessageDialog(null,"O Produto Com o melhor Custo Benefio é \n"+"Primeiro Produto \n\n"+tipoProduto+" "+Marca1+" "+Quantidade1+" "+unidadeDeMedida+"\n\nPreço R$ "+Preço1);
        }
            if (Quantidade1 < Quantidade2) {
                if (Preço2 > precoProduto1) {
                    JOptionPane.showMessageDialog(null,"O Produto Com o melhor Custo Benefio é \n"+"Primeiro Produto \n\n"+tipoProduto+" "+Marca1+" "+Quantidade1+" "+unidadeDeMedida+"\n\nPreço R$ "+Preço1);
                }else JOptionPane.showMessageDialog(null,"O Produto Com o melhor Custo Benefio é \n"+"Segundo Produto \n\n"+tipoProduto+" "+Marca2+" "+Quantidade2+" "+unidadeDeMedida2+"\n\nPreço R$ "+Preço2);

        }          
    }
    
}
