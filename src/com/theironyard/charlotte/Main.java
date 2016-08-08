package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<ToDoItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create to-do item");
            System.out.println("2. Toggle to-do item");
            System.out.println("3. List to-do items");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                //prompt the user for a to do list
                System.out.println("Enter your to-do item");
                //read in the txt for said to do
                String text = scanner.nextLine();
                //add a new to do object to
                items.add(new ToDoItem(text, false));

            }
            else if (option.equals("2")) {
                //prompt the user for to do number to toggle
                System.out.println("Enter the number of the item you want to toggle:");
                //read in a number that indicates a to to index
                int idx = Integer.valueOf(scanner.nextLine());
                //change the isDone property
                ToDoItem currentTodo = items.get(idx);

                currentTodo.setDone(!currentTodo.isDone());

            }
            else if (option.equals("3")) {
                //for each to do item:
                // print its index, its completion value and its test
                // eg 1 [ ] fold the laundry
                //    2 [x] vaccuum the dogs
                System.out.println("Listing ToDo Items:");

                String checkBox = "[ ]";
                String finishedCheckBox = "[X]";

                for (int i = 0;i < items.size();i++) {
                    ToDoItem currentItem = items.get(i);

                    System.out.printf("%d. %s %s\n", i, currentItem.isDone() ? finishedCheckBox : checkBox,
                            currentItem.getText());
                }
            } else {
                System.out.println("Invalid selection. Please Try Again. :");
            }

        }

    }
}
