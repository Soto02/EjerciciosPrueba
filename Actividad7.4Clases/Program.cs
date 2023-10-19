namespace Actividad7._4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Persona persona1 = new Persona("Ruben", 24);
            Empleado empleado1 = new Empleado("Riki", 36, 1500);

            Console.WriteLine(persona1.ToString());
            Console.WriteLine(empleado1.ToString());
            
        }
    }
}