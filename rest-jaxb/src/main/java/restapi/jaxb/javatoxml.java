package restapi.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class javatoxml {

	public static void main(String[] args) throws JAXBException {
		student s=new student();
		s.setId(1);
		s.setName("arun");
		
		JAXBContext jaxb=JAXBContext.newInstance(student.class);
		Marshaller marshel=jaxb.createMarshaller();
		marshel.marshal(s,new File("src//main//NewFile.xml"));

	}

}
