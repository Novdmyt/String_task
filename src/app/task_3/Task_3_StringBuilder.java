package app.task_3;

import java.util.Scanner;

public class Task_3_StringBuilder {

    public static void main(String[] args) {
        Task_3_StringBuilder sb = new Task_3_StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name for search: ");
        String search = scanner.nextLine();
        sb.getData(name,search);
    }
    public static String name = "Bob, Alice, Tom, Lucy, Bob, Lisa";
    private void getData(String name, String searchName){
        StringBuilder sb = new StringBuilder(name);
        int count = 0;
        for(int i = 0; i<sb.length(); i++){
            if(sb.indexOf(searchName, i) == i){
                count++;
            }
        }
        if (count > 0){
            System.out.println("Name found \"" +  searchName + "\" " + count + "  times in the list.");
        }else {
            System.out.println("Name \"" + searchName + "\" is not in the list.");
        }
    }
}
