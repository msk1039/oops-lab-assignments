import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    static Person inputPerson(int no){
        Scanner sc = new Scanner(System.in);
        Person temp = new Person("",0);
        System.out.println("enter name of person "+no);
        temp.name = sc.nextLine();
        System.out.println("enter age of person "+no);
        temp.age = sc.nextInt();
        return temp;
    }

    void printPerson(){
        System.out.println("name: "+this.name+"  age: "+this.age);
    }
}