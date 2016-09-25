package module02.homework.task1;

/**
 * Created by aleigis on 25.09.2016.
 */
public class ArrayMethods
{
    public static void main(String[] args)
    {
  int array[]={10,25,135,983,77,1356,13,5,12,2};
  double array1[]={2.55,6.22,4.66};//{10.95,-25.58,-135.78,-983.66,-77.33,1356.68,-13.22,-5.56,-12.66,-2.66};
        int sum= intSum(array);
        double sum1= doubleSum(array1);
        int max= intMax(array);
        double max1= maxPositive(array1);
        double m = Multiplication(array1);
        double m2 = Multiplication2(array1);
        double mod = Modus(array1);
        System.out.println("1.int sum="+ sum);
        System.out.println("double sum="+sum1);
        System.out.println("2.int max=" + max);
        System.out.println("3.maxPositive double=" + max1);
        System.out.println("4. double multiplication="+ m);
        System.out.println("4. double multiplication2="+ m2);
        System.out.println("5. double modus="+ mod);

    }

    static double Modus(double[] array1 ) {

        double mod = 1;

        for (double i : array1) {
            mod %= i;
        }
        return mod;
    }


    static double Multiplication2(double[] array1)
    {
        //double n;
        double m2 = 0;
double k=1;
        for (double i=1;i<=10; i++)
        {   //1    k*=i   m+=k
           // i[0]*i[1]+i[2]*i[n]
           // m2*=i;
            //2
            if(k>0)
            {
        k*=i;
        m2+=k;
        }}
        return m2;
    }


    static double Multiplication(double[] array1)
    {
        double m = 1;

        for (double i : array1)
        {
            //if (i>m)

            {
                m*= i;
            }
        }
        return m;
    }



    static double maxPositive(double[] array1)
    {//что передавать на вход в методе, передаем масив
        double max1 = 0;
        //int n=0;
        for (double i : array1)
        {
            if (i>0||i>(-1))
            //||i=0)
            {
                max1+= i;
            }
        }
        return max1;}

    static int intMax(int[] array)
    {//что передавать на вход в методе, передаем масив
        int max = 0;
        int n=0;
        for (int i : array)
        {
            if (i > max)
            {
                max = i;
            }
        }
        return max;}

    static int intSum(int[] array)
    {//что передавать на вход в методе, передаем масив
        int sum = 0;
        for (int i : array)
        {
           if (i > 0 && i < 2000)
          {
                sum += i;
        }
        }
        return sum;}

    static double doubleSum(double[] array1)
    {//что передавать на вход в методе, передаем масив
        double sum1 = 0;
        for (double i : array1)
        {
            if (i > 0 && i < 2000)
            {
                sum1 += i;
            }
        }
        return sum1;

    }}
