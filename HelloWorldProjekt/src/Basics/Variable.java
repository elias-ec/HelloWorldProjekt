package Basics;

public class Variable {

	public static void main(String[] args) {
		// 1 bit - wahr oder falsch / 0 oder 1
		boolean boolVar;
		boolVar = true;
		System.out.println(boolVar);
		//
		boolVar = false;
		System.out.println(boolVar);
		//
		// Variable: shortVar
		//short 16bit
		short shortVar;
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		shortVar = 24673;
		System.out.println(shortVar);
		//
		shortVar = 3+4;
		System.out.println(shortVar);
		//
		shortVar = 9-5;
		System.out.println(shortVar);
		//
		shortVar = 3*3;
		System.out.println(shortVar);
		//
		shortVar = 9/4;
		System.out.println(shortVar);
		//Achtung Nur ganze Zahlen werden gerechnet (siehe 9/4=2)
		System.out.println(9/4.0);
		//Jetzt kommt ein Wert mit Kommastellen heraus.
		//
		//
		//Andere Variable: int:
		int intVar;
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		// Man sieht: intVar hat einen größeren Wertebereich als shortVar
		//
		//Andere Variable: longVar
		long longVar;
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		// Man sieht: longVar hat noch einen viel größeren Wertebereich als intVar
		longVar = 1000*1000*1000*1000;
				System.out.println(longVar);
				//
				//
				System.out.println(System.currentTimeMillis());
				// Aktuelle Zeit in MilliseKunden
				// Vom ersten Jänner 1970 aus (hier begann das Zeitalter der Computer -> die meisten PCs rechenen daher von 1970)
	}
}
