public class CountByThrees {
    public static void main(String[] args){
        dislpayWhileForward();
    }
    public static void dislpayWhileForward(){
        int count = 3;
        while (count <= 300){
            System.out.println(count);
            count = count + 3;
        }
    }
}
