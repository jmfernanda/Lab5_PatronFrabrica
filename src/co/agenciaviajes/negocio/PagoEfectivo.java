package co.agenciaviajes.negocio;

/**
 * Pago en efectivo
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class PagoEfectivo extends Pago {

    public PagoEfectivo() {
    }

    public PagoEfectivo(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void registrarPago() {
        System.out.println("------------------------------------------------------");
        Cliente cliente = new Cliente("98393282", "Carlos", "Sanchez Londonio", "M", "carlitos@gmail.com");
        this.setCliente(cliente);

        this.setValor(1200000); // Cualquier valor de una logica de negocio que aun no se tiene

        System.out.println("Pago en efectivo registrado en el sistema con éxito.");
        System.out.println("Cliente: " + this.getCliente().toString());
        System.out.println("Valor: " + this.getValor());
    }
   
}
