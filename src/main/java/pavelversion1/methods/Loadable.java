package pavelversion1.methods;

import jakarta.xml.bind.JAXBException;

public interface Loadable {
    void loadSaveLeftDoor() throws JAXBException;

    void loadSaveRightDoor() throws JAXBException;
}
