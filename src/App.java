public class App {
    public static void main(String[] args) throws Exception {

        Animal animal = new Animal("Bestia", 200);
        Gato gato = new Gato("Wilson", 14);
        Perro perro = new Perro("kelan", 3);

        System.out.println("el animal llamado "+ animal.nombre + " hace: " + animal.hacerSonido());
        System.out.println("el gato llamado "+ gato.nombre + " hace: " + gato.hacerSonido());
        System.out.println("el perro llamado "+ perro.nombre + " hace: " + perro.hacerSonido());
    }
}
