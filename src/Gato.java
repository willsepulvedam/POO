public class Gato extends Animal{
     
    public Gato(String nombre, Integer edad){
        super(nombre, edad);
    }

    @Override
    public String hacerSonido(){
        return "Miau";
    }
}
