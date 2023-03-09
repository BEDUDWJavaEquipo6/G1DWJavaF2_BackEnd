public class Mermelada extends HeladoDecorator{

    private final Helado helado;

    public Mermelada(Helado helado){
        this.helado = helado;
    }
    @Override
    public String producto(){
        return helado.producto() + " con mermelada";

    }

    @Override
    public int precio(){
        return helado.precio() + 10;
    }
}