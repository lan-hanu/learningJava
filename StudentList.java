import java.util.*;

public class StudentList {
    public static final List<Student> studentList = new ArrayList<>();

    // 1. Them moi sinh vien, check trung lap theo ma sinh vien

    public static void addNewStudent(Student student) {
        if (Common.ischeckExist(student.getStudentId(), studentList)) {
            System.out.println("Sinh viên này đã tồn tại");
        } else {
            studentList.add(student);
        }
    }

//    public static void addNewStudent(Student student) {
//        boolean isduplicate = false;
//        for (Student student1 : studentList) {
//            if (student1.getStudentId().equals(student.getStudentId())) {
//                System.out.println("Sinh viên này đã tồn tại");
//                isduplicate = true;
//                break;
//            }
//        }
//        if (!isduplicate) {
//            studentList.add(student);
//        }
//    }

    //2. In ra danh sach sinh
    public static void showStudentList() {
        System.out.println("Danh sách sinh viên: ");
        for (Student student1 : studentList) {
            System.out.println(student1.toString());
        }
    }

    //3. Lay ra so luong sinh vien trong danh sach
    public static void qtyOfStudent() {
        System.out.println("Số lượng sinh viên: " + studentList.size());
    }

    //4. Tim kiem sinh vien theo ma sinh vien

    public static void searchStudentById(Scanner scanner) {
        System.out.println("Nhập mã sinh viên cần kiểm tra");
        boolean isExist = false;
        String checkId = scanner.nextLine();
        for (Student student : studentList) {
            if (student.getStudentId().trim().equals(checkId.trim())) {
                System.out.println("Sinh viên cần tìm là: " + student);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tồn tại sinh viên tương ứng");
        }
    }

    //5. Update các thông tin sinh viên dựa trên mã sinh viên
    public static void updateStudentInfoById(Scanner scanner) {
        System.out.println("Nhập mã sinh viên cần cập nhật");
        String checkId = scanner.nextLine();
        if (Common.ischeckExist(checkId, studentList)) {
            for (Student student : studentList) {
                boolean isLoop = true;
                Student tempStudent = new Student();
                System.out.println("Cập nhật lại thông tin sinh viên:");
                do {
                    if (tempStudent.getFullName() == null) {
                        System.out.println("Cập nhật lại họ tên:");
                        tempStudent.setFullName(scanner.nextLine());
                    }

                    if (tempStudent.getYearOfBirth() == null) {
                        System.out.println("Cập nhật lại năm sinh:");
                        String yearOfBirthStr = scanner.nextLine();
                        if (Common.isInterger(yearOfBirthStr)) {
                            tempStudent.setYearOfBirth(Integer.parseInt(yearOfBirthStr));
                        } else {
                            System.out.println("Chỉ được phép nhập số");
                            tempStudent.setYearOfBirth(null);
                            continue;
                        }
                    }
                    System.out.println("Cập nhật lại điểm:");
                    String avgPointStr = scanner.nextLine();
                    if (Common.isFloat(avgPointStr)) {
                        float tempPoint = Float.parseFloat(avgPointStr);
                        if (tempPoint >= 0.0 && tempPoint <= 10.0) {
                            tempStudent.setAvgPoint(tempPoint);
                            isLoop = false;
                        } else {
                            System.out.println("Chỉ được nhập trong khoảng 0 -> 10");
                        }
                    } else {
                        System.out.println("Chỉ được phép nhập số");
                    }
                    student.setFullName(tempStudent.getFullName());
                    student.setYearOfBirth(tempStudent.getYearOfBirth());
                    student.setAvgPoint(tempStudent.getAvgPoint());
                }
                while (isLoop);
                break;
            }
        } else {
            System.out.println("Không tồn tại sinh viên này để cập nhật. Vui lòng kiểm tra lại mã sinh viên");
        }
    }
//        boolean isExist = false;
//        String checkId = scanner.nextLine();
//        for (Student student : studentList) {
//            if (student.getStudentId().trim().equals(checkId.trim())) {
//                boolean isLoop = true;
//                Student tempStudent = new Student();
//                System.out.println("Cập nhật lại thông tin sinh viên:");
//                do {
//                    if (tempStudent.getFullName() == null) {
//                        System.out.println("Cập nhật lại họ tên:");
//                        tempStudent.setFullName(scanner.nextLine());
//                    }
//
//                    if (tempStudent.getYearOfBirth() == null) {
//                        System.out.println("Cập nhật lại năm sinh:");
//                        String yearOfBirthStr = scanner.nextLine();
//                        if (Common.isInterger(yearOfBirthStr)) {
//                            tempStudent.setYearOfBirth(Integer.parseInt(yearOfBirthStr));
//                        } else {
//                            System.out.println("Chỉ được phép nhập số");
//                            tempStudent.setYearOfBirth(null);
//                            continue;
//                        }
//                    }
//                    System.out.println("Cập nhật lại điểm:");
//                    String avgPointStr = scanner.nextLine();
//                    if (Common.isFloat(avgPointStr)) {
//                        float tempPoint = Float.parseFloat(avgPointStr);
//                        if (tempPoint >= 0.0 && tempPoint <= 10.0) {
//                            tempStudent.setAvgPoint(tempPoint);
//                            isLoop = false;
//                        } else {
//                            System.out.println("Chỉ được nhập trong khoảng 0 -> 10");
//                        }
//                    } else {
//                        System.out.println("Chỉ được phép nhập số");
//                    }
//                    student.setFullName(tempStudent.getFullName());
//                    student.setYearOfBirth(tempStudent.getYearOfBirth());
//                    student.setAvgPoint(tempStudent.getAvgPoint());
//                }
//                while (isLoop);
//                isExist = true;
//                break;
//            }
//        }
//        if (!isExist) {
//            System.out.println("Không tồn tại sinh viên này để cập nhật. Vui lòng kiểm tra lại mã sinh viên");
//        }

    //6. Xoá dánh sách sinh viên theo mã sinh viên
    public static void deleteStudentById(Scanner scanner) {
        boolean isExist = false;
        System.out.println("Nhập mã sinh viên cần xoá");
        String deleteId = scanner.nextLine();
        for (Student student : studentList) {
            if (student.getStudentId().trim().equals(deleteId.trim())) {
                studentList.remove(student);
                System.out.println("Đã xoá sinh viên tương ứng!");
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tồn tại sinh viên vừa nhập. Vui lòng kiểm tra lại mã sinh viên");
        }
    }

    //7 . Tìm kiếm dựa trên tên sinh viên
    public static void searchStudentByName(Scanner scanner) {
        System.out.println("Nhập tên sinh viên cần tìm kiếm");
        boolean isExist = false;
        String checkName = scanner.nextLine();
        System.out.println("Sinh viên tìm thấy là: ");
        for (Student student : studentList) {
            if (student.getFullName().contains(checkName.trim())) {
                System.out.println(student);
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("Không tồn tại sinh viên tương ứng");
        }
    }

    //8. Xuất sinh viên có điểm từ cao tới thấp, nếu sinh viên cùng điểm thì sắp xếp theo tên(A->Z)
    public static void compareStudentByPoitDecs() {
        studentList.sort(new CompareByPoint());
        System.out.println("Danh sách sinh viên có điểm từ cao đến thấp là: ");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    //"9. In ra top 3 các bạn sinh viên có điểm cao nhất
    public static void showTop3StudentByPoitDecs() {
        studentList.sort(new CompareByPoint());
        System.out.println("Top 3 các bạn sinh viên có điểm cao nhất là: ");
        for (Student student : studentList.subList(0, 3)) {
            System.out.println(student);
        }
    }
}



