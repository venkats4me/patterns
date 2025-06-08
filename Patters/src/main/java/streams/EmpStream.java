package streams;

import java.time.Instant;
import java.time.Year;
import java.util.*;
import java.util.stream.Collectors;

public class EmpStream {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0,0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0,0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0,0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0,0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0,0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0,0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0,0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0,0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11000.0,0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.0,0));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0,0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0,0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0,0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5,0));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0,0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0,0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0,0));
        employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);
        // System.out.println(employeeList.size());
        int empsal=1;
        System.out.println("emp of "+empsal+" salary  is " +employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).
         skip(empsal-1).findAny().get());
        System.out.println("emp of another"+empsal+" salary  is"+employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList().get(empsal-1));
        System.out.println("How many male and female employees are there in the organization?");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())));
        System.out.println("Print the name of all departments in the organization?");
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        System.out.println("What is the average age of male and female employees?");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge))));
        System.out.println("Get the details of highest paid employee in the organization?");
        System.out.println("way== 1 "+employeeList.stream().sorted((o1,o2)-> (int) (o2.getSalary()-o1.getSalary())).findFirst().get());
        System.out.println("way== 2 "+employeeList.stream().max(Comparator.comparing(Employee::getSalary)).get());
        System.out.println("way== 3 "+employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst().get());
        System.out.println("way== 4 "+employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).skip(employeeList.size()-1).findFirst().get());
        System.out.println("way== 5 "+employeeList.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).skip(employeeList.size()-1).findFirst().get());
        int salno=4;
        System.out.println("way== 6 "+employeeList.stream().sorted((e1,e2)->(int)(e2.getSalary()-e1.getSalary())).skip(salno-1).findFirst().get());
        System.out.println("way== 7 "+employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get());
        System.out.println("Get the names of all employees who have joined after 2015?");
        employeeList.stream()
                .filter(e->e.getYearOfJoining()>2015)
                .map(e->e.getName())
                .forEach(System.out::println);
        System.out.println("Count the number of employees in each department?");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())));
        System.out.println("exp of the emp");

        List<Emp1> collect = employeeList.stream().map(emp -> new Emp1(emp.id, emp.name, emp.age, emp.gender, emp.department, emp.yearOfJoining, emp.salary, Year.now().getValue() - emp.yearOfJoining))
                .collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("find the emp experience with same and changing in the constructor");
        employeeList.stream().map(e->new Employee(e.getId(),e.getName(),e.getAge(),e.getGender(),e.department,e.yearOfJoining,e.salary,(Year.now().getValue()-e.getYearOfJoining()))).forEach(System.out::println);
        List<Employee> empWithExp = employeeList.stream().map(e -> new Employee(e.getId(), e.getName(), e.getAge(), e.getGender(), e.department, e.yearOfJoining, e.salary, (Year.now().getValue() - e.getYearOfJoining()))).collect(Collectors.toList());
        System.out.println("emp with Exp");
        empWithExp.forEach(System.out::println);
        int exp=1;
        Optional<Employee> expBase = empWithExp.stream().sorted(Comparator.comparing(Employee::getExp).reversed()).skip(exp - 1).findFirst();
        System.out.println(" the "+exp+" of the employee of "+expBase);
        System.out.println("custom sort");
        List<Employee> collect1 = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()
                .thenComparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println("====Count the number of employees in each department?=====");
        empWithExp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
                        .entrySet().stream().forEach(e->System.out.println(e.getKey()+"   "+e.getValue()));
        System.out.println("======What is the average salary of each department?=======");
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))).entrySet()
                .stream().forEach(s->System.out.println(s.getKey()+"  "+s.getValue()));

        System.out.println("====Get the details of youngest male employee in the product development department?======");
        System.out.println(employeeList.stream().filter(e->e.getDepartment().equalsIgnoreCase("Product Development")&&e.getGender().equalsIgnoreCase("Male")).
                sorted(Comparator.comparing(Employee::getAge)).findFirst().get());
        System.out.println("=====Who has the most working experience in the organization?======");
        System.out.println(employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst().get());
        System.out.println("======= How many male and female employees are there in the sales and marketing team?=========");
        System.out.println(employeeList.stream().filter(e->e.getDepartment().equalsIgnoreCase("Sales And Marketing")).
                collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())));
        System.out.println("=====What is the average salary of male and female employees?======");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary))));
        System.out.println("=========List down the names of all employees in each department=========");
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((k,v)->{

                    System.out.println("=========="+k+"=======");

                    v.stream().forEach(s->System.out.println(s.getName()));

                });
        System.out.println("==What is the average salary and total salary of the whole organization===");
        System.out.println(employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)));
        System.out.println("====Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.===");
        employeeList.stream().collect(Collectors.groupingBy(e->e.getAge()<=25?"Youngers":"non youngers"))
                .forEach((k,v)->{
                    if(k.equalsIgnoreCase("Youngers")){
                        System.out.println("youngers are");
                        v.stream().forEach(System.out::println);
                    }else if(k.equalsIgnoreCase("non youngers")){
                        System.out.println("non youngers are");
                        v.stream().forEach(System.out::println);
                    }
                });
        System.out.println("another logic");
        employeeList.stream().collect(Collectors.partitioningBy(e->e.getAge()<=25))
                .forEach((k,v)->{
                    if(k){
                        System.out.println("youngers are");
                        v.stream().forEach(System.out::println);
                    }else if(!k){
                        System.out.println("non youngers are");
                        v.stream().forEach(System.out::println);
                    }
                });
        System.out.println("= Who is the oldest employee in the organization? What is his age and which department he belongs to?==");
        System.out.println(employeeList.stream().max(Comparator.comparingInt(Employee::getAge)).get());
        System.out.println("logic2");
        System.out.println(employeeList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).findFirst().get());
        System.out.println("==logic3");
        System.out.println(employeeList.stream().sorted((o1,o2)->o2.getAge()-o1.getAge()).findFirst().get());












































    }
}
