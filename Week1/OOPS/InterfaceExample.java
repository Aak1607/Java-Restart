package Week1.OOPS;

interface ElectronicDevice {
    void turnOn();
    void turnOff();
}

class TV implements ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("TV is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is now OFF");
    }

    public void changeChannel(int channel) {
        System.out.println("TV channel changed to " + channel);
    }
}

class Radio implements ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("Radio is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is now OFF");
    }

    public void setFrequency(double frequency) {
        System.out.println("Radio frequency set to " + frequency + " MHz");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        ElectronicDevice myTV = new TV();
        myTV.turnOn();
        ((TV) myTV).changeChannel(5);
        myTV.turnOff();

        ElectronicDevice myRadio = new Radio();
        myRadio.turnOn();
        ((Radio) myRadio).setFrequency(101.1);
        myRadio.turnOff();
    }
}