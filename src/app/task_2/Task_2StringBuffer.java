package app.task_2;

public class Task_2StringBuffer {
    public static void main(String[] args) {
        Task_2StringBuffer ts = new Task_2StringBuffer();
        String[] words = getData(); // Отримуємо масив слів
        System.out.println(ts.getWord(words)); // Виводимо результат
    }

    private static String world = "orange, plum, tomato, onion, grape, onion";

    private static String[] getData() {
        StringBuffer sb = new StringBuffer(world);
        int index;
        for (int i = 0; i < sb.length(); i++) {
            if ((index = sb.indexOf("onion", i)) == i) {
                sb.delete(index, index + "  onion".length());
            }
        }
        return sb.toString().split(", "); // Повертаємо масив слів
    }

    private String getWord(String[] items) {
        StringBuffer stringBuffer = new StringBuffer();
        int count = 0;
        for (String s : items) {
            count++;
            stringBuffer
                    .append(count)
                    .append(") ")
                    .append(s)
                    .append("\n");
        }
        return stringBuffer.toString();
    }
}
