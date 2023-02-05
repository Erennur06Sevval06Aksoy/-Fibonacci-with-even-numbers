/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package çift.sayılarla.fibonacci;

/**
 *
 * @author Lenovo
 */
public class ÇiftSayılarlaFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] fibonacci = new int[50]; // Rastgele bir maksimum değer, şuanda önemsiz bir detay
int fibo = 1, toplam = 0, sayici = 0, limit = 40;

while (fibo < limit)
{
      fibonacci[sayici+1] = fibonacci[sayici] + fibo; // Yeni terim, bir önceki ve iki öncekinin toplamı
      fibo = fibonacci[sayici]; // İki önceki artık bir önceki konumunda

      if (fibonacci[sayici] < limit && fibonacci[sayici] % 2 == 0) // Eğer limitin altında ve çiftse
      {
         toplam += fibonacci[sayici]; // Toplama ekle
         System.out.println(fibonacci[sayici]);
      }

      sayici++;
}
System.out.print("Toplam: {0}"+ toplam);
System.out.println("");
    }    
}
    
