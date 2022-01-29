package i.have.an.program;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {
    
    Socket s=new Socket("localhost",6666);
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());
    String str = "";
    Scanner scanner=new Scanner(System.in);
    while(!str.equals("exit")) {
        System.out.println("enter :");
        str=scanner.nextLine();
        dout.writeUTF(str);
        dout.flush();
    }
    dout.close();
    s.close();
        }
    }

