
//Class string practice
public class StringPractice
{

    //stringPractice object
    static StringPractice stringPractice = new StringPractice();

    //Main method
    public static void main(String[] args)
    {
        stringPractice.concatenateStrings("PHP Exercises and ", "Python Exercises");
        stringPractice.charValue("PHP Exercises and Python Exercises", "and");
        stringPractice.specialSymbol("£30.00 are not equal to £20.00");
        stringPractice.verify("Python Exercises", "Python Exercise");
        stringPractice.caseConsideration("Stephen Edwin King", "Walter Winchell", "stephen edwin king");
        extractNumber("Rajesh34 patel45 2345988London");
        totalLength("example.com");
        startsWith("Red is my favourite color", "Orange is also my favourite color");
        specifiedPosition("The quick brown fox jumps over the lazy dog");
        replaceCharacter("Rajesh Moradia");
    }

    //    nonstatic - Concatenate two strings
    void concatenateStrings(String one, String two)
    {
        System.out.println(one);
        System.out.println(two);
        System.out.println(one + two);

    }

    //    nonstatic - string contain specified sequence of char value
    void charValue(String value1, String value2)
    {
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value1.contains(value2));
    }

    //    nonstatic - to remove special symbol
    void specialSymbol(String old)
    {
        System.out.println(old);
        System.out.println(old.replace("£", " "));
    }

//    nonstatic - check whether a given string ends with another string

    void verify(String main, String submain)
    {
        System.out.println(main.endsWith("se"));
        System.out.println(submain.endsWith("se"));
    }

//    nonstatic - compare strings to each other, ignoring case considerations

    void caseConsideration(String first, String second, String third)
    {
        System.out.println(first.equalsIgnoreCase(second));
        System.out.println(first.equalsIgnoreCase(third));

    }

//    static - extract number from string

    static void extractNumber(String info)
    {
        System.out.println(info.replaceAll("[^0-9]", ""));
    }

//static - length of a string

    static void totalLength(String name)
    {
        System.out.println(name.length());
    }

//    static - check string starts with another string

    static void startsWith(String color01, String color02)
    {
        System.out.println(color01.startsWith("Red"));
        System.out.println(color02.startsWith("Red"));
    }

//   static - get substring of given string at two specified positions

    static void specifiedPosition(String Sentence)
    {
        System.out.println(Sentence.substring(10, 26));
    }

//    static - replace specified characters

    static void replaceCharacter(String Fullname)
    {
        System.out.println(Fullname.replaceAll("a", "T"));
    }

}

