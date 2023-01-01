using System;

namespace 백준
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int T = int.Parse(Console.ReadLine());

            for(int i = 1; i <= T; i++)
            {
                String[] str = Console.ReadLine().Split();
                Console.WriteLine("Case #" + i + ": " + (int.Parse(str[0]) + int.Parse(str[1])));
            }
        }
    }
}