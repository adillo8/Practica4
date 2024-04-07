package dominio;
public class CalculadoraDistancia {

      /**
     * Calcula la distancia de edición entre dos cadenas de caracteres.
     * s1 La primera cadena
     * s2 La segunda cadena
     * return La distancia de edición entre las dos cadenas s1 y s2.
     */

    public static int calcularDistancia(String s1, String s2) {
        //matriz para los resultados intermedios
        int[][] matriz = new int[s1.length() + 1][s2.length() + 1];

        // Inicializar la primera fila(s1) y la primera columna (s2)de la matriz
        for (int i = 0; i <= s1.length(); i++) {
            matriz[i][0] = i;
        }
        for (int j = 0; j <= s2.length(); j++) {
            matriz[0][j] = j;
        }

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0) {
                    matriz[i][j] = j;
                } else if (j == 0) {
                    matriz[i][j] = i;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    matriz[i][j] = matriz[i - 1][j - 1];
                } else {
                    matriz[i][j] = 1 + Math.min(Math.min(matriz[i][j - 1], //insertar
                    matriz[i - 1][j]), //eliminar
                    matriz[i - 1][j - 1]);//reemplazar
                }
            }
        }

        return matriz[s1.length()][s2.length()];
    }

}
