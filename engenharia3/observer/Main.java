import java.util.ArrayList;
import java.util.List;
 
// observer
interface Observer {
    void update(String texto);
}
 
// subject
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// concretesubject
class Texto implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String texto;
 
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
 
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
 
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(texto);
        }
    }
 
    public void setTexto(String newTexto) {
        this.texto = newTexto;
        notifyObservers();
    }
}
 
// concreteobserver 1
class TextoSite implements Observer {
    private String texto;
 
    @Override
    public void update(String texto) {
        this.texto = texto;
        mostrar();
    }
 
    private void mostrar() {
        System.out.println("Texto site atualizado: " + texto);
    }
}

// concreteobserver 2
class TextoApp implements Observer {
    private String texto;
 
    @Override
    public void update(String texto) {
        this.texto = texto;
        mostrar();
    }
 
    private void mostrar() {
        System.out.println("Texto app atualizado: " + texto);
    }
}

public class Main {
	public static void main(String args[]) {
		Texto texto = new Texto(); //observer
 
        Observer textoSite = new TextoSite();
        Observer textoApp = new TextoApp();
 
        texto.addObserver(textoSite);
        texto.addObserver(textoApp);
 
        texto.setTexto("ABC");
	}
}