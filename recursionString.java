import java.util.Scanner;
public class recursionString {
//    static String removeLetter(String a ,char letter) {
//        if (a.isEmpty())
//            return "";
//        String ans = removeLetter(a.substring(1,a.length()), letter);
//        if (a.charAt(0) != letter) {
//            return a.charAt(0) + ans;
//        }
//        return ans;
//    }
//    static String reverseString(String s){
//        if (s.isEmpty())
//            return "";
//        String ans = reverseString(s.substring(1));
//        ans+= s.charAt(0);
//        return ans;


    static boolean palindromeCheck(String s){
        if ((s.length()==3 && s.charAt(0)==s.charAt(2)) || (s.length()==2 && s.charAt(0)==s.charAt(1))){
            return true;
        }

        if (s.length()>3&&palindromeCheck(s.substring(1,s.length()-1))){
            return true;
        }
        return false;
    }
    static boolean palindromeCheck2(String s,int l , int r){
        if (l>r)
            return true;
        if (s.charAt(l)!=s.charAt(r))
            return false;
        return palindromeCheck2(s,l+1,r-1);

    }





    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String a = get.nextLine();
//        System.out.print(a.substring(1,1));
//        System.out.print("Enter a letter : ");
//        char letter = get.next().charAt(0);
        System.out.println("After removal of  the string is "+palindromeCheck2(a,0,a.length()-1));

            }

        }




