package pavelversion1.methods;

import jakarta.xml.bind.JAXBException;

public interface Savable {
    void leftDoorSaveToXml() throws JAXBException;

    void rightDoorSaveToXml() throws JAXBException;
}
