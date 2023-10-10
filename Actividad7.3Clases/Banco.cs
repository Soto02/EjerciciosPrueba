using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Actividad7._3
{
    internal class Banco
    {
        public List<Cliente> Clientes = new List<Cliente> {
            new Cliente("654A", "Soto", 300),
            new Cliente("186B", "Riki", 100),
            new Cliente("937C", "Ruben", 200)
        };

        public void Operar()
        {
            Console.WriteLine("Introduzca el DNI: ");
            string dni = Console.ReadLine();

            for (int i = 0; i < dni.Length; i++)
            {
                
            }

        }
        
        
    }
}
