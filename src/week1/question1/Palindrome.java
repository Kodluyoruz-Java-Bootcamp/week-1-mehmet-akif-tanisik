package week1.question1;

public class Palindrome {

    public static void main(String[] args) {

        Palindrome palindrome = new Palindrome();

        palindrome.printChain(palindrome.findLongestChainNumber(10,100));
    }

    /**
     * This method reverse the number digits.
     * Precondition number is greater than 0.
     * @param number is actual number that will be reversed.
     * @return reversed number as long type.
     */
    public long reverseDigits(long number)
    {
        long temp = 0;
        while (number > 0) {
            temp = temp * 10 + number % 10;
            number = number / 10;
        }
        return temp;
    }

    /**
     * This method checks if the given number and the reversed of given number is palindromic or not.
     * reverseDigits() method is used to make the reversed of given number.
     * @param number is actual number that will be checked palindromic status.
     * @return true if the given number equivalent to its reversed, false otherwise
     */
    public boolean isPalindrome(long number)
    {
        return (reverseDigits(number) == number);
    }

    /**
     * This method creates the palindromic result and counts the steps that we need to get this number.
     * @param number is actual number that will be made palindromic result out of this number.
     * @return counter that is the total steps that we need to make palindromic result of given number.
     */
    public int countChains(long number)
    {
        int counter = 0;
        long total;
        while (true){
            long reversed = reverseDigits(number);
            total = number + reversed;
            counter++;

            if (isPalindrome(total)){
                return counter;
            } else {
                number = total;
            }
        }
    }

    /**
     * This method finds the number that will need the longest chain to make palindromic result in boundaries.
     * @param beginIndex the beginning index, inclusive
     * @param endIndex the ending index, inclusive
     * @return the number that will need the longest chain to create palindromic result.
     */
    public int findLongestChainNumber(int beginIndex, int endIndex){

        int longestCounter = 0;
        int actualNumber = 0;

        for (int i = beginIndex; i<=endIndex; i++){
            if (countChains(i)>longestCounter){
                longestCounter = countChains(i);
                actualNumber = i;
            }
        }
        return actualNumber;
    }

    /**
     * Prints a String of steps to create palindromic result of given number.
     * @param number any number that will be chained to create palindromic result.
     */
    public void printChain(long number){
        int longestChain = 0;
        do {
            System.out.println(number + " + " + reverseDigits(number) + " = " + (number + reverseDigits(number)));
            number += reverseDigits(number);
            longestChain++;
        } while (!isPalindrome(number));
        System.out.println("Longest chain: " + longestChain);
    }
}
