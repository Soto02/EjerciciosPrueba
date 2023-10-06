using System.Linq;

namespace Actividad1LINQ
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<int> ListaNum = new List<int>();
            ListaNum = Enumerable.Range(1,100).ToList();

            ListaNum = ListaNum.Where(n => n % 7 == 0).ToList();
            Console.WriteLine(string.Join(" ", ListaNum));

            var agruparListaPares = ListaNum.GroupBy(l => l % 2 == 0);

            foreach (var grupo in agruparListaPares)
            {
                if(grupo.Key == true)
                {
                    Console.WriteLine("Numeros pares de la lista:");

                    foreach (var par in grupo)
                    {
                        Console.WriteLine(par);
                    }
                } else
                {
                    Console.WriteLine("Numeros impares de la lista:");

                    foreach (var impar in grupo)
                    {
                        Console.WriteLine(impar);
                    }
                }
                
            }
        }
    }
}