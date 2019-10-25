public class distinctTransformation {
        static int findSubsequenceCount(String S, String T)
        {
            int m = T.length();
            int n = S.length();

            // T can't appear as a subsequence in S
            if (m > n)
                return 0;

            // mat[i][j] stores the count of
            // occurrences of T(1..i) in S(1..j).
            int mat[][] = new int[m + 1][n + 1];

            // Initializing first column with
            // all 0s. An emptystring can't have
            // another string as suhsequence
            for (int i = 1; i <= m; i++)
                mat[i][0] = 0;

            // Initializing first row with all 1s.
            // An empty string is subsequence of all.
            for (int j = 0; j <= n; j++)
                mat[0][j] = 1;

            // Fill mat[][] in bottom up manner
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    // If last characters don't match,
                    // then value is same as the value
                    // without last character in S.
                    if (T.charAt(i - 1) != S.charAt(j - 1))
                        mat[i][j] = mat[i][j - 1];

                        // Else value is obtained considering two cases.
                        // a) All substrings without last character in S
                        // b) All substrings without last characters in
                        // both. // c) all living thing
                    else
                        mat[i][j] = mat[i][j - 1] + mat[i - 1][j - 1];
                }
            }

        /* uncomment this to print matrix mat
        for (int i = 1; i <= m; i++, cout << endl)
            for (int j = 1; j <= n; j++)
                System.out.println ( mat[i][j] +" "); */
            return mat[m][n];
        }

        // Driver code to check above method


    public static int subSequence (String s, String t, int slen, int tlen){
            if (tlen==0)
                return 1;
            else if (slen==0)
                return 0;
            else if (s.charAt(slen-1)!=t.charAt(tlen-1)) {
                s = s.substring(0,slen - 1);
                return subSequence(s,t,slen-1,tlen);
            }
            else {
                return subSequence(s,t,slen-1,tlen)+subSequence(s,t,slen-1,tlen-1);
            }
    }
        public static void main(String[] args)
        {
            String T = "abccd";
            String S = "abcccd";
            System.out.println(subSequence(S, T,S.length(),T.length()));
        }
    }

