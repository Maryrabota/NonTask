public class For1 {
    public static void main(String[] args) {
        String word = "S N PRASAD RAO 5 ";
        String[] data;
        int k=0;
        data=word.split("");
        for(int i=0;i<data.length;i++){
            if(data[i].equals(" ")){
                k++;
            }

        }
        System.out.println(k);
        for (int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }


    }
}
