
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoArchillaMondragonCristina2223 miVehiculoArchillaMondragonCristina2223;
        int stockActual;
        
        miVehiculoArchillaMondragonCristina2223 = new VehiculoArchillaMondragonCristina2223("Seat",18000,100);
        operativaVehiculosArchillaMondragonCristina2223(miVehiculoArchillaMondragonCristina2223, 50); 
    }

    private static void operativaVehiculosArchillaMondragonCristina2223(VehiculoArchillaMondragonCristina2223 miVehiculoArchillaMondragonCristina2223, 
            int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoArchillaMondragonCristina2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoArchillaMondragonCristina2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoArchillaMondragonCristina2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
