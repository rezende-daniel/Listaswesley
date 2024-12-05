public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Tempo(int hora) {
        setHora(hora); 
        this.minuto = 0;
        this.segundo = 0;
    }

    public Tempo(int hora, int minuto) {
        setHora(hora); 
        setMinuto(minuto); 
        this.segundo = 0;
    }

    public Tempo(int hora, int minuto, int segundo) {
        setHora(hora);    
        setMinuto(minuto); 
        setSegundo(segundo); 
    }

    public void setTime(int hora, int minuto, int segundo) {
        setHora(hora); 
        setMinuto(minuto); 
        setSegundo(segundo);
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Hora inválida! Deve ser entre 0 e 23.");
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("Minuto inválido! Deve ser entre 0 e 59.");
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Segundo inválido! Deve ser entre 0 e 59.");
        }
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public String toString() {
        return String.format("%d:%d:%d", this.hora, this.minuto, this.segundo);
    }

    public static void main(String[] args) {

        Tempo tempo1 = new Tempo();
        System.out.println(tempo1.toString()); 

        Tempo tempo2 = new Tempo(10);
        System.out.println(tempo2.toString()); 

        Tempo tempo3 = new Tempo(10, 30);
        System.out.println(tempo3.toString());

        Tempo tempo4 = new Tempo(10, 30, 45);
        System.out.println(tempo4.toString()); 

        tempo1.setTime(12, 45, 55);
        System.out.println(tempo1.toString()); 

        try {
            tempo1.setHora(25); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); 
        }
    }
}
