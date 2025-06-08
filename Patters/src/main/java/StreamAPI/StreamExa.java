package StreamAPI;
import java.time.Year;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExa {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jennifer", 22, "Female", "HR", 2017, 55000.0));
        employeeList.add(new Employee(112, "Rohit", 35, "Male", "Sales And Marketing", 2019, 23500.0));
        employeeList.add(new Employee(113, "Shubman", 29, "Male", "Infrastructure", 2019, 28000.0));
        employeeList.add(new Employee(114, "Rinku", 28, "Male", "Product Development", 2020, 62500.0));
        employeeList.add(new Employee(115, "Aaditi", 41, "Female", "HR", 2022, 29700.0));
        employeeList.add(new Employee(116, "Mahendra", 43, "Male", "Security And Transport", 2023, 20500.0));
        employeeList.add(new Employee(117, "Nitish", 35, "Male", "Account And Finance", 2019, 37000.0));
        employeeList.add(new Employee(118, "Aditya", 31, "Male", "Product Development", 2019, 34500.0));
        employeeList.add(new Employee(119, "Monika", 24, "Female", "Sales And Marketing", 2021, 21500.0));
        employeeList.add(new Employee(120, "Aman", 38, "Male", "Security And Transport", 2021, 31000.5));
        employeeList.add(new Employee(121, "Sangeeta", 27, "Female", "Infrastructure", 2021, 35000.0));
        employeeList.add(new Employee(122, "Joshi", 25, "Male", "Product Development", 2020, 29000.0));
        employeeList.add(new Employee(123, "Jeddy", 27, "Female", "Account And Finance", 2020, 29000.0));
        employeeList.add(new Employee(124, "Niden", 24, "Male", "Sales And Marketing", 2020, 30200.5));
        employeeList.add(new Employee(125, "Saig", 23, "Male", "Infrastructure", 2019, 42700.0));
        employeeList.add(new Employee(126, "Saey", 26, "Female", "Product Development", 2018, 38900.0));
        employeeList.add(new Employee(127, "Shreyas", 25, "Male", "Product Development", 2016, 35700.0));
        System.out.println("====How many employees are there in the organization?===");
        System.out.println(employeeList.stream().count());
        System.out.println(employeeList.stream().collect(Collectors.counting()));
        System.out.println("====Sort the List of Employee objects based on salary in Ascending order====");
        System.out.println("==logic 1");
        employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);
        System.out.println("==logic 2");
        employeeList.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).forEach(System.out::println);
        System.out.println("=Sort the List of Employee objects based on salary in Descending order=");
        employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);
        System.out.println("==logic 2");
        employeeList.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).forEach(System.out::println);
        System.out.println("=How many male and female employees are there in the organization=");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())));
        System.out.println("=How many employees are there in each department=");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())));
        System.out.println("=How many male and female employees are there in the organization?=");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())));
        System.out.println("=Fetch the highest-paid male and female employee=");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))));
        System.out.println("==logic 2");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.
                maxBy((o1,o2)->(int)(o1.getSalary()-o2.getSalary())))));
        System.out.println("=Fetch the lowest-paid male and female employee=");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)))));
        System.out.println("=Get the highest-paid employee in each department=");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))));
        System.out.println("==logic 2");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy((o1,o2)->(int)(o1.getSalary()-o2.getSalary())))));
        System.out.println("==logic 3");
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy((o1,o2)->(int)(o1.getSalary()-o2.getSalary()))))
                        .entrySet().stream().forEach(s->System.out.println(s.getKey()+"==="+s.getValue().get()));
        System.out.println("=List down the names of all employees in each department=");
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((k,v)->{
                    System.out.println("=="+k+"==");
                    v.stream().map(Employee::getName).forEach(System.out::println);
                });

        System.out.println("=Get the name of all the department=");
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        System.out.println("=Find the average salary of the male and female employee=");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary))));
        System.out.println("=Get the details of the highest paid employee in the organization=");
        System.out.println(employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get());
        System.out.println("=logic 2=");
        System.out.println( employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst());
        System.out.println("=logic 3=");
        int sal=1;
        System.out.println(employeeList.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).skip(sal-1).findFirst());
        System.out.println("= Find the average salary of each department=");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))));
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)))
                .forEach((k,v)->{
                    System.out.println("===="+k+"======");
                    System.out.println(v);
                });

        System.out.println("=Get the details of the youngest male employee in the product development department=");
        System.out.println(employeeList.stream().filter(e->e.getDepartment().equalsIgnoreCase("Product Development")&&
                        e.getGender().equalsIgnoreCase("male")).
                min(Comparator.comparingInt(Employee::getAge)));
        System.out.println("= Who has the most working experience in the organization=");
        System.out.println( employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).get());
        System.out.println("=logic 2=");
        System.out.println(employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst());
        System.out.println("=logic 3=");
        System.out.println(employeeList.stream().sorted((o1,o2)->o1.getYearOfJoining()-o2.getYearOfJoining()).findFirst());
        System.out.println("=What is the average salary and total salary of the whole organization=");
        System.out.println(employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)));
        System.out.println("=Separate the employees who are younger or equal to 30 years from those older than 30 years=");
        employeeList.stream().collect(Collectors.groupingBy(e->e.getAge()<=30?"younger":"older"))
                .forEach((k,v)->{
                    if(k.equalsIgnoreCase("younger")){
                        System.out.println("=younger=");
                        v.stream().forEach(System.out::println);
                    }else if(k.equalsIgnoreCase("older")){
                        System.out.println("=Older=");
                        v.stream().forEach(System.out::println);
                    }
                });
        System.out.println("==logic 2=");
employeeList.stream().collect(Collectors.groupingBy(e->e.getAge()<=30?"younger":"old")).entrySet().stream()
        .forEach(s->System.out.println(s.getKey()+"  "+s.getValue()));
        System.out.println("=logic 3=");
        employeeList.stream().collect(Collectors.partitioningBy(e->e.getAge()<=30)).
                forEach((k,v)->{
                    if(k){
                        System.out.println("=younger emps=");
                        System.out.println(v);
                    }else if(!k){
                        System.out.println("=older emps=");
                        System.out.println(v);
                    }
                });
        System.out.println("emp list==");
        employeeList.stream().forEach(System.out::println);
        System.out.println("expre 3yrs more increase the saly by 5%s");

        int yr= Year.now().getValue();
        List<Employee> salHikeList = employeeList.stream().filter(e -> (yr - e.getYearOfJoining()) > 5).map(
                e -> new Employee(e.id, e.name, e.age, e.gender, e.department, e.yearOfJoining, e.salary + (e.salary * 5 / 100))
        ).toList();
       salHikeList.stream().forEach(System.out::println);
    }
}
