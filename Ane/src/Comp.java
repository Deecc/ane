/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
*/

/**
 *
 * @author pesquisa
 */
public class Comp{
    String [] code;
    private int lineCounter = 0;
    private int end;
    public Comp(String[] code){
        this.code = code;
        end = code.length;
    }
    
    public void line(PC pc, Ula ula, BancoRegistradores br){
        if(lineCounter++ < end){
            pc.setPC(code[lineCounter]);
            ula.exec(br, pc);
        }
    }
    
    public void all(PC pc, Ula ula, BancoRegistradores br){
        while(lineCounter++ < end){
            pc.setPC(code[lineCounter]);
            ula.exec(br, pc);
        }
    }
    
    public void clear(){
        lineCounter = 0;
        code = null;
    }
}
