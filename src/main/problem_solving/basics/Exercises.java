package main.problem_solving.basics;

import java.util.ArrayList;
import java.util.List;

public class Exercises {

    static class Expressions {
        /*
     We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
     We are in trouble if they are both smiling or if neither of them is smiling. Return true if we
     are in trouble.

     TDD:
     monkeyTrouble(true, true) → true
     monkeyTrouble(false, false) → true
     monkeyTrouble(true, false) → false
     */
        public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
            boolean areWeInTrouble = (aSmile && bSmile) || (!aSmile && !bSmile);
            //boolean areWeInTrouble = !(aSmile ^ bSmile); <-- Another alternative

            return areWeInTrouble;
        }

        /*
         We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
         We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if
         we are in trouble.

         TDD:
         parrotTrouble(true, 6) → true
         parrotTrouble(true, 7) → false
         parrotTrouble(false, 6) → false
         */
        public boolean parrotTrouble(boolean talking, int hour) {
            boolean areWeInTrouble = talking && (hour < 7 || hour > 20);
            return areWeInTrouble;
        }

        /*
         When squirrels get together for a party, they like to have cigars. A squirrel party is successful
         when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case
         there is no upper bound on the number of cigars. Return true if the party with the given values is
         successful, or false otherwise.

         TDD:
         cigarParty(30, false) → false
         cigarParty(50, false) → true
         cigarParty(70, true) → true
         */
        public boolean cigarParty(int cigars, boolean isWeekend) {
            int minimumCigarCount = 40;
            int maximumCigarCount = 60;

            boolean hasMinimumCigars = cigars >= minimumCigarCount;
            boolean withinMaxRangeOfCigars = (!isWeekend && cigars <= maximumCigarCount) || isWeekend;
            boolean successful = hasMinimumCigars && withinMaxRangeOfCigars;

            return successful;
        }

        /*
         The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature
         is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given
         an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
         squirrelPlay(70, false) → true
         squirrelPlay(95, false) → false
         squirrelPlay(95, true) → true
         */
        public boolean squirrelPlay(int temp, boolean isSummer) {
            int upperTempRange = isSummer ? 100 : 90;
            int lowerTempRange = 60;

            boolean tempInRange = lowerTempRange <= temp && temp <= upperTempRange;

            return tempInRange;
        }
    }

    static class Loops {
        /*
         Given an array of ints length 3, return the sum of all the elements.

         TDD:
         sum3([1, 2, 3]) → 6
         sum3([5, 11, 2]) → 18
         sum3([7, 0, 0]) → 7
         */
        public int sum3(int[] nums) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }

            return sum;
        }
    }

    static class Objects {

        static class Strings {
            /*
             Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
             TDD:
             helloName("Bob") → "Hello Bob!"
             helloName("Alice") → "Hello Alice!"
             helloName("X") → "Hello X!"
            */
            public String helloName(String name) {
                return "Hello " + name + "!";
            }

            /*
             The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example,
             the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the
             HTML string with tags around the word, e.g. "<i>Yay</i>".
             TDD:
             makeTags("i", "Yay") → "<i>Yay</i>"
             makeTags("i", "Hello") → "<i>Hello</i>"
             makeTags("cite", "Yay") → "<cite>Yay</cite>"
             */
            public String makeTags(String tag, String word) {
                return "<" + tag + ">" + word + "</" + tag + ">";
            }

            /*
             Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
             TDD:
             firstHalf("WooHoo") → "Woo"
             firstHalf("HelloThere") → "Hello"
             firstHalf("abcdef") → "abc"
             */
            public String firstHalf(String str) {
                return str.substring(0, str.length() / 2);
            }

            /*
             Given a string, return a version without the first and last char, so "Hello" yields "ell".
             The string length will be at least 2.
             TDD:
             withoutEnd("Hello") → "ell"
             withoutEnd("java") → "av"
             withoutEnd("coding") → "odin"
             */
            public String withoutEnd(String str) {
                return str.substring(1, str.length() - 1);
            }

            /*
             Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string
             on the outside and the longer string on the inside. The strings will not be the same length, but
             they may be empty (length 0).
             TDD:
             comboString("Hello", "hi") → "hiHellohi"
             comboString("hi", "Hello") → "hiHellohi"
             comboString("aaa", "b") → "baaab"
             */
            public String comboString(String a, String b) {
                if (a.length() > b.length()) {
                    return b + a + b;
                }
                return a + b + a;
            }

            /*
             Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
             The string length will be at least 3.
             TDD:
             middleThree("Candy") → "and"
             middleThree("and") → "and"
             middleThree("solving") → "lvi"
             */
            public String middleThree(String str) {
                int len = str.length();
                if (len == 3) {
                    return str;
                }
                return str.substring(len / 2 - 1, len / 2 + 2);
            }

            /*
             Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or
             whatever is there if the string is less than length 3. Return n copies of the front;
             TDD:
             frontTimes("Chocolate", 2) → "ChoCho"
             frontTimes("Chocolate", 3) → "ChoChoCho"
             frontTimes("Abc", 3) → "AbcAbcAbc"
             */
            public String frontTimes(String str, int n) {
                String result = "";
                if (str.length() <= 3) {
                    for (int i = 0; i < n; i++) {
                        result += str;
                    }
                } else {
                    for (int i = 0; i < n; i++) {
                        result += str.substring(0, 3);
                    }
                }
                return result;
            }

            /*
             Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
             TDD:
             countXX("abcxx") → 1
             countXX("xxx") → 2
             countXX("xxxx") → 3
             */
            public int countXX(String str) {
                int count = 0;
                for (int i = 0; i < str.length() - 1; i++) {
                    if (str.substring(i, i + 2).equals("xx")) {
                        count++;
                    }
                }
                return count;
            }

            /*
             Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed.
             The "yak" strings will not overlap.
             TDD:
             stringYak("yakpak") → "pak"
             stringYak("pakyak") → "pak"
             stringYak("yak123ya") → "123ya"
             */
            public String stringYak(String str) {
                int posYak = str.indexOf("yak");
                while (posYak != -1) {
                    str = str.substring(0, posYak) + str.substring(posYak + 3);
                    posYak = str.indexOf("yak");
                }
                return str;
            }
        }

        static class Lists {
            /*
             Given an array of Strings, return an ArrayList containing the same Strings in the same order
             TDD:
             array2List( {"Apple", "Orange", "Banana"} )  ->  ["Apple", "Orange", "Banana"]
             array2List( {"Red", "Orange", "Yellow"} )  ->  ["Red", "Orange", "Yellow"]
             array2List( {"Left", "Right", "Forward", "Back"} )  ->  ["Left", "Right", "Forward", "Back"]
             */
            public List<String> array2List(String[] stringArray) {
                List<String> stringList = new ArrayList<>();
                for (int i = 0; i < stringArray.length; i++) {
                    stringList.add(stringArray[i]);
                }
                return stringList;
            }

            /*
             Given a list of Strings, return an array containing the same Strings in the same order
             TDD:
             list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
             list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
             list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
             */
            public String[] list2Array(List<String> stringList) {
                String[] stringArray = new String[stringList.size()];
                for (int i = 0; i < stringList.size(); i++) {
                    stringArray[i] = stringList.get(i);
                }
                return stringArray;
            }

            /*
             Given an array of Strings, return an ArrayList containing the same Strings in the same order
             except for any words that contain exactly 4 characters.
             TDD:
             no4LetterWords( {"Train", "Boat", "Car"} )  ->  ["Train", "Car"]
             no4LetterWords( {"Red", "White", "Blue"} )  ->  ["Red", "White"]
             no4LetterWords( {"Jack", "Jill", "Jane", "John", "Jim"} )  ->  ["Jim"]
             */
            public List<String> no4LetterWords(String[] stringArray) {
                List<String> no4LetterWordList = new ArrayList<>();
                for (int i = 0; i < stringArray.length; i++) {
                    if (stringArray[i].length() != 4) {
                        no4LetterWordList.add(stringArray[i]);
                    }
                }
                return no4LetterWordList;
            }

            /*
             Given an array of ints, divide each int by 2, and return an ArrayList of Doubles.
             TDD:
             arrayInt2ListDouble( {5, 8, 11, 200, 97} ) -> [2.5, 4.0, 5.5, 100, 48.5]
             arrayInt2ListDouble( {745, 23, 44, 9017, 6} ) -> [372.5, 11.5, 22, 4508.5, 3]
             arrayInt2ListDouble( {84, 99, 3285, 13, 877} ) -> [42, 49.5, 1642.5, 6.5, 438.5]
             */
            public List<Double> arrayInt2ListDouble(int[] intArray) {
                List<Double> doubleList = new ArrayList<>();
                for (int i = 0; i < intArray.length; i++) {
                    doubleList.add(intArray[i] / 2.0);
                }
                return doubleList;
            }

            /*
             Given a List of Integers, return the largest value.
             TDD:
             findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) -> 33333
             findLargest( [987, 1234, 9381, 731, 43718, 8932] ) -> 43718
             findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) -> 81238
             */
            public Integer findLargest(List<Integer> integerList) {
                int largestInt = 0;
                for (Integer currentInteger : integerList) {
                    if (currentInteger > largestInt) {
                        largestInt = currentInteger;
                    }
                }
                return Integer.valueOf(largestInt);
            }

            /*
             Given an array of Integers, return a List of Integers containing just the odd values.
             TDD:
             oddOnly( {112, 201, 774, 92, 9, 83, 41872} ) -> [201, 9, 83]
             oddOnly( {1143, 555, 7, 1772, 9953, 643} ) -> [1143, 555, 7, 9953, 643]
             oddOnly( {734, 233, 782, 811, 3, 9999} ) -> [233, 811, 3, 9999]
             */
            public List<Integer> oddOnly(Integer[] integerArray) {
                List<Integer> oddOnlyList = new ArrayList<>();
                for (Integer currentInteger : integerArray) {
                    if (currentInteger % 2 != 0) {
                        oddOnlyList.add(currentInteger);
                    }
                }
                return oddOnlyList;
            }

            /*
             Given a List of Integers, and an int value, return true if the int value appears two or more times in
             the list.
             TDD:
             foundIntTwice( [5, 7, 9, 5, 11], 5 ) -> true
             foundIntTwice( [6, 8, 10, 11, 13], 8 -> false
             foundIntTwice( [9, 23, 44, 2, 88, 44], 44) -> true
             */
            public boolean foundIntTwice(List<Integer> integerList, int intToFind) {
                int foundCount = 0;
                for (Integer currentInteger : integerList) {
                    if (currentInteger == intToFind) {
                        if (foundCount >= 1) {
                            //No point continuing, we just found the second occurrence.
                            return true;
                        }
                        foundCount++;
                    }
                }
                return false;
            }

            /*
             Given an array of Integers, return a List that contains the same Integers (as Strings). Except any multiple of 3
            must be replaced by the String "Fizz", any multiple of 5 must be replaced by the String "Buzz",
            and any multiple of both 3 and 5 must be replaced by the String "FizzBuzz."
            ** INTERVIEW QUESTION **

            TDD:
            fizzBuzzList( {1, 2, 3} )  ->  ["1", "2", "Fizz"]
            fizzBuzzList( {4, 5, 6} )  ->  ["4", "Buzz", "Fizz"]
            fizzBuzzList( {7, 8, 9, 10, 11, 12, 13, 14, 15} )  ->  ["7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]

            HINT: To convert an Integer x to a String, you can use x.toString() in your code. For example, if x = 1, then x.toString() returns "1."
             */
            public List<String> fizzBuzzList(Integer[] integerArray) {
                List<String> stringList = new ArrayList<>();
                boolean multipleOfThree;
                boolean multipleOfFive;
                for (Integer currentInteger : integerArray) {
                    multipleOfThree = currentInteger % 3 == 0;
                    multipleOfFive = currentInteger % 5 == 0;
                    if (multipleOfThree && multipleOfFive) {
                        stringList.add(new String("FizzBuzz"));
                    } else if (multipleOfThree) {
                        stringList.add(new String("Fizz"));
                    } else if (multipleOfFive) {
                        stringList.add(new String("Buzz"));
                    } else {
                        stringList.add(currentInteger.toString());
                    }
                }
                return stringList;
            }

            /*
             Given two lists of Integers, interleave them beginning with the first element in the first list followed
             by the first element of the second. Continue interleaving the elements until all elements have been interwoven.
             Return the new list. If the lists are of unequal lengths, simply attach the remaining elements of the longer
             list to the new list before returning it.
             TDD:
             interleaveLists( [1, 2, 3], [4, 5, 6] )  ->  [1, 4, 2, 5, 3, 6]
             */
            public List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo) {
                int minListLength = Math.min(listOne.size(), listTwo.size());
                List<Integer> output = new ArrayList<>();

                for (int i = 0; i < minListLength; i++) {
                    output.add(listOne.get(i));
                    output.add(listTwo.get(i));
                }

                // Add remainder Logic
                List<Integer> longerList = (listOne.size() > listTwo.size()) ? listOne : listTwo;
                for (int i = minListLength; i < longerList.size(); i++) {
                    output.add(longerList.get(i));
                }

                return output;
            }
        }


    }

}
