package application;

import java.util.Scanner;

import entities.Champion;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name1 = scanner.next();
		System.out.print("Vida inicial: ");
		int life1 = scanner.nextInt();
		System.out.print("Ataque: ");
		int attack1 = scanner.nextInt();
		System.out.print("Armadura: ");
		int armor1 = scanner.nextInt();
		Champion champion1 = new Champion(name1, life1, attack1, armor1);

		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		String name2 = scanner.next();
		System.out.print("Vida inicial: ");
		int life2 = scanner.nextInt();
		System.out.print("Ataque: ");
		int attack2 = scanner.nextInt();
		System.out.print("Armadura: ");
		int armor2 = scanner.nextInt();
		System.out.println();
		Champion champion2 = new Champion(name2, life2, attack2, armor2);

		System.out.print("Quantos turnos você deseja executar? ");
		int nTurns = scanner.nextInt();
		System.out.println();

		for (int turn = 1; turn <= nTurns; turn++) {
			System.out.println("Resultado do turno " + turn + ":");
			
			
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);

			System.out.println(champion1.status());
			System.out.println(champion2.status());
			
			System.out.println();

			if (champion1.status().contains("morreu") || champion2.status().contains("morreu")) {
				break;
			}
		}
		
		System.out.println();

		System.out.println("FIM DO COMBATE");
		scanner.close();
	}
}
