package BehavioralPatterns.Mediator;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficControlCenter implements AirTrafficControl {
    private List<Aircraft> aircraftList;

    public AirTrafficControlCenter() {
        this.aircraftList = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, Aircraft aircraft) {
        for (Aircraft a : aircraftList) {
            // Відправка повідомлення всім літакам, крім відправника
            if (a != aircraft) {
                a.receiveMessage(message);
            }
        }
    }

    @Override
    public void addAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }
}
