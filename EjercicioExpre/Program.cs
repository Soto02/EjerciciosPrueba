using System.Text.RegularExpressions;

namespace EjercicioExpresionesRegulares
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("1. Definir la expresión regular para encontrar una fecha en formato dd/mm/yyyy");
            String fecha = "02/07/2004";
            Match resultado1 = Regex.Match(fecha, @"\d{2}/\d{2}/\d{4}");
            Console.WriteLine(resultado1);

            Console.WriteLine("2. Expresión regular para validar direcciones de correo electrónico");
            String correo = "asotfer636@educaand.es";
            Match resultado2 = Regex.Match(correo, @"^\w+@\w+\.\w{2,3}$");
            Console.WriteLine(resultado2);

            Console.WriteLine("3. Expresión regular para extraer números de teléfono en formato ###-###-####");
            String telefono = "527-349-8201";
            Match resultado3 = Regex.Match(telefono, @"\d{3}-\d{3}-\d{4}");
            Console.WriteLine(resultado3);

            Console.WriteLine("4. Expresión regular para validar una dirección IP");
            String ip = "127.0.0.1";
            Match resultado4 = Regex.Match(ip, @"^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}");
            Console.WriteLine(resultado4);

            Console.WriteLine("5. Expresión regular para validar una dirección MAC");
            String mac = "50:EB:F6:A5:AF:AD";
            Match resultado5 = Regex.Match(mac, @"^(\w{2}:){5}\w{2}$");
                                              //@"^[A-F][:-]$"
            Console.WriteLine(resultado5);

            Console.WriteLine("6. Expresión regular para buscar palabras que comienzan con una letra especifica");
            String pablabras = "coche camion tracor moto carro";
            MatchCollection resultado6 = Regex.Matches(pablabras, @"^{c}\w*");


        }
    }
}