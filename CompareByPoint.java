import java.util.Comparator;

public class CompareByPoint implements Comparator<Student> {

    @Override
    //8.
    public int compare(Student o1, Student o2) {
        var compareAvgPoit = Float.compare(o2.getAvgPoint(), o1.getAvgPoint());
        if (compareAvgPoit != 0) {
            return compareAvgPoit;
        } else {
            String o1FirstName = o1.getFullName().trim().substring(o1.getFullName().lastIndexOf(" "));
            String o2FirstName = o2.getFullName().trim().substring(o2.getFullName().lastIndexOf(" "));
            var compareFirstName = o1FirstName.compareTo(o2FirstName);
            if (compareFirstName != 0) {
                return compareFirstName;
            } else {
                String o1LastName = o1.getFullName().trim().substring(0, o1.getFullName().indexOf(" "));
                String o2LastName = o2.getFullName().trim().substring(0, o2.getFullName().indexOf(" "));
                return o1LastName.compareTo(o2LastName);
            }
        }
    }
}
