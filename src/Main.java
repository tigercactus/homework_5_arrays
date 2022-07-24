public class Main {
    public static void main(String[] args) {

        //Задание 1

    int[]arr1 = new int[]{1,2,3};
    double[]arrDouble = new double[]{1.57, 7.654, 9.986};
    int[]arr3 = new int[5];
    arr3[0] = 11;
    arr3[1] = 22;
    arr3[2] = 33;
    arr3[3] = 44;
    arr3[4] = 55;


    //Задание 2
        for (int i = 0; i < arr1.length; i++) {
            if((i< arr1.length-1)){
            System.out.print(arr1[i] + ", ");}
            else{
                System.out.print(arr1[i] );}
            }
        System.out.println(" ");

        for (int i = 0; i < arrDouble.length; i++) {
            if((i< arrDouble.length-1)){
                System.out.print(arrDouble[i] + ", ");}
            else{
                System.out.print(arrDouble[i] );}
        }

        System.out.println(" ");

        for (int i = 0; i < arr3.length; i++) {
            if(i< (arr3.length -1)){
                System.out.print(arr3[i] + ", ");}
            else{
                System.out.print(arr3[i] );}
        }

        System.out.println(" ");
        //Задание 3
        int reverse = arr1.length-1;
        while(reverse > 0 ){
            System.out.print(arr1[reverse]+", ");
            reverse --;
        }
        System.out.print(arr1[0]);

        System.out.println(" ");

        int reverse2 = arrDouble.length-1;
        while(reverse2 > 0 ){
            System.out.print(arrDouble[reverse2]+", ");
            reverse2 --;
        }
        System.out.print(arrDouble[0]);
        System.out.println(" ");

        int reverse3 = arr3.length-1;
        while(reverse3 > 0 ){
            System.out.print(arr3[reverse3]+", ");
            reverse3 --;
        }
        System.out.print(arr3[0]);

        //Задание 4
        System.out.println(" ");

        for(int i = 0; i < arr1.length; i++){
            if (arr1[i] % 2 !=0){
            arr1[i]++;
            System.out.println(arr1[i]);}
            else{
                System.out.println(arr1[i]);
            }
        }





    }


    }
