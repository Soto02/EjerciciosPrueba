using System;

namespace Actividad4
{
    public class Arrays
    {
        static void Main(string[] args)
        {
        }

        public static int minValorArray(int[] array)
        {
            //TODO
            //Comprobamos si el array esta vacio
            if (array.Length == 0)
            {
                return 0;

            }
            //Declaramos la variable valorMinimo
            int valorMinimo = array[0];
            
            //Recorremos el array, para i = 1(i=0 da error)
            for (int i = 1; i < array.Length; i++)
            {
                //Si i es menor que el valorMinimo
                if (i < valorMinimo)
                {
                    //then el valorMinimo es i
                    valorMinimo = i;
                }
            }        
            return valorMinimo;

            throw new NotImplementedException();
        }
        public static int[] invertirArray(int[] array)
        {
            //TODO
            //Declaramos la variable que sea un nuevo arrayInvertido con la longitud de array
            int[] arrayInvertido = new int[array.Length];

            //Recorremos el array
            for (int i = 0;i < array.Length; i++)
            {
                //Copiamos el dato en la posicion i-1 del array original en la posicion del arrayInverso
                arrayInvertido[i] = array[array.Length-1-i];
            }
            //El valor del array es ahora es del arrayInvertido
            array = arrayInvertido;

            return arrayInvertido;

            throw new NotImplementedException();
        }

        public static int comprobarValorEnArray(int[] array, int valor)
        {
            //TODO
            throw new NotImplementedException();
        }

        public static int calcularModa(int[] entrada)
        {
            //TODO
            throw new NotImplementedException();
        }
    }
}
