package day10_collections_framework.hashMapvsTreeMap.treeMap;

public class EmployeeTreeMap {
    private int id;
    private String name;
    private String department;

    public EmployeeTreeMap(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "EmployeeTreeMap{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
