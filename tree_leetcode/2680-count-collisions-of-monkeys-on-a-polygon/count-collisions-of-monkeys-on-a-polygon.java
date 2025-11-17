class Solution {
    private final int MOD = 1_000_000_007;

    public int monkeyMove(int n) {
        // Step 1: Compute 2^n % MOD using fast modular exponentiation
        long totalWays = modPow(2, n, MOD);

        // Step 2: Subtract the 2 safe non-collision ways (all clockwise / counter-clockwise)
        long collisions = (totalWays - 2 + MOD) % MOD;

        return (int) collisions;
    }

    // Fast modular exponentiation
    private long modPow(long base, long exp, int mod) {
        long result = 1;
        long x = base % mod;

        while (exp > 0) {
            if ((exp & 1) == 1) { // If current bit is 1
                result = (result * x) % mod;
            }
            x = (x * x) % mod;
            exp >>= 1; // Divide exponent by 2
        }

        return result;
    }
}
