package com.server.model.util;

public class Status {

	private int kod;
	private String mesaj;

	public Status() {
		// TODO Auto-generated constructor stub
	}

	public Status(int kod, String mesaj) {
		super();
		this.kod = kod;
		this.mesaj = mesaj;
	}

	public int getKod() {
		return kod;
	}

	public void setKod(int kod) {
		this.kod = kod;
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

}
