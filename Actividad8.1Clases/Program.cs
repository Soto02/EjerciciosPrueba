namespace Actividad8._1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Empleado empleado = new Empleado("Rafa");
            Directivo directivo = new Directivo("Mario");
            Operario operario = new Operario("Alfonso");
            Oficial oficial = new Oficial("Luis");
            Tecnico tecnico = new Tecnico("Pablo");

            Console.WriteLine(empleado.ToString());
            Console.WriteLine(directivo.ToString());
            Console.WriteLine(operario.ToString());
            Console.WriteLine(oficial.ToString());
            Console.WriteLine(tecnico.ToString());
        }
    }
}