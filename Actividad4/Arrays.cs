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
            //Encontramos la posicion del valor en el array
            int posicion = Array.IndexOf(array, valor);

            //Si se encuentra devuelve la posicion del valor en el array 
            return posicion;
            throw new NotImplementedException();
        }

        public static int calcularModa(int[] entrada)
        {
            //TODO
            //Si el array esta vacio, devueve 0
            if(entrada.Length == 0)
            { 
                return 0; 
            }
            //Declaramos la variable numMax(numero que mas veces aparece)
            int numMax = entrada[0];
            //Declaramos la variable i
            int i = 0;
            //Mientras que indice sea menos que la longitude del array entrada
            while (i < entrada.Length)
            {
                //Declaramos numVeces que guarda el numero de veces que aparece un numero
                int numVeces = 0;
                int j = 0;
                //Para j menor que entrada
                while (j < entrada.Length)
                {
                    //Si array de j tiene el mismo valor de array de i
                    if (entrada[j] == entrada[i])
                    {
                        //Implementamos numVeces
                        numVeces++;
                    }
                    //Implementamos j
                    j++;
                }
                //si numVeces es mayor que numMax
                if (numVeces > numMax)
                {
                    //Decimos que numMax es el array de indice i
                    numMax = entrada[i];
                    //y que ahora, numMax sea igual al numVeces
                    numMax = numVeces;
                }
                //Implementamos i
                i++;
            }
            //Devolvemos el numMax
            return numMax;
            throw new NotImplementedException();
        }
    }
}
