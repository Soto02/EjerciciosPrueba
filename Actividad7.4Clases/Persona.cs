using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Actividad7._4
{
    internal class Persona
    {
        public String Nombre { get; set; }
        public int Edad {  get; set; }

        public Persona(String nombre, int edad) 
        { 
            Nombre = nombre;
            Edad = edad;
        }

        public override string ToString()
        {
            return ("Persona: nombre= " + Nombre + ", edad= " + Edad);
        }
    }
}
