using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace SimulacroEjer2
{
    internal class Empleado
    {
        public String DNI {  get; set; } = "12345678F";
        public String Nombre {  get; set; } = default;
        public double SueldoBase { get; set; } = default(double);
        public int PagoHorasExtra { get; set; } = default(int);
        public int HorasExtraMes { get; set; } = default(int);
        public double IRPF {  get; set; } = default(double);
        public bool Casado {  get; set; } = false;
        public int NumHijos { get; set; } = default(int);

        public Empleado()
        {
        }
        public Empleado(String dni) 
        {
            DNI = dni;
        }
        public Empleado(string dni, string nombre, double sueldoBase, int pagoHorasExtra, int horasExtraMes, double iRPF, bool casado, int numHijos) : this(dni)
        {
            Nombre = nombre;
            SueldoBase = sueldoBase;
            PagoHorasExtra = pagoHorasExtra;
            HorasExtraMes = horasExtraMes;
            IRPF = iRPF;
            Casado = casado;
            NumHijos = numHijos;
        }

        public static void ComprobarDni(String dni)
        {
            try
            {
                MatchCollection comprobar = Regex.Matches(dni, @"^\d{8}[A-Z]\w{1}");
                Console.WriteLine(comprobar.Count);
            }
            catch (Exception e)
            {
                Console.WriteLine("El dni no ha sido introducido correctamente: " + e);
            }
        }
        public static void CalcularHorasExtra(int HorasExtraMes, int PagoHorasExtra)
        {
            double calculo = HorasExtraMes * PagoHorasExtra;
            Console.WriteLine("Pago por horas extras: "+calculo+ " euros");
        }

        public static void CalcularSueldo(double SueldoBase, int PagoHorasExtra)
        {
            double sueldoBruto = SueldoBase + PagoHorasExtra;
            Console.WriteLine("Sueldo bruto: " + sueldoBruto + " euros");
        }

        public static void CalcularRetencionIRPF(double IRPF, double sueldoBruto)
        {
            /*if(Casado == true)
            {
                IRPF += 2;
            } 
            if(NumHijos == 0)
            {
                IRPF -= 1;
            }*/

            double retencion = sueldoBruto * IRPF;

            Console.WriteLine(retencion);
        }

        public void ToString()
        {
            Console.WriteLine("DNI: " + DNI + ", nombre: " + Nombre + ", sueldo base: " + SueldoBase + ", pago de horas extras: " + PagoHorasExtra
                + ", horas extras al mes: " + HorasExtraMes + ", IRPF: " + IRPF + "%, casado: " + Casado + ", número de hijos: " + NumHijos);
        }

    }
}
