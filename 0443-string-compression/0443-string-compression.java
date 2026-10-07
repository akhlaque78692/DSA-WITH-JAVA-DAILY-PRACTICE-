class Solution {
    public int compress(char[] arr) {
        int i = 0;
        int j = 0;
        int index = 0;

        while (j < arr.length) {
            int count = 0;

            while (j < arr.length && arr[j] == arr[i]) {
                count++;
                j++;
            }

            arr[index++] = arr[i];

            if (count > 1) {
                String num = String.valueOf(count);

                for (int k = 0; k < num.length(); k++) {
                    arr[index++] = num.charAt(k);
                }
            }

            if (j < arr.length) {
                i = j;
            }
        }

        return index;
    }
}