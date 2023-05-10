class Eixo {
	double angulomax;
	double angulo;
	
	public Eixo (double angulomax, double angulo) {
		this.angulomax = angulomax;
		this.angulo = angulo;
	}
	
	public void virar(double rotacao){
		if (rotacao > 1)
			rotacao = 1;
		else if (rotacao < -1)
			rotacao = -1;
		this.angulo = angulomax * rotacao;
	}
}