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
	
	public static void main(String args[]) {
		Carro dodgecharger = new Carro(1, "Dodge Charger 1970", "FAZOL13", new Motor("HEMI", 8, 425), new Eixo(40, 0));
		System.out.println(dodgecharger.eixo.angulo);
		dodgecharger.eixo.Virar(0.7);
		System.out.println(dodgecharger.eixo.angulo);
	}
}