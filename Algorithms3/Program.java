package Algorithms3;

public class Program {

    public static void main(String[] args) {
        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.addFirst(new Employee("Cvvss", 55));
        linkedList.addFirst(new Employee("Acsss", 35));
        linkedList.addFirst(new Employee("Baaaaa", 40));
        //linkedList.removeFirst();
        linkedList.directSort(new EmployeeNameComparator(SortType.Ascending));
        printList(linkedList);

        linkedList.directSort(new EmployeeNameComparator(SortType.Descending));
        printList(linkedList);

        linkedList.reverse();
        printList(linkedList);

        LinkedList<Employee> linkedList2 = new LinkedList<>();
        linkedList2.addFirst(new Employee("sdfgsdfgsdfg", 85));
        linkedList2.addFirst(new Employee("sdfgsdfgs", 31));
        linkedList2.addFirst(new Employee("sdfgsfdgssdfgsdfg", 10));
        printList(linkedList2);

        linkedList2.reverse();
        printList(linkedList2);
    }

    public static void printList(LinkedList<Employee> list){
        LinkedList<Employee>.Node node = list.head;
        while (node != null){
            System.out.printf("%s - %d\n", node.value.getName(), node.value.getAge());
            node = node.next;
        }
        System.out.println();
    }

}

class Employee{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
