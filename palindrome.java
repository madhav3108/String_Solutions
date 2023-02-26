public class palindrome {
    public static void main(String[] args) {
        String str1="MADAM";
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2+=str1.charAt(i);
        }
        System.out.println(str2);
        if(str1.equals(str2)){
            System.out.println("Gien string is Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
    
}
