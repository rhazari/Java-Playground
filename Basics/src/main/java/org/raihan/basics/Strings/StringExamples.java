package org.raihan.basics.Strings;

import java.util.Arrays;

public class StringExamples {
    public static void main(String[] args){
        // create 3 strings
        String first = "java programming";
        String second = "java programming";
        String third = "python programming";

        //Compare Strings
        {
            // compare first and second strings
            boolean result1 = first.equals(second);
            System.out.println("Strings first and second are equal: " + result1);

            // compare first and third strings
            boolean result2 = first.equals(third);
            System.out.println("Strings first and third are equal: " + result2);
        }

        //Concat
        {
            // join two strings
            String joinedString = first.concat(second);
            System.out.println("Joined String: " + joinedString);
        }

        //Contains
        {
            String str1 = "Java String contains()";
            // check if str1 contains "Java"
            boolean result = str1.contains("Java");
            System.out.println(result);

            // check if str1 contains "Python"
            result = str1.contains("Python");
            System.out.println(result);  // false
        }

        //Split
        {
            String text = "Java is a fun programming language";
            // split string from space
            String[] result1 = text.split(" ");
            System.out.print("result = " + Arrays.toString(result1));
            System.out.println();

            // Limit parameter indicates how many substrings to return
            String[] result2 = text.split(" ", 3);
            System.out.print("result = " + Arrays.toString(result2));

            // split at character
            String vowels = "a+e+f";
            // splitting the string at "+"
            String[] result = vowels.split("\\+");
            // converting array to string and printing it
            System.out.println("result = " + Arrays.toString(result));
        }

        // CompareTo
        {
            // compares 2 strings lexicographically
            String str1 = "Learn Java";
            String str2 = "Learn Kolin";
            int result;
            // comparing str1 with str2
            result = str1.compareTo(str2);
            System.out.println(result);

            // Ignore Case when comparing
            String str3 = "Learn Java";
            String str4 = "learn java";

            // comparing str1 with str2
            result = str3.compareToIgnoreCase(str4);
            System.out.println(result); //
        }

        // Replace
        {
            // Character replacement
            String str1 = "abc cba";
            // all occurrences of 'a' is replaced with 'z'
            System.out.println(str1.replace('a', 'z'));  // zbc cbz

            // String replacement
            String str2 = "C++ Programming";
            // all occurrences of "C++" is replaced with "Java"
            System.out.println(str2.replace("C++", "Java"));  // Java Programming

            String str3 = "aabbaaac";
            String str4 = "Learn223Java55@";
            // regex for sequence of digits
            String regex = "\\d+";

            // all occurrences of "aa" is replaceAll with "zz"
            System.out.println(str3.replaceAll("aa", "zz"));  // zzbbzzac

            // replace a digit or sequence of digits with a whitespace
            System.out.println(str4.replaceAll(regex, " "));  // Learn Java @
        }

        //Substring
        {
            String str1 = "java is fun";
            // extract substring from index 0 to 3
            System.out.println(str1.substring(0, 4));
        }

        //IndexOf
        {
            String str1 = "Learn Java";
            int result;

            // the first occurrence of 'a' is returned
            result = str1.indexOf('a');
            System.out.println(result); // 2

            // Search from the index param as the starting point
            result = str1.indexOf('a', 5);
            System.out.println(result); // 2
        }

        //Trim
        {
            // Removes leading and trailing whitespaces
            String str1 = "     Learn   Java Programming ";
            String str2 = "Learn\nJava Programming\n\n   ";

            System.out.println(str1.trim());
            System.out.println(str2.trim());
        }

        //StartsWith
        {
            String str = "JavaScript";

            // checks if "JavaScript" starts with "Java"
            System.out.println(str.startsWith("Java"));
        }

        //EndsWith
        {
            String str = "Java Programming";

            System.out.println(str.endsWith("Programming")); // true
        }

        //Interning
        {
            String str1 = new String("xyz");
            String str2 = new String("xyz");

            // str1 and str2 doesn't share the same memory pool
            System.out.println(str1 == str2); // false

            // using the intern() method
            // now both str1 and str2 share the same memory pool
            str1 = str1.intern();
            str2 = str2.intern();

            System.out.println(str1 == str2); // true
        }

        //Join
        {
            String str1 = "I";
            String str2 = "love";
            String str3 = "Java";

            // join strings with space between them
            String joinedStr = String.join(" ", str1, str2, str3);
            System.out.println(joinedStr);
        }

        //toCharArray
        {
            String str = "Java Programming";

            // creating a char array
            char[] result = str.toCharArray();
            System.out.println(result); // Java Programming
        }
    }
}
