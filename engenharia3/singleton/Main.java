class Singleton {

    private static Singleton instance;
    private Singleton()
    {
        System.out.println("Singleton rodando");
    }
    public static Singleton getInstance()
    {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
    public static void rodar()
    {
        System.out.println("Rodando!");
    }
}

class Main {
    public static void main(String[] args)
    {
        Singleton.getInstance().rodar();
		Singleton.getInstance().rodar();
		Singleton.getInstance().rodar();
    }
}