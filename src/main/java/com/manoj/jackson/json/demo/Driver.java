package com.manoj.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {


		try {
			
			
			//create Object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			//read JSON file and map/convert to java pojo: data/sample-lite.json
			Student theStudent = mapper.readValue(new File("data/sample-full.json"),Student.class);
			
			//print first name D AST NAME 
			System.out.println("First Name :"+theStudent.getAddress());
			System.out.println("Last Name :"+theStudent.getLastName());
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
