import java.util.Scanner;

public class TwoDimensionArrays {
   public static void main (String[] args) {
//       String[] fruits = {"Apple", "Banana", "Watermelon"};
//       String[] vegetables = {"Lettuce", "Cabbage", "Carrot"};
//       String[] meats = {"Beef", "Chicken", "Pork", "Fish"};

//    to make an array made of arrays
//       String[][] groceries = {fruits, vegetables, meats}; OR

//       String[][] groceries = {
//               {"Apple", "Banana", "Watermelon"},
//               {"Lettuce", "Cabbage", "Carrot"},
//               {"Beef", "Chicken", "Pork", "Fish"}
//       };

//       groceries[1][2] = "Celery";


//       for(String[] grocery : groceries){
//           for (String item : grocery){

//           System.out.print(item + " ");
//           }
//           System.out.println();
//       }
//
//       char[][] telephone = {
//               {'1', '2', '3'},
//               {'4', '5', '6'},
//               {'7', '8', '9'},
//               {'*', '0', '#'}
//       };
//
//       for (char[] row : telephone){
//           for (char key : row){
//               System.out.print(key + " ");
//           }
//           System.out.println();
//       }

//       JAVA QUIZ GAME

//       QUESTIONS array[]
       String[] questions = {
               "What is a router?",
               "What year did you start coding?",
               "what is facebook?",
               "What was the first programming language"
       };

       String[][] options = {
               {"1. A software", "2. An internet tool", "3. Encrypting data", "4. Managing passwords"},
               {"1. 2001", "2. 2002", "3. 2022", "4. 2020"},
               {"1. A social media platform", "2. A wizard", "3. A laptop", "4. A death note"},
               {"1. COBOL", "2. C", "3. FORTRAN", "4. Java"}
       };

       int[] answers = {4, 3, 1, 3};
       int score = 0;
       int guess;

       Scanner scanner = new Scanner(System.in);

       System.out.println("****************************");
       System.out.println("Welcome to the Java Quiz game");
       System.out.println("****************************");


       for (int i = 0; i < questions.length; i++) {
           System.out.println(questions[i]);

           for (String option : options[i]) {
               System.out.println(option);
           }
           System.out.println("Enter your answer: ");
           guess = scanner.nextInt();

           if (guess == answers[i]){
               System.out.println("****************************");
               System.out.println("Correct");
               System.out.println("****************************");
score++;
           } else {
               System.out.println("****************************");
               System.out.println("Wrong!");
               System.out.println("****************************");

           }
       }

//       options array [][];
//       declare vars;
//       welcome message;
//       question loop
//               options;
//            get guess;
//            check for guess;
//       display final score
       System.out.println("Your final score is: " + score + " out of " + questions.length);
scanner.close();
   }




}
