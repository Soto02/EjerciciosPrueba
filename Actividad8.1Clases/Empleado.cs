using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Actividad8._1
{
    internal class Empleado
    {
        public String Nombre {  get; set; }

        public Empleado(String nombre) 
        { 
            Nombre = nombre;
        }

        public override string ToString()
        {
            return ("Empleado " +  Nombre);
        }
    }
}
