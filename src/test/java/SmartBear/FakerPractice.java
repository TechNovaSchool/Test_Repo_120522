package SmartBear;

import com.github.javafaker.Faker;

public class FakerPractice {
    public static void main(String[] args) {

        Faker faker = new Faker();

        String firstName=faker.name().firstName();

        String lastNAme=faker.name().lastName();

        int age=faker.number().numberBetween(0,120);

        String address = faker.address().fullAddress();

        String msg=faker.lorem().sentence();
        String email=faker.internet().emailAddress();

        System.out.println(firstName+" "+ lastNAme);

        System.out.println(age);

        System.out.println(address);

        System.out.println(msg);

        System.out.println(email);
        System.out.println(firstName+"."+ lastNAme+"@gmail.com");

    }
}
