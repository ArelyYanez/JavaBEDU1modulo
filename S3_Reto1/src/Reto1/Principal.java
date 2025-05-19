package Reto1;

public class Principal {
    public static void main(String[] args) {
        // Crear un pasajero
        Pasajero pasajero = new Pasajero("Lina Díaz", "P123456");

        // Crear un vuelo
        Vuelo vuelo = new Vuelo("UX123", "Shanghái", "18:30");

        // Reservar asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("✅ Reserva realizada con éxito.\n");
        } else {
            System.out.println("❌ No se pudo realizar la reserva.\n");
        }

        // Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        System.out.println("❌ Cancelando reserva...\n");
        vuelo.cancelarReserva();

        // Mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        // Realizamos una nueva reservacion
        vuelo.reservarAsiento("Victoria Aguilar", "P987654");
        System.out.println(vuelo.obtenerItinerario());
    }
}

