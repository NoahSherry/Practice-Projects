using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Sockets;
using System.Text;
using System.Threading.Tasks;

namespace PortScan
{
    class Program
    {
        public static string IPA = "";
        private static TcpClient tcpClient = new TcpClient();

        static void Main(string[] args)
        {
            Console.WriteLine("Welcome to Noah's Port Scanner");
            Console.WriteLine("Please enter the IP address you want to scan:");
            IPA = Console.ReadLine();
            CheckPorts(IPA);


            Console.ReadLine();
        }

        public static void CheckPorts(string IP)
        {
            for (int port = 0; port < 65535; port++)
            {
                    try
                    {
                        tcpClient.Connect(IP, port);
                        Console.WriteLine("Port " + port + " open");
                    }
                    catch (Exception)
                    {
                    }
            }
        }
    }
}
