using System;
using System.Linq;
using System.Text.RegularExpressions;

namespace Actividad09
{
    public class Actividad9
    {
        static void Main(string[] args)
        {
        }

        public static bool cadenaContenedora(string cadena, string valor)
        {
            return Regex.IsMatch(cadena, $@"{valor}");
            throw new NotImplementedException();
        }

        public static bool numeroEntero(string v)
        {
            return Regex.IsMatch(v, @"^\d+$");
            throw new NotImplementedException();
        }

        public static bool isSpanish(string telefono)
        {
            return Regex.IsMatch(telefono, @"^+?(00?(34)?]");
            throw new NotImplementedException();
        }

        public static bool isCorrectEmail(string email)
        {
            return Regex.IsMatch(email, @"\w+@\w+\.\w{2,3}");
            throw new NotImplementedException();
        }

        public static bool numeroPositivo(string v)
        {
            return Regex.IsMatch(v, @"^\d+$");
            throw new NotImplementedException();
        }

        public static bool isOctal(string v)
        {
            return Regex.IsMatch(v, @"^\d{8}$");
            throw new NotImplementedException();
        }

        public static bool dni(string v)
        {
            return Regex.IsMatch(v, @"^(\d{8}\w{1})$");
            throw new NotImplementedException();
        }

        public static bool fechaFormat(string v)
        {
            return Regex.IsMatch(v, @"\d{2}/\d{2}/\d{4}");
            throw new NotImplementedException();
        }

        public static bool isBinario(string v)
        {
            return Regex.IsMatch(v, @"^\d[0-1]+$");
            throw new NotImplementedException();
        }
    }
}
