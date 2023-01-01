using System;

namespace 백준
{
    internal class Program
    {
        static void Main(String[] args)
        {
            String[] str = Console.ReadLine().Split();
            int[] arr = new int[3];
            for(int i = 0; i < arr.Length; i++)
                arr[i] = int.Parse(str[i]);
            Array.Sort(arr);
            Console.WriteLine(arr[1] + arr[2]);
        }
    }
}