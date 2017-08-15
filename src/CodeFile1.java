public class CodeFile1 {
    public static void main(String[] args) {

        int main =2;
        int prev =1;
        int prevPrev =1;

        for(int i=0; i<10; i++){

            main = main + prev;
            prev = prevPrev;


        }

        System.out.println(main);

    }
    }
