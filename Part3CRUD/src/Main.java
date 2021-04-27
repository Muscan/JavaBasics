import domain.Sneakers;
import repo.SneakerRepository;

public class Main {


    public static void main(String[] args) {
        Sneakers s = new Sneakers("Jordan", 12.4);
        Sneakers s2 = new Sneakers("Jordan", 12.3);
        Sneakers s1 = new Sneakers("Mike", 12.4);
        Sneakers s3 = new Sneakers("Mike", 12.4);
        SneakerRepository repo = new SneakerRepository();
        repo.save(s);
        repo.save(s1);
        repo.save(s3);
        repo.save(s2);
        System.out.println("Jordan and Mike were saved " + repo.getSneakersArray());
        repo.delete(s);
        System.out.println("Jordan got deleted: " + repo.getSneakersArray());
        System.out.println(repo.getSneakersOfACertainModel("Mike"));

    }
}
