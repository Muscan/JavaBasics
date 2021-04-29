import domain.Sneakers;
import repo.SneakerRepository;

public class Main {


    public static void main(String[] args) {

        SneakerRepository sr = new SneakerRepository();
        Sneakers s1 = new Sneakers("model",1);
        Sneakers s2 = new Sneakers("model2", 12);
        sr.save(s1);
        sr.save(s2);
        System.out.println(sr.getSneakersArray());
        System.out.println(sr.getSneakersOfACertainModel(s1.getModel()));
        sr.delete(s1);
        System.out.println(sr.getSneakersArray());

    }
}
