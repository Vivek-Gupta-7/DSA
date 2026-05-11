package DSA.Binary_Search;

public class Leet_744 {
    public static void main(String[] args) {

        char[] letters = {'c','f','j'};
        char target = 'e';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);

    }

    static char nextGreatestLetter(char[] letters, char target) {


        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            // find the middle element

//            int mid = (start+end)/2; // might be possible that (start + end) exceed the range of integer

            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            }

            else  {

                start = mid + 1;
            }
        }



        //ans not found
        return letters[start % letters.length];// need to go through this agian
    }







}
