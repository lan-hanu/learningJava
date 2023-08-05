import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Student s1 = new Student("1234", "Nong Thi Tu Lan", 1995, 8.0f);
        Student s2 = new Student("1235", "Hoang Thi Lan", 1996, 9.0f);
        Student s3 = new Student("1236", "Mai Thi Anh Lan", 1997, 8.0f);
        Student s4 = new Student("1231", "Le Van Tuan", 1997, 9.0f);
        Student s5 = new Student("1232", "Dang Minh Tuan", 1998, 7.5f);
        Student s6 = new Student("1233", "Hoang Anh Tuan", 1997, 7.5f);

        StudentList.addNewStudent(s1);
        StudentList.addNewStudent(s2);
        StudentList.addNewStudent(s3);
        StudentList.addNewStudent(s4);
        StudentList.addNewStudent(s5);
        StudentList.addNewStudent(s6);

        int select = 0;
        do {
            menu();
            System.out.println("Vui lòng chọn Menu");
            select = scanner.nextInt();
            scanner.nextLine();

            switch (select) {
                case 1:
                    Student newStudent = new Student();
                    newStudent.inputStudenInfo(scanner);
                    StudentList.addNewStudent(newStudent);
                    break;
                case 2:
                    StudentList.showStudentList();
                    break;
                case 3:
                    StudentList.qtyOfStudent();
                    break;
                case 4:
                    StudentList.searchStudentById(scanner);
                    break;
                case 5:
                    StudentList.updateStudentInfoById(scanner);
                    break;
                case 6:
                    StudentList.deleteStudentById(scanner);
                case 7:
                    StudentList.searchStudentByName(scanner);
                case 8:
                    StudentList.compareStudentByPoitDecs();
                case 9:
                    StudentList.showTop3StudentByPoitDecs();
                case 0:
                    break;
            }

        } while (select != 0);
    }

    public static void menu() {
        System.out.println();
        System.out.println("--------------------------MENU--------------------------");
        System.out.println("1. Thêm mới sinh viên, có check trùng lặp theo mã sinh viên \n" +
                "2. In ra danh sách sinh viên \n" +
                "3. Lấy số lượng sinh viên trong danh sách \n" +
                "4. Tìm kiếm sinh viên theo mã sinh viên \n" +
                "5. Update các thông tin sinh viên dựa trên mã sinh viên \n" +
                "6. Xoá dánh sách sinh viên theo mã sinh viên \n" +
                "7. Tìm kiếm dựa trên tên sinh viên \n" +
                "8. Xuất sinh viên có điểm từ cao tới thấp, nếu sinh viên cùng điểm thì sắp xếp theo tên(A->Z) \n" +
                "9. In ra top 3 các bạn sinh viên có điểm cao nhất \n" +
                "0. Kết thúc chương trình \n" +
                "--------------------------------------------------------------"
        );
    }

}
