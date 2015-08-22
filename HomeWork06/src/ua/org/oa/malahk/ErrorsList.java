package ua.org.oa.malahk;

import java.util.ArrayList;

public class ErrorsList
{
    public void ArrayIndexOutOfBoundsTest()
    {
        this.ArrayIndexOutOfBoundsTest(5);
    }

    void ArrayIndexOutOfBoundsTest(int z) {
        int[] arr = new int[z];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        try {
            System.out.println(arr[z]);
            System.out.println();
            this.noException();
        } catch (ArrayIndexOutOfBoundsException aiException) {
            this.hadleException(aiException);
        }
    }

    public void IllegalArgumentTest()
    {
        this.IllegalArgumentTest("9i");
    }
    
    void IllegalArgumentTest(String s)
    {
        try {
            System.out.println(Integer.parseInt(s));
            System.out.println();
            this.noException();
        } catch (IllegalArgumentException iaException) {
            this.hadleException(iaException);
        }
    }

    public void StringIndexOutOfBoundsTest()
    {
        this.StringIndexOutOfBoundsTest("abcdefg");
    }

    void StringIndexOutOfBoundsTest(String s) {
        try {
            int z = s.length() + 2;
            System.out.println("Char number " + z + ": " + s.charAt(z));
            System.out.println();
            this.noException();
        } catch (StringIndexOutOfBoundsException siException) {
            this.hadleException(siException);
        }
    }

    public void ClassCastTest()
    {
        try {
            Object x = new Integer(0);
            System.out.println((String)x);
            this.noException();
        } catch (ClassCastException ccException) {
            this.hadleException(ccException);
        }
    }

    void NullPointer1() {
        String[] strings = new String[5];
        try {
            System.out.println(strings[1].charAt(1));
            this.noException();
        } catch (NullPointerException npException) {
            this.hadleException(npException);
        }
    }


    void NullPointer2() {
        Integer[] in = new Integer[5];
        try {
            System.out.println(in[1].toString());
            this.noException();
        } catch (NullPointerException npException) {
            this.hadleException(npException);
        }
    }

    void NullPointer3() {
        Object[] objects = new Object[7];
        try {
            System.out.println(objects[3].hashCode());
            this.noException();
        } catch (NullPointerException npException) {
            this.hadleException(npException);
        }
    }

    void StackOverflowTest()
    {
        try {
            this.recursion();
            this.noException();
        } catch (StackOverflowError soError) {
            this.hadleException(soError);
        }
    }

    public void NumberFormatTest()
    {
        try {
            Integer.parseInt("Test");
            this.noException();
        } catch (NumberFormatException  nfException) {
            this.hadleException(nfException);
        }
    }

    void OutOfMemoryTest() {
        ArrayList<String> st = new ArrayList<String>();
        try {
            while (true) {
                st.add("abcdefg");
            }
        } catch (OutOfMemoryError omException) {
            this.hadleException(omException);
        }
    }

    protected void recursion()
    {
        this.recursion();
    }

    protected void hadleException(Throwable throwable)
    {
        System.out.println("------------------------------------------------------------");
        System.out.println(throwable.toString());
        System.out.println();
    }

    protected void noException()
    {
        System.out.println("error, exception not thrown");
    }

}


