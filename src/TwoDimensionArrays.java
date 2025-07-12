public class TwoDimensionArrays {
   public static void main (String[] args) {
//       String[] fruits = {"Apple", "Banana", "Watermelon"};
//       String[] vegetables = {"Lettuce", "Cabbage", "Carrot"};
//       String[] meats = {"Beef", "Chicken", "Pork", "Fish"};

//    to make an array made of arrays
//       String[][] groceries = {fruits, vegetables, meats}; OR

       String[][] groceries = {
               {"Apple", "Banana", "Watermelon"},
               {"Lettuce", "Cabbage", "Carrot"},
               {"Beef", "Chicken", "Pork", "Fish"}
       };

       groceries[1][2] = "Celery";


       for(String[] grocery : groceries){
           for (String item : grocery){

           System.out.print(item + " ");
           }
           System.out.println();
       }
   }


}
