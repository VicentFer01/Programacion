package Objetos.A1.Reloj;

public class Reloj {
    private int hora;
    private int minutos;
    private int segundos;
    private int formato;

    public Reloj() {
        hora = 0;
        minutos = 0;
        segundos = 0;
        formato = 0;

    }

    public Reloj(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;

    }


    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos < 60 && segundos > 0)
            this.segundos = segundos;
    }

    public int getFormato() {
        return formato;
    }

    public void setFormato(int formato) {
        if (formato >= 1 && formato <= 2)
            this.formato = formato;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (segundos < 60 && segundos > 0)
            this.minutos = minutos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora > 0 && hora < 24)
            this.hora = hora;
    }

    public void printearReloj() {
        System.out.println("Formato 24h");
        String horaFinal = this.hora + ":" + this.minutos + ":" + this.segundos;
        System.out.println(horaFinal);

        System.out.println("Formato 12h");
        int hora12 = this.hora;
        String periodo = "AM";

        if (hora12 >= 12) {
            periodo = "PM";
            if (hora12 > 12) {
                hora12 = hora12 - 12;
            }
        } else if (hora12 == 0) {
            hora12 = 12;
        }

        String horaFinal12 = hora12 + ":" + this.minutos + ":" + this.segundos + " " + periodo;
        System.out.println(horaFinal12);
    }









    public String toString() {
        return "Reloj{" +
                "hora=" + hora +
                ", minutos=" + minutos +
                ", segundos=" + segundos +
                ", formato=" + formato +
                '}';
    }
}
