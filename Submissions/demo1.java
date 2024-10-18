import java.util.Scanner;

public class demo1 {
    public static String longestCommon(String[] words){
        int len=words.length;

        if(len==0||words==null)return "-1";

        String pre=words[0];
        for(int i=1;i<len;i++){
            while(words[i].indexOf(pre)!=0){
              pre=pre.substring(0,pre.length()-1);

              if(pre.isEmpty())return "-1";
            }
        }

        return pre;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n=sc.nextInt();
        String words[]= new String[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
             String str= sc.next();
             words[i]=str;
        }
        System.out.println("The required answer is:"+longestCommon(words));

        sc.close();
    }
}
