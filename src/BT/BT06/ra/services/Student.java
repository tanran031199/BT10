package BT.BT06.ra.services;

import java.util.Scanner;
import java.util.UUID;

public class Student implements StudentService {
    int studentId;
    String studentName;
    String address;
    String phone;
    boolean gender;
    double mark;
    public static int count = 0;

    public Student() {
        setStudentId(count + 1);
        count += 1;
    }

    public Student(String studentName, String address, String phone, boolean gender, double mark) {
        this.studentName = studentName;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
        this.mark = mark;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public void inputNewData(Scanner sc) {
        do {
            try {
                System.out.println("Nhập vào tên HS:");
                String name = sc.nextLine();
                if (name.isEmpty()) {
                    System.err.println("Tên không được để trống!");
                } else {
                    setStudentName(name);
                    break;
                }
            } catch (Exception e) {
                System.err.println("Nhập sai định dạng, vui lòng nhập lại!");
            }
        } while (true);

        do {
            try {
                System.out.println("Nhập vào địa chỉ HS:");
                String address = sc.nextLine();
                if (address.isEmpty()) {
                    System.err.println("Địa chỉ không được để trống!");
                } else {
                    setAddress(address);
                    break;
                }
            } catch (Exception e) {
                System.err.println("Nhập sai định dạng, vui lòng nhập lại!");
            }
        } while (true);

        do {
            try {
                System.out.println("Nhập vào số điện thoại HS:");
                String phone = sc.nextLine();
                String phoneRegex = "^(84|0)[35789][0-9]{8}$";

                if (phone.isEmpty()) {
                    System.err.println("Số điện thoại không được để trống!");
                } else if (!phone.matches(phoneRegex)) {
                    System.err.println("Số điện thoại không chính xác, vui lòng nhập lại!");
                } else {
                    StringBuilder tel = new StringBuilder();

                    for (int i = 0; i < phone.length(); i++) {
                        if (i == 0 && phone.charAt(0) == '0') {
                            tel.append("84");
                        } else {
                            tel.append(phone.charAt(i));
                        }
                    }

                    setPhone(tel.toString());
                    break;
                }
            } catch (Exception e) {
                System.err.println("Nhập sai định dạng, vui lòng nhập lại!");
            }
        } while (true);

        do {
            try {
                System.out.println("Nhập vào giới tính của HS:");
                System.out.println("1. Nam");
                System.out.println("2. Nữ");
                String choosGender = sc.nextLine();

                if (choosGender.isEmpty()) {
                    System.err.println("Vui lòng lựa chọn giới tính phù hợp!");
                } else if (Integer.parseInt(choosGender) == 1) {
                    setGender(true);
                    break;
                } else if (Integer.parseInt(choosGender) == 2) {
                    setGender(false);
                    break;
                } else {
                    System.err.println("Không có lựa chọn " + choosGender + ", vui lòng nhập lại!");
                }
            } catch (Exception e) {
                System.err.println("Nhập sai định dạng, vui lòng nhập lại!");
            }
        } while (true);

        do {
            try {
                System.out.println("Nhập vào điểm số của HS:");
                String inputMark = sc.nextLine();

                if (inputMark.isEmpty()) {
                    System.err.println("Vui lòng nhập vào điểm số của HS!");
                } else if (Double.parseDouble(inputMark) < 0 || Double.parseDouble(inputMark) > 10) {
                    System.err.println("Điểm số nhập vào phải nằm trong 1-10!");
                } else {
                    setMark(Double.parseDouble(inputMark));
                    break;
                }
            } catch (Exception e) {
                System.err.println("Nhập sai định dạng, vui lòng nhập lại!");
            }
        } while (true);
    }

    @Override
    public void inputUpdateData(Scanner sc) {
        do {
            try {
                System.out.println("Nhập vào tên HS:");
                String name = sc.nextLine();
                if (name.isEmpty()) {
                    break;
                } else {
                    setStudentName(name);
                    break;
                }
            } catch (Exception e) {
                System.err.println("Nhập sai định dạng, vui lòng nhập lại!");
            }
        } while (true);

        do {
            try {
                System.out.println("Nhập vào địa chỉ HS:");
                String address = sc.nextLine();
                if (address.isEmpty()) {
                    break;
                } else {
                    setAddress(address);
                    break;
                }
            } catch (Exception e) {
                System.err.println("Nhập sai định dạng, vui lòng nhập lại!");
            }
        } while (true);

        do {
            try {
                System.out.println("Nhập vào số điện thoại HS:");
                String phone = sc.nextLine();
                if (phone.isEmpty()) {
                    break;
                } else if (!phone.matches("^(84|0)[35789][0-9]{8}$")) {
                    System.err.println("Số điện thoại không chính xác, vui lòng nhập lại!");
                } else {
                    StringBuilder tel = new StringBuilder();

                    for (int i = 0; i < phone.length(); i++) {
                        if (i == 0 && phone.charAt(0) == '0') {
                            tel.append("84");
                        } else {
                            tel.append(phone.charAt(i));
                        }
                    }

                    setPhone(tel.toString());
                    break;
                }
            } catch (Exception e) {
                System.err.println("Nhập sai định dạng, vui lòng nhập lại!");
            }
        } while (true);

        do {
            try {
                System.out.println("Nhập vào giới tính của HS:");
                System.out.println("1. Nam");
                System.out.println("2. Nữ");
                String choosGender = sc.nextLine();

                if (choosGender.isEmpty()) {
                    break;
                } else if (Integer.parseInt(choosGender) == 1) {
                    setGender(true);
                    break;
                } else if (Integer.parseInt(choosGender) == 2) {
                    setGender(false);
                    break;
                } else {
                    System.err.println("Không có lựa chọn " + choosGender + ", vui lòng nhập lại!");
                }
            } catch (Exception e) {
                System.err.println("Nhập sai định dạng, vui lòng nhập lại!");
            }
        } while (true);

        do {
            try {
                System.out.println("Nhập vào điểm số của HS:");
                String inputMark = sc.nextLine();

                if (inputMark.isEmpty()) {
                    break;
                } else if (Double.parseDouble(inputMark) < 0 || Double.parseDouble(inputMark) > 10) {
                    System.err.println("Điểm số nhập vào phải nằm trong 1-10!");
                } else {
                    setMark(Double.parseDouble(inputMark));
                    break;
                }
            } catch (Exception e) {
                System.err.println("Nhập sai định dạng, vui lòng nhập lại!");
            }
        } while (true);
    }

    @Override
    public void display() {
        StringBuilder displayTel = new StringBuilder("+");

        for (int i = 0; i < getPhone().length(); i++) {
            if (i == 1 || i == 3 || i == 7) {
                displayTel.append(phone.charAt(i)).append("-");
            } else {
                displayTel.append(phone.charAt(i));
            }
        }

        System.out.println("\u001B[36m");
        System.out.println("Mã HS: " + getStudentId());
        System.out.println("Tên: " + getStudentName());
        System.out.println("Địa chỉ: " + getAddress());
        System.out.println("Số điện thoại: " + displayTel);
        System.out.println("Giới tính: " + (isGender() ? "Nam" : "Nữ"));
        System.out.printf("Điểm số: %f.1", getMark());
        System.out.println("\u001B[0m");
    }
}
