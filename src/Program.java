import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        try
        {
            //ввод с консоли в строку input
            Scanner in = new Scanner(System.in);
            System.out.println("Input:");
            String input = in.nextLine();
            System.out.println("Output:");
            in.close();

            //разбиваем строку input на 3 подстроки с помощью пробела:
            //number[0], number[1] и number[2]
            //числа будут в первой и третьей строке, действие - во второй
            String[] number = input.split(" ");

            int num1 = 0;
            int num2 = 0;

            //переводим строку действия в символ
            char c = number[1].charAt(0);

            //проверяем, введены ли римские цифры
            if (number[0].contains("I") || number[0].contains("V") || number[0].contains("X"))
            {
                //превращаем римские цифры в арабские для обоих чисел (от 1 до 10)
                if (number[0].equals("I"))
                    num1 = 1;
                if (number[0].equals("II"))
                    num1 = 2;
                if (number[0].equals("III"))
                    num1 = 3;
                if (number[0].equals("IV"))
                    num1 = 4;
                if (number[0].equals("V"))
                    num1 = 5;
                if (number[0].equals("VI"))
                    num1 = 6;
                if (number[0].equals("VII"))
                    num1 = 7;
                if (number[0].equals("VIII"))
                    num1 = 8;
                if (number[0].equals("IX"))
                    num1 = 9;
                if (number[0].equals("X"))
                    num1 = 10;

                if (number[2].equals("I"))
                    num2 = 1;
                if (number[2].equals("II"))
                    num2 = 2;
                if (number[2].equals("III"))
                    num2 = 3;
                if (number[2].equals("IV"))
                    num2 = 4;
                if (number[2].equals("V"))
                    num2 = 5;
                if (number[2].equals("VI"))
                    num2 = 6;
                if (number[2].equals("VII"))
                    num2 = 7;
                if (number[2].equals("VIII"))
                    num2 = 8;
                if (number[2].equals("IX"))
                    num2 = 9;
                if (number[2].equals("X"))
                    num2 = 10;

                //проверяем число и вычисляем результат в классе Math методом math
                int res = Math.math(c, num1, num2);
                //если результат отрицательный, выводим сначала минус
                if (res < 0) {
                    System.out.print("-");
                    res = res * (-1);
                    ConvertResToRomanNumber.conv(res);
                }
                //полученный результат (int) переводим в римскую
                //цифру и выводим с помощью класса Convert.... и метода conv
                else {
                    ConvertResToRomanNumber.conv(res);
                }
            }
            //если введены не римские цифры, значит арабские
            else {
                //переводим 1 и 3 строки в цифры
                num1 = Integer.parseInt(number[0]);
                num2 = Integer.parseInt(number[2]);

                int res = Math.math(c, num1, num2);
                //выводим результат
                System.out.println(res);
            }
        } catch (Exception e) {
            System.out.println("Неверный формат чисел или ввода");
        }
    }
}
