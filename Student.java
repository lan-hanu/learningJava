import java.util.Scanner;

public class Student implements Comparable<Student>{
    private String studentId;
    private String fullName;
    private Integer yearOfBirth;
    private Float avgPoint;

    public Student() {
    }



    //Nhap va validate
    public void inputStudenInfo(Scanner scanner) {
        boolean isLoop = true;
        System.out.println("Nhập thông tin sinh viên");
        do {
            if (studentId == null) {
                System.out.print("Mời bạn nhập mã sinh viên: ");
                this.studentId = scanner.nextLine();
                if (studentId.length() != 4) {
                    System.out.println("Chỉ được phép nhập 4 ký tự!!!!");
                    this.studentId = null;
                    continue;
                } else if(Common.ischeckExist(studentId, StudentList.studentList)){
                    System.out.println("Sinh viên này đã tồn tại. Vui lòng kiểm tra lại mã sinh viên");
                    this.studentId = null;
                    continue;
                }
            }

            if (fullName == null) {
                System.out.print("Mời bạn nhập họ tên: ");
                this.fullName = scanner.nextLine();
            }

            if (yearOfBirth == null) {
                System.out.print("Mời bạn nhập năm sinh: ");
                String yearOfBirthStr = scanner.nextLine();
                if (Common.isInterger(yearOfBirthStr)) {
                    this.yearOfBirth = Integer.parseInt(yearOfBirthStr);
                } else {
                    System.out.println("Chỉ được phép nhập số");
                    this.yearOfBirth = null;
                    continue;
                }
            }
            System.out.print("Mời bạn nhập điểm: ");
            String avgPointStr = scanner.nextLine();
            if (Common.isFloat(avgPointStr)) {
                float tempPoint = Float.parseFloat(avgPointStr);
                if (tempPoint >= 0.0 && tempPoint <= 10.0) {
                    this.avgPoint = tempPoint;
                    isLoop = false;
                } else {
                    System.out.println("Chỉ được nhập trong khoảng 0 -> 10");
                }
            }else {
                System.out.println("Chỉ được phép nhập số");
            }
        }
        while (isLoop);
    }

    public Student(String studentId, String fullName, Integer yearOfBirth, Float avgPoint) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.avgPoint = avgPoint;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Float getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(Float avgPoint) {
        this.avgPoint = avgPoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", avgPoint=" + avgPoint +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }


}


