namespace media
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int numero1, numero2, numero3, numero4;

            Console.WriteLine("Introduzca el primer número: ");
             numero1 = int.Parse(Console.ReadLine());
            Console.WriteLine("Introduzca el segundo número: ");
             numero2 = int.Parse(Console.ReadLine());
            Console.WriteLine("Introduzca el tercer número: ");
             numero3 = int.Parse(Console.ReadLine());
            Console.WriteLine("Introduzca el cuarto número: ");
             numero4 = int.Parse(Console.ReadLine());

            double media = Convert.ToDouble(numero1 + numero2 + numero3 + numero4) / 4;
            Console.WriteLine("La media de los 4 números es: " + media);


        }
    }
}