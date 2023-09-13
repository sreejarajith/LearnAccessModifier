package accessModifier;

public class SamepackageAccessModifierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
AccessModifierprog amprog=new AccessModifierprog();
//amprog.privateNumPrint();
amprog.protectedNumPrint();
amprog.publicNumPrint();
amprog.defaultNumPrint();

amprog.setnumber(45);
System.out.println("privatenumber changed="+amprog.getnumber());
	}

}
