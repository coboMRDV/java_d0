package com.cursojava.colecciones.banco;

import java.util.*;

public class ClientesBancarios {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Antonio López", "0001", 20000);
		Cliente cliente2 = new Cliente("Rafael Gómez", "0002", 15000);
		Cliente cliente3 = new Cliente("Ana Martín", "0003", 200000);
		Cliente cliente4 = new Cliente("Juan Díaz", "0004", 20);
		Cliente cliente5 = new Cliente("Antonio López", "0001", 20000);

		Set<Cliente> clientesDelBanco = new HashSet<Cliente>();

		clientesDelBanco.add(cliente1);
		clientesDelBanco.add(cliente2);
		clientesDelBanco.add(cliente3);
		clientesDelBanco.add(cliente4);
		clientesDelBanco.add(cliente5);

//		System.out.println("+-----+----------------+--------------+");
//		System.out.println("| ID  | Nombre Cliente | Saldo actual |");
//		System.out.println("+-----+----------------+--------------+");
//		for(Cliente cliente : clientesDelBanco) {
//			System.out.println(cliente.getDatos());
//		}

		Iterator<Cliente> it = clientesDelBanco.iterator();

		while (it.hasNext()) {
			System.out.println(it.next().getNombre());
		}

//		System.out.println("+-----+----------------+--------------+");
	}

}
