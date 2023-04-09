import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int option = 100;

		try (Scanner in = new Scanner(System.in)) {
			while (option != 0) {

				System.out.println("Caro cliente, informe a opção desejada para aluguel:");
				System.out.println("1 - Aluguel de roupas esportivas");
				System.out.println("2 - Aluguel de roupas tradicionais.");
				System.out.println("3 - Aluguel de roupas para festas.");
				System.out.println("0 - Sair.");
				System.out.print("Opção desejada: ");
				option = in.nextInt();

				switch (option) {

				case 1:
					break;

				case 2:
					break;

				case 3:
					break;
					
				default:
					break;
				}
			}
		}

		System.out.println(" \n" + "Até logo!!");

	}

}
