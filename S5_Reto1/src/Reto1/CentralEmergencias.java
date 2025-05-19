package Reto1;

public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Julieta");
        Patrulla patrulla = new Patrulla("Patrulla", "Lorenzo");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Martha");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
}