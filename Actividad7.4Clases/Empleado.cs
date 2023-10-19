using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Actividad7._4
{
    internal class Empleado : Persona
    {
        public double Sueldo { get; set; }

        public Empleado(string nombre, int edad, double sueldo) : base(nombre, edad)
        {
            Sueldo = sueldo;
        }

        public override string ToString()
        {
            return ("Empleado: nombre= " + Nombre + ", edad= " + Edad + ", sueldo= " + Sueldo + " euros.");
        }
    }
}
