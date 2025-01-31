package Objetos.A1.Personas;

public class Personas {
    private int dni;
    private char letra;
    private String nombre;
    private String apellido;
    private int edad;
    public final static int retiredAge = 65;
    public final static int adultAge = 18;


    public Personas(int dni, char letra, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.letra = letra;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
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

    public static boolean checkDNI(int dni, char letra) {
        if (dni < 0 || dni > 99999999) {
            return false;
        } else {
            char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
            char letraCalculada = letras[dni % 23];
            return letraCalculada == Character.toUpperCase(letra);
        }
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
