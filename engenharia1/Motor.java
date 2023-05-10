class Motor {
	String nome;
	int valvulas;
	double cavalos;
	
	public Motor (String nome, int valvulas, double cavalos) {
		this.nome = nome;
		this.valvulas = valvulas;
		this.cavalos = cavalos;
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public int getValvulas(){
		return valvulas;
	}
	public void setValvulas(int chassi){
		this.valvulas = valvulas;
	}
	
	public double getCavalos(){
		return cavalos;
	}
	public void setCavalos(double cavalos){
		this.cavalos = cavalos;
	}
}