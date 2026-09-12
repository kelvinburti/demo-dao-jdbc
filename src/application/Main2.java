package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: department findById =====");

		Department department = departmentDao.findById(3);

		System.out.println(department);

		System.out.println("=== TEST 2: department Insert =====");

		Department newDepartment = new Department(7, "Tung");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());

		System.out.println("=== TEST 3: department delete =====");

		System.out.print("Enter Department Id for delete: ");
		int id = sc.nextInt();
		sc.nextLine();
		departmentDao.deleteById(id);
		System.out.println("Delete complete! ");

		System.out.println("=== TEST 4: department update =====");
		department = departmentDao.findById(1);
		department.setName("Computers");
		departmentDao.update(department);
		System.out.println("Update complete!");

		System.out.println("=== TEST 5: department findAll =====");
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);
	}

}
