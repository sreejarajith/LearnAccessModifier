package anotherAcessModifier;
import java.lang.reflect.Field;

import accessModifier.AccessModifierprog;

public class TestAccessModifierInAnotherPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierprog amprog=new AccessModifierprog();
		//amprog.privateNumPrint();
	//	amprog.protectedNumPrint();
		amprog.publicNumPrint();
		
	//amprog.defaultNumPrint();
//     Field field = amprog.getClass().getDeclaredField(privatenum);
//		
//     field.setAccessible(true);
//     int privatenum1 = (int) field.get(amprog);
//     System.out.println(privatenum1);
		
		amprog.setnumber(67);
		System.out.println("private value changed"+amprog.getnumber());
	}

}
