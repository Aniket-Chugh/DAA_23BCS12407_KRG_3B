class Solution {
    
   
    
    public int minPlatform(int arr[], int dep[]) {
      int n = arr.length;
        
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platform_needed = 1;
        int max_platforms = 1;
        int i = 1; 
        int j = 0; 
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platform_needed++;
                i++;
            } else {
                platform_needed--;
                j++;
            }

            if (platform_needed > max_platforms) {
                max_platforms = platform_needed;
            }
        }

        return max_platforms;
        
        
    }
}
