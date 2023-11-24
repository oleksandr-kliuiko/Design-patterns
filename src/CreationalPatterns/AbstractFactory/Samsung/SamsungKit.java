package CreationalPatterns.AbstractFactory.Samsung;

import CreationalPatterns.AbstractFactory.Interfaces.Cable;
import CreationalPatterns.AbstractFactory.Interfaces.Cover;
import CreationalPatterns.AbstractFactory.Interfaces.Kit;
import CreationalPatterns.AbstractFactory.Interfaces.Phone;

public class SamsungKit implements Kit {
    @Override
    public Phone getPhone() {
        return new SamsungGalaxyS22();
    }

    @Override
    public Cable getCable() {
        return new UsbTypeC();
    }

    @Override
    public Cover getCover() {
        return new SiliconeCase();
    }
}
