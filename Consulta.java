package Construtores;

public class Consulta {

	String NomePcnt;
	String NomeDents;
	int data;
	
	public Consulta () {
	}
	
	public Consulta(String nome) {
	this.NomePcnt = NomePcnt;
	}
	public Consulta(String NomePcnt, String NomeDents, int data) {
	this.NomePcnt = NomePcnt;
	this.NomeDents = NomeDents;
	this.data = data;
	}
	public String getNomePcnt() {
	return NomePcnt;
	}
	public void setNomePcnt (String NomePcnt) {
	this.NomePcnt = NomePcnt;
	}
	public String getNomeDents() {
	return NomeDents;
	}
	public void setNomeDents(String NomeDents) {
	this.NomeDents = NomeDents;
	}
	public int getData() {
	return data;
	}
	public void setData(int data) {
	this.data = data;
	}}