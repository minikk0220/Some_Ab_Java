package SUN;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Cars{
    public int id;
    public String name;
    public double price;
    public double carryingCapacity;//�ػ�
    public int seatingCapacity;//����

    public Cars(){}
    public Cars(int id,String name,double price,double carryingCapacity,int seatingCapacity){
        id = this.id;
        name = this.name;
        price = this.price;
        carryingCapacity = this.carryingCapacity;
        seatingCapacity = this.seatingCapacity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public void input(){
        Scanner keyin = new Scanner(System.in);
        System.out.println("�����복��ID:");
        id = keyin.nextInt();

        System.out.println("�����복��Ʒ��:");
        String block = keyin.nextLine();
        name = keyin.nextLine();

        System.out.println("�����복�����:");
        price = keyin.nextDouble();

        System.out.println("�����복������(�ػ�and����,Eg:0 4):");
        carryingCapacity = keyin.nextDouble();
        seatingCapacity = keyin.nextInt();

    }


    public String toString() {
        if(seatingCapacity==0) {
            return id+".\t\t"+name+"\t\t"+price+"Ԫ/��\t\t�ػ�"+carryingCapacity+"��";
        }
        else if(carryingCapacity==0){
            return id+".\t\t"+name+"\t\t"+price+"Ԫ/��\t\t�ؿ�"+seatingCapacity+"��";
        }
        else{ return id+".\t\t"+name+"\t\t"+price+"Ԫ/��\t\t�ػ�"+carryingCapacity+"��\t\t�ؿ�"+seatingCapacity+"��";
        }
    }
}
