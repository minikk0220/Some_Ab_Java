package SUN;


import java.util.ArrayList;
import java.util.Scanner;
public class Rent {
    public static void main(String[] args) {

        Scanner keyin = new Scanner(System.in);

        System.out.println("--------��ӭ�������Աϵͳ--------");
        System.out.println("�״ν���,����Ա����Ҫ��¼�복����Ϣ:");
        System.out.println("�������ܹ�Ҫ¼��ĳ�����:");
        int carQut = keyin.nextInt();

        Cars[] CarQut = new Cars[carQut];
        for(int i = 0; i < carQut; i++){
            CarQut[i] = new Cars();
            CarQut[i].input();
        }

        System.out.println("-----------��ʾ���г�����Ϣ----------");
        System.out.println("���\t\t����\t\t\t���\t\t\t\t����");
        for(int i = 0; i < carQut; i++){
            System.out.println(CarQut[i].toString());
        }
        System.out.println("-----------------------------------");

        System.out.println("�������Աϵͳ(���״ν���,ֻ���޸�����)or�û�ϵͳ?\t1.����Աϵͳ\t2.�û�ϵͳ\t3.�˳�����ϵͳ\t������:");
        int choose = keyin.nextInt();

        while(choose ==1 || choose == 2){
            if(choose == 1){
                int choose_of_change =1;

                while(choose_of_change != 2){
                    System.out.println("������������ĳ�����ID:");
                    int change_of_ID = keyin.nextInt();
                    System.out.println("������������ĳ�������Ϣ����:"+"\t1.Ʒ��"+"\t2.���"+"\t3.����(�ػ�and����)");
                    int choose_of_type = keyin.nextInt();

                    for(int i = 0; i < carQut; i++){
                        if(CarQut[i].getId() == change_of_ID){
                            switch(choose_of_type){
                                case 1:{
                                    System.out.println("��������Ʒ��:");
                                    String block = keyin.nextLine();
                                    String newName = keyin.nextLine();
                                    CarQut[i].setName(newName);
                                    break;
                                }
                                case 2:{
                                    System.out.println("�����������:");
                                    double newPrice = keyin.nextDouble();
                                    CarQut[i].setPrice(newPrice);
                                    break;
                                }
                                case 3:{
                                    System.out.println("������������:");
                                    double newCarryingCapacity = keyin.nextDouble();
                                    int newSeatingCapacity = keyin.nextInt();
                                    CarQut[i].setCarryingCapacity(newCarryingCapacity);
                                    CarQut[i].setSeatingCapacity(newSeatingCapacity);
                                    break;
                                }
                                default:System.out.println("ֻ�ܸı�ó����� Ʒ��/���/���� ��Ϣ!");
                            }
                        }
                    }

                    System.out.println("�Ƿ�Ҫ�ٸ�������������Ϣ?"+"\t1.Yes"+"\t2.No");
                    choose_of_change = keyin.nextInt();



                }
                System.out.println("-----------��ʾ���г�����Ϣ----------");
                System.out.println("���\t\t����\t\t\t���\t\t\t\t����");
                for(int i = 0; i < carQut; i++){
                    System.out.println(CarQut[i].toString());
                }
                System.out.println("-----------------------------------");

                System.out.println("�������Աϵͳ(���״ν���,ֻ���޸�����)or�û�ϵͳ?\t1.����Աϵͳ\t2.�û�ϵͳ\t3.�˳�����ϵͳ\t������:");
                choose = keyin.nextInt();

            }
            if(choose == 2) {

                System.out.println("----------��ӭʹ�ô���⳵ϵͳ----------\n���Ƿ�Ҫ�⳵:1.��\t2.��");

                int in = keyin.nextInt();
                if (in == 1) {
                    System.out.println("���\t\t����\t\t\t���\t\t\t\t����");
                    for (int i = 0; i < carQut; i++) {
                        System.out.println(CarQut[i].toString());
                    }

                    System.out.println("��������Ҫ������������:");
                    int allcar = keyin.nextInt();


                    double money = 0;
                    double allCarryingCapacity = 0;
                    int allSeatingCapacity = 0;
                    int[] carInId = new int[allcar];
                    ArrayList<String> carInCarrying = new ArrayList<>();
                    ArrayList<String> carInSeating = new ArrayList<>();


                    for (int i = 0; i < allcar; i++) {
                        System.out.println("�������" + (i + 1) + "���������:");
                        int thisId = keyin.nextInt();
                        carInId[i] = thisId;
                    }

                    System.out.print("�������⳵����:");
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

                    System.out.println("--------------------------\n�⳵�ɹ�,�����˵�:");

                    System.out.println("******���ػ��ĳ���:");
                    for (int i = 0; i < carInCarrying.size(); i++) {
                        System.out.println(carInCarrying.get(i));
                    }
                    System.out.println("���ػ�:" + allCarryingCapacity + "��");

                    System.out.println("******�����˵ĳ���:");
                    for (int i = 0; i < carInSeating.size(); i++) {
                        System.out.println(carInSeating.get(i));
                    }
                    System.out.println("������:" + allSeatingCapacity + "��");
                    System.out.println("******�⳵���۸�:" + money + "Ԫ");
                    break;
                }
                else {
                    System.out.println("���˳�����⳵ϵͳ");
                    System.out.println("�������Աϵͳor�û�ϵͳ?\t1.����Աϵͳ(���״ν���,ֻ���޸�����)\t2.�û�ϵͳ\t3.�˳�����ϵͳ\t������:");
                    choose = keyin.nextInt();
                }
            }
        }
        if(choose == 3)
            System.out.println("���˳�����ϵͳ!");
        keyin.close();
    }
}

