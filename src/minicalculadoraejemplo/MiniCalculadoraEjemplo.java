package minicalculadoraejemplo;

/**
 * Clase de una miniCalculadora con dos metodos de ejemplos para poder ver el valor absoluto y la raiz cuadrada de un numero
 * @author Erwin
 * @version 21/02/2024
 */
public class MiniCalculadoraEjemplo {
    
    /**
     * Metodo estatico 'valorAbsoluto' con un valor doble por parametro.
     * @param numero Valor del numero introducido.
     * @return Devuelve el valor Absoluto.
     */
    public static double valorAbsoluto(double numero) {
        return Math.abs(numero);
    }
    
    /**
     * Metodo estatico 'raizCuadrada' con un valor doble por parametro.
     * @param numero Valor del numero introducido.
     * @return Resultado del valor de la raiz cuadrada de 'numero'.
     */
    public static double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

}
