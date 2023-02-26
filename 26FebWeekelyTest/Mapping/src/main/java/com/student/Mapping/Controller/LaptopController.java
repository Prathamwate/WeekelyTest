package com.student.Mapping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.Mapping.Model.Laptop;
import com.student.Mapping.Service.LaptopService;

import jakarta.annotation.Nullable;

@RestController
@RequestMapping("/laptop")
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    @PostMapping("/laptop")
    public Laptop addLaptop(@RequestBody String laptop) {
        Laptop laptop1 =  laptopService.addLaptop(laptop);
        return laptop1;
    }
    
    @GetMapping("/laptop")
    public  List<Laptop> getLaptop(@Nullable @RequestParam String laptopId){
    	return  laptopService.getLaptop(laptopId);
    	
    }
}
