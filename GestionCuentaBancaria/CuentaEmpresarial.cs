using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionCuentasBancarias
{
    internal class CuentaEmpresarial : CuentaBancaria
    {

        public CuentaEmpresarial(string titular, double saldo) : base(titular, saldo)
        {   
        }
    }
}
