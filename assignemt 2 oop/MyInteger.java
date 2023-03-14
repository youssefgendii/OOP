public class MyInteger {
    private int value;

    public MyInteger(int value){
        return value;
    }
    public boolean IsEven(int value){
        if (value % 2 == 0)
            return true;
    }
    public boolean IsOdd(int value){
        if (value % 2 !== 0)
            return true;
    }
    public boolean IsPrime(int value){
        for (int i=2; i<value; i++){
            if(i % value == 1)
                return true;
            else
                return false;

        }
        if (value == 1 || value == 2)
            return true;
    }
    public static boolean IsEven(int value){
        if (value % 2 == 0)
            return true;
    }



    public static boolean IsPrime(int value) {
        for (int i = 2; i < value; i++) {
            if (i % value == 1)
                return true;
            else
                return false;
        }
        if (value == 1 || value == 2)
            return true;
    }

    public static boolean IsEven (MyInteger integer)
    {
        return integer.IsEven();
    }
    public static boolean IsOdd (MyInteger integer)
    {
        return integer.IsOdd();
    }
    public static boolean IsPrime (MyInteger integer)
    {
        return integer.IsPrime();
    }
    public boolean equals (int i) {
        if (i == value){
            return true;
        else
            return false;
    }
    }
    public boolean equals(MyInteger integer){
        if (integer == value)
            return true;
    }



}
