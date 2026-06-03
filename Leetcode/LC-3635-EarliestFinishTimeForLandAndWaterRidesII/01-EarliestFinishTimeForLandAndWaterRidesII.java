class Solution {

    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        int minLF = Integer.MAX_VALUE;
        int minWF = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++) {
            minLF = Math.min(
                minLF,
                landStartTime[i] + landDuration[i]
            );
        }

        for (int j = 0; j < waterStartTime.length; j++) {
            ans = Math.min(
                ans,
                Math.max(minLF, waterStartTime[j]) + waterDuration[j]
            );
        }

        for (int j = 0; j < waterStartTime.length; j++) {
            minWF = Math.min(
                minWF,
                waterStartTime[j] + waterDuration[j]
            );
        }

        for (int i = 0; i < landStartTime.length; i++) {
            ans = Math.min(
                ans,
                Math.max(minWF, landStartTime[i]) + landDuration[i]
            );
        }

        return ans;
    }
}
