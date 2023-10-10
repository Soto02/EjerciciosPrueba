using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Actividad7._3
{
    internal class Cliente
    {
        //public List<Cliente> Clientes { get; set; }

        internal String Dni { get; set; }
        internal String Nombre { get; set; }
        internal int CantAhorrada { get; set; }


        public Cliente(String dni, String nombre, int cantAhorrada)
        {
            Dni = dni;
            Nombre = nombre;
            CantAhorrada = cantAhorrada;
        }
        

        public void Ingresar()
        {
            bool introducir = false;

            Console.WriteLine("¿Desea ingresar dinero? S/N " );
            string result = Console.ReadLine().ToLower();

            if ( result == "s" ) 
            { 
                introducir = true;
                Console.WriteLine("¿Cuanto dinero desea ingresar?");
                int cantIntroducida = int.Parse(Console.ReadLine());
                CantAhorrada += cantIntroducida ;
            } else
            {
                introducir = false;
                Console.WriteLine("La operacion se ha cancelado.");
            }
        }

        public void Extraer()
        {
            bool introducir = false;

            Console.WriteLine("¿Desea extraer dinero? S/N ");
            string result = Console.ReadLine().ToLower();

            if (result == "s")
            {
                introducir = true;
                Console.WriteLine("¿Cuanto dinero desea extraer?");
                int cantIntroducida = int.Parse(Console.ReadLine());
                CantAhorrada -= cantIntroducida;
            }
            else
            {
                introducir = false;
                Console.WriteLine("La operacion se ha cancelado.");
            }
        }

        public void ConsultarSaldo()
        {
            Console.WriteLine("Su saldo es de: " + CantAhorrada + "€");
        }

    }
}
