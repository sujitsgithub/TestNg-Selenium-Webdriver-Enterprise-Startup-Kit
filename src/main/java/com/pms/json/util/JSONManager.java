package com.pms.json.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONManager {
	
	
	public static Object readJson(String filePath, Class classInstance) {
		//read json file data to String
		Object object = null;
		try {
			byte[] jsonData = Files.readAllBytes(Paths.get(filePath));
			//create ObjectMapper instance
			ObjectMapper objectMapper = new ObjectMapper();
			object = objectMapper.readValue(jsonData, classInstance);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      return object;
	}
	

			
		

}
