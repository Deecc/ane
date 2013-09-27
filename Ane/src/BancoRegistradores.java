/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nios;

public class BancoRegistradores {
        private static Conversor converter = new Conversor();
	String registrador[];
        
	public BancoRegistradores() {

            registrador = new String[32];
            for(int i = 0; i<32;i++){
                registrador[i] = "00000000000000000000000000000000";
            }
	}
	public void generateValue(int i, String value){
          if(i!=0){  
            while(value.length() < 32){
                value = "0" + value;
            }
            
            registrador[i] = value;
          }  
        }
	    
	public int getRegistrador(int i) {
		if (i == 0)return 0;
		return Integer.parseInt(registrador[i], 2);
	}
	
	public void setRegistrador(int i, int valor) {
		if (i != 0){
                   String sValor = "" + valor;
		   this.registrador[i] = converter.decToBin(sValor);
                }
        }
	
	 public String[] getBancoRegistradores(){
             return registrador;
         }
        

}