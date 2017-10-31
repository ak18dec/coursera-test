package javanetworking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPAddressClass {
	public static void main(String[] args) throws UnknownHostException {
		//Returns the instance of InetAdddress containing local host name and address
		InetAddress localhost = InetAddress.getLocalHost();
		System.out.println("System IP Address: "+(localhost.getHostAddress()).trim());
		System.out.println("System Host Name: "+ (localhost.getHostName()).trim());
		
		//Find Public IP Address
		String systemipaddress = "";
		Scanner sc = new Scanner(System.in);
		String url_string = sc.next();
		try {
			URL url_name = new URL(url_string);
			BufferedReader br = new BufferedReader(new InputStreamReader(url_name.openStream()));
			
			//reads system ip address
			systemipaddress = br.readLine().trim();
		}catch(Exception e) {
			systemipaddress = "Cannot Execute Properly";
		}finally {
			sc.close();
		}
		System.out.println("Public IP Address: "+ systemipaddress);
		
	}
}
