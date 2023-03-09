public class Application {
    public static void main(String[] args) {
        Helado helado = new HeladoSuave();

        helado = new Cobertura(helado);
        helado = new Granola(helado);
        System.out.println(helado.producto());
        System.out.println(helado.precio());
    }
}