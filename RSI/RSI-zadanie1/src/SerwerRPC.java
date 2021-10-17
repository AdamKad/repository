
/*
import java.net.InetAddress;
import java.util.Scanner;

import org.apache.xmlrpc.WebServer;

public class ServerRpc {

	public Integer echo(int x, int y) {
		return new Integer(x+y);
	}
	public Integer echo(String q) {
		Scanner reader = new Scanner(q);
		int par1 = Integer.valueOf(reader.next());
		int par2 = Integer.valueOf(reader.next());
		reader.close();
		return echo(par1,par2);
	}
	
	public int asy(String s) {
		
		
		
		
		System.out.println("asy start");
		int value = -1;
		char ch ='a';
		String string ="";
		try {	
			Scanner scan = new Scanner(s);
			int x = Integer.valueOf(scan.next());
			string = scan.next();
			ch = scan.next().charAt(0);
			scan.close();
			Thread.sleep(x);
				}
		catch(InterruptedException ex) {
			ex.printStackTrace();
			Thread.currentThread().interrupt();
		}
		
		
		System.out.println("asy koniec");
		
		char[] sa= string.toCharArray();
		for(int i = 0; i< string.length(); i++) {
			if(sa[i] == (ch)) {
				value = i;
			}
		}
		return value;
		
			
	}
	*/
	/*public int asy(String s) {
		Scanner scan = new Scanner(s);
		int i = Integer.valueOf(scan.next());
		String string = scan.next();
		char ch = scan.next().charAt(0);
		scan.close();
		return asy(i,string,ch);
	}*/
	
	
	/*
	public String credentials(String imie, String nazwisko) {
		String result = "Witaj " + imie + " " + nazwisko +"!";
		return result;
	}
	public String credentials(String q) {
		Scanner reader = new Scanner(q);
		String par1 = reader.next();
		String par2 = reader.next();
		reader.close();
		return credentials(par1,par2);
	}
	
	public int addDiff(int i, String l) {
		return i + Integer.valueOf(l);
	}
	
	public int addDiff(String q) {
		Scanner reader = new Scanner(q);
		int par1 = Integer.valueOf(reader.next());
		String par2 = reader.next();
		reader.close();
		return addDiff(par1,par2);
	}
	
	public String show() {
		return ("credentials imie nazwisko - (String,String) Zwraca wiadomosc powitalna. \n"+
		"echo liczba1 liczba2 - (int,int) Zwraca wynik dodawania dwoch liczb.\n"+
		"asy liczba1 - (int,String,char) Asynchronicznie usypia watek na ustalona liczbe i podaje znak w strignui.\n"+
		"addDiff liczba1 liczba2 (int,String) Zwraca wynik dodawania liczby i lancucha znakow zawierajacego liczbe.");
		
	}
	
	public String show(String r) {
		return show();
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("Startuje serwer XML-RPC...");
			int port = 10013;
			WebServer server = new WebServer(port,InetAddress.getByName("10.108.129.13"));
			server.addHandler("Moj serwer", new ServerRpc());
			server.start();
			System.out.println("Serwer wystartowa³ pomyœlnie");
			System.out.println("Nasluchuje na porcie: " + port);
			System.out.println("Aby zatrzymaæ serwer naciœnij ctrl+c");
			
		}
		catch(Exception e) {
			System.err.println("Serwer XML-RPC: " + e);			
		}

	}

}

*/
import org.apache.xmlrpc.WebServer;

public class SerwerRPC {

	public static void main(String[] args) {
		
		try {
			System.out.println("Startuje serwer XML-RPC...");
			int port=10022;
			WebServer server=new WebServer(port);
			
			server.addHandler("MojSerwer", new SerwerRPC());
			server.start();
			System.out.println("Serwer wystartowa³ pomyœlnie.");
			System.out.println("Nasluchuje na porcie: "+port);
			System.out.println("Aby zatrzymaæ serwer naciœnij ctrl+c");
		}catch(Exception exception) {
			System.err.println("Serwer XML-RPC: "+exception);
		}
	}
	
	public Integer multiplication(int x, int y) {
		return x*y;
	}
	
	public String showAge(String name, String age) {
		String result=(String)name+"-"+Integer.parseInt(age)+" lat";
		return result;
	}
	
	public Integer asyInt(int time, int res) {
		System.out.println("...wywo³ano asy - odliczam");
		
		try {
			Thread.sleep(time);
			
		}catch(InterruptedException ex) {
			ex.printStackTrace();
			Thread.currentThread().interrupt();
		}
		return(res);
	}
	
	public String show() {
		
		String show = "multiplication(int x, int y)-zwraca iloczyn dwoch liczb typu int  \nshowAge(String name, int age)-zwraca ciag znakow skladajacy sie z imienia i wieku \nasyInt(int time, int res)-po czasie time(w milisekundach) zwraca inta \naby wywolac procedure napisz jej nazwe i parametry po spacji np asyInt 10 1 \naby zakonczyc napisz exit";
	return show;
	}
}
/*

import org.apache.xmlrpc.WebServer;

public class SerwerRPC {

	public static void main(String[] args) {
		
		try {
			System.out.println("Startuje serwer XML-RPC...");
			int port=10022;
			WebServer server=new WebServer(port);
			
			server.addHandler("MojSerwer", new SerwerRPC());
			server.start();
			System.out.println("Serwer wystartowa³ pomyœlnie.");
			System.out.println("Nasluchuje na porcie: "+port);
			System.out.println("Aby zatrzymaæ serwer naciœnij ctrl+c");
		}catch(Exception exception) {
			System.err.println("Serwer XML-RPC: "+exception);
		}
	}
	
	public Integer multiplication(int x, int y) {
		return x*y;
	}
	
	public String showAge(String name, String age) {
		String result=(String)name+"-"+Integer.parseInt(age)+" lat";
		return result;
	}
	
	public Integer asyInt(int time, int res) {
		System.out.println("...wywo³ano asy - odliczam");
		
		try {
			Thread.sleep(time);
			
		}catch(InterruptedException ex) {
			ex.printStackTrace();
			Thread.currentThread().interrupt();
		}
		return(res);
	}
	
	public String show() {
		
		String show = "multiplication(int x, int y)-zwraca iloczyn dwoch liczb typu int  \nshowAge(String name, int age)-zwraca ciag znakow skladajacy sie z imienia i wieku \nasyInt(int time, int res)-po czasie time(w milisekundach) zwraca inta \naby wywolac procedure napisz jej nazwe i parametry po spacji np asyInt 10 1 \naby zakonczyc napisz exit";
	return show;
	}
}
*/