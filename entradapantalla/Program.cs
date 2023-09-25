namespace entradaPantalla
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int numero = 0;

            Console.WriteLine("Introduzca un número entero: ");
            String dato = Console.ReadLine(); 
            
            numero = Convert.ToInt32(dato);

            Console.WriteLine("Has introducido el siguiente número: {0}", numero);
        }
    }
}