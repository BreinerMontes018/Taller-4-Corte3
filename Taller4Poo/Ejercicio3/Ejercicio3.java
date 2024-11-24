package Taller4Poo.Ejercicio3;

// import Taller4Poo.Ejercicio2.Vehiculo;
import Taller4Poo.Ejercicio2.Moto;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Banco banco = new Banco(1000.0);
        banco.depositar(500.0);
        banco.retirar(200.0);
        
        System.out.println("Saldo final: " + banco.obtenerSaldo());

        // Vehiculo vehiculo = new Vehiculo("Automóvil", "Toyota");
        // tipo y marca son protegidos no accesibles desde aqui
        // System.out.println(vehiculo.tipo); 
        
        Moto moto = new Moto("Moto", "Yamaha", 250);
        moto.mostrarInformacion();
        
        System.out.println(banco.saldo);
    }
}
