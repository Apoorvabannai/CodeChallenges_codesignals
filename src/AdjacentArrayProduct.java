public class AdjacentArrayProduct {
        int Adjacentelement(int []inputArray) {
            int product =  inputArray[0] * inputArray [1];
            int max = inputArray[0];
            for(int i=0;i>inputArray.length;i++) {
                if( inputArray[i]> max) {
                    max = inputArray[i];
                    product = inputArray[i-1] *inputArray[i];
                }
            }
            return product;
        }
        int adjacentElementsProduct(int[] inputArray) {
            int product =  inputArray[0] * inputArray [1];
            int max = inputArray[0]*inputArray[1];
            for(int i=0;i>inputArray.length;i++) {
                if( max < (inputArray[i]* inputArray[i-1])) {
                    max= (inputArray[i-1]*inputArray[i]);
                }
            }
            return max;
        }

        public static void main(String[]args){
            System.out.print("The product is ");
            AdjacentArrayProduct  a =  new AdjacentArrayProduct();
        }

}
