package sneakerShopTests;

import domain.Sneakers;

import org.junit.jupiter.api.Test;
import repo.SneakerRepository;

public class SneakerRepositoryTests {

    @org.junit.jupiter.api.Test
    public void getSneakersArray_RepositoryIsNewlyCreated_SizeIsZero(){
        SneakerRepository sr = new SneakerRepository();
        //Sa nu arunce exceptie cand creez obiectul X
        //Daca obiectul este proaspat facut, inseamna ca nu are nimic stocat in el X
        // Adica size-ul arrayu-ului de Sneakers este 0 X
        //Deci aici testam Constructorul si pentru asta, verificam si getterul pentru array
        assert(sr.getSneakersArray().size()==0);
    }
    @Test
    public void save_RepositoryExistsAndAddObject_ObjectWasAdded(){
        SneakerRepository srSave = new SneakerRepository();
        Sneakers sneaker1 = new Sneakers("Nike",123.1);
        srSave.save(sneaker1);
        assert(srSave.getSneakersArray().size() == 1);
        /*
        * Facem un repository nou (este gol, deci size 0)
        * Facem un Sneaker nou pe care il salvam in repository
        * Daca obiectul este salvat, inseamna ca lungimea array-ului din repo este 1 (initial era 0)
        * */
    }
    @Test
    public void delete_RepositoryAlreadyHasTheObject_ObjectWasDeleted(){
        SneakerRepository srDelete = new SneakerRepository();
        Sneakers sneaker2 = new Sneakers("Nike", 731.2);
        srDelete.save(sneaker2);
        srDelete.delete(sneaker2);
        assert(srDelete.getSneakersArray().size() == 0);
    }
    @Test
    public void getSneakersOfACertainModel_RepoHasMultipleModels_WeGetWhatWeLookFor(){
        SneakerRepository srFilter = new SneakerRepository();
        Sneakers s1 = new Sneakers("a", 731.2),
                 s2 = new Sneakers("a",1),
                 s3 = new Sneakers("b",123);
        srFilter.save(s1);
        srFilter.save(s3);
        srFilter.save(s2);
        assert(srFilter.getSneakersOfACertainModel("a").size() == 2
                && srFilter.getSneakersOfACertainModel("b").size() == 1);

    }

}
