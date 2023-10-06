using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Actividad7._1
{
    internal class TrianguloIsosceles
    {

        public float LongitudIgual {  get; set; }

        public float LongitudDistinta { get; set; }

        public float AlturaTriangulo { get; set; }

        public float CalcularPerimetro()
        {
            float perimetro = (LongitudIgual * 2)+ LongitudDistinta;
            return perimetro;
        }

        public float CalcularArea()
        {
            float area = (LongitudDistinta * AlturaTriangulo) / 2;
            return area;
        }

        public TrianguloIsosceles(float longitudIgual, float longitudDistinta, int alturaTriangulo)
        {
            LongitudIgual = longitudIgual;
            LongitudDistinta = longitudDistinta;
            AlturaTriangulo = alturaTriangulo;
        }



    }
}
