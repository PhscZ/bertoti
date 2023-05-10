class Carro {
	int chassi;
	String nome;
	String placa;
	Motor motor;
	Eixo eixo;
	
	public Carro (int chassi, String nome, String placa, Motor motor, Eixo eixo) {
		this.chassi = chassi;
		this.nome = nome;
		this.placa = placa;
		this.motor = motor;
		this.eixo = eixo;
	}
	
	public int getChassi(){
		return chassi;
	}
	public void setChassi(int chassi){
		this.chassi = chassi;
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getPlaca(){
		return placa;
	}
	public void setPlaca(String placa){
		this.placa = placa;
	}
	
	
	public static void main(String args[]) {
		Carro dodgecharger = new Carro(1, "Dodge Charger 1970", "FAZOL13", new Motor("HEMI", 8, 425), new Eixo(40, 0));
		System.out.println(dodgecharger.eixo.getAngulo());
		dodgecharger.eixo.Virar(0.7);
		System.out.println(dodgecharger.eixo.getAngulo());
	}
}