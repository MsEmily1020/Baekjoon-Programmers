using System;

namespace 백준
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());

            Console.WriteLine(a > 0 && b > 0 ? "1" : a > 0 ? "4" : a < 0 && b < 0 ? "3" : "2");
        }
    }
}