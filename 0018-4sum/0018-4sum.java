
class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 2; i++) {

            if(i > 0 && arr[i] == arr[i-1]) {
                continue;
            }

            for(int p = i + 1; p < arr.length - 1; p++) {

                if(p > i + 1 && arr[p] == arr[p-1]) {
                    continue;
                }

                int k = p + 1;
                int j = arr.length - 1;

                while(k < j) {

                    long sum = (long) arr[i] + arr[p] + arr[k] + arr[j];

                    if(sum == target) {

                        List<Integer> list = new ArrayList<>();

                        list.add(arr[i]);
                        list.add(arr[p]);
                        list.add(arr[k]);
                        list.add(arr[j]);

                        ans.add(list);

                        while(k < j && arr[k] == arr[k + 1]) {
                            k++;
                        }

                        while(k < j && arr[j] == arr[j - 1]) {
                            j--;
                        }

                        k++;
                        j--;
                    }
                    else if(sum > target) {
                        j--;
                    }
                    else {
                        k++;
                    }
                }
            }
        }

        return ans;
    }
}
