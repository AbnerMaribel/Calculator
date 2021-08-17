//класс для вычислений
class Math
{
    public static int math(char ch, int num1, int num2)
    {
        //переменная для результата вычисления
        int res = 0;
        //проверяем, что числа от 1 до 10
        if (num1 == 0 || num2 == 0 || num1 > 10 || num2 > 10)
        {
            System.out.println("Одно из чисел не принимается на вход");
            System.exit(0);
        }
        else
        {
            //проверяем какое действие и
            //выполняем его
            switch (ch) {
                case '+' -> res = num1 + num2;
                case '-' -> res = num1 - num2;
                case '*' -> res = num1 * num2;
                case '/' -> res = num1 / num2;
                default -> {
                    System.out.println("Операция не обрабатыватся");
                    System.exit(0);
                }
            }
        }
        return res;
    }
}
