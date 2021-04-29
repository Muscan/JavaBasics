package repo;

import domain.Sneakers;

import java.util.ArrayList;


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

    /**
     *
     * @param model
     * @return @{ArrayList<Sneakers>}
     * Isi face o lista de sneakers (filteredSneakers) in care salveaza adidasii cu modelul "model"
     * Trece prin toata lista this.sneakersArray, si daca gaseste obiecte cu modelul cautat
     *      il va adauga in filteredSneakers
     * La sfarsit returneaza filteredSneaker, in care sunt adidasii cu modelul cautat
      */
    public ArrayList<Sneakers> getSneakersOfACertainModel(String model){
       ArrayList<Sneakers> filteredSneakers = new ArrayList<>();
        for (int i = 0; i < this.sneakersArray.size(); i++) {
            if(this.sneakersArray.get(i).getModel().equals(model))
                filteredSneakers.add(this.sneakersArray.get(i));
        }
        return filteredSneakers;
    }
}
