public  class HeladoDecorator implements Helado{
    @Override
    public String producto(){
        return "agregar";
    }

    @Override
    public int precio(){
        return 0;
    }
}