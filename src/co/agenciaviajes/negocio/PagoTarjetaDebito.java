package co.agenciaviajes.negocio;

/**
 * Pago con tarjeta débito
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class PagoTarjetaDebito extends Pago {
    private String codigo;
    private String banco;
    private String numeroCuenta;

    public PagoTarjetaDebito() {
    }

    public PagoTarjetaDebito(String codigo, String banco, String numeroCuenta) {
        this.codigo = codigo;
        this.banco = banco;
        this.numeroCuenta = numeroCuenta;
    }

    public PagoTarjetaDebito(String codigo, String banco, String numeroCuenta, Cliente cliente) {
        super(cliente);
        this.codigo = codigo;
        this.banco = banco;
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public void registrarPago() {
        System.out.println("------------------------------------------------------");
        Cliente cliente = new Cliente("98123458", "Manuel", "Lara", "M", "manuelito@gmail.com");
        this.setCliente(cliente);

        this.setValor(2650000); // Cualquier valor de una logica de negocio que aun no se tiene
        this.setCodigo("1254578");
        this.setBanco("Bancolombia");
        this.setNumeroCuenta("5125-6645-1245");

        System.out.println("Pago con tarjeta de crédito registrado en el sistema con éxito.");
        System.out.println("Cliente: " + this.getCliente().toString());
        System.out.println("Código del Cliente: " + this.getCodigo());
        System.out.println("Banco: " + this.getBanco());
        System.out.println("Número de cuenta: " + this.getNumeroCuenta());
        System.out.println("Valor: " + this.getValor());
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

}
