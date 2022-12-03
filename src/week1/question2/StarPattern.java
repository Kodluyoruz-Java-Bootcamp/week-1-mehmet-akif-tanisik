package week1.question2;

public class StarPattern {

    public static void main(String[] args) {

        StarPattern str = new StarPattern();

        System.out.println("-------------Left hand-side test case--------------");
        System.out.println("When row number is less than 0 --> rowNumber = -2");
        str.leftHandSidePattern(-1);
        System.out.println("When row number is greater than 0 --> rowNumber = 6");
        str.leftHandSidePattern(6);

        System.out.println("");

        System.out.println("-------------Right hand-side test case--------------");
        System.out.println("When row number is less than 0 --> rowNumber = -2");
        str.rightHandSidePattern(-1);
        System.out.println("When row number is greater than 0 --> rowNumber = 4");
        str.rightHandSidePattern(4);

    }

    /**
     * Prints the left-hand side pattern with given length of the rows with asterisks character (*)
     * @param rowNumber is length of the total row numbers
     */
    void leftHandSidePattern(int rowNumber){

            if (rowNumber>0){
                for (int i=1; i<=rowNumber; i++){
                    for (int j=0; j<i ; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Row number should be greater than 0.");
            }
    }

    /**
     * Prints the right-hand side pattern with given length of the rows with asterisks character (*)
     * @param rowNumber is length of the total row numbers
     */
    void rightHandSidePattern(int rowNumber){

        if (rowNumber>0){
            for (int i=1; i<=rowNumber; i++){
                for (int j=i ; j<rowNumber; j++){
                    System.out.print(" ");
                }
                for (int k=i; k>0 ; k--){
                    System.out.print("*");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Row number should be greater than 0.");
        }
    }
}
