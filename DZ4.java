import static java.lang.Math.*;

public class DZ4 {
    public static void main(String[] args) {
        // 1. вывести все четные числа от 1 до миллиона
        for (int i = 1; i<= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }


        // 2. вывести все нечетные числа от 500000 до 100000
        for (int i2 = 500000; i2 >= 100000; i2--) {
            if (i2 % 2 != 0) {
                System.out.println(i2);
            }
        }


        //вывести все числа до миллиона, которые делятся на 3
        for (int i3 = 1; i3<= 1000000; i3++) {
            if (i3 % 3 == 0) {
                System.out.println(i3);

            }
        }
        
        
        //вывести все отрицательные числа, квадрат которых меньше 100000
        for (int i4=-1;i4*i4 < 100000;i4--) {
            System.out.println(i4);
            }
    }

}

