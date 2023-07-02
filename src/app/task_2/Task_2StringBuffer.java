package app.task_2;

public class Task_2StringBuffer {
    public static void main(String[] args) {

        Task_2StringBuffer ts = new Task_2StringBuffer();
        ts.getWord();
    }

    public   String world ="orange, plum, tomato, onion, grape, onion";

       private StringBuffer getData(){
        StringBuffer sb = new StringBuffer(world);
        int index;
        for(int i = 0; i < sb.length(); i++){
            if((index = sb.indexOf("onion", i)) == i){
                sb.delete(index, index + "onion, ".length());
            }
        }
        return sb;
    }
    private void getWord(){
        String[ ]  word = getData().toString().split(", ");
        int count = 0;
        for (String s: word){
            count++;
            System.out.println(count + ") " + s);
        }
    }

}
