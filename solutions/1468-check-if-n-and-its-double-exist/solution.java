class Solution {
    public boolean checkIfExist(int[] arr) {
        int zeroCount = 0;

        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            }
        }
        if (zeroCount >= 2) {
            return true;
        }

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

