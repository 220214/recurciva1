package controller;

public class Soma {

	public Soma() {
		super();
		}
public int Somatudo(int valor) {
	
	//menor que zero
	if( valor < 0) {
		return 0;
	}else if( valor ==0) {//se for igual a zero
		return 0;
	}else {
		
		return  valor + Somatudo(valor - 1); //chama a função
	}
}
}
