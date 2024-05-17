package org.AntoArray;

public class MioArrayDinamico {
	private int[] arrayAnto;
	private int ultimoIndice;

	public MioArrayDinamico(int[] nuovoArray) {
		this.arrayAnto = nuovoArray;
		this.ultimoIndice = -1;
	}

	public MioArrayDinamico() {
		this.arrayAnto = new int[0];
		this.ultimoIndice = -1;

	}

	public MioArrayDinamico(int size) {
		this.arrayAnto = new int[size];
		this.ultimoIndice = -1;
	}

	public int getElementoSuccessivo() {
		
		
	}

	public boolean hasAncoraElementi() {
		return true;
	}
}
