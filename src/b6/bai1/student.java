package b6.bai1;

import java.util.Scanner;

public class student extends person {
    private int mark;
    private String grade;

    public student() {
    }

    public student(String id, String name, int age) {
        super(id, name, age);
    }

    public student(String id, String name, int age, int mark, String grade) {
        super(id, name, age);
        this.mark = mark;
        this.grade = grade;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }
    public void calGrade(){
        if(mark >= 8){
            grade = "distinction";
        }
        else if(mark >= 7){
            grade = "credit";
        }
        else if(mark >= 5){
            grade = "pass";
        }
        else {
            grade = "fail";
        }
    }


    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        this.id = sc.nextLine();
        System.out.print("Nhap ten: ");
        this.name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        this.age = sc.nextInt();
        System.out.print("nhap diem: ");
        mark = sc.nextInt();
        calGrade();

    }

    public void display(){
        System.out.println("thong tin student: ");
        System.out.println("id: " + getId()+
                "\nname: " + getName()+
                "\nage: " + getAge() +
                "\nmark: " + getMark() +
                "\ngrade: " + getGrade());
    }

    public static void main(String[] args) {
       student a = new student();
       a.input();
       a.display();
    }

}
