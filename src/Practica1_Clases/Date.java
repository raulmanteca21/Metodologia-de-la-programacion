package Practica1_Clases;

public class Date {
    private int day;
    private int month;
    private int year; //Atributos generales privados
    //----------------------------------------------
    //constructores
    public Date(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    //----------------------------------------------
    //getters, permiten leer los atributos privados desde fuera de la clase
    public int getDay(){return day;}
    public int getMonth(){return month;}
    public int getYear(){return year;}
    //----------------------------------------------
    //setters, permiten actualizar los valores (no devuelven nada, void)
    public void setDay(int newDay){this.day=newDay;}
    public void setMonth(int newMonth){this.month=newMonth;}
    public void setYear(int newYear){this.year=newYear;}
    public void setDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    //----------------------------------------------
    //formato de salida de texto
    public String toString(){return String.format("%02d/%02d/%04d", day, month, year);}
    //Lo del 0 lo he hecho fijándome en la práctica, que sale algo parecido en el TestMain del Rectangle, más la ayuda de la IA.
    //String.format es una plantilla con la que defines una estructura:
    //"%" indica que ahí va la variable
    //"0" rellena los huecos vacíos con 0
    //"2" reserva 2 espacios
    //"d" se refiere al tipo de dato (decimal en este caso)
}

