package Construtores;

public class ContrucoesConsulta {

	public static void main(String[] args) {
		Consulta consulta1 = new Consulta ("Joao", "Dr. Fernando", 02/05);
		Consulta consulta2 = new Consulta ("Maria", "Dr. Adriano", 95/12);
		Consulta consulta3 = new Consulta ("Carla", "Dr. Marcos", 30/10);
		
		System.out.println(consulta1.getNomePcnt());
		System.out.println(consulta1.getNomeDents());
		System.out.println(consulta2.getData());
		
		System.out.println(consulta2.getNomePcnt());
		System.out.println(consulta2.getNomeDents());
		System.out.println(consulta2.getData());
		
		System.out.println(consulta3.getNomePcnt());
		System.out.println(consulta3.getNomeDents());
		System.out.println(consulta3.getData());
		}
		


	}


