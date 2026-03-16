package Practica3_HerenciaDeClases.Person_y_subclases;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address){
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person[name= " + name + ",address=" + address +"]";
    }
}
