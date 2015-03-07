/**
* Test whether or not an input String is a Palindrome
*/
public boolean isPalindrome(String input) {

  List<Character> inputInList = new ArrayList();
  for (char c : input.toCharArray())
    inputInList.add(c);

  List<Character> reversedList = new ArrayList(inputInList);
  Collections.reverse(reversedList);

  return inputInList.equals(reversedList);
}
