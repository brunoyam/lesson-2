import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Сочетания клавиш в идее: CTRL + D - скопировать строку
        // Сделать код красивым: выделить его и CTRL+ALT+L


        // Считывание данных с консоли:
        Scanner scanner = new Scanner(System.in);

        String st = scanner.next(); // считать строку
        int a = scanner.nextInt(); // считать целое число с клавиатуры
        char c = scanner.next().charAt(0); // считать один символ с клавиатуры


        int l = st.length(); // длина строки
        String substr = st.substring(0, 5); // вытащить подстроку из строки
        String replaced = st.replace('o', 'i'); // заменить все вхождения o на i в строке

        // проверить, является ли число четным
        int b = scanner.nextInt();
        if (b % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }

        // калькулятор, считывающий выражение
        String s = scanner.next(); // считать выражение
        int pos = -1; // найдем арифметический знак внутри полученной строки
        if (s.indexOf('+') != -1 ) {  // s.indexOf('+') - найти индекс первого вхождения + в строку
            pos = s.indexOf('+');
        }
        if (s.indexOf('-') != -1) {
            pos = s.indexOf('-');
        }
        if (s.indexOf('*') != -1) {
            pos = s.indexOf('*');
        }
        if (s.indexOf('/') != -1) {
            pos = s.indexOf('/');
        }
        if (pos == -1) {
            System.out.println("Арифметического знака не найдено");
        } else {
            char operation = s.charAt(pos);  // получим знак
            String leftOperand = s.substring(0, pos);  // разделим строку на две части, эта - первая - до знака
            String rightOperand = s.substring(pos + 1);// разделим строку на две части, эта - вторая - после знака

            int res;
            int leftNumber = Integer.parseInt(leftOperand); // приведем строку к числу
            int rightNumber = Integer.parseInt(rightOperand);

            switch (operation) {
                case '+':
                    res = leftNumber + rightNumber;
                    System.out.println(res);
                    break;
                case '-':
                    res = leftNumber - rightNumber;
                    System.out.println(res);
                    break;
                case '*':
                    res = leftNumber * rightNumber;
                    System.out.println(res);
                    break;
                case '/':
                    res = leftNumber / rightNumber;
                    System.out.println(res);
                    break;
                default:
                    System.out.println("Произошла ошибка: непредвиденная операция");
                    break;
            }
        }

    }
}