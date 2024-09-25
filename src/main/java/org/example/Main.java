package org.example;

import org.example.MODELOS.Apartamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);
        Apartamento apartamento = new Apartamento();


        System.out.print("Digita tu nombre: ");
        apartamento.setNombre(lea.nextLine());

        System.out.print("Digita tu direccion: ");
        apartamento.setDireccion(lea.nextLine());

        System.out.print("Digita el piso: ");
        apartamento.setPiso(lea.nextLine());

        System.out.println("Digita la superficie: ");
        apartamento.setSuperficie(lea.nextLine());

        System.out.println("Digita el precio: ");
        apartamento.setPrecio(lea.nextInt());

        System.out.println("Digita el numero de habitaciones: ");
        apartamento.setNumeroHabitaciones(lea.nextLine());

        //imprimiendo los datos del apartamento:
        System.out.println(apartamento);





    }


}