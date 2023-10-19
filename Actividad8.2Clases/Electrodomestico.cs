using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Actividad8._2
{
    internal class Electrodomestico
    {
        public double Precio_base {  get; set; }
        public string[] Color = { "blanco", "negro", "rojo", "azul", "gris" };
        public char[] Consumo = { 'A', 'B', 'C', 'D', 'E', 'F' };
        public double Peso {  get; set; }

        public Electrodomestico(double precio, string[] color, char[] consumo, double peso)
        {
            Precio_base = precio;
            Color = color;
            Consumo = consumo;
            Peso = peso;
        }



        protected void ComprobarConsumoEnergia(char letra)
        {
            for (int i = 0; i < Consumo.Length; i++) 
            {
                if (Consumo[i] == letra)
                {
                    Console.WriteLine(letra);
                } else
                {
                    Console.WriteLine(Consumo[i]);
                }
            }
        }
        protected void ComprobarColor(string color)
        {
            for (int i = 0;i < Color.Length;i++)
            {
                if (Color[i].Equals(color))
                {
                    Console.WriteLine(Color[i]);
                }

            }
        }

        public void PrecioFinal()
        {
            foreach (var consumo in Consumo)
            {
                for (int i = 0; i < Peso;  i++)
                {
                   switch (consumo)
                   {
                        case 'A':
                            Precio_base += 100;
                            break;
                        case 'B':
                            Precio_base += 80;
                            break;
                        case 'C':
                            Precio_base += 60;
                            break;
                        case 'D':
                            Precio_base += 50;
                            break;
                        case 'E':
                            Precio_base += 30;
                            break;
                        case 'F':
                            Precio_base += 10;
                            break;
                   }
                    if (i >= 80)
                    {
                        Precio_base += 100;
                    }

                    if (i >= 50 || i <= 79)
                    {
                        Precio_base += 80;
                    }
                    if (i >= 20 || i <= 49)
                    {
                        Precio_base += 50;
                    }
                    if (i >= 0 || i <= 19)
                    {
                        Precio_base += 10;
                    }
                }
            }
        }


    }
}
