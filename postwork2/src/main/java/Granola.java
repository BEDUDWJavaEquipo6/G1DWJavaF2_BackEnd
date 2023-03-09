public class Granola extends HeladoDecorator{

    private Helado helado;

    public Granola(Helado helado){
        this.helado = helado;

    }
    @Override
    public String producto(){
        return helado.producto() + "con granola";
    }

    @Override
    public int precio(){
        return helado.precio() + 10;
    }
}