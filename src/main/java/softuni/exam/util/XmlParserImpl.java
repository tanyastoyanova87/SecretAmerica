package softuni.exam.util;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.stereotype.Component;


import java.io.File;

@Component
public class XmlParserImpl implements XmlParser {

    @Override
    public <T> T fromFile(String filePath, Class<T> tClass) throws JAXBException, JAXBException {
       JAXBContext jaxbContext = JAXBContext.newInstance(tClass);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (T) unmarshaller.unmarshal(new File(filePath));
    }
}
