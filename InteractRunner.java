import java.util.Scanner;

public class InteractRunner {

	public static void main(String[] arg) {

		System.out.println("Инициализация...");

		Scanner reader = new Scanner(System.in);

		try {

			Calculator calc = new Calculator();

			String exit = "yes";

			System.out.println("Калькулятор от DNScookie");

			System.out.println(" ");

			while (!exit.equals("no")) {

				System.out.println("Введи первое слагаемое: ");

				String first = reader.next();

				System.out.println("Введи второе слагаемое: ");

				String second = reader.next();

				calc.add(Float.valueOf(first), Float.valueOf(second));

				System.out.println("Получится " + calc.getResult());

				System.out.println("Круто, да? А теперь ещё раз.");

				calc.clearResult();

				System.out.println(" ");

			}

		} finally {

			reader.close();

		}

	}

}