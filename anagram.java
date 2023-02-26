import java.util.Arrays;

// anangram = if we from a word from same alphabet which is used in te character is known as anamgram
// e.g: keep        peek

// steps to solve anagram
//      1-        remove space
//                alphabets seen like Madhav Thakur->MadhavThakur
//      2-        convert to lower case
//      3-        convert to an array
//      4-        sort and compare array

public class anagram {
    public static void main(String[] args) {
        String str1="School Master";
        String str2="The Classroom Java";

        str1=str1.replace(" ", "");     // remove space
        str2=str2.replace(" ", "");

        str1=str1.toLowerCase();                            // convert to lower case
        str2=str2.toLowerCase();

        char arr1[]=str1.toCharArray();                     // create an array of character
        char arr2[]=str2.toCharArray();

        Arrays.sort(arr1);                                  // sort an array
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){                      // comapre an array
            System.out.println("It is an anagram");

        }
        else{
            System.out.println("Its is not an anagram");
        }
        
        
    }
    
}
