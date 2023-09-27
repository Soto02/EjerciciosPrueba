using System;
using System.Security.Cryptography.X509Certificates;

namespace puntoSilla
{
    internal class Program
    {
        //Declaramos la variable matriz
        private int[,] matriz;

        //Creamos la clase rellenar para que el usuario introduzca los datos de la matriz
        public void rellenar()
        {
            //Pedimos que introduzca el numero de filas y columnas
            Console.WriteLine("Introduce cuantas filas tiene la matriz:");
            String dato1 = Console.ReadLine();
            //Convertimos un string a int
            int filas = Convert.ToInt32(dato1);

            Console.WriteLine("Introduce cuantas columnas tiene la matriz:");
            String dato2 = Console.ReadLine();
            //Convertimos un string a int
            int columnas = Convert.ToInt32(dato2);

            matriz = new int[filas,columnas];

            for (int i = 0; i < matriz.GetLength(0); i++)
            {
                for (int j = 0; j < matriz.GetLength(1); j++)
                {
                    //Pedimos los valores
                    Console.WriteLine("Introduzca los valores de la matriz: ");
                    String valor = Console.ReadLine();           
                    matriz[i,j] = int.Parse(valor);
                    
                } 
            }
        }
        public void imprimir()
        {
            for(int i = 0;i < matriz.GetLength(0);i++)
            {
                for (int j = 0; j < matriz.GetLength(1);j++)
                {
                    Console.Write(" ");
                    Console.Write($"{matriz[i, j]} ");
                }
                Console.WriteLine();
            }
        }
       
        static void Main(string[] args)
        {
            Program matriz = new Program();
            matriz.rellenar();
            matriz.imprimir();
               
        }
    }
}