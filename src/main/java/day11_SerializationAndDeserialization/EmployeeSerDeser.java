package day11_SerializationAndDeserialization;

import java.io.Serializable;

public class EmployeeSerDeser implements Serializable {
    private static final long employeeUID = 1L;
    String name;
    String dept;
}
