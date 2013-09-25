package nios;

public class PC {

	//int PCparts[];
	String sPCparts[] = new String[6];

	private int opCode, rA, rB, rC, opx, imm16, imm5;
	
	public PC(String linha) {
	
		
		sPCparts[0] = linha.substring(0, 5);   // rA              5bits
		sPCparts[1] = linha.substring(5, 10);   // rB              5bits
		sPCparts[2] = linha.substring(10, 15); // rC        imm16 5bits
		sPCparts[3] = linha.substring(15, 21); // opx       imm16 5bits
		sPCparts[4] = linha.substring(21, 26); // opx imm5  imm16 6bits
		sPCparts[5] = linha.substring(26, 32); // opCode          6bits
		
		this.opCode = Integer.parseInt(sPCparts[5], 2);
		this.rA = Integer.parseInt(sPCparts[0], 2);
		this.rB = Integer.parseInt(sPCparts[1], 2);
	}
	
	
	
	// função retornará true se a operação definida em opCode for do tipo I.
	public boolean defOperation(){
            System.out.println(sPCparts[5] + "---" + opCode);
		if (opCode == 0x3a){
			 
                       toRType(sPCparts);
                    return true;

		}else{
                        toIType(sPCparts);
			return false;
			}


	}
	
	private void toIType(String spc[]){
		this.imm16 = Integer.parseInt(spc[2] + spc[3] + spc[4], 2);
		
	}	
	
	private void toRType(String spc[]){
		this.rC = Integer.parseInt(spc[2], 2);
		this.opx = Integer.parseInt(spc[3], 2);
		this.imm5 = Integer.parseInt(spc[4], 2);
		
	}

//      private void toJType(String spc[]){
//		this.imm16 = Integer.parseInt(spc[2] + spc[3], 2);
//		
//	}
	


	public int getOpCode() {
		return opCode;
	}


	public int getrA() {
		return rA;
	}


	public int getrB() {
		return rB;
	}


	public int getrC() {
		return rC;
	}


	public int getOpx() {
		return opx;
	}


	public int getImm16() {
		return imm16;
	}
	
        public int getImm5() {
            return imm5;
        }
	
	
	
}
