/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;

import java.util.Scanner;
public class Jurnal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int bil1=0,bil2=0,hasil=1,bil3,hasilJumlah=0;
   Scanner input = new Scanner (System.in);
   System.out.print ("Input Deret : ");
        bil3 = input.nextInt ();
        for(int i=1; i<=bil3; i++){           
    bil1=bil2;
    bil2=hasil;
    hasilJumlah=hasilJumlah+hasil;
    hasil=bil1+bil2;
    }
     System.out.print(hasilJumlah+" ");
    } 
    
}
