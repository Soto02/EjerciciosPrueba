using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Actividad8._2
{
    internal class Lavadora : Electrodomestico
    {
        public int Carga {  get; set; }
        public Lavadora(int carga) : base(precio, color, consumo, peso)
        { 
            Carga = carga;
        }

        public void PrecioFinal()
        {
            if (Carga > 30) 
            {
                Precio_base += 50;
            }
        }
    }
}
