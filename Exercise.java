public class App {
    public static void main(String[] args) throws Exception {

        char [][] mdArray = {{'1','1','1'},{'1','1','1'},{'1','1','1'}, {'1', '1', '1'}};
    

        // PATTERN 1
        System.out.println("PATTERN 1");

        for (int row = 0; row < mdArray.length; row++) {

            System.out.println(" ");
            System.out.print("row" + row + ": ");
    
            for (int column = 0; column < 3; column++) {
                if (row % 2 != 0) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }

        // PATTERN 2
        System.out.println(" ");
        System.out.println("PATTERN 2");

        for (int row = 0; row < mdArray.length; row++) {

            System.out.println(" ");
            System.out.print("row" + row + ": ");

            for (int column = 0; column < 3; column++) {
            if (row % 2 == 0) {
                System.out.print(mdArray[row][column]);
            }
    }
}
        // PATTERN 3
        System.out.println(" ");
        System.out.println("PATTERN 3");

        for (int row = 0; row < mdArray.length; row++) {

            System.out.println(" ");
            //System.out.print("row" + row + ":");

            for (int column = 0; column < 3; column++) {
                if (row == 0 || row == 3) {
                    System.out.print(mdArray[row][column]);
                }
                else if ((row == 1 || row == 2) && column == 1) {
                    System.out.print(mdArray[row][column]);
                }
                else{
                    System.out.print(" ");
                }
        }
    }

        // PATTERN 4
        System.out.println(" ");
        System.out.println("PATTERN 4");

        for (int row = 0; row < mdArray.length; row++) {

            System.out.println(" ");
            //System.out.print("row" + row + ":");

            for (int column = 0; column < 3; column++) {
                if (row == 1 || row == 3) {
                    System.out.print(mdArray[row][column]);
                }
                else if ((row == 0 || row == 2) && column == 1) {
                    System.out.print(mdArray[row][column]);
                }
                else{
                    System.out.print(" ");
                }
        }
    }

        // PATTERN 5
        System.out.println("");
        System.out.println("PATTERN 5");

        int [][] mdArray2 = {{1,1,1},{1,1,1},{1,1,1},{1,1,1}};

        int sum = 0;
        for (int row = 0; row < mdArray.length; row++) {

            for (int column = 0; column < 3; column++) {
                    sum += mdArray2[row][column];
            }
        }
        System.out.println(sum);

    }
}
    