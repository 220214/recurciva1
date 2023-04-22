package view;

import controller.Soma;

public class Main {

	public static void main(String[] args) {
		int valor =(int)((Math.random()*100)+ 0);
		Soma s=new Soma ();
		int soma = s.Somatudo(valor);
		System.out.println("Soma do " + valor +" até o zero = "+ soma);
		

	}

}
