using System;
using System.Linq;

namespace Actividad5
{
    public class Actividad5
    {
        static void Main(string[] args)
        {
        }

        public static string devolverString(string[] vs)
        {
            //TODO
            string resultado = "";
            foreach (var i in vs)
            {
                resultado += i;
                
            }
            return resultado;

            throw new NotImplementedException();
        }

        public static string devolverStringOrdenado(string[] vs)
        {

            //TODO
            Array.Sort(vs);
            string resultado = "";

            foreach(var i in vs)
            {
                resultado = resultado + i;
            }
            return resultado;

            throw new NotImplementedException();
        }

        public static int contarCaracter(string[] vs, char v)
        {
            //TODO
            int caracteres = 0;
            
            foreach (var i in vs)
            {
                foreach (var c in i)
                {
                    if (c == v) 
                    {
                        caracteres++;
                    } 
                }
            }
            return caracteres;
            throw new NotImplementedException();
        }

        public static int[] sumarArrays(int[] vs1, int[] vs2)
        {

            //TODO
            int[] suma = new int[vs1.Length];
            
            for (int i = 0; i < vs1.Length; i++)
            {
                suma[i] = vs1[i] + vs2[i];
            }
            return suma;

            throw new NotImplementedException();
        }

        public static int[] multiplicarArrays(int[] vs1, int[] vs2)
        {
            //TODO
            int[] multiplicacion = new int[vs1.Length];

            for(int i = 0; i< vs1.Length; i++)
            {
                multiplicacion[i] = vs1[i] * vs2[i];
            }
            return multiplicacion;

            throw new NotImplementedException();
        }

        public static bool isPalindromo(string entrada)
        {
            //TODO
            bool esPalindromo = false;

            string sinEspacio = entrada.Replace(" ", "").ToLower();
            string alReves = new string(entrada.Reverse().ToArray());
            string cadenaReves = "";

            for (int i = 0;i < alReves.Length;i++)
            {
                cadenaReves += alReves[i];
            }

            if(alReves.Equals(sinEspacio))
            {
                esPalindromo = true;
            }

            return esPalindromo;

            throw new NotImplementedException();


        }

        public static int contarPalabras(string entrada)
        {
            //TODO
            int totalPalabras = 0;

            for (int i = 0; i<entrada.Length; i++)
            {
                if (entrada[i] == entrada[i])
                {

                }
            }

            throw new NotImplementedException();
        }

        public static int contarCaracteres(string entrada)
        {
            //TODO

            throw new NotImplementedException();
        }
    }
}
