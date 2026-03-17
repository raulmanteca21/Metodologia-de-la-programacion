package Practica2_ComposicionAgregacion.CustomerAccount;

public class TestAccount {
    public static void main(String[] args) {
        // Creamos clientes
        Customer c1 = new Customer(101, "Alice", 'f');
        Customer c2 = new Customer(102, "Bob", 'm');

        System.out.println(c1); // Alice(101)
        System.out.println(c2); // Bob(102)

        // Creamos cuentas
        Account a1 = new Account(201, c1, 100.0);
        Account a2 = new Account(202, c2);

        System.out.println(a1); // Alice(101) balance=$100.00
        System.out.println(a2); // Bob(102) balance=$0.00

        // Probamos deposit
        a2.deposit(50);
        System.out.println(a2); // Bob(102) balance=$50.00

        // Probamos withdraw
        a1.withdraw(30);
        System.out.println(a1); // Alice(101) balance=$70.00

        // Intentamos retirar más de lo que hay
        a2.withdraw(100); // Imprime mensaje
        System.out.println(a2); // Bob(102) balance=$50.00
    }

}
