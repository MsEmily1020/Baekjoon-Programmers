using System;

namespace 백준
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while(true)
            {
                String[] str = Console.ReadLine().Split();
                int A = int.Parse(str[0]);
                int B = int.Parse(str[1]);

                if (A == 0 && B == 0) break;
                Console.WriteLine(A + B);
            }
        }
    }
}