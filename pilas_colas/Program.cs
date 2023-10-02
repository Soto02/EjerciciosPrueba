namespace pilas_colas
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string formula = "(2+[3-12]*{8/3})";

            Stack<char> pila = new Stack<char>();

            for (int i = 0; i < formula.Length; i++)
            {
                if (formula[i] == '(' || formula[i] == '[' || formula[i] == '{')
                {
                    pila.Push(formula[i]);
                    Console.Write(formula[i]);
                    

                } 
                if (formula[i] == ')' || formula[i] == ']' || formula[i] == '}')
                {
                    pila.Push(formula[i]);
                    Console.Write(formula[i]);
                    
                }
                for (int j = 0; j < formula.Length; j++)
                {
                    
                }

            }

        }
    }
}