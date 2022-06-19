package restapi.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class xmltojava {

	public static void main(String[] args) throws JAXBException {
		
		JAXBContext xmltojax=JAXBContext.newInstance(student.class);
		Unmarshaller unmarshaller=xmltojax.createUnmarshaller();
		File f=new File("NewFile.xml");
		student s=(student)unmarshaller.unmarshal(f);
		System.out.println(s);
	}

}
