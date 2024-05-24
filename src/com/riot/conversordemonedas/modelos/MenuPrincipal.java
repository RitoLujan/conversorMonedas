package com.riot.conversordemonedas.modelos;

import java.time.LocalDateTime;

public class MenuPrincipal {
    private final String mensajeBienvenida = """
                
                                %sth %s %s %s:%s
                Bienvenido a su conversor de monedas personal Riot.
                """.formatted(LocalDateTime.now().getDayOfMonth(), LocalDateTime.now().getMonth(),
                LocalDateTime.now().getYear(), LocalDateTime.now().getHour(), LocalDateTime.now().getMinute());

    private final String mensajeOpciones = """
            Actualmente el sistema cuenta con estas monedas registradas.
            1.  Dólar estadounidense (USD)
            2.  Dram armenio (AMD)
            3.  Peso argentino (ARS)
            4.  Franco burundés (BIF)
            5.  Boliviano (BOB)
            6.  Real brasileño (BRL)
            7.  Dólar canadiense (CAD)
            8.  Corona danesa (DKK)
            9.  Euro (EUR)
            10. Franco guineano (GNF)
            11. Rupia indonesia (IDR)
            12. Rial iraní (IRR)
            13. Peso mexicano (MXN)
            14. Rublo ruso (RUB)
            15. Lira turca (TRY)
            16. Finalizar conversiones
            ¿Que moneda desea comvertir?
            """;

    public void getMensajeBienvenida() {
        System.out.print(mensajeBienvenida);
    }

    public void getMensajeOpciones() {
        System.out.println(mensajeOpciones);
    }
}
