class ConvertContext {
    private ConvertStrategy convertStrategy;
 
    public ConvertContext(ConvertStrategy convertStrategy) {
        this.convertStrategy = convertStrategy;
    }
 
    public void setConvertStrategy(ConvertStrategy convertStrategy) {
        this.convertStrategy = convertStrategy;
    }
 
    public void convert(String image) {
        convertStrategy.convert(image);
    }
}
 
interface ConvertStrategy {
    void convert(String image);
}
 
class ConvertToPNG implements ConvertStrategy {
    @Override
    public void convert(String image) {
        System.out.println("Convertendo para PNG");
    }
}
 
class ConvertToJPG implements ConvertStrategy {
    @Override
    public void convert(String image) {
        System.out.println("Convertendo para JPEG");
    }
}
 
class ConvertToGIF implements ConvertStrategy {
    @Override
    public void convert(String image) {
        System.out.println("Convertendo para GIF");
    }
}
 
public class Main {
    public static void main(String[] args) {
		String arquivo = "";
		
		ConvertContext convertContext = new ConvertContext(new ConvertToPNG());
        convertContext.convert(arquivo);
 
        convertContext.setConvertStrategy(new ConvertToJPG()); //troca a strategy
        convertContext.convert(arquivo);
 
        convertContext.setConvertStrategy(new ConvertToGIF()); //troca a strategy
        convertContext.convert(arquivo);
    }
}