package me.alex.tryitout.worktries;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Executors;

/**
 * Hello Lambda!
 *
 */
public class LambdaMain
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Lambda!" );

        // Code is written in an anonymous class
        // Code is passed to other code to run later
        // Could be run in another context(thread)
        // Effectively passed code as a parameter
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                Comparator<String> comparator = new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return Integer.compare(o1.length(), o2.length());
                    }
                };

                String[] testString = {"ccc", "a", "bb"};

                Arrays.sort(testString, comparator);

                for (String test : testString) {
                    System.out.println(test);
                }

                return;
            }
        };

        Executors.newSingleThreadExecutor().execute(r1);

        // So, when a class implements a single, abstract method, you can make it a lambda.
        // Just name your object, add an =, put the necessary args, if any, in the parens,
        // draw a right arrow, and implement your code. In this instance we're overriding run,
        // which takes no args and returns void
        Runnable r2 = () -> {
            // Technically you don't need a lambda here, but it would be compare, which would take
            // two generics of the same type and return an int.
            //Comparator<String> comparator = (o1, o2) -> Integer.compare(o1.length(), o2.length());
            Comparator<String> comparator = Comparator.comparingInt(String::length);

            String[] testString = {"fff", "d", "ee"};

            Arrays.sort(testString, comparator);

            for (String test : testString) {
                System.out.println(test);
            }

            System.exit(0);
        };

        Executors.newSingleThreadExecutor().execute(r2);

    }
}
