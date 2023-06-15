//Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
//de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
//con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
package Ejercicio_3;

public class Ejercicio_1 {

    public static void main(String[] args) {

        PersonaServicio servicio = new PersonaServicio();
        PersonaEntidad persona1 = new PersonaEntidad();

        try {
            persona1 = null;
            servicio.esMayorDeEdad(persona1);
        } catch (Exception e) {
            System.out.println("No existe la persona");
        }

    }
}
