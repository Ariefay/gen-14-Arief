package Tugas4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;




public class WriterReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barang b1 = new Barang("Oreo", 6000, 10);
		Barang b2 = new Barang("Tanggo", 5000, 10);
		Barang b3 = new Barang("Buavita", 7000, 10);
		Barang b4 = new Barang("Aqua", 3000, 10);
		
	try {
		FileOutputStream f = new FileOutputStream(new File("DaftarBarang.txt"));
		ObjectOutputStream o = new ObjectOutputStream(f);
		
		o.writeObject(b1);
		o.writeObject(b2);
		o.writeObject(b3);
		o.writeObject(b4);
		
		o.close();
		f.close();
		
		FileInputStream fi = new FileInputStream(new File("DaftarBarang.txt"));
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Barang br1 = (Barang) oi.readObject();
		Barang br2 = (Barang) oi.readObject();
		Barang br3 = (Barang) oi.readObject();
		Barang br4 = (Barang) oi.readObject();
		
		System.out.println(br1.toString());
		System.out.println(br2.toString());
		System.out.println(br3.toString());
		System.out.println(br4.toString());
		
		oi.close();
		fi.close();
	} catch (FileNotFoundException e) {
		System.out.println("File not found");
	} catch (IOException e) {
		System.out.println("Error insitializing stream");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	
	
	}

}
