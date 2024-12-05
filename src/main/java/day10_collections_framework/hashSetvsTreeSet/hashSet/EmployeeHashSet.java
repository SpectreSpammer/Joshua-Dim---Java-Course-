package day10_collections_framework.hashSetvsTreeSet.hashSet;

import java.util.Objects;

public class EmployeeHashSet {
    private int id;
    private String name;
    private String dept;

    public EmployeeHashSet(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeHashSet that = (EmployeeHashSet) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(dept, that.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dept);
    }

    @Override
    public String toString() {
        return "EmployeeHashSet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
