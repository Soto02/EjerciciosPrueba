using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Actividad8._2
{
    internal class Television : Electrodomestico
    {
        public int Resolucion {  get; set; }
        public bool SintonizadorTDT { get; set; }

        public Television(int resolucion, bool sintinizadorTDT) : base(precio, color, consumo, peso)
        {
            Resolucion = resolucion;
            SintonizadorTDT = sintinizadorTDT;
        }

        public void PrecioFinal()
        {
            if(Resolucion > 40)
            {
                Precio_base *= 0.30;
            }
            if(SintonizadorTDT == true)
            {
                Precio_base += 50;
            }
        }
    }
}
