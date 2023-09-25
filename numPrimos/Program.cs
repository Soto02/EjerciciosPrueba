namespace numerosPrimos
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num = 2;
            int divisible = 0;

            while (num <= 12)
            {
                for (int i = 1; i <= num; i++)
                {
                    if (num % i == 0)
                    {
                        divisible++;
                    }
                        
                    if (divisible > 2)
                    {
                        break;
                    }
                        
                }
                if (divisible == 2)
                {
                    Console.WriteLine(num);
                }
                divisible = 0;
                num++;
            }
        }
    }
}