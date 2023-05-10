class Eixo {
	double angulomax;
	double angulo;
	
	public Eixo (double angulomax, double angulo) {
		this.angulomax = angulomax;
		this.angulo = angulo;
	}
	
	public double getAnguloMax(){
		return angulomax;
	}
	public void setAnguloMax(double angulomax){
		this.angulomax = angulomax;
	}
	
	public double getAngulo(){
		return angulo;
	}
	public void setAngulo(double angulo){
		this.angulo = angulo;
	}
	
	public void Virar(double rotacao){
		if (rotacao > 1)
			rotacao = 1;
		else if (rotacao < -1)
			rotacao = -1;
		this.angulo = angulomax * rotacao;
	}
}