public class Topping extends HeladoDecorator{

    private final Helado helado;

    public Topping(Helado helado){
        this.helado = helado;
    }
    @Override
    public String producto(){
        return helado.producto() + " con topping";

    }

    @Override
    public int precio(){
        return helado.precio() + 20;
    }
}