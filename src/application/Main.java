package application;

import java.time.LocalDate;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		Department department = new Department(1, "Books");
		System.out.println(department);
		
		Seller seller = new Seller(1, "Maria", "maria@gmail.com", LocalDate.of(2026, 9, 11) , 1600.00, department);
		System.out.println(seller);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
	}

}
