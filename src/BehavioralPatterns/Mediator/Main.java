package BehavioralPatterns.Mediator;

public class Main {
    public static void main(String[] args) {
        AirTrafficControl airTrafficControl = new AirTrafficControlCenter();

        Aircraft aircraft1 = new Aircraft("Boeing", airTrafficControl);
        Aircraft aircraft2 = new Aircraft("Airbus", airTrafficControl);
        Aircraft aircraft3 = new Aircraft("Cessna", airTrafficControl);

        airTrafficControl.addAircraft(aircraft1);
        airTrafficControl.addAircraft(aircraft2);
        airTrafficControl.addAircraft(aircraft3);

        aircraft1.sendMessage("Увага на маршруті!");
        aircraft2.sendMessage("Дякую за інформацію!");
    }
}
