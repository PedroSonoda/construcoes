package Construtores;

public class ConstrutorCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro Carro1 = new Carro ();
		Carro Carro2 = new Carro ("09FJO0", 784);
		Carro Carro3 = new Carro ("0FECS20", 484);

		
		System.out.println(Carro2.getPlaca());
		System.out.println(Carro2.getNumChassi());
		
		System.out.println(Carro3.getPlaca());
		System.out.println(Carro3.getNumChassi());
	}

}
