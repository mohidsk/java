package learningjava;
/*
Method	Description:-
1. length():-       	            Returns the length of String name. (5 in this case)
2. toLowerCase():-      	Converts all the characters of the string to the lower case letters.
3. toUpperCase():-      	Converts all the characters of the string to the upper case letters.
4. trim():-                     	Returns a new String after removing all the leading and trailing spaces from the original string.
5. substring(int start):-	Returns a substring from start to the end. Substring(3) returns “ry”. [Note that indexing starts from 0]

6. substring(int start, int end):-  	Returns a substring from the start index to the end index. The start index is included, and the end is excluded.
7. replace(‘r’, ‘p’):-      	Returns a new string after replacing r with p. Happy is returned in this case. (This method takes char as argument)
8. startsWith(“Ha”):-       	Returns true if the name starts with the string “Ha”. (True in this case)
9. endsWith(“ry”):-     	Returns true if the name ends with the string “ry”. (True in this case)
10. charAt(2):-         	Returns the character at a given index position. (r in this case)
11. indexOf(“s”)	:-      Returns the index of the first occurrence of the specified character in the given string.
12. lastIndexOf(“r”)	:-      Returns the last index of the specified character from the given string. (3 in this case)
13. equals(“Harry”)	:-      Returns true if the given string is equal to “Harry” false otherwise [Case sensitive]
14.equalsIgnoreCase(“harry”)	:-      Returns true if two strings are equal, ignoring the case of characters.
*/

public class strings_usingMethods {
    public static void main(String[] args) {
        String name = "Mohid";
        //String name = new String("mohid");

        //Length of the string method
        int  lenname = name.length() ;
        System.out.println("the length of the name is:-");
        System.out.println(lenname);

        //tolowercase and touppercase
        String lowname = name.toLowerCase();
        String  upname = name.toUpperCase();
        System.out.println("after changing the lower case");
        System.out.println(lowname);
        System.out.println("after changing the upper case");
        System.out.println(upname);

        //trim() it uses to delite the spaces
        String trname =  "          mohid           ";
        String trimname = trname.trim();
        System.out.println("after triming the name:-");
        System.out.println(trimname);

        //substring :- it uses to print the charecters from the given index
        String subststring = name.substring(2);
        String longsubstring = name.substring(2, 4);
        System.out.println("the charecter by the index is :-");
        System.out.println(subststring);
        System.out.println("the charecter from the two index's is :-");
        System.out.println(longsubstring);

        //replace() :- it uses to replace the char or any word in the place of specific index
        String repstring = name.replace('M', 'h' );
        String repmorestring = name.replace("M","sadiq");
        System.out.println("after replaing a chrecter from one charecter:-");
        System.out.println(repstring);
        System.out.println("after replacing a word from the one charecter:-");
        System.out.println(repmorestring);

        //starts with and ends with it is booleon function if it true it shows true else it shows false
        System.out.println("start with function :-");
        System.out.println(name.startsWith("Mo"));
        System.out.println("ends with function:-");
        System.out.println(name.endsWith("id"));

        //charat function it uses to print the single carecter by the index
        System.out.println("by the charAt function:-");
        System.out.println(name.charAt(3));

        //indexof function it show first occerence of letter in the word if they are multiple of same latters
        System.out.println("By the indexof function:-");
        int indexofstring = name.indexOf("h");
        System.out.println(indexofstring);
        //lastindexof this function checks the letter from last index
        System.out.println("by the lastindexof function:-");
        int lastindexofstring = name.lastIndexOf("h");
        System.out.println(lastindexofstring);


        //equal fundtion it is also boolion which show if the given name is equal to our given name or  it will not ignore the  it my lowercare or uppercase
        //equalignorecase it is also a boolion function which show if the given is equal to our given name or not it ignore the  it my lowercare or uppercase
        System.out.println("by the equal function:-" );
        System.out.println(name.equals("Mohid"));
        System.out.println("by the equalignorecase function:-");
        System.out.println(name.equalsIgnoreCase("MoHiD"));
    }
}
