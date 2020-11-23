package bsu.rfe.java.group6.lab1.Seyidova.A7;

public class Breakfast {
    public static void main(String[] args) {
        Food[] breakfast = new Food[10];
        int sum = 0;
        int i = 0;
        System.out.println("Посчитаем количество продуктов");
        for (String arg1 : args)
        {
            String[] part = arg1.split("/");
            if (part[0].equals("Ice cream"))
            {
                Icecream Icecream = new Icecream(part[1]);
                Icecream.consume();
                sum++;
            }
            i++;
        }
        for(Food item: breakfast)
        {
            if(item != null)
                item.consume();
            else break;
        }
        System.out.println("Количество съеденных продуктов: " +sum);
    }
}