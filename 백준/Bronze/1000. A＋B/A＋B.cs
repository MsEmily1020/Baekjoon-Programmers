using System;

namespace 백준
{
    internal class Program
    {
        static void Main(string[] args)
        {
            String[] arr = Console.ReadLine().Split();
            Console.WriteLine(int.Parse(arr[0]) + int.Parse(arr[1]));
        }
    }
}