package BT.BT06.ra.run;

import BT.BT06.ra.services.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    public static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean inMenu = true;

        do {
            System.out.println("********** StudentManagerment************ ");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Sửa học sinh");
            System.out.println("3. Xóa học sinh");
            System.out.println("4. Tìm kiếm học sinh theo studentId");
            System.out.println("5. Sắp xếp theo tên học sinh từ a-z");
            System.out.println("6. In ra danh sách học sinh");
            System.out.println("7. Sắp xếp điểm tăng dần");
            System.out.println("8. Sắp xếp điểm giảm dần");
            System.out.println("9. Thoát");
            System.out.println();
            System.out.println("Nhập vào lựa chọn của bạn:");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editInfo();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    searchById();
                    break;
                case 5:
                    sortByName();
                    break;
                case 6:
                    students.forEach(Student::display);
                    System.out.println();
                    break;
                case 7:
                    sortMarkAscending();
                    break;
                case 8:
                    sortMarkDecrease();
                    break;
                case 9:
                    inMenu = false;
                    System.out.println("Bạn đã thoát khỏi chương trình!");
                    break;
                default:
                    System.err.println("Không có lựa chọn " + choice + ", vui lòng chọn lại!");
                    break;
            }
        } while (inMenu);
    }

    public static void addStudent() {
        Scanner sc = new Scanner(System.in);
        Student newStudent = new Student();
        newStudent.inputNewData(sc);
        students.add(newStudent);
    }

    public static void editInfo() {
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.println("Nhập vào mã số HS:");
                int id = Integer.parseInt(sc.nextLine());
                int index = -1;

                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getStudentId() == id) {
                        index = i;
                        break;
                    }
                }

                if (index != -1) {
                    students.get(index).inputUpdateData(sc);
                    break;
                } else {
                    System.err.println("Id không tồn tại!");
                }
            } catch (Exception e) {
                System.err.println("Nhập sai định dạng, vui lòng nhập lại!");
            }
        } while (true);
    }

    public static void deleteStudent() {
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.println("Nhập vào mã số HS muốn xóa:");
                int id = Integer.parseInt(sc.nextLine());
                int index = -1;

                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getStudentId() == id) {
                        index = i;
                        break;
                    }
                }

                if (index != -1) {
                    students.remove(index);
                    break;
                } else {
                    System.err.println("Id không tồn tại!");
                }

            } catch (Exception e) {
                System.err.println("Nhập sai định dạng, vui lòng nhập lại!");
            }
        } while (true);
    }

    public static void searchById() {
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.println("Nhập vào mã số HS muốn xóa:");
                int id = Integer.parseInt(sc.nextLine());
                int index = -1;

                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getStudentId() == id) {
                        index = i;
                        break;
                    }
                }

                if (index != -1) {
                    System.out.println("\u001B[33mThông tin học sinh " + id + ":");
                    students.get(index).display();
                    System.out.println("\u001B[0m");
                    break;
                } else {
                    System.err.println("Id không tồn tại!");
                }

            } catch (Exception e) {
                System.err.println("Nhập sai định dạng, vui lòng nhập lại!");
            }
        } while (true);
    }

    public static void sortByName() {
        List<Student> newList = new ArrayList<>(students);

        newList.sort((a, b) -> a.getStudentName().compareToIgnoreCase(b.getStudentName()));
        newList.forEach(Student::display);
        System.out.println();
    }

    public static void sortMarkAscending() {
        List<Student> newList = new ArrayList<>(students);

        newList.sort((a, b) -> {
            double pointA = a.getMark();
            double pointB = b.getMark();

            return (int) (pointA - pointB);
        });

        newList.forEach(Student::display);
        System.out.println();
    }

    public static void sortMarkDecrease() {
        List<Student> newList = new ArrayList<>(students);

        newList.sort((a, b) -> {
            double pointA = a.getMark();
            double pointB = b.getMark();

            return (int) (pointB - pointA);
        });

        newList.forEach(Student::display);
        System.out.println();
    }
}
