public class Galleta extends HeladoDecorator{

    private final Helado helado;

    public Galleta(Helado helado){
        this.helado = helado;
    }
    @Override
    public String producto(){
        return helado.producto() + " con galleta";

    }

    @Override
    public int precio(){
        return helado.precio() + 15;
    }
}