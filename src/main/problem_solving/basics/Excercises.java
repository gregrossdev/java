package main.problem_solving.basics;

public class Excercises {

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

}
