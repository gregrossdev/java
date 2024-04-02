package main.problem_solving.basics;

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

}
