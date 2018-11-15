package control;

import entity.Numero;

public class Calculadora {
	
	public Integer soma(Numero n){
		Integer soma = n.getNum1() + n.getNum2();
		return soma;
	}

	public Integer subtracao(Numero n){
		Integer sub = n.getNum1() - n.getNum2();
		return sub;
	}
	
	public Integer multiplicacao(Numero n){
		Integer mult = n.getNum1() * n.getNum2();
		return mult;
	}
	
	public Integer divisao(Numero n){
		Integer div = n.getNum1() / n.getNum2();
		return div;
	}
}
