namespace monedas
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
            double producto = 0.45, cambio, centimos;
            double dinero = 0, contador, euros;


            Console.WriteLine("Todos los productos cuestan 0.45 centimos");
            Console.WriteLine("Introduzca el dinero (monedas): ");
            dinero = Convert.ToDouble(Console.ReadLine());
            cambio = dinero - producto;
            contador = cambio;
            
            for (double i = 0; i < contador; i++)
            {
                
            }


            


            Console.WriteLine("Su cambio es de: " + cambio);
            

            

            


        }
    }
}