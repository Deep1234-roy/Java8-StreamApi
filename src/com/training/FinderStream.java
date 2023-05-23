package com.training;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.training.model.Employee;

public class FinderStream {

	public static void main(String[] args) {
		Optional<Integer> firstEven=Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
				.filter(n-> n%2 == 0)
				.findFirst();
		System.out.println(firstEven.get());

		Optional<Integer> firstEvenGT10=Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
				.filter(n-> n>10)
				.filter(n-> n%2 == 0)
				.findFirst();
		System.out.println(firstEvenGT10);

		// findFirst - Using Employee Data
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Neon G", "Accounts", 8000));
		empList.add(new Employee("Nicholas Y", "Admin", 15000));
		empList.add(new Employee("Vasaol V", "Security", 2500));
		empList.add(new Employee("Amander", "Admin", 12500));
		empList.add(new Employee("Abhishek Kolkur", "Engineer", 40000));
		empList.add(new Employee("Bikash Dutta", "HR", 76700));
		empList.add(new Employee("Ghanendra Singh", "Admin", 50000));
		Employee defaultEmployee = 
				new Employee("A man (or woman) has no name", "Black and White", 0);

		empList.stream()
		.filter(emp -> emp.getAccount().matches("Admin"))
		.findFirst()
		.ifPresent(System.out::println);

		// using findAny 
		System.out.println("\n\n-----------findAny - Sequential Stream ---------------");
		empList.stream()
		.filter(e-> e.getAccount().equals("Admin"))
		.findAny()
		.ifPresent(System.out::println);
		System.out.println("-----------------------------------------");


		//Employee with Maximum Salary
		//Sorted method
		empList.stream()
		.sorted((e1,e2)-> Integer.compare(e2.getSalary(), e1.getSalary()))
		.limit(1)
		.forEach(System.out::println);



		// using BinaryOperator.maxBy
		System.out.println("\n----------------------BinaryOperator.maxBy---------------------");
		Optional<Employee> optionalEmp =empList.stream()
				.reduce(BinaryOperator.maxBy(Comparator.comparingInt(Employee::getSalary)));
		System.out.println("Employee with Max Salary => " + optionalEmp.orElse(defaultEmployee));

		// using max on primitive stream
		System.out.println("\n------------------------Primitive max-----------------------");
		OptionalInt maxSalary = empList.stream()
				.mapToInt(Employee::getSalary)
				.max();
		System.out.println("Emp with Max Salary => " + maxSalary);

		// using Collectors.maxBy
		System.out.println("\n-----------------------Collectors.maxBy------------------------");
		Optional<Employee> emp=empList.stream()
				.collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)));
		System.out.println("Emp with Max Salary = > " + emp.get());


		System.out.println("------------------------------------------------------------------");
		//Employee with Minimum Salary
		//Sorted method
		empList.stream()
		.sorted((s1,s2)-> Integer.compare(s1.getSalary(), s2.getSalary()))
		.limit(1)
		.forEach(System.out::println);

		// using Collectors.minBy
		System.out.println("\n-----------------------Collectors.minBy------------------------");
		Optional<Employee> minSalary=empList.stream()
				.collect(Collectors.minBy(Comparator.comparingInt(Employee::getSalary)));
		System.out.println("Emp with Minimum Salary = > " + minSalary);

		// using min on primitive stream
		System.out.println("\n------------------------Primitive min-----------------------");
		OptionalInt minSalaryUsingMin = empList.stream()
				.mapToInt(Employee::getSalary)
				.min();
		System.out.println("Lowest Salary => " + minSalaryUsingMin);

		// using BinaryOperator.minBy
		System.out.println("\n----------------------BinaryOperator.maxBy---------------------");
		Optional<Employee> minEmp = empList.stream()
			.reduce(BinaryOperator.minBy(Comparator.comparingInt(Employee::getSalary)));
		System.out.println("Employee with Minimum Salary => " + minEmp.orElse(defaultEmployee));

	}

}
