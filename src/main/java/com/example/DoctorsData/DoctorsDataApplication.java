package com.example.DoctorsData;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DoctorsDataApplication {
	@GetMapping("/Doctors")
	public String display()
	{
		return "doctors details are printed in the console";
	}


	
		public static void main(String[] args) {
			SpringApplication.run(DoctorsDataApplication.class, args);
			
			   data p1=new data(101,"Nagaraju",230000,"Eye");
			   data p2=new data(101,"Gopi",230000,"Eye");
			   data p3=new data(101,"Srinu",230000,"Eye");
			   data p4=new data(101,"Dani",230000,"Eye");
			   data p5=new data(101,"Sai",230000,"Eye");
			   data p6=new data(101,"Amar",230000,"Eye");
			   data p7=new data(101,"Ajay",230000,"Eye");
			   data p8=new data(101,"Naresh",230000,"Eye");
			   data p9=new data(101,"raju",230000,"Eye");
			   data p10=new data(101,"Naga",230000,"Eye");
			   
		       List<data> doctor=new ArrayList<>();
		       doctor.add(p1);
		       doctor.add(p2);
		       doctor.add(p3);
		       doctor.add(p4);
		       doctor.add(p5);
		       doctor.add(p6);
		       doctor.add(p7);
		       doctor.add(p8);
		       doctor.add(p9);
		       doctor.add(p10);
		       for(data s:doctor)
		       {
		    	   System.out.println(s.toString());
		       }
		}


	}

