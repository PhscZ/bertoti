class CarroModel {
    private String placa;
    private String fabricante;
    private String modelo;
    private int ano;
 
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
 
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
	
	public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
	
	public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}
 
class CarroView {
    public void printCarro(String placa, String fabricante, String modelo, int ano) {
        System.out.println("  Carro:");
        System.out.println("Placa: " + placa);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
 
class CarroController {
    private CarroModel model;
    private CarroView view;
 
    public CarroController(CarroModel model, CarroView view) {
        this.model = model;
        this.view = view;
    }
 
    public void setPlaca(String placa) {
        model.setPlaca(placa);
    }
    public String getPlaca() {
        return model.getPlaca();
    }
	
	public void setFabricante(String fabricante) {
        model.setFabricante(fabricante);
    }
    public String getFabricante() {
        return model.getFabricante();
    }
	
	public void setModelo(String modelo) {
        model.setModelo(modelo);
    }
    public String getModelo() {
        return model.getModelo();
    }
	
	public void setAno(int ano) {
        model.setAno(ano);
    }
    public int getAno() {
        return model.getAno();
    }
 
    public void updateView() {
        view.printCarro(model.getPlaca(), model.getFabricante(), model.getModelo(), model.getAno());
    }
}
 
public class Main {
    public static void main(String[] args) {
        CarroModel model = buscarCarro();
 
        CarroView view = new CarroView();
 
        CarroController controller = new CarroController(model, view);
 
        controller.updateView();
 
        controller.setModelo("Corsa");
 
        controller.updateView();
    }
 
    private static CarroModel buscarCarro() {
        CarroModel carro = new CarroModel();
        carro.setPlaca("PHP1993");
        carro.setFabricante("Chevrolet");
        carro.setModelo("Celta");
        carro.setAno(1993);
        return carro;
    }
}