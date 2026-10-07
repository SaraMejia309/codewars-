public class FindOutlier {

    static int find(int[] integers) {
        int evenCount = 0;
        
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                evenCount++;
            }
        }
        
        boolean shouldFindOdd = evenCount >= 2;
        
        for (int n : integers) {
            boolean isOdd = n % 2 != 0;
            if (shouldFindOdd && isOdd) {
                return n;
            }
            if (!shouldFindOdd && !isOdd) {
                return n;
            }
        }
        
        return 0;
    }
}

