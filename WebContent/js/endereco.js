function Endereco(bairro,cidade){
	this.bairro=bairro;
	this.cidade=cidade;
};
Endereco.prototype.setBairro= function(bairro){
	this.bairro= bairro;
};
Endereco.prototype.getBairro= function(){
	return this.bairro;
};
Endereco.prototype.setCidade= function(cidade){
	this.cidade= cidade;
};
Endereco.prototype.getCidade= function(){
	return this.cidade;
};

