import java.util.Scanner;

public class InteractRunner {

	public static void main(String[] arg) {

		System.out.println("�������������...");

		Scanner reader = new Scanner(System.in);

		try {

			Calculator calc = new Calculator();

			String exit = "yes";

			System.out.println("����������� �� DNScookie");

			System.out.println(" ");

			while (!exit.equals("no")) {

				System.out.println("����� ������ ���������: ");

				String first = reader.next();

				System.out.println("����� ������ ���������: ");

				String second = reader.next();

				calc.add(Float.valueOf(first), Float.valueOf(second));

				System.out.println("��������� " + calc.getResult());

				System.out.println("�����, ��? � ������ ��� ���.");

				calc.clearResult();

				System.out.println(" ");

			}

		} finally {

			reader.close();

		}

	}

}