package ds_practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Employee{
    private int id;
    private String name;
    private double salary;
    
    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String toString(){
        return "[Employee :" + this.id + " " + this.name + " " + this.salary + " ]";
         
    }
    
}

public class StreamAPIExamples {
    public static void main(String[] args) {
        Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100.0), 
            new Employee(2, "Bill Gates", 200.0), 
            new Employee(3, "Mark Zuckerberg", 400.0)
        };

        Stream<Double> empStreamSalary = Stream.of(arrayOfEmps).map(employee -> employee.getSalary());
        empStreamSalary.forEach(System.out::println);

        List<Employee> empList = Stream.of(arrayOfEmps).collect(Collectors.toList());
        System.out.println(empList);

        List<Employee> empList1 = Stream.of(arrayOfEmps).filter(e -> e.getSalary() > 100).collect(Collectors.toList());
        System.out.println(empList1);

        Optional<Employee> emp2 = Stream.of(arrayOfEmps).filter(e -> e.getSalary()> 300).findAny();
        if(emp2.isPresent()){
            System.out.println(emp2.get());
        }
        else{
            System.out.println("No such employee present");
        }

        Employee[] emps4 = Stream.of(arrayOfEmps).toArray(Employee[]::new);
        for(Employee e: emps4){
            System.out.println(e);
        }

        List<List<String>> list = Arrays.asList(
            Arrays.asList("harsh","tarak"),
            Arrays.asList("software","mechanical")
        );

        List<String> list2 = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(list2);

        List<Employee> sortedEmps = empList.stream().sorted((a,b) -> a.getName().compareTo(b.getName())).collect(Collectors.toList());
        System.out.println(sortedEmps);

        Employee empMinSalary = empList.stream().min(Comparator.comparing(Employee::getSalary
            )).orElseThrow(NoSuchElementException::new);
        System.out.println(empMinSalary);

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6);
        List<Integer> distinctList = intList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);

        boolean allEven = distinctList.stream().allMatch(a -> a%2 == 0);
        System.out.println(allEven);

        boolean anyEven = distinctList.stream().anyMatch(a -> a%2 == 0);
        System.out.println(anyEven);

        boolean noneMultipleOfThree = distinctList.stream().noneMatch(a -> a%3 == 0);
        System.out.println(noneMultipleOfThree);

        Integer latestEmpId = empList.stream().mapToInt(Employee::getId).max().orElseThrow(NoSuchElementException::new);
        System.out.println("Latest Employee is is : " + latestEmpId);

        Double maxSalary = empList.stream().mapToDouble(Employee::getSalary).max().orElseThrow(NoSuchElementException::new);
        System.out.println("Maximum salary is : " + maxSalary);

        //Creating a strem of Integer from 10 to 19
        IntStream intStream = IntStream.range(10,20);
        System.out.println(Arrays.toString(intStream.toArray()));

        Double averageSalary = empList.stream().mapToDouble(Employee::getSalary).average().orElseThrow(NoSuchElementException::new);
        System.out.println("Average salary is : " + averageSalary);

        Double sumSalary = empList.stream().mapToDouble(Employee::getSalary).reduce(0.0,Double::sum);
        System.out.println("Sum of all salaries : " + sumSalary);

        String empNames = empList.stream().map(Employee::getName).collect(Collectors.joining(", ")).toString();
        System.out.println(empNames);

        Set<String> nameSet = empList.stream().map(Employee::getName).collect(Collectors.toSet());
        System.out.println(nameSet);

        Vector<String> nameVector = empList.stream().map(Employee::getName).collect(Collectors.toCollection(Vector::new));
        System.out.println(nameVector);

        //partioning the array into even and odd and store the same in hashmap
        Map<Boolean,List<Integer>> map = Arrays.asList(1,2,3,4,5,6,7,8,9).stream().collect(Collectors.partitioningBy(i -> i%2 == 0));
        System.out.println("Even numbers are : " + map.get(true));
        System.out.println("Odd Numbers are : " + map.get(false));

        

        
    }


    
}