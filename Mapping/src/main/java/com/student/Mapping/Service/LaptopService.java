package com.student.Mapping.Service;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.weaver.ast.Not;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.student.Mapping.Model.Book;
import com.student.Mapping.Model.Laptop;
import com.student.Mapping.Model.Student;
import com.student.Mapping.Repo.ILaptopRepo;
import com.student.Mapping.Repo.IStudentRepo;

@Service
public class LaptopService {
	
	@Autowired
	private ILaptopRepo iLaptopRepo;
	@Autowired
	private IStudentRepo iStudentRepo;

	public Laptop addLaptop(String laptop) {
	 JSONObject jsonObject=new JSONObject(laptop);
		Student student = null;
        int studentId = jsonObject.getInt("student");

        if(iStudentRepo.findById(studentId).isPresent()) {
        	student = iStudentRepo.findById(studentId).get();
        } else {
            return null;
        }

		Laptop laptop2=new Laptop();
		laptop2.setBrand(jsonObject.getString("brand"));
		laptop2.setName(jsonObject.getString("name"));
		laptop2.setPrice(jsonObject.getInt("price"));
		laptop2.setStudent(student);
		
		Laptop laptop3=iLaptopRepo.save(laptop2);
		return laptop3;
	}

	public List<Laptop> getLaptop(String laptopId) {
		List<Laptop> laptop ;
		if(laptopId!=null) {
		try {
		    laptop = new ArrayList<>();
			laptop.add(iLaptopRepo.findById(Integer.parseInt(laptopId)).get());
			return laptop;
		}
		
		catch (Exception e) {
			return laptop=null;
		}
		}
		else {
			laptop=iLaptopRepo.findAll();
			return laptop;
		}
		
	}

}
