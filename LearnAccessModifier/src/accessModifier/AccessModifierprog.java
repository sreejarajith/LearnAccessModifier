package accessModifier;

public class AccessModifierprog {
	public int publicnum=34;
	private int privatenum=44;
	protected int protectnum=46;
	int defaultnum=67;
	
	protected void protectedNumPrint() {
		System.out.println("protected num="+protectnum);
	}
	public void publicNumPrint() {
		System.out.println("public num="+publicnum); 
	}
	void defaultNumPrint() {
		System.out.println("default num="+defaultnum);
	}
	private void privateNumPrint() {
		System.out.println("private num="+privatenum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifierprog amprog=new AccessModifierprog();
		amprog.privateNumPrint();
		amprog.protectedNumPrint();
		amprog.publicNumPrint();
		amprog.defaultNumPrint();
		}
		public int setnumber(int privatenum) {
			return this.privatenum=privatenum;
		}
		public int getnumber()
		{return this.privatenum=privatenum;
	}

}
