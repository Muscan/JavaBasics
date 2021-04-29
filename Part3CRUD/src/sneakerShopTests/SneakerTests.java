package sneakerShopTests;

import domain.Sneakers;
import org.junit.jupiter.api.Test;

public class SneakerTests {

    @Test
    public void Sneakers_CreateNewSneaker_ModelAndPriceAreCorrect(){
        Sneakers s = new Sneakers("Mike", 100.1);
        assert (s.getModel().equals("Mike") && s.getPrice() == 100.1);
    }

    @Test
    public void Sneakers_SneakerAlreadyExists_SettersWorkProperly(){
        Sneakers s = new Sneakers("John Snow Protector Of The Realm", 45.21);
        s.setModel("Tyrion Defender Of The Dwarves");
        s.setPrice(1);
        assert(s.getModel().equals("Tyrion Defender Of The Dwarves") && s.getPrice() == 1);

    }

    @Test
    public void toString_SneakerExists_PrintedProperly(){
        Sneakers s = new Sneakers("Azara", 21.2);
        assert (s.toString().equals("Sneakers{model='Azara', price=21.2}"));
    }

}
