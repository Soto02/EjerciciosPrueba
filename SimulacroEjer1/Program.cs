using System.Security.Cryptography.X509Certificates;

namespace SimulacroEjer1
{
    internal class Program
    {
        static void Main(string[] args)
        {

            static void imprimir(this int num, int valor)
            {
                num = 0;

                Console.WriteLine("Introduzca un numero:");
                valor = int.Parse(Console.ReadLine());

                for (int i = num; i <= valor; i++)
                {
                    Console.WriteLine(i.ToString());
                }

            }
            int num;
            num.imprimir();

        }
    }
}