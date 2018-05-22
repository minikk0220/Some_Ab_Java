package SUN;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
public class AccountMain {
    public static void main(String[] args){
        System.out.print("-----------------��ͥ��֧�������-----------------"
                +"\n1.��ʾ��֧��ϸ"+"\n2.¼������"+"\n3.¼��֧��"+"\n4.�˳�"+"\n��ѡ��(1-4):");
        Scanner keyin = new Scanner(System.in);
        int myInput = keyin.nextInt();

        ArrayList<account> a = new ArrayList<>();
        double allMoney = 0;

        while(myInput != 4){

            if(myInput == 2){
                String type = "����";

                System.out.println("����������:");
                double thisMoney = keyin.nextDouble();

                String block = keyin.nextLine();
                System.out.println("��������˵��:");
                String description = keyin.nextLine();

                allMoney = allMoney + thisMoney;


                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String createTime  = simpleDateFormat.format(new Date());

                account account_in = new account(type,allMoney,thisMoney,description,createTime);
                a.add(account_in);
            }
            else if(myInput == 3){
                String type = "֧��";

                System.out.println("����֧�����:");
                double thisMoney = keyin.nextDouble();

                String block = keyin.nextLine();
                System.out.println("����֧��˵��:");
                String description = keyin.nextLine();

                allMoney = allMoney - thisMoney;

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String createTime  = simpleDateFormat.format(new Date());

                account account_out = new account(type,allMoney,thisMoney,description,createTime);
                a.add(account_out);
            }
            else if(myInput == 1){
                System.out.println("-------------��ǰ��֧��ϸ��¼---------------");
                System.out.println("��֧\t\t"+"�˻����\t\t"+"��֧���\t\t"+"˵��\t\t"+"ʱ��");

                for(int i = 0; i < a.size(); i++){
                    System.out.println(a.get(i).toString());
                }
            }
            System.out.println("-----------------��ͥ��֧�������-----------------"
                    +"\n1.��ʾ��֧��ϸ"+"\n2.¼������"+"\n3.¼��֧��"+"\n4.�˳�"+"\n��ѡ��(1-4):");
            myInput = keyin.nextInt();
        }

        if(myInput == 4){
            System.out.println("ȷ���Ƿ��˳�(Y/N):");
            String block = keyin.nextLine();
            char choose = keyin.nextLine().charAt(0);
            if(choose == 'N'){
                System.out.println("-----------------��ͥ��֧�������-----------------"
                        +"\n1.��ʾ��֧��ϸ"+"\n2.¼������"+"\n3.¼��֧��"+"\n4.�˳�"+"\n��ѡ��(1-4):");
                myInput = keyin.nextInt();
            }
        }
    }


}


