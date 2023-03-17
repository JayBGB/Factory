import com.jay.transportes.Barco;
import com.jay.transportes.Camion;
import com.jay.transportes.Bicicleta;
import com.jay.transportes.ITransportes;

import javax.swing.*;

/**
 * Fabrica encargada de devolver el producto
 * que elegimos según el tipo
 */
public class Factoria {
    public static final int CAMION = 1;
    public static final int BICICLETA = 2;

    public static final int BARCO = 3;
    public static Integer cp = null;
    public static Float dimensionX = null;
    public static Float dimensionY = null;
    public static Float dimensionZ = null;
    public static Float peso = null;
    /**
     * Devuelve producto del tipo de la Interface
     * @param type 1: consola, 2:ventana
     * @param msg string a imprimir
     * @return producto segun el tipo
     */

    public static ITransportes getProducto(int type) {
        cp = Integer.parseInt(JOptionPane.showInputDialog("Teclee tu CP"));
        dimensionX = Float.parseFloat(JOptionPane.showInputDialog("Teclee a dimensionX"));
        dimensionY = Float.parseFloat(JOptionPane.showInputDialog("Teclee a dimensionY"));
        dimensionZ = Float.parseFloat(JOptionPane.showInputDialog("Teclee a dimensionZ"));
        peso = Float.parseFloat(JOptionPane.showInputDialog("Teclee o peso"));
        switch (type) {
            // tipo consola
            case CAMION:
                return new Camion(cp, dimensionX, dimensionY, dimensionZ, peso);
            // tipo ventana
            case BICICLETA:
                return new Bicicleta(cp, dimensionX, dimensionY, dimensionZ, peso);

            case BARCO:
                return new Barco(cp, dimensionX, dimensionY, dimensionZ, peso);

            default:
                return null;
        }
    }

}
