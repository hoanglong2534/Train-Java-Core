/*
Bài 1:  Viết chương trình nhập danh sách sinh viên gồm: id, name, age gồm các chức năng sau
1. Thêm sinh viên vào danh sách.
2. Hiển thị danh sách sinh viên.
3. Sắp xếp danh sách theo tên (A-Z).
4. Sắp xếp danh sách theo tên (Z-A).
5. Liệt kê danh sách các Tên của danh sách lớp
6. Lấy ra tên có nhiều sinh viên nhất và số sinh viên là bao nhiêu
Note: có danh sách sinh viên mặc định để có thể sắp xếp được luôn
private static List<Student> students = new ArrayList<>(List.of(
    new Student(1, "An", 20),
    new Student(2, "Bình", 21),
    new Student(3, "An", 22),
    new Student(4, "Cường", 19),
    new Student(5, "Duy", 20),
    new Student(6, "Hà", 21),
    new Student(7, "Lan", 20),
    new Student(8, "Mai", 22),
    new Student(9, "An", 23),
    new Student(10, "Bình", 20),
    new Student(11, "Trang", 22),
    new Student(12, "Vy", 21),
    new Student(13, "Yến", 20),
    new Student(14, "Trang", 23),
    new Student(15, "Hà", 19),
    new Student(16, "Cường", 21),
    new Student(17, "Khoa", 22),
    new Student(18, "Lâm", 20),
    new Student(19, "Phúc", 21),
    new Student(20, "Nam", 23),
    new Student(21, "Vy", 22),
    new Student(22, "Trung", 20),
    new Student(23, "Minh", 21),
    new Student(24, "Thảo", 20),
    new Student(25, "Trang", 21),
    new Student(26, "Linh", 22),
    new Student(27, "Tuấn", 23),
    new Student(28, "An", 21),
    new Student(29, "Duy", 22),
    new Student(30, "Huy", 20)
));

 */

package b8.BTCollection.Bai1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> list = new ArrayList<SinhVien>();
        //1
        list.add(new SinhVien(1, "An", 20));
        list.add(new SinhVien(2, "Bình", 21));
        list.add(new SinhVien(3, "An", 22));
        list.add(new SinhVien(4, "Cường", 19));
        list.add(new SinhVien(5, "Duy", 20));
        list.add(new SinhVien(6, "Hà", 21));
        list.add(new SinhVien(7, "Lan", 20));
        list.add(new SinhVien(8, "Mai", 22));
        list.add(new SinhVien(9, "An", 23));
        list.add(new SinhVien(10, "Bình", 20));
        list.add(new SinhVien(11, "Trang", 22));
        list.add(new SinhVien(12, "Vy", 21));
        list.add(new SinhVien(13, "Yến", 20));
        list.add(new SinhVien(14, "Trang", 23));
        list.add(new SinhVien(15, "Hà", 19));
        list.add(new SinhVien(16, "Cường", 21));
        list.add(new SinhVien(17, "Khoa", 22));
        list.add(new SinhVien(18, "Lâm", 20));
        list.add(new SinhVien(19, "Phúc", 21));
        list.add(new SinhVien(20, "Nam", 23));
        list.add(new SinhVien(21, "Vy", 22));
        list.add(new SinhVien(22, "Trung", 20));
        list.add(new SinhVien(23, "Minh", 21));
        list.add(new SinhVien(24, "Thảo", 20));
        list.add(new SinhVien(25, "Trang", 21));
        list.add(new SinhVien(26, "Linh", 22));
        list.add(new SinhVien(27, "Tuấn", 23));
        list.add(new SinhVien(28, "An", 21));
        list.add(new SinhVien(29, "Duy", 22));
        list.add(new SinhVien(30, "Huy", 20));

        //2
        for(SinhVien sv : list) {
            System.out.println(sv);
        }

        //3
        Collections.sort(list, new Comparator<SinhVien>() {

            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //4
        Collections.sort(list, new Comparator<SinhVien>() {

            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });

        //5
        Set<String> se = new TreeSet<>();
        for (SinhVien sv : list) {
            String x = sv.getName();
            se.add(x);
        }

        //6
        List<String> names = new ArrayList<>();

        for(SinhVien sv : list) {
            names.add(sv.getName());
        }

        Map<String, Integer> mp = new HashMap<>();
        for(int i = 0 ; i < names.size() ; i++) {
            String ten = names.get(i);
            if(mp.containsKey(ten)) {
                Integer tanSuat = mp.get(ten);
                tanSuat++;
                mp.put(ten, tanSuat);
            }
            else{
                mp.put(ten, 1);
            }
        }

        Integer max = Integer.MIN_VALUE;
        String tmp = "";
        Set<Map.Entry<String, Integer>> entrySet = mp.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                tmp = entry.getKey();
            }
        }
        System.out.println("ten nhieu nhat " + tmp + " - co " + max + " lan xuat hien");





    }
}
