import java.io.*;
import java.net.*;

class Server
{
    public static void main(String Args[])throws Exception
    {
       System.out.println("Server of Marvellous Chat Massenger is Running...");
       ServerSocket ssobj = new ServerSocket(2100);
       System.out.println("Server is in the listning mode at port no : 2100");

       Socket sobj = ssobj.accept();
       System.out.println("Client and Server connection is Sucessful...");

       PrintStream ps = new PrintStream(sobj.getOutputStream());

       BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
       BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

       System.out.println("Marvellous Chat Massenger started...");

       String str1 , str2 ;

       while((str1 = br1.readLine())!= null)
       {
        System.out.println("Client say : "+str1);
        System.out.println("Enter message for client : ");
        str2 = br2.readLine();
        ps.println(str2);
       }
       System.out.println("Thank you for using the chat messenger..");
       ssobj.close();
       sobj.close();
       ps.close();
       br1.close();
       br2.close();
    }

}