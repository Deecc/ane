/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author pesquisa
 */

public class Nios {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
                BancoRegistradores br = new BancoRegistradores();
                Conversor converter = new Conversor();
                PC pc;
                Scanner ler = new Scanner(System.in);
                
		FileReader fr = new FileReader("arquivo.txt"); 
		BufferedReader buf = new BufferedReader(fr); 
		String linha;
                Ula ula = new Ula();
		int i = 0;
                int comp;

                do{
                    System.out.println("Digite 1 para próxima instrução ou 9 para finalizar.\n");
                    comp = ler.nextInt();
                    
                    switch(comp){
                        case 1:
                            if((linha = buf.readLine()) != null){
                                System.out.println(linha);
                                pc = new PC(linha);
                               ula.exec(br, pc);
                                printRegisters(br);
                            }else System.out.println("EOF");
                            break;
                        case 9:
                            
                            break;
                            
                        default:
                            System.out.println("Opção inválida.\n");
                            break;
                    }
                    
                }while(comp != 9);
                System.out.println("fim");
//		while((linha = buf.readLine()) != null){
//                    i++;
//                    System.out.println("linha "+ i +":  " + linha);
//                    
//			
//		}
//               
	}
        
   private static void printRegisters(BancoRegistradores br){
       for(String s : br.getBancoRegistradores()){
           System.out.println(s);
       }
   }
}