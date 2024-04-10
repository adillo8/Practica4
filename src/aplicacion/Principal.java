package aplicacion;
public class Principal{
    
    /**
     * Método principal para probar la funcionalidad de la clase.
     */
    public static void main(String[] args) {
        String s1 = "copla";
        String s2 = "copa";
        System.out.println("Distancia de edición entre '" + s1 + "' y '" + s2 + "': " + dominio.CalculadoraDistancia.calcularDistancia(s1, s2));
    }
}