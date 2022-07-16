package by.tms.myproject.lessons11.homework;

import by.tms.myproject.lessons11.homework.util.ExceptionUtils;

import java.io.FileNotFoundException;

public class ExceptionDemo {

    public static void main(String[] args) throws RuntimeException {

        try {
            ExceptionUtils.generationNullPointerException(null);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }


        try {
            ExceptionUtils.generationArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


        try {
            ExceptionUtils.generationIllegalAccessError(null);
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            ExceptionUtils.getFileInputStream();
        } catch (MyClassException e) {
            e.printStackTrace();

        }


        try {
            ExceptionUtils.methodThrowExceptions();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }


        try {
            ExceptionUtils.twoException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("finally");
        }

    }
}
