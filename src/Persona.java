public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;

    public Persona(String nombre, String apellido, Integer edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String darNombreCompleto(){
        return getApellido() + ", " + getNombre();
    }

    public String enviarSaludo(String saludado){
        return "hola, ¿como estas " + saludado +"?";
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
