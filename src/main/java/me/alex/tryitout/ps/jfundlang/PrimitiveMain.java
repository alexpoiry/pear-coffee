package me.alex.tryitout.ps.jfundlang;

public class PrimitiveMain {
  public static void main(String... args) {
    //Programs are made up of statements
    //Whitespace is mostly ignored in Java
    //Variable is named data storage
    //Java is strongly typed
    //Variables can be modified
    //Variable names can be alphanumeric with $ or _, anything in UTF-8 charset. First letter cannot be a number
    //Java primitives are stored and copied by value
    //4 TYPES of primitives: integer, floating point, character, and boolean.
    //Integers are byte, short, int, long. They are unsigned 8, 16, 32, and 64 bits respectively
    //Integer literals in Java are always ints, unless otherwise specified. Append 'L' to get a long.
    //Floating points are float and double. They are 32 and 64 bits respectively
    //Append 'f' to floats, and 'd' to doubles.
    //Chars are assigned between single quotes. 'u' or use unicode notation, e.g., '\u00DA'

    System.out.println("Min and max values of primitive data types:");
    float fmin = Float.NEGATIVE_INFINITY;
    float fmax = Float.POSITIVE_INFINITY;
    System.out.println("long: " + (long)fmin +
            ".." + (long)fmax);
    System.out.println("int: " + (int)fmin +
            ".." + (int)fmax);
    System.out.println("short: " + (short)fmin +
            ".." + (short)fmax);
    System.out.println("char: " + (int)(char)fmin +
            ".." + (int)(char)fmax);
    System.out.println("byte: " + (byte)fmin +
            ".." + (byte)fmax);
    System.out.println();

    int preVal = 5;
    System.out.print("Prefix incr value: ");
    System.out.print(++preVal + ", and after: ");
    System.out.println(preVal);
    System.out.println();

    int postVal = 5;
    System.out.print("Postfix incr value: ");
    System.out.print(postVal++ + ", and after: ");
    System.out.println(postVal);
    System.out.println();

    //Operator Precedence, evaluated left-to-right, overridden with parens, nested parens evaluated from inside out
    //Postfix         x++ , x--
    //Prefix          ++x , --x
    //Multiplicative  * , / , %
    //Additive        + , -

    //Type Conversion
    //Implicit conversions
    //Implicit type conversions happen when a smaller primative type is assigned to a larger primitive type. No additional action is required.
    //Explicit type conversions require a cast.
    long lVal = 50;
    int iVal = (int)lVal;
    System.out.print("Casting long value 50 to int: ");
    System.out.println(iVal);
    System.out.println();
    //Implicit type conversion in an equation always casts all variables to the largest data sized primitive. If ints and floats are together, ints become floats
    //If you explicitly do a narrowing cast, you may lose data and/or precision

    int tooBigForByte = 500;
    byte tooSmallForInt = (byte) tooBigForByte;
    System.out.print("Casting int value 500 to byte: ");
    System.out.println(tooSmallForInt);
    System.out.print("Binary value of int (before cast): ");
    System.out.println(Integer.toBinaryString(tooBigForByte));
    System.out.print("Binary value of byte (after cast):  ");
    String s1 = String.format("%8s", Integer.toBinaryString(tooSmallForInt & 0xFF)).replace(' ', '0');
    System.out.println(s1);
    System.out.println();

    int stillTooBigForByte = 1012;
    byte stillTooSmallForInt = (byte) stillTooBigForByte;
    System.out.print("Casting int value 1012 to byte: ");
    System.out.println(stillTooSmallForInt);
    System.out.print("Binary value of int (before cast): ");
    System.out.println(Integer.toBinaryString(stillTooBigForByte));
    System.out.print("Binary value of byte (after cast):   ");
    String s2 = String.format("%8s", Integer.toBinaryString(stillTooSmallForInt & 0xFF)).replace(' ', '0');
    System.out.println(s2);
    System.out.println();

    int anotherTooBig = 756;
    byte anotherTooSmall = (byte) anotherTooBig;
    System.out.print("Casting int value 756 to byte: ");
    System.out.println(stillTooSmallForInt);
    System.out.print("Binary value of int (before cast): ");
    System.out.println(Integer.toBinaryString(anotherTooBig));
    System.out.print("Binary value of byte (after cast):   ");
    String s3 = String.format("%8s", Integer.toBinaryString(anotherTooSmall & 0xFF)).replace(' ', '0');
    System.out.println(s3);
    System.out.println();


    int big = 1234567890;
    float approx = big;
    System.out.print("Assign an int 1234567890 to float X, then cast the float to an int Y and subtract X - Y: ");
    System.out.println(big - (int)approx);
    System.out.println();

    int intPlusFloat = 10;
    intPlusFloat += 5.5;
    System.out.print("Int assigned 10 + 5.5 = ");
    System.out.println(intPlusFloat);
    System.out.println();

    System.out.print("Adding 10 + 5.5 as literals = ");
    System.out.println(10 + 5.5);
    System.out.println();

    System.out.println("Examples of outputs from all narrowing operations that loose information:");
    // A narrowing of int to short loses high bits:
    System.out.println("(short)0x12345678==0x" +
            Integer.toHexString((short)0x12345678));
    // An int value too big for byte changes sign and magnitude:
    System.out.println("(byte)255==" + (byte)255);
    // A float value too big to fit gives largest int value:
    System.out.println("(int)1e20f==" + (int)1e20f);
    // A NaN converted to int yields zero:
    System.out.println("(int)NaN==" + (int)Float.NaN);
    // A double value too large for float yields infinity:
    System.out.println("(float)-1e100==" + (float)-1e100);
    // A double value too small for float underflows to zero:
    System.out.println("(float)1e-50==" + (float)1e-50);
    System.out.println();

    //You can declare and assign multiple variables on a single line, e.g.:
    //int i1 = 10, i2 = 4, diff;
  }
}
