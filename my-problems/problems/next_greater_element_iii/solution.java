class Solution {
    public int nextGreaterElement(int n) {

        char[] numbers = (n + "").toCharArray();

        int i;
        for(i = numbers.length-1; i > 0; i--){
            if(numbers[i-1] < numbers[i]) break;
        }

        if(i == 0) return -1;

        int secondLowIdx = i, low = numbers[i-1];
        for(int j = i+1; j < numbers.length; j++){
            if(numbers[j] > low && numbers[j] <= numbers[secondLowIdx])
                secondLowIdx = j;
        }

        char temp = numbers[i-1];
        numbers[i-1] = numbers[secondLowIdx];
        numbers[secondLowIdx] = temp;

        Arrays.sort(numbers,i,numbers.length);

        long ans = Long.parseLong(new String(numbers));

         return ans <= Integer.MAX_VALUE ? (int) ans : -1;

    }
}