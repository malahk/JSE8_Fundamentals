package ua.org.oa.malahk;

public class AppTest
{

    public static void main(String[] args)
    {
        ErrorsList err = new ErrorsList();
        err.ArrayIndexOutOfBoundsTest(); // a
        err.IllegalArgumentTest(); // b
        err.ClassCastTest(); // c
        err.StringIndexOutOfBoundsTest(); // d
        err.NullPointer1(); // e 1
        err.NullPointer2(); // e 2
        err.NullPointer3(); // e 3
        err.StackOverflowTest(); // f
        err.NumberFormatTest(); // g
        err.OutOfMemoryTest(); // h
        // TODO Auto-generated method stub

    }
}