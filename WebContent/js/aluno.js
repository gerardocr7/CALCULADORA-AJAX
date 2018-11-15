function Aluno(nome,sexo){
	this.nome=nome;
	this.sexo=sexo;
};
Aluno.prototype.setNome= function(nome){
	this.nome=nome;
};
Aluno.prototype.getNome= function(){
	return this.nome;
};
Aluno.prototype.setSexo= function(sexo){
	this.sexo=sexo;
};
Aluno.prototype.getSexo= function(){
	return this.sexo;
};