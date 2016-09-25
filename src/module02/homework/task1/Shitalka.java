package module02.homework.task1;

/**
 * Created by aleigis on 22.09.2016.
 */
public class Shitalka {
    boolean isBankActive;
    static int calculateBalancesSum(int[] balances) {//что передавать на вход в методе, передаем масив
        int sum = 0;
        for (int balance : balances) {
            if (balance > 1000 && balance < 5000) {
                sum += balance;
            }}
            return sum;
        }
    public static void main(String[] args) {
        System.out.println("введите через пробел 10 цифр массива");
//int[] myIntArray =new int[10] //оюьявила массив типа инт 101 эл
        int[] myIntArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < myIntArray.length; i++) {
            //  System.out.println(myIntArray[i]);//выззов массива
        }

        System.out.println(myIntArray.length);//вывод длины массива

//дляструктур данных!!!
        //for (int item:myIntArray)//прохожу по каждому балансу
        //{        }
  /* 2!!!!
        int[] balances = {1303, 1232, 955, 456, 5600, 2431, 0, 15};

        for (int balance:balances)
        {
            if(balance>1000)
            {
                System.out.println("email was sent..."+balance);
            }
        }
*/
        // 3!!!!!!! теперь сичтаем СУММУ ВСЕХ БАЛАНСОВ!!!!!!!!!! >1000<200
        int[] balances = {1303, 1232, 955, 456, 5600, 2431, 0, 15};
        int[] balances1 = {1435, 1436, 3460, 456, 5670, 2431, 0, 15};//2 структура данных, чтобы не было дубля массива это ГРЕХ!!!! делаем МЕТОД!!!!
        boolean isBankActive = true;
        int sum = calculateBalancesSum(balances); //обьявила сумму
        System.out.println(sum);
        int sum1 = calculateBalancesSum(balances1);
        System.out.println(sum1);
// for (int balance : balances) {
  //          if (balance > 1000 && balance < 5000) {
    //            sum += balance;
      //          System.out.println("email was sent..." + balance);
        //    }
        //}
    }
}
