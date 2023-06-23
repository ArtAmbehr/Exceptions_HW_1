public class Task_1 {
    public static void main(String[] args) {
        String[] sArray = {"first str", null, "third str"};
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        division(10, 0);
        printValueByIndex(array,12);
        printStringArray(sArray);

    }
    
    public static void division(double firstNum, double secondNum){
        if(secondNum ==  0) throw new ArithmeticException("Не делим на ноль");
        double result = firstNum/secondNum;
        System.out.printf("В результате деления %f на %f получаем %f.\n", firstNum, secondNum, result);
    }
    
    public static void printValueByIndex(int[] array, int index){
        if(index > array.length-1) throw new ArrayIndexOutOfBoundsException("Элемента с данным индексом нет");
        else System.out.printf("Элемент с индексом %d равен %d.\n",index, array[index]);
    }
    
    public static void printStringArray(String[] sArray){
        for (String item: sArray){
            if(item == null) throw new NullPointerException("Элемента не существует");
            System.out.println(item);
        }
    }
}