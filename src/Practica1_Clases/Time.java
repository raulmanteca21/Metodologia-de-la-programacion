package Practica1_Clases;

public class Time {
    private int hour;
    private int minute;
    private int second;//Atributos generales privados
    //----------------------------------------------
    //constructores
    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    //----------------------------------------------
    //getters, permiten leer los atributos privados desde fuera de la clase
    public int getHour(){return hour;}
    public int getMinute(){return minute;}
    public int getSecond(){return second;}
    //----------------------------------------------
    //setters, permiten actualizar los valores (no devuelven nada, void)
    public void setHour(int newHour){this.hour=newHour;}
    public void setMinute(int newMinute){this.minute=newMinute;}
    public void setSecond(int newSecond){this.second=newSecond;}
    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    //----------------------------------------------
    //formato de salida de texto
    public String toString(){return String.format("%02d:%02d:%02d",hour,minute,second);} //Misma idea que en en el ejercicio Date
    //----------------------------------------------
    public Time nextSecond(){
        second+=1;
        if (second==60){
            this.second=0;
            minute+=1;
            if (minute==60){
                this.minute=0;
                hour+=1;
                if (hour==24){
                    this.hour=0;
                }
            }
        }
        return this; //Como pide el ejercicio retornamos un Time
    }

    public Time previousSecond(){    //Misma idea que en nextSecond
        second-=1;
        if (second==-1){
            this.second=59;
            minute-=1;
            if (minute==-1){
                this.minute=59;
                hour-=1;
                if (hour==-1){
                    this.hour=23;
                }
            }
        }
        return this;
    }
}
