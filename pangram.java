//pangram - all the alphabets are include whether it is in lower case or upper case
// approach
// 1 - remove space
// 2 - convert to lower case or upper case
// 3 - covert to char an array
// 4 - create an empty array with the alphabet size that is 26

public class pangram {
    public static void main(String[] args) {

        boolean flag = false;
        String str = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        str = str.replace(" ", "");
        char[] ch = str.toCharArray();

        int ar[] = new int[26];

        for (int i = 0; i < ch.length; i++) {
            ar[ch[i] - 65]++;
        }
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0) {
                System.out.println("Its not pangram");
                flag = true;
            }
        }

        if (flag == false) {
            System.out.println("Its pangram");
        }

    }

}

// 97