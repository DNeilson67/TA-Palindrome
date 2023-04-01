public class verifyPalindrome extends ListStack{
    public boolean stack(String value, ListStack stack, ListStack stackSample, ListStack stackReversed) {
        int i = 0;
        boolean isPalindrome = true;
        char[] valueArray = value.toCharArray();
        while (i < valueArray.length) {
            stack.push(valueArray[i]);
            stackSample.push(valueArray[i]);
            i++;
        }
        for (i = 0; i < valueArray.length; i++) {
            stackReversed.push(stackSample.peek());
            stackSample.pop();
        }
        for (i = 0; i < valueArray.length; i++) {
            if (stackReversed.peek() != stack.peek()) {
                isPalindrome = false;
            }
            stackReversed.pop();
            stack.pop();
        }
        return isPalindrome;
    }
}
