package Tugas4;

import java.io.Serializable;

public class Barang implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private int harga;
	private int stock;
	
	
	public Barang () {
		super();
	}
	
	public Barang(String name, int harga, int stock) {
		super();
		this.name = name;
		this.harga = harga;
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Nama: " +name+ "\tHarga: " +harga+ "\tStock: " +stock;
	}
}
