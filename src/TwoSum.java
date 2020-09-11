public class TwoSum {

    //compute two sum indices
    private static int[] getTwoSum(int[] numbers, int theTarget) {
        for (int i = 0; i < numbers.length; i++) { //loop the first number
            for (int j = i + 1; j < numbers.length; j++) { //loop the first number
                if (i != j) {//check if the two numbers are the same
                    if (numbers[i] + numbers[j] == theTarget) {  // check if the sum of the two numbers equals the target
                        return new int[]{i, j}; //return array of the indices
                    }
                }
            }
        }
        return new int[]{}; //return empty array if the solution cannot be found
    }

    public static void main(String[] args) {

        TwoSum program = new TwoSum();

        //Unsorted array of integers
        int[] numbers = {1, 13, 18, 20, 20, 30};

        //Target
        int theTarget = 40;
        System.out.print("Array : [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print( numbers[i]+ "  " );
        }
        System.out.print( "]");
        System.out.println("\nTarget : " + theTarget);
        System.out.print("\nOutput : ");

        //Invoking the getTwoSum() method
        int[] indices = program.getTwoSum(numbers, theTarget);

        if (indices.length == 2) {
            System.out.println("["+indices[0] + ", " + indices[1]+"]");
        }
        //Return -1 when same element is used twice
        else {
            System.out.println("-1");
        }
    }

}

