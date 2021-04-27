package repo;

import domain.Sneakers;

import java.sql.Array;
import java.util.ArrayList;


public class SneakerRepository {
    private ArrayList<Sneakers> sneakersArray;

    public SneakerRepository(){
        this.sneakersArray = new ArrayList<Sneakers>();
    }

    public void save(Sneakers s){
        this.sneakersArray.add(s);
    }
//f
    public void delete (Sneakers s){
        this.sneakersArray.remove(s);
    }
    public ArrayList<Sneakers> getSneakersArray(){
        return this.sneakersArray;
    }
}
