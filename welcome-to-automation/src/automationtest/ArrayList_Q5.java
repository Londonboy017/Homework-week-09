package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {
    public static void main(String[] args) {
        ArrayList<String> software =new ArrayList<>();
        software.add("Scrum");
        software.add("Java");
        software.add("Jira");
        software.add("Selenium");
        software.add("Cucumber");
        software.add("Postman");
        software.add("Rest Assured");

        for (String group:software) {
            System.out.println(group);

        }
    }
}
