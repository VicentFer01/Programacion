package Objetos;

public class Personas {
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;

    public Personas(String dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public boolean isAdult(int edad) {
        if (this.edad > 18) return true;
        else return false;
    }

    public boolean isRetired(int edad) {
        if (this.edad > 65) return true;
        else return false;
    }

   /* public int ageDiff(int edad, edad2); */

    public static boolean checkDNI(String dni)  {
        if (dni.length() != 9) return false;
        else return true;
    }


    public String toString() {
        return "Personas{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
