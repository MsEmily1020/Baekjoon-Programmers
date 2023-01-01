using System;
using System.Diagnostics.CodeAnalysis;
using System.Xml.Schema;

namespace 백준
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int totalPrice = int.Parse(Console.ReadLine());

            int T = int.Parse(Console.ReadLine());
            int sum = 0;
            for (int i = 0; i < T; i++)
            {
                String[] str = Console.ReadLine().Split();
                sum += int.Parse(str[0]) * int.Parse(str[1]);
            }

            if (sum == totalPrice) Console.WriteLine("Yes");
            else Console.WriteLine("No");
        }
    }
}