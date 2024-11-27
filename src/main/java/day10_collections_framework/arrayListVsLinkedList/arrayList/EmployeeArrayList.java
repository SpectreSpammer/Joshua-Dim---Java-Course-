package day10_collections_framework.arrayListVsLinkedList.arrayList;

public class EmployeeArrayList {

    private int id;
    private String namel;
    private String department;

    public EmployeeArrayList(int id, String namel, String department) {
        this.id = id;
        this.namel = namel;
        this.department = department;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", namel='" + namel + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
