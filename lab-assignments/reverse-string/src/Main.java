import java.util.Scanner;



public class Main {
    static void reverseString(String strings[]){
        char ch;
        for(int i=0;i<5;i++){
            String rev="";
            for(int j=strings[i].length()-1;j>=0;j--){
                ch = strings[i].charAt(j);
                rev=rev+ch;
            }
            strings[i]=rev;
        }
    }



    static void reverseArray(String strings[]){
//        String temp[] = strings;
        for(int i=0;i<2;i++){
            String temp;
            temp=strings[i];
            strings[i]=strings[4-i];
            strings[4-i]=temp;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc=new Scanner(System.in);
        String strings[]=new String[5];
        System.out.println("enter 5 strings");
        for(int i=0;i<5;i++){
            strings[i]=sc.next();
        }
        reverseArray(strings);
        reverseString(strings);
        for(int i=0;i<5;i++){
            System.out.println(strings[i]);
        }


    }
}