import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task1 {

    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(7, -12, 1, 792, 2, 39, 3, 55);
            System.out.println(array);
    
            System.out.println(removeEvenValue(array));
            System.out.println(getMax(array));
            System.out.println(getMin(array));
            System.out.println(getAverage(array));
    
    }
    
    // Нужно удалить из него четные числа
    
    public static List<Integer> removeEvenValue(List<Integer> list){
        ArrayList<Integer> temp = new ArrayList<>();
    
        for(int i = 0; i < list.size(); i++){
            if(list.get(i)% 2 != 0){
                temp.add(list.get(i));
                }
        }
    
    
    
        return temp;
    }
    
    // Найти минимальное значение
    public static Integer getMin(List<Integer> list){
    
        int min = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < min){
                min = list.get(i);
            }
    
    
        }
    
        return min;
    }
    
    // Найти максимальное значение
    public static Integer getMax(List<Integer> list){
        int max = 0;
        for(int i = 0; i < list.size(); i++){
    
            if(list.get(i)> max){
                max = list.get(i);
                }
        }
    
        return max;
    }
    
    // Найти среднее значение
    public static Integer getAverage(List<Integer> list){
        int sum = 0;
        int average = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        average = sum/list.size();
        return average;
    }

    
}
