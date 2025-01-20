package Tema4.ActividadAmplizacion.Main;

import Tema4.ActividadAmplizacion.CuentaCorriente;

import java.util.Scanner;

import static Tema4.ActividadAmplizacion.CuentaCorriente.dni;
import static Tema4.ActividadAmplizacion.CuentaCorriente.nombre;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        double saldo = 0;
        double cantidad = 0;

        CuentaCorriente cuentaNueva = new CuentaCorriente(dni,nombre, saldo);
        // Crear una cuenta corriente con DNI y saldo inicial
        do {
            System.out.println("1.Crear una cuenta de corriente");
            System.out.println("2.Sacar dinero");
            System.out.println("3.Ingresar dinero");
            System.out.println("4.Mostrar informacion");
            System.out.println("5.Salir");
            option = scanner.nextInt();
            if (option == 1) {
                System.out.println("Crear una cuenta de corriente");
                System.out.println("Ingrese su DNI");
                dni = scanner.next();
                cuentaNueva.setDni(dni);
                System.out.println("Ingrese su NOMBRE");
                nombre = scanner.next();
                cuentaNueva.setNombre(nombre);
                System.out.println("Su saldo inicial sera 0");
                cuentaNueva.setSaldo(0);
            }else if (option == 2) {
                System.out.println("Sacar dinero");
                System.out.println("Ingrese la cantidad a retirar");
                CuentaCorriente.saldo = scanner.nextDouble();
                cuentaNueva.getSaldo(CuentaCorriente.saldo);
                CuentaCorriente.retirarDinero(saldo);
            }else if (option == 3) {
                System.out.println("Ingrese la cantidad a ingresar");
                CuentaCorriente.saldo = scanner.nextDouble();
                CuentaCorriente.depositarDinero(saldo);
                cuentaNueva.getSaldo(saldo);
            }
        }while (option != 5);
        }



    }

