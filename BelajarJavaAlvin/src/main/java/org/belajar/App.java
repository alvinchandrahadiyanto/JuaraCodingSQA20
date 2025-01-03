package org.belajar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        int score = 130;
        int highest = 120;
        if (score > highest) {

            System.out.println("NEW WORLD RECORD!");

        } else if (score < highest + 10) {

            System.out.println("GOOD PERFORMANCE");

        } else {
            System.out.println("AVERAGE PERFORMANCE");

        }
    }
}
