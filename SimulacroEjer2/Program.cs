namespace SimulacroEjer2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Introduzca el numero de empleados: ");
            int numEmpleados = int.Parse(Console.ReadLine());

            for (int i = 0; i < numEmpleados; i++)
            {
                Empleado empleado = new Empleado();

                Console.WriteLine("Introduzca el dni: ");
                empleado.DNI = Console.ReadLine();
                Empleado.ComprobarDni(empleado.DNI);

                Console.WriteLine("Introduzca el nombre: ");
                empleado.Nombre = Console.ReadLine();

                Console.WriteLine("Introduzca el sueldo base: ");
                empleado.SueldoBase = double.Parse(Console.ReadLine());

                Console.WriteLine("Introduzca el pago por horas extras: ");
                empleado.PagoHorasExtra = int.Parse(Console.ReadLine());

                Console.WriteLine("¿Cuantas horas extra ha realizado al mes?: ");
                empleado.HorasExtraMes = int.Parse(Console.ReadLine());

                Console.WriteLine("Introduzca el IRPF (en porcentaje): ");
                empleado.IRPF = double.Parse(Console.ReadLine());

                Console.WriteLine("¿Está casado? (Si/No): ");
                String casado = Console.ReadLine().ToLower();

                if (casado.Equals("si"))
                {
                    empleado.Casado = true;
                } else if (casado.Equals("no"))
                {
                    empleado.Casado = true;
                }

                Console.WriteLine("¿Cuantos hijos tiene?:");
                empleado.NumHijos = int.Parse(Console.ReadLine());

                empleado.ToString();
            }
        }
    }
}