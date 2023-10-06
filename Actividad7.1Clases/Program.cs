using System.Runtime.CompilerServices;

namespace Actividad7._1
{
    internal class Program
    {
        static void Main(string[] args)
        {

            TrianguloIsosceles trianguloIsosceles = new TrianguloIsosceles(15, 10, 12);

            Console.WriteLine($"El perimetro del triangulo es: {trianguloIsosceles.CalcularPerimetro()}");
            Console.WriteLine($"El area del triangulo es: {trianguloIsosceles.CalcularArea()}");



        }
    }
}