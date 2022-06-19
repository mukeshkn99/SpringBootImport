package restapi.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class javatojson {

	public static void main(String[] args) throws Exception {
		employee em=new employee();
		em.setName("mukesh");
		em.setPassword(1234);
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File("file.json"), em);
		System.out.println("json file created");
	}

}
