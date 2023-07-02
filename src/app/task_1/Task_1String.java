package app.task_1;

public class Task_1String {

    public static void main(String[] args) {
        Task_1String ts = new Task_1String();
        ts.getData();
    }
    public String world = " brange, plum, tomato, onibn, grape";

    private void getData(){
        String[ ] world = getWorld().split(",");
        int count = 0;
        for(String s : world){
            count++;
            System.out.println(count + ") " + s);
        }

    }
    private  String getWorld(){
        return world.replace("b","o");

    }
}
