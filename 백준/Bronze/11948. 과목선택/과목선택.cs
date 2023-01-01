using System;

namespace 백준
{
    internal class Program
    {
        static void Main(String[] args)
        {
            int[] arr = new int[4];
            int sum = 0;
            for(int i = 0; i < 2; i++)
            {
                for(int j = 0; j < arr.Length; j++)
                    arr[j] = int.Parse(Console.ReadLine());
                Array.Sort(arr);
                if (arr.Length == 4) sum += arr[1] + arr[2] + arr[3];
                else sum += arr[1];
                arr = new int[2];
            }

            Console.WriteLine(sum);
        }
    }
}