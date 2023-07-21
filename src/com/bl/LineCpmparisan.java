package com.bl;

public class LineCpmparisan {
    public static void main(String[] args) {
        double first_x1 = 6, first_x2 = 7;
        double first_y1 = 7, first_y2 = 9;

        double second_x1 = 23 , second_x2 = 15;
        double second_y1 = 63, second_y2 = 27;

        double first_x_Value_of_squire = Math.pow((first_x2 - first_x1),2);
        double first_y_valur_of_squire = Math.pow((first_y2 - first_y1),2);

        double lenght_Of_Line1 = Math.sqrt(first_x_Value_of_squire + first_y_valur_of_squire);
        System.out.println("Line1 = " + " " +lenght_Of_Line1);

        double second_x_Value_of_squire = Math.pow((second_x2 - second_x1),2);
        double second_y_valur_of_squire = Math.pow((second_y2 - second_y1),2);

        double lenght_Of_Line2 = Math.sqrt(second_x_Value_of_squire + second_y_valur_of_squire);
        System.out.println("Line2 = " + " " +lenght_Of_Line2);


    }
}
