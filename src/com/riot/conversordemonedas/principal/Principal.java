package com.riot.conversordemonedas.principal;

import com.riot.conversordemonedas.implementaciones.ConsultaTipoCambio;
import com.riot.conversordemonedas.modelos.MenuPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        double cantidadConvertir;
        double tipoCambio;
        double conversion;
        String monedaOriginal;
        String monedaDestino;
        Scanner lectura = new Scanner(System.in);
        ConsultaTipoCambio consulta = new ConsultaTipoCambio();
        MenuPrincipal menu = new MenuPrincipal();
        menu.getMensajeBienvenida();

        while (opcion != 16) {
            menu.getMensajeOpciones();
            opcion = lectura.nextInt();

            switch (opcion) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    monedaOriginal = obtenerMonedaOriginal(opcion);
                    System.out.print("¿A qué moneda quieres hacer la conversión? ");
                    monedaDestino = lectura.next().toUpperCase();
                    System.out.println("¿Cuántos " + monedaOriginal + "'s quieres convertir?");
                    cantidadConvertir = lectura.nextDouble();

                    tipoCambio = consulta.conversionMoneda(monedaOriginal, monedaDestino);
                    conversion = tipoCambio * cantidadConvertir;
                    System.out.println("El tipo de cambio de " + cantidadConvertir + " " + monedaOriginal + " a "
                            + monedaDestino + " es: " + conversion + " " + monedaDestino);
                    break;
                case 16:
                    System.out.println("Saliendo del conversor de monedas...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        lectura.close();
    }

    private static String obtenerMonedaOriginal(int opcion) {
        switch (opcion) {
            case 1: return "USD";
            case 2: return "AMD";
            case 3: return "ARS";
            case 4: return "BIF";
            case 5: return "BOB";
            case 6: return "BRL";
            case 7: return "CAD";
            case 8: return "DKK";
            case 9: return "EUR";
            case 10: return "GNF";
            case 11: return "IDR";
            case 12: return "IRR";
            case 13: return "MXN";
            case 14: return "RUB";
            case 15: return "TRY";
            default: return "";
        }
    }
}
