import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello world!");
        city cities[] = new city[5];
        for(int i=0;i<5;i++){
            System.out.println("enter name of city "+(i+1)+": ");
            String name = sc.next();
            System.out.println("enter pupulation of "+name+": ");
            int population = sc.nextInt();
            cities[i] = new city(name,population);
        }
        for(int i=0;i<5;i++){
            System.out.println("name: "+cities[i].name+" pupulation: "+cities[i].population);
        }
    }
}