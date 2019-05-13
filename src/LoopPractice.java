public class LoopPractice {

    public static void main(String [] args){

            displayWhileForward();
            displayWhileUp();
            displayDoDown();
            displayForBack();
            displayDoUp();
            displayForUp();

    }
    public static void displayWhileForward(){
        int count = 11;
        while (count >= 0){

            System.out.println(count);
            count = count - 1;
        }
    }
    public static void displayWhileUp(){
        int count = 0;
        while (count <= 11){

            System.out.println(count);
            count = count + 1;
        }
    }
    public static void displayDoDown(){
        int count = 11;
        do{
            System.out.println(count);
            count = count - 1;
        }while (count >= 0);
    }
    public static void displayDoUp(){
        int count = 0;
        do{
            System.out.println(count);
            count = count + 1;
        }while (count <= 11);
    }
    public static void displayForBack(){

        for(int i= 11; i >= 0; --i){
            System.out.println(i);
        }
    }
    public static void displayForUp(){
        for(int i= 0; i <= 11; ++i){
            System.out.println(i);
        }
    }
}
