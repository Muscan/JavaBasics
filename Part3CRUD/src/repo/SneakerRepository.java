package repo;

import domain.Sneakers;

import java.sql.Array;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class SneakerRepository {
    private ArrayList<Sneakers> sneakersArray;

    public SneakerRepository(){
        this.sneakersArray = new ArrayList<Sneakers>();
    }

    public void save(Sneakers s){
        this.sneakersArray.add(s);
    }

    public void delete (Sneakers s){
        this.sneakersArray.remove(s);
    }

    public ArrayList<Sneakers> getSneakersArray(){
        return this.sneakersArray;
    }

    public ArrayList<Sneakers> getSneakersOfACertainModel(String model){
       ArrayList<Sneakers> filteredSneakers = new ArrayList<>();
        for (int i = 0; i < this.sneakersArray.size(); i++) {
            if(this.sneakersArray.get(i).getModel().equals(model))
                filteredSneakers.add(this.sneakersArray.get(i));
        }
        return filteredSneakers;
    }
}
