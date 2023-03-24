class Motor{
	int nValvulas;
	double litros;
	int linhas;
	double rpm;
	boolean rodando;

	void ignicao(){
		if (rodando == false) {
			rodando = true;
		} else {
			rodando = false;
		}
	}
	void acelerar(double forca){
		
	}
}