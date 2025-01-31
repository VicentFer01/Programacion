package Objetos.A1.Reloj;

public class MainReloj {
    public static void main(String[] args) {
        int horas = 22, minutos = 30, segundos = 0;
        Reloj reloj = new Reloj();

        Reloj reloj2 = new Reloj(horas, minutos, segundos);

        reloj2.printearReloj();

    }
}
