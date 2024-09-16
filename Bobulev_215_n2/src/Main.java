import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя пользователя:");
            String name = scanner.nextLine();
            PersonAccount user = new PersonAccount(name);

            System.out.println("Хотите открыть счёт в RUB?");
            System.out.println("1 - Да");
            System.out.println("2 - Нет");
            int command = scanner.nextInt();
            if (command == 1) {
                user.moneyRUB = 0.0;
            }else{
                user.moneyRUB = null;f
            }

            System.out.println("Хотите открыть счёт в USD?");
            System.out.println("1 - Да");
            System.out.println("2 - Нет");
            command = scanner.nextInt();
            if (command == 1) {
                user.moneyUSD = 0.0;
            }
            else{
                user.moneyUSD = null;
            }

            System.out.println("Хотите открыть счёт в EUR?");
            System.out.println("1 - Да");
            System.out.println("2 - Нет");
            command = scanner.nextInt();

            //чуть чуть изменил условия и если значения пустые то не выводим
            // и double привел к Double


            if (command == 1) {
                user.moneyEUR = 0.0;
            }
            else{
                user.moneyEUR = null;
            }

            System.out.println("Поздравляем, аккаунт для пользователя " + user.name + " создан.");
            System.out.println("Открытые счета:");
            if (user.moneyRUB != null) {
                System.out.println("- RUB");
            }
            if (user.moneyUSD != null) {
                System.out.println("- USD");
            }
            if (user.moneyEUR != null) {
                System.out.println("- EUR");
            }

        }
    }

    class PersonAccount {
        String name;      // имя и фамилия
        Double  moneyRUB;  // счёт в рублях
        Double  moneyUSD;  // счёт в долларах
        Double  moneyEUR;  // счёт в евро


        PersonAccount(String userName) {
            name = userName;
            moneyRUB = null;
            moneyUSD = null;
            moneyEUR = null;
        }

}