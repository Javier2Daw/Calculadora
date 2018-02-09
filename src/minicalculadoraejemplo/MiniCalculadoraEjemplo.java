package minicalculadoraejemplo;
import java.lang.Math;

/**
 * 
 * @author Javier
 */
public class MiniCalculadoraEjemplo {

    /**
     * @param args the command line arguments
     * Metodo principal de la aplicacion que llama a los otros dos metodos creados y saca sus valores por consola
     */
    public static void main(String[] args) {
        double prueba = 5.2;
        double raizCuadradaPrueba;
        raizCuadradaPrueba = raizCuadrada(prueba);

        System.out.println("La raiz cuadrada de " + prueba + " es: " + raizCuadradaPrueba);
    }
    /*@aut
     * @param prueba
     * @return rtnPrueba 
     * Metodo que obtiene la raizCuadrada del parametro prueba
     */
    public static double raizCuadrada(double prueba) {
        double rtnPrueba;
        rtnPrueba= Math.abs(prueba);
        return rtnPrueba;
    }
}
