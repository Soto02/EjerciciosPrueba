using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Actividad8._1
{
    internal class Oficial : Operario
    {
        public Oficial(string nombre) : base(nombre) { }

        public override string ToString()
        {
            return base.ToString() + " -> Operario -> Oficial";
        }
    }
}
