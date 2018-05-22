package SUN;


import java.util.ArrayList;
import java.util.Scanner;
public class Rent {
    public static void main(String[] args) {

        Scanner keyin = new Scanner(System.in);

        System.out.println("--------欢迎进入管理员系统--------");
        System.out.println("首次进入,管理员您需要先录入车辆信息:");
        System.out.println("请输入总共要录入的车辆数:");
        int carQut = keyin.nextInt();

        Cars[] CarQut = new Cars[carQut];
        for(int i = 0; i < carQut; i++){
            CarQut[i] = new Cars();
            CarQut[i].input();
        }

        System.out.println("-----------显示所有车辆信息----------");
        System.out.println("序号\t\t车名\t\t\t租金\t\t\t\t容量");
        for(int i = 0; i < carQut; i++){
            System.out.println(CarQut[i].toString());
        }
        System.out.println("-----------------------------------");

        System.out.println("进入管理员系统(非首次进入,只能修改数据)or用户系统?\t1.管理员系统\t2.用户系统\t3.退出整个系统\t请输入:");
        int choose = keyin.nextInt();

        while(choose ==1 || choose == 2){
            if(choose == 1){
                int choose_of_change =1;

                while(choose_of_change != 2){
                    System.out.println("请输入所需更改车辆的ID:");
                    int change_of_ID = keyin.nextInt();
                    System.out.println("请输入所需更改车辆的信息类型:"+"\t1.品牌"+"\t2.租金"+"\t3.容量(载货and载人)");
                    int choose_of_type = keyin.nextInt();

                    for(int i = 0; i < carQut; i++){
                        if(CarQut[i].getId() == change_of_ID){
                            switch(choose_of_type){
                                case 1:{
                                    System.out.println("请输入新品牌:");
                                    String block = keyin.nextLine();
                                    String newName = keyin.nextLine();
                                    CarQut[i].setName(newName);
                                    break;
                                }
                                case 2:{
                                    System.out.println("请输入新租金:");
                                    double newPrice = keyin.nextDouble();
                                    CarQut[i].setPrice(newPrice);
                                    break;
                                }
                                case 3:{
                                    System.out.println("请输入新容量:");
                                    double newCarryingCapacity = keyin.nextDouble();
                                    int newSeatingCapacity = keyin.nextInt();
                                    CarQut[i].setCarryingCapacity(newCarryingCapacity);
                                    CarQut[i].setSeatingCapacity(newSeatingCapacity);
                                    break;
                                }
                                default:System.out.println("只能改变该车辆的 品牌/租金/容量 信息!");
                            }
                        }
                    }

                    System.out.println("是否还要再更改其他车辆信息?"+"\t1.Yes"+"\t2.No");
                    choose_of_change = keyin.nextInt();



                }
                System.out.println("-----------显示所有车辆信息----------");
                System.out.println("序号\t\t车名\t\t\t租金\t\t\t\t容量");
                for(int i = 0; i < carQut; i++){
                    System.out.println(CarQut[i].toString());
                }
                System.out.println("-----------------------------------");

                System.out.println("进入管理员系统(非首次进入,只能修改数据)or用户系统?\t1.管理员系统\t2.用户系统\t3.退出整个系统\t请输入:");
                choose = keyin.nextInt();

            }
            if(choose == 2) {

                System.out.println("----------欢迎使用答答租车系统----------\n您是否要租车:1.是\t2.否");

                int in = keyin.nextInt();
                if (in == 1) {
                    System.out.println("序号\t\t车名\t\t\t租金\t\t\t\t容量");
                    for (int i = 0; i < carQut; i++) {
                        System.out.println(CarQut[i].toString());
                    }

                    System.out.println("请输入您要租汽车的数量:");
                    int allcar = keyin.nextInt();


                    double money = 0;
                    double allCarryingCapacity = 0;
                    int allSeatingCapacity = 0;
                    int[] carInId = new int[allcar];
                    ArrayList<String> carInCarrying = new ArrayList<>();
                    ArrayList<String> carInSeating = new ArrayList<>();


                    for (int i = 0; i < allcar; i++) {
                        System.out.println("请输入第" + (i + 1) + "辆车的序号:");
                        int thisId = keyin.nextInt();
                        carInId[i] = thisId;
                    }

                    System.out.print("请输入租车天数:");
                    int day = keyin.nextInt();


                    for (int i = 0; i < allcar; i++) {
                        money = money + day * CarQut[(carInId[i] - 1)].price;
                        if (CarQut[(carInId[i] - 1)].getCarryingCapacity() != 0) {
                            carInCarrying.add(CarQut[(carInId[i] - 1)].getName());
                            allCarryingCapacity = allCarryingCapacity + CarQut[(carInId[i] - 1)].getCarryingCapacity();
                        }
                        if (CarQut[(carInId[i] - 1)].getSeatingCapacity() != 0) {
                            carInSeating.add(CarQut[(carInId[i] - 1)].getName());
                            allSeatingCapacity = allSeatingCapacity + CarQut[(carInId[i] - 1)].getSeatingCapacity();
                        }


                    }

                    System.out.println("--------------------------\n租车成功,您的账单:");

                    System.out.println("******可载货的车有:");
                    for (int i = 0; i < carInCarrying.size(); i++) {
                        System.out.println(carInCarrying.get(i));
                    }
                    System.out.println("共载货:" + allCarryingCapacity + "吨");

                    System.out.println("******可载人的车有:");
                    for (int i = 0; i < carInSeating.size(); i++) {
                        System.out.println(carInSeating.get(i));
                    }
                    System.out.println("共载人:" + allSeatingCapacity + "人");
                    System.out.println("******租车共价格:" + money + "元");
                    break;
                }
                else {
                    System.out.println("已退出答答租车系统");
                    System.out.println("进入管理员系统or用户系统?\t1.管理员系统(非首次进入,只能修改数据)\t2.用户系统\t3.退出整个系统\t请输入:");
                    choose = keyin.nextInt();
                }
            }
        }
        if(choose == 3)
            System.out.println("已退出整个系统!");
        keyin.close();
    }
}

