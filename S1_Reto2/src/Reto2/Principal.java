package Reto2;

// Clase principal, con este se prueba el sistema de entradas
public class Principal {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Concierto de BEDU", 800.00);
        Entrada entrada2 = new Entrada("Obra de Teatro de BEDU", 450.50);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        //Reto adicional
        Entrada_Record entrada3= new Entrada_Record("Sinfónica de BEDU", 1200.00);
        entrada3.mostrarInformacion();

        Entrada_Record entrada4= new Entrada_Record("Festival de Rock 2025", 765.50);
        entrada4.mostrarInformacion();

    }
}

