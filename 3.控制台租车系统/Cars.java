package SUN;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Cars{
    public int id;
    public String name;
    public double price;
    public double carryingCapacity;//载货
    public int seatingCapacity;//载人

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
        System.out.println("请输入车辆ID:");
        id = keyin.nextInt();

        System.out.println("请输入车辆品牌:");
        String block = keyin.nextLine();
        name = keyin.nextLine();

        System.out.println("请输入车辆租金:");
        price = keyin.nextDouble();

        System.out.println("请输入车辆容量(载货and载人,Eg:0 4):");
        carryingCapacity = keyin.nextDouble();
        seatingCapacity = keyin.nextInt();

    }


    public String toString() {
        if(seatingCapacity==0) {
            return id+".\t\t"+name+"\t\t"+price+"元/天\t\t载货"+carryingCapacity+"吨";
        }
        else if(carryingCapacity==0){
            return id+".\t\t"+name+"\t\t"+price+"元/天\t\t载客"+seatingCapacity+"人";
        }
        else{ return id+".\t\t"+name+"\t\t"+price+"元/天\t\t载货"+carryingCapacity+"吨\t\t载客"+seatingCapacity+"人";
        }
    }
}
