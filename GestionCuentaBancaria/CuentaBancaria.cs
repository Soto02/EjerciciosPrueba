using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionCuentasBancarias
{
    internal class CuentaBancaria
    {

        internal String Titular {  get; set; }
        internal double Saldo { get; set; }

        public CuentaBancaria(String titular, double saldo)
        {
            Titular = titular;
            Saldo = saldo;
        }

        public void MostrarSaldo()
        {
            Console.WriteLine("Su saldo es de: " + Saldo + " euros.");
        }

        public void Depositar()
        {
            Console.WriteLine("¿Cuanto dinero desea ingresar?");
            double cantIntroducida = int.Parse(Console.ReadLine());
            Saldo += cantIntroducida;
        }

        public void Extraer()
        { 
            Console.WriteLine("¿Cuanto dinero desea retirar?");
            double cantIntroducida = int.Parse(Console.ReadLine());
            Saldo -= cantIntroducida;
        }

        protected internal void RealizarTransferencia(CuentaBancaria cuenta, double saldo)
        {

            cuenta.Saldo += saldo;

        }
    }
}
