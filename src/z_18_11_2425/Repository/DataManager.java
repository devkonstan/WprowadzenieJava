package z_18_11_2425.Repository;

public class DataManager {
    private final Repo repo;

    DataManager(Repo repo) {

        this.repo = repo;
    }

    void showData() {

        repo.load();
    }

    void addData() {

        repo.save();
    }

}
