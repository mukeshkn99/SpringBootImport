package restapi.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsontojava {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper mapper=new ObjectMapper();
		employee emp=mapper.readValue(new File("file.json"), employee.class);
		System.out.println(emp);

	}

}
