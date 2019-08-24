/*
 * Java has 8 build in primative types
 *
 * Float and Double are use for decimals
 *
 * Byte, short, int, long are use for numbers without decimal points
 *
 * Each nummeric type use twice as many bits as the smaller similar type. Short use twice as many bits as byte does
 *
 * a byte is 8 bits and each bit has two possible values ( 0 or 1) 2(8) 2 x 2 = 4 x 2 = 8 x 2 = 16 x 2 = 32 x 2 = 64 x 2 = 128 x 2 = 256
 *
 * the number of bits is used by Java wehn it figures out how much memory to reserve for your variable
 *
 * Numeric primitives: when a number is present in the code, it is called a literal
 *
 *
 */

package basics.ReferencesAndPrimitives;

public class PrimativeTypes {

    public static void main(String[] args) {

        // true or false
        boolean primativeBoolean = false;
        System.out.println(primativeBoolean);

        // byte can hold a value from -128 and 127 (since 0 is include java take it away from the positive site)
        // 8 bit
        byte primativeByte = 123;
        System.out.println(primativeByte);
        System.out.println(Byte.MAX_VALUE);

        // 16 bit
        short primativeShort = 123;
        System.out.println(primativeShort);
        System.out.println(Short.MAX_VALUE);

        // 32 bit
        int primativeInt = 123;
        System.out.println(primativeInt);
        System.out.println("Max value int " + Integer.MAX_VALUE);

        // 64 bit
        long primativeLong = 123;
        System.out.println(primativeLong);
        System.out.println("Max value long " + Long.MAX_VALUE);

        // requires the letter f so Java knows it is a float
        // 32 bit
        float primativeFloat = 123.45f;
        System.out.println(primativeFloat);

        // 64 bit
        double primativeDouble = 123.456;
        System.out.println(primativeDouble);

        // 16 bit
        char primativeChar = 'a';
        System.out.println(primativeChar);


        // example

//        long max = 3123456789; // DOES NOT COMPILE, compiler thinks it is an integer and max value integer is 2147483647
        long max1 = 3123456789L; // DOES COMPILE since whe tell it is a Long with the letter L behind the value


        // Other formats

        // Octal (digits 0-7), which uses the number 0 as a prefix, for example 017
        System.out.println(017); // prints 15

        // Hexadecimal (digits 0-9 and letters A-F), which uses the number 0 followed by x or X as a prefix. For example 0xFF
        System.out.println(0xFF); // prints 255

        // binary (digits 0-1) which uses the number 0 followed by b O B as prefix. For example 0b10
        System.out.println(0b10); // prints 2


        // Adding underscores to numbers to make them easier to read
        // You can add underscores anywhere except at the beginning of a literal, the end of a literal, right before a decimal point or right after a decimal point

        int million1 = 1000000;
        int million2 = 1_000_000;

//       double notAtStart = _1000.00; // DOES NOT COMPILE
//       double notAtEnd = 1000.00_; // DOES NOT COMPILE
//       double notByDecimal 1000_.00; // DOES NOT COMPILE

    }
}




