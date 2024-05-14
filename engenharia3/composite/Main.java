import java.util.ArrayList;
import java.util.List;
 
// component
interface Component {
    String getLeaf();
    void setLeaf(String texto);
    void mostrar();
}
 
// leaf
class Leaf implements Component {
    private String texto;
 
    public Leaf(String texto) {
        this.texto = texto;
    }
 
    @Override
    public String getLeaf() {
        return texto;
    }
 
    @Override
    public void setLeaf(String texto) {
        this.texto = texto;
    }
 
    @Override
    public void mostrar() {
        System.out.println("Leaf: " + texto);
    }
}
 
// composite
class ComponentList implements Component {
    private String texto;
    private List<Component> components;
 
    public ComponentList(String texto) {
        this.texto = texto;
        this.components = new ArrayList<>();
    }
 
    @Override
    public String getLeaf() {
        return texto;
    }
 
    @Override
    public void setLeaf(String texto) {
        this.texto = texto;
    }
 
    public void addComponent(Component component) {
        components.add(component);
    }
 
    public void removeComponent(Component component) {
        components.remove(component);
    }
 
    @Override
    public void mostrar() {
        System.out.println("Components: " + texto);
        for (Component component : components) {
            component.mostrar();
        }
    }
}
 
// main
public class Main {
    public static void main(String[] args) {
        // criando novos componentes
        Component texto1 = new Leaf("ABC");
        Component texto2 = new Leaf("abc");
        // criando lista de componentes
        ComponentList componentList = new ComponentList("Componentes");
        componentList.addComponent(texto1);
		componentList.addComponent(texto2);
        // lista de componentes relacionada
        ComponentList textos = new ComponentList("Textos");
        textos.addComponent(new Leaf("seila"));
        textos.addComponent(new Leaf("SEILA"));
 
        componentList.addComponent(textos);
        componentList.mostrar();
    }
}