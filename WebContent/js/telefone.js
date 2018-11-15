function Telefone(numero){
	this.numero=numero;
};

Telefone.prototype.setNumero= function(numero){
	this.numero = numero;
};

Telefone.prototype.getNumero= function(){
	return this.numero;
};