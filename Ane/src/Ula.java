/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import javax.swing.JOptionPane;




public class Ula {
	Scanner sc = new Scanner(System.in);

	public void exec(BancoRegistradores br, PC pc){
	      switch (pc.getOpCode()) {
                    case 0x00:
                        call(br,pc);
                        break;
                    case 0x01:
                        jmpi(br, pc);              
			break;
                    case 0x02:
						
			break;
                    case 0x03:
                        ldbu(br, pc);
                        break;
                    case 0x04:
                        addi(br, pc);
                        break;
                    case 0x05:
                        stb(br, pc);
                        break;
                    case 0x06:
                        br(br, pc);
                        break;
                    case 0x07:
                        ldb(br, pc);
                        break;
                    case 0x08:
                        cmpgei(br, pc);
                        break;
                    case 0x09:
                        
                        break;
                    case 0x0A:
                        
                        break;
                    case 0x0B:
                        ldhu(br, pc);
                        break;
                    case 0x0C:
                        andi(br, pc);
                        break;
                    case 0x0D:
                        sth(br, pc);              
			break;
                    case 0x0E:
			bge(br, pc);			
			break;
                    case 0x0F:
                        ldh(br, pc);
                        break;
                    case 0x10:
                        cmplti(br, pc);
                        break;
                    case 0x11:
                        
                        break;
                    case 0x12:
                        
                        break;
                    case 0x13:
                        initda(br, pc);
                        break;
                    case 0x14:
                        ori(br, pc);
                        break;
                    case 0x15:
                        stw(br, pc);
                        break;
                    case 0x16:
                        blt(br, pc);
                        break;
                    case 0x17:
                        ldw(br, pc);
                        break;
                    case 0x18:
                        cmpnei(br, pc);
                        break;
                    case 0x19:
                      
                        break;
                    case 0x1A:
                        
                        break;
                    case 0x1B:
                        flushda(br, pc);
                        break;
                    case 0x1C:
                        xori(br, pc);
                        break;
                    case 0x1D:
                        
                        break;
                    case 0x1E:
                        bne(br, pc);
                        break;
                    case 0x1F:
                        
                        break;
                    case 0x20:
                        cmpeqi(br, pc);
                        break;
                    case 0x21:
                        
                        break;
                    case 0x22:
                        
                        break;
                    case 0x23:
                        ldbuio(br, pc);
                        break;
                    case 0x24:
                        muli(br, pc);
                        break;
                    case 0x25:
                        stbio(br, pc);
                        break;
                    case 0x26:
                        beq(br, pc);
                        break;
                    case 0x27:
                        ldbio(br, pc);
                        break;    
                    case 0x28:
                        cmpqeui(br, pc);
                        break;
                    case 0x29:
                        
                        break;
                    case 0x2A:
                        
                        break;
                    case 0x2B:
                        ldhuio(br, pc);
                        break;
                    case 0x2C:
                        andhi(br, pc);
                        break;    
                    case 0x2D:
                        sthio(br, pc);
                        break;
                    case 0x2E:
                        bgeu(br, pc);
                        break;
                    case 0x2F:
                        ldhio(br, pc);
                        break;
                    case 0x30:
                        cmpltui(br, pc);
                        break;
                    case 0x31:
                        
                        break;
                    case 0x32:
                        custom(br, pc);
                        break;
                    case 0x33:
                        initd(br, pc);
                        break;
                    case 0x34:
                        orhi(br, pc);
                        break;
                    case 0x35:
                        stwio(br, pc);
                        break;
                    case 0x36:
                        bltu(br, pc);
                        break;
                    case 0x37:
                        ldwio(br, pc);
                        break;    
                    case 0x38:
                        rdprs(br, pc);
                        break;
                    case 0x39:
                        
                        break;
                    case 0x3A:
                        rTypeOperation(br, pc);
                        break;
                    case 0x3B:
                        flushd(br, pc);
                        break;
                    case 0x3C:
                        xorhi(br, pc);
                        break;    
                    case 0x3D:
                        
                        break;
                    case 0x3E:
                        
                        break;
                    case 0x3F:
                        
                        break;
                default:
                    JOptionPane.showMessageDialog(null, "Código Inoperante ou reservado.",null , JOptionPane.ERROR_MESSAGE );
                    break;
            }
        }
        
        
        
	private void rTypeOperation(BancoRegistradores br, PC pc){
		switch (pc.getOpx()) {
                    case 0x02:
                        roli(br, pc);              
			break;
                    case 0x03:
			rol(br, pc);			
			break;
                    case 0x04:
                        flushp(br, pc);
                        break;
                    case 0x05:
                        ret(br, pc);
                        break;
                    case 0x06:
                        nor(br, pc);
                        break;
                    case 0x07:
                        mulxuu(br, pc);
                        break;
                    case 0x08:
                        cmpge(br, pc);
                        break;
                    case 0x09:
                        bret(br, pc);
                        break;
                    case 0x0B:
                        ror(br, pc);
                        break;
                    case 0x0C:
                        flushi(br, pc);
                        break;
                    case 0x0D:
                        jmp(br, pc);
                        break;
                    case 0x10:
                        cmplt(br, pc);
                        break;
                    case 0x12:
                        slli(br, pc);              
			break;
                    case 0x13:
			sll(br, pc);			
			break;
                    case 0x14:
                        wrprs(br, pc);
                        break;
                    case 0x16:
                        or(br, pc);
                        break;
                    case 0x17:
                        mulxsu(br, pc);
                        break;
                    case 0x18:
                        cmpne(br, pc);
                        break;
                    case 0x1A:
                        srli(br, pc);
                        break;
                    case 0x1B:
                        srl(br, pc);
                        break;
                    case 0x1C:
                        nextpc(br, pc);
                        break;
                    case 0x1D:
                        callr(br, pc);
                        break;
                    case 0x20:
                        cmpeq(br, pc);
                        break;
                    case 0x24:
                        divu(br, pc);
                        break;
                    case 0x25:
                        div(br, pc);
                        break;
                    case 0x26:
                        rdctl(br, pc);
                        break;
                    case 0x27:
                        mul(br, pc);
                        break;
                    case 0x28:
                        cmpgeu(br, pc);
                        break;
                    case 0x29:
                        initi(br, pc);
                        break;
                    case 0x2D:
                        trap(br, pc);
                        break;
                    case 0x30:
                        cmpltu(br, pc);
                        break;
                    case 0x31:
                        add(br, pc);
                        break;
                    case 0x34:
                        breaK(br, pc);
                        break;
                    case 0x36:
                        sync(br, pc);
                        break;
                    case 0x39:
                        sub(br, pc);
                        break;
                    case 0x3A:
                        srai(br, pc);
                        break;
                    case 0x3B:
                        sra(br, pc);
                        break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "Código Inoperante ou reservado.",null , JOptionPane.ERROR_MESSAGE );
			break;
		}
		
		
        }
	
        
        
    // rTypeOperations    
    private void roli(BancoRegistradores br, PC pc){
        int n = Integer.rotateLeft(br.getRegistrador(pc.getrA()), br.getRegistrador(pc.getImm5()));
        br.setRegistrador( pc.getrC(), n);
    }
	
    private void rol(BancoRegistradores br, PC pc){
        int n = (br.getRegistrador(pc.getrB()) << 1);
        n = Integer.rotateLeft(br.getRegistrador(pc.getrA()), n);
        br.setRegistrador(pc.getrC(), n);
    }
        
    private void flushp(BancoRegistradores br, PC pc){
        for (int i=0;i<31;i++){
            br.setRegistrador(i, 0);
        }
            
    }
        
    private void ret(BancoRegistradores br , PC pc){
        br.setRegistrador(pc.getrA(), (pc.getrA()+pc.getrB()+pc.getrC()+pc.getImm16()+pc.getOpCode()));
    }
        
	
    private void nor(BancoRegistradores br, PC pc) {
        br.setRegistrador(pc.getrC(),~(br.getRegistrador(pc.getrA()) | br.getRegistrador(pc.getrB())));
    
    }

    private void mulxuu(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cmpge(BancoRegistradores br, PC pc) {
        int cmp;
        if(br.getRegistrador(pc.getrA())>= br.getRegistrador(pc.getrB())){
            cmp = 1;
        }else cmp = 0;
        br.setRegistrador(pc.getrC(),cmp);
    }

    private void bret(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ror(BancoRegistradores br, PC pc) {
        int n = (br.getRegistrador(pc.getrB()) << 1 );
        n = Integer.rotateRight(br.getRegistrador(pc.getrA()), n);
        br.setRegistrador(pc.getrC(), n);
    }

    private void flushi(BancoRegistradores br, PC pc) {
        br.setRegistrador(pc.getrA(), 0);
    }

    private void jmp(BancoRegistradores br, PC pc) {
        br.setRegistrador(pc.getrA(), br.getRegistrador(pc.getrA()));
    }

    private void cmplt(BancoRegistradores br, PC pc) {
        int cmp;
        if (br.getRegistrador(pc.getrA()) < br.getRegistrador(pc.getrB())){
            cmp = 1;
        }else cmp = 0;
        br.setRegistrador(pc.getrC(), cmp);
    }

    private void slli(BancoRegistradores br, PC pc) {
        int shift = br.getRegistrador(pc.getrA()) << br.getRegistrador(pc.getImm5());
        br.setRegistrador(pc.getrC(), shift );
    }

    private void sll(BancoRegistradores br, PC pc) {
        int n = (br.getRegistrador(pc.getrB()) << 1);
        int shift = (pc.getrA() << n);
    }

    private void wrprs(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void or(BancoRegistradores br, PC pc) {
        br.setRegistrador(pc.getrC(), (br.getRegistrador(pc.getrA()) | br.getRegistrador(pc.getrB())));
    }

    private void mulxsu(BancoRegistradores br, PC pc) {
        long l = br.getRegistrador(pc.getrA());
        long l2 = br.getRegistrador(pc.getrB()) & 0xfL;
        long l3 = l * l2 >>> 32;
        br.setRegistrador(pc.getrC(), (int)l3);
    }

    private void cmpne(BancoRegistradores br, PC pc) {
        if (br.getRegistrador(pc.getrA()) != br.getRegistrador(pc.getrB())){
            br.setRegistrador(pc.getrC(), 1);
        }else br.setRegistrador(pc.getrC(), 0);
    }

    private void srli(BancoRegistradores br, PC pc) {
        int n = br.getRegistrador(pc.getImm5()) & 0x3f;
        br.setRegistrador(pc.getrC(), br.getRegistrador(pc.getrA()) >> n);
        
    }

    private void srl(BancoRegistradores br, PC pc) {
        int n = (br.getRegistrador(pc.getrB()) << 1);
        br.setRegistrador(pc.getrC(), br.getRegistrador(pc.getrA()) >> n);
    }
    

    private void nextpc(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void callr(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cmpeq(BancoRegistradores br, PC pc) {
        if (br.getRegistrador(pc.getrA()) == br.getRegistrador(pc.getrB())){
            br.setRegistrador(pc.getrC(), 1);
        }else br.setRegistrador(pc.getrC(), 0);
    }

    private void divu(BancoRegistradores br, PC pc) {
        long rA = br.getRegistrador(pc.getrA()) & 0xfL;
        long rB = br.getRegistrador(pc.getrB()) & 0xfL;
        long result = rA * rB;
        br.setRegistrador(pc.getrC(), (int)result);
    }

    private void div(BancoRegistradores br, PC pc) {
        br.setRegistrador(pc.getrC(), br.getRegistrador(pc.getrA()) / br.getRegistrador(pc.getrB()));
    }

    private void rdctl(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mul(BancoRegistradores br, PC pc) {
        br.setRegistrador(pc.getrC(), pc.getrA() * pc.getrB());
    }

    private void cmpgeu(BancoRegistradores br, PC pc) {
        long l = br.getRegistrador(pc.getrA()) & 0xfL;
        long l2 = br.getRegistrador(pc.getrB()) & 0xfL;
        if (l >= l2){
            br.setRegistrador(pc.getrC(),1);
        }else br.setRegistrador(pc.getrC(),0);
    }

    private void initi(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void trap(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    private void cmpltu(BancoRegistradores br, PC pc) {
        long l = br.getRegistrador(pc.getrA()) & 0xfL;
        long l2 = br.getRegistrador(pc.getrB()) & 0xfL;
        if (l < l2){
            br.setRegistrador(pc.getrC(),1);
        }else br.setRegistrador(pc.getrC(),0);
    
    }
    
    private void add(BancoRegistradores br, PC pc){
            br.setRegistrador( pc.getrA(), br.getRegistrador(pc.getrB()) + br.getRegistrador(pc.getrC()) );
    }

    private void breaK(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void sync(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void sub(BancoRegistradores br, PC pc) {
        br.setRegistrador( pc.getrA(), br.getRegistrador(pc.getrB()) - br.getRegistrador(pc.getrC()) );
    }

    private void srai(BancoRegistradores br, PC pc) {
        int n = br.getRegistrador(pc.getImm5()) & 0x3f;
        br.setRegistrador(pc.getrC(), br.getRegistrador(pc.getrA()) >> n);
    }

    private void sra(BancoRegistradores br, PC pc) {
        int n = (br.getRegistrador(pc.getrB()) << 1);
        br.setRegistrador(pc.getrC(), br.getRegistrador(pc.getrA()) >> n);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    
    // iTypeOperations
    private void call(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void jmpi(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ldbu(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addi(BancoRegistradores br, PC pc) {
        br.setRegistrador(pc.getrC(), br.getRegistrador(pc.getrA()) + br.getRegistrador(pc.getImm16()));
    }

    private void stb(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void br(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ldb(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cmpgei(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ldhu(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void andi(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void sth(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void bge(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ldh(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cmplti(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void initda(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ori(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void stw(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void blt(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ldw(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cmpnei(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void flushda(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void xori(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void bne(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cmpeqi(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ldbuio(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void muli(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void stbio(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void beq(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ldbio(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cmpqeui(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ldhuio(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void andhi(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void sthio(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void bgeu(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ldhio(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cmpltui(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void custom(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void initd(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void orhi(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void stwio(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void bltu(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ldwio(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void rdprs(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void flushd(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void xorhi(BancoRegistradores br, PC pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
