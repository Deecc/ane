/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nios;

/**
 *
 * @author 20122014040090
 */
public class Conversor {
    
    // converte a string hexadecimal para o equivalente em binário de 32bits
     public String hexToBin(String hex){
        String bin = "";
        String binFragment;
        int iHex;
        hex = hex.trim();
        hex = hex.replaceFirst("0x", "");

        for(int i = 0; i < hex.length(); i++){
            iHex = Integer.parseInt(""+hex.charAt(i),16);
            binFragment = Integer.toBinaryString(iHex);

            while(binFragment.length() < 4){
                binFragment = "0" + binFragment;
            }
            bin += binFragment;
        }
        while (bin.length() <32){
            bin = "0" + bin;
        }
    return bin;
    }
     
     public String decToBin(String dec){
         //dec = dec.trim();
         String bin = "";
         int iDec;
         for(int i = 0 ; i < dec.length() ;i++){
             iDec = Integer.parseInt(dec,10);
             bin = Integer.toBinaryString(iDec);
             
             while (bin.length() < 32){
                 bin = "0" +bin;
             }
         }
         
         return bin;
     }
}
