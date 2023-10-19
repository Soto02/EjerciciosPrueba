namespace GestionCuentasBancarias
{
    internal class Program
    {
        static void Main(string[] args)
        {
            CuentaBancaria cuenta1 = new CuentaBancaria("Riki", 1500);
            CuentaEmpresarial empresa1 = new CuentaEmpresarial("Ruben", 600);

            cuenta1.MostrarSaldo();
            cuenta1.Extraer();
            cuenta1.MostrarSaldo();
            cuenta1.RealizarTransferencia(empresa1, 500);
            empresa1.MostrarSaldo();

        }
    }
}