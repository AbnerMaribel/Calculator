public class ConvertResToRomanNumber
{
    public static void conv(int res)
    {
        //
        int div = res / 10;
        int remain = res % 10;

        //если цифра стандартная
        if((div == 0) || (remain == 0))
            //в методе standart выводим стандартные цифрв
            standart(res);

            //если нестандартная
        else if(div >= 1 && div <= 9)
        {
            //разбиваем на две стандартные цифры
            int num3 = div * 10;
            //два вывода для двух разрядов
            standart(num3);
            standart(remain);
        }
        System.out.print("\n");
    }
    //стандартные римские цифры
    public static void standart(int num)
    {
        if (num == 1)
            System.out.print( "I");
        if (num == 2)
            System.out.print( "II");
        if (num == 3)
            System.out.print( "III");
        if (num == 4)
            System.out.print( "IV");
        if (num == 5)
            System.out.print( "V");
        if (num == 6)
            System.out.print( "VI");
        if (num == 7)
            System.out.print( "VII");
        if (num == 8)
            System.out.print( "VIII");
        if (num == 9)
            System.out.print( "IX");
        if (num == 10)
            System.out.print( "X");
        if (num == 20)
            System.out.print( "XX");
        if (num == 30)
            System.out.print( "XXX");
        if (num == 40)
            System.out.print( "XL");
        if (num == 50)
            System.out.print( "L");
        if (num == 60)
            System.out.print( "LX");
        if (num == 70)
            System.out.print( "LXX");
        if (num == 80)
            System.out.print( "LXXX");
        if (num == 90)
            System.out.print( "XC");
        if (num == 100)
            System.out.print( "C" );
    }
}
