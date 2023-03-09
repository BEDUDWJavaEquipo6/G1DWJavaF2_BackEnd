public class Cobertura extends HeladoDecorator{

    private final Helado helado;

    public Cobertura(Helado helado){
        this.helado = helado;
    }
    @Override
    public String producto(){
        return helado.producto() + "con cobertura ";

    }

    @Override
    public int precio(){
        return helado.precio() + 20;
    }
}