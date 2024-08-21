import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); //Ввели сканер, чтобы считать
        System.out.println("Введите уровнение"); //Вывели надпись введите уровнение
        String string = scanner.nextLine(); // Считали уровнение, занесли если в string
        System.out.println(calc(string));

    }


    public static short calc(String string) throws Exception {
        String[] strings = string.split(" "); //Создали массив
        if (strings.length != 3) {
            throw new Exception("Неверное математические выражение");
        }
        short number1 = Short.parseShort(strings[0]); //Внесли в переменную number1 1 число
        short number2 = Short.parseShort(strings[2]); //внесли в переменную number2 2 число
        short answer = 0;
        String s = (strings[1]); //Внесли в переменную s наш знак(Пока что текстом)2


        if (number1 < 1 || number2 < 1 || number1 > 10 || number2 > 10) {
            throw new Exception("Слишком большие или маленькие числа");
        }
        switch (s) {
            case "+":
                answer = (short) (number1 + number2);
                break;
            case "-":
                answer = (short) (number1 - number2);
                break;
            case "*":
                answer = (short) (number1 * number2);
                break;
            case "/":
                answer = (short) (number1 / number2);
                break;
            default:
                throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        return answer;
    }
}
