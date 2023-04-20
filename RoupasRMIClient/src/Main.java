import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws RemoteException, NotBoundException {

		Registry registry = LocateRegistry.getRegistry("localhost");
		// Registry registry = LocateRegistry.getRegistry("192.168.2.115");
		AluguelRoupasService client = (AluguelRoupasService) registry.lookup("Roupas");
		LocalDate start, end;

		int option = 100;
		String inicio, fim, saida;

		try (Scanner in = new Scanner(System.in)) {
			while (option != 0) {

				System.out.println("Caro cliente, informe a opção desejada para aluguel:");
				System.out.println("1 - Aluguel de roupas esportivas.");
				System.out.println("2 - Aluguel de roupas tradicionais.");
				System.out.println("3 - Aluguel de roupas para festas.");
				System.out.println("0 - Sair.");
				System.out.print("Opção desejada: ");
				option = in.nextInt();

				switch (option) {

				case 1:
					inicio = carregarQuestoes("início");
					fim = carregarQuestoes("fim");
					start = LocalDate.parse(inicio, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					end = LocalDate.parse(fim, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					saida = client.findRoupasDisponiveis("Esportivo", start, end);
					System.out.println(saida);
					break;

				case 2:
					inicio = carregarQuestoes("início");
					fim = carregarQuestoes("fim");
					start = LocalDate.parse(inicio, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					end = LocalDate.parse(fim, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					saida = client.findRoupasDisponiveis("Tradicional", start, end);
					System.out.println(saida);
					break;

				case 3:
					inicio = carregarQuestoes("início");
					fim = carregarQuestoes("fim");
					start = LocalDate.parse(inicio, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					end = LocalDate.parse(fim, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					saida = client.findRoupasDisponiveis("Festa", start, end);
					System.out.println(saida);
					break;

				default:
					break;
				}
			}
		}

		System.out.println(" \n" + "Até logo!!");
	}

	public static String carregarQuestoes(String tipo) {
		Scanner in2 = new Scanner(System.in);
		String date = "";
		System.out.print("Informe a data " + tipo + " para o aluguel - (Formato: DD/MM/AAAA): ");
		date = in2.nextLine();
		return date;
	}

}
