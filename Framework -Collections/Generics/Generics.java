package Generics;

import java.util.ArrayList;

public class Generics {

  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    System.out.print("hellow");
    String[] strArray = new String[20];
    @SuppressWarnings("unused")
    Employee[] empArray = new Employee[20];
    strArray[0] = "21";
    // empArray[0] = "21"; // Type mismatch: cannot convert from String to Employee
    // cannot convert from String to Employee - compile time error

    @SuppressWarnings("rawtypes")
    ArrayList l = new ArrayList();
    l.add("meenal");
    l.add(new Employee());

    @SuppressWarnings("unused")
    String name = (String) l.get(0); // have to typecast it to string
    Employee name2 = (Employee) l.get(1);

    System.out.print(name2);
  }
}
