
/*/
Chép vào đoạn code sau đây:
        import java.util.ArrayList;
        public class personModel <T> {
        public ArrayList<T> li = new ArrayList<T>();
        public void addObject(T object){
        li.add(object);
        }
        public void display(){
        for (T e:li){
        System.out.println(e);
        }
        }
        public static void main(String args[]){
        //Đoạn code cần viết thêm vào
        }
        }

Đoạn code cần viết thêm vào thực hiện các công việc:
Tạo đối tượng personModel<student>
Gọi phương thức addObject để nhập vào 2 sinh viên (student)
Gọi phương thức display để hiển thị 2 sinh viên vừa nhập.

Tạo đối tượng personModel<employee>
Gọi phương thức addObject để nhập vào 2 nhân viên (employee)
Gọi phương thức display để hiển thị 2 nhân viên vừa nhập.

Tạo đối tượng personModel<String>
Gọi phương thức addObject để nhập vào họ tên của 2 người
Gọi phương thức display để hiển thị 2 họ tên vừa nhập.

 */
package b10.bai5;
import b10.bai3.Student;
import b10.bai4.Employee;

import java.util.ArrayList;
public class PersonModel <T> {
    public ArrayList<T> li = new ArrayList<T>();
    public void addObject(T object){
        li.add(object);
    }
    public void display(){
        for (T e:li){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        //student
        PersonModel<Student> studentPersonModel = new PersonModel();
        studentPersonModel.addObject(new Student(1, "Hoang", 18));
        studentPersonModel.addObject(new Student(2, "Long", 20));
        studentPersonModel.display();

        //employee
        PersonModel<Employee> employeePersonModel = new PersonModel();
        employeePersonModel.addObject(new Employee(3, "Hoang2", 7000000));
        employeePersonModel.addObject(new Employee(4, "Long2", 10000000));
        employeePersonModel.display();

        //String
        PersonModel<String> stringPersonModel = new PersonModel();
        stringPersonModel.addObject(new String("Nguyen Van A"));
        stringPersonModel.addObject(new String("Nguyen Van B"));
        stringPersonModel.display();
    }
}
