package z_19_01_2627.Serializacja;

import com.google.gson.Gson;

public class Main {
    static String jsonUser = "{" + "\"imie\": \"Brajanusz\"," + "\"wiek\": 30" + "}";

    public static void main(String[] args) {

        User konrad = new User("Konrad", 24);
        Gson gson = new Gson();

        String json = gson.toJson(konrad);
        System.out.println(json);

        User fromJson = gson.fromJson(jsonUser, User.class);
        System.out.println(fromJson);

        User konradJson = gson.fromJson(json, User.class);
        System.out.println(konradJson);
    }
}
