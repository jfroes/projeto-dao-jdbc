package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: FindById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("=== TEST 2: FindAll ===");
		List<Department> list = departmentDao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 3: Update ===");
		dep = departmentDao.findById(1);
		dep.setName("Smartphones");
		departmentDao.update(dep);
		System.out.println("Update Complete!");
		
		System.out.println("=== TEST 4: Insert ===");
		Department newDepartment = new Department(null, "Computers");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
	}

}
