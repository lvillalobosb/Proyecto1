package poo;

public class Persona {
    private String nombre;
    private int edad;
    private char gerero;
    public Persona(){
        
    }
    //crear constructor, inicializa la instancia de la clase (clic derecho/InsertCode/constructor)

    public Persona(String nombre, int edad, char gerero) {
        this.nombre = nombre;
        this.edad = edad;
        this.gerero = gerero;
    }
    //métodos getter y setter para acceder a un dato de tipo privado (clic derecho/InsertCode/Getter y Setter)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGerero() {
        return gerero;
    }

    public void setGerero(char gerero) {
        this.gerero = gerero;
    }
    
}
