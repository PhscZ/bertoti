class Carro{
	String nome;
	int ano;
	int idChassi;
	String placa;
	double largura;
	double altura;
	double comprimento;
	double peso;
	double posX;
	double posY;
	double posZ;
	double velocidade;
	double rotacao;
	
	public void main(String args[]) {
		Carro dodgeCharger = new Carro();
		dodgeCharger.nome = "Dodge Charger";
		dodgeCharger.ano = 1970;
		dodgeCharger.placa = "THX1138";
		dodgeCharger.largura = 194.6;
		dodgeCharger.comprimento = 529.6;
		dodgeCharger.altura = 134.6;
		
		Motor hemi426 = new Motor();
		hemi426.litros = 7.0;
		hemi426.nValvulas = 8;
		hemi426.linhas = 2;
		hemi426.rpm = 0;
		hemi426.rodando = false;
		
		Cambio a833 = new Cambio();
		a833.engate = 0;
		a833.marchas = 4;
		a833.marcha = 0;
		a833.relacao = {0.00, 2.47, 1.77, 1.34, 1.00};
		
		Volante mw752 = new Volante();
		mw752.diametro = 36.83;
		mw752.rotacao = 0;
		mw752.rotacaoMax = 3.2;
		
		EixoRoda roda = new EixoRoda();
	}
}