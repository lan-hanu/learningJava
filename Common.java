import java.util.List;

public class Common {
    public static boolean isInterger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isFloat(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean ischeckExist(String chekInfo, List<Student> studentList) {
        for (Student student : studentList) {
            if (chekInfo.equals(student.getStudentId())) {
                return true;
            }
        }
        return false;
    }
}

//    public static Student findStudentbyId(String searchType, String value) {
//        for (Student student : StudentList.studentList) {
//            if (searchType.equals("studentId") && student.getStudentId().equals(value)) {
//                return student;
//            }
//        }
//        return null;
//    }
//}
