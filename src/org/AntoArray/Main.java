package org.AntoArray;


public class Main {
	public static void main(String[] ars) {
		
		int[] arrayDiNumeri = {3,5,7,5};
		
		MioArrayDinamico arrayInt = new MioArrayDinamico(arrayDiNumeri);
		
		System.out.println(arrayInt);
		arrayInt.addElemento(55);
		
		System.out.println(arrayInt);
		
		System.out.println(arrayInt.getElementoSuccessivo());
		System.out.println(arrayInt.getElementoSuccessivo());
		System.out.println(arrayInt.getElementoSuccessivo());
		System.out.println(arrayInt.getElementoSuccessivo());
		System.out.println(arrayInt.getElementoSuccessivo());
		System.out.println(arrayInt.getElementoSuccessivo());
		
		
		MioArrayDinamico arraySenzaCostruttore = new MioArrayDinamico();
		arraySenzaCostruttore.addElemento(55);
		System.out.println(arraySenzaCostruttore);
		 
		
	}
	

	
	
	

}
