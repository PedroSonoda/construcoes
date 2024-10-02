package Construtores;

public class Carro {
	private String placa;
	private  int numChassi ;
	

public Carro(){

}
public Carro (String placa, int NumChassi) {
	this.placa = placa;
	this.numChassi = numChassi;
}
public String getPlaca() {
	return placa;
}
public void setPlaca(String placa) {
	this.placa = placa;
}
public int getNumChassi() {
	return numChassi;
}
public void setNumChassi(int numChassi) {
	this.numChassi = numChassi;
}}