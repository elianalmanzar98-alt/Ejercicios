package ejercicioenclase.Ejercicios;
mport java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Cuenta Bancaria");
            System.out.println("2. Polimorfismo con Empleados");
            System.out.println("3. Ocultamiento de Atributos");
            System.out.println("4. Arrays y Referencias");
            System.out.println("0. Salir");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    CuentaBancaria cb = new CuentaBancaria("001", 500.0);
                    cb.depositar(100);
                    System.out.println("Saldo: " + cb.getSaldo());
                    break;
                case 2:
                    
                    Empleado emp = new EmpleadoPorHora(10);
                    System.out.println("Salario: " + emp.calcularSalario());
                    break;
                case 3:
                    A obj = new B();
                    System.out.println("Valor x: " + obj.x);
                    break;
                case 4:
                    int[] arr1 = {1, 2, 3};
                    int[] arr2 = arr1;
                    arr2[0] = 9;
                    System.out.println(Arrays.toString(arr1));
                    break;
            }
        } while (opcion != 0);
    }
}
