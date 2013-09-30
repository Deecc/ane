package nios;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
*/

/**
 *
 * @author pesquisa
 */
public class Comp{
    Conversor converter = new Conversor();
    public Comp(){
    }
    
    public boolean line(PC pc, Ula ula, BancoRegistradores br, String code){
           if(code.contains("0x")){
               code = converter.hexToBin(code);
           }
           if(pc.setPC(code)){
                ula.exec(br, pc);
                return true;
           }else{
               return false;
           }
           
    }
}
