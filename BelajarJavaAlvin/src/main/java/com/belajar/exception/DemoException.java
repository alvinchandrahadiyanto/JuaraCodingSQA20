package com.belajar.exception;

public class DemoException {
    static int y;

    static int itung(int x, int y) throws ArithmeticException, AssertionError {
        if (y == 0) {
            throw new AssertionError("Upps ulala");
        }

        return x / y;
    }

    public static void main(String[] args) {
        try {
            System.out.println(itung(10, 0));
        } catch (NullPointerException err) {
            System.out.println("ADA ERROR (nullpointer): ");
            System.out.println(err);
        } catch (ArithmeticException err) {
            System.out.println("ADA ERROR (arithmetic): ");
            System.out.println(err);
        } catch (Exception err) {
            System.out.println("ERROR KEDETEKSI");
            System.out.println(err);
        } catch (Error err) {
            System.out.println("ERROR ASSERT");
            System.out.println(err);
        }
        finally {
            System.out.println("FINAL");
        }
    }
}