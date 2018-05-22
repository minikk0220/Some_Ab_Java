package SUN;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
public class AccountMain {
    public static void main(String[] args){
        System.out.print("-----------------家庭收支记账软件-----------------"
                +"\n1.显示收支明细"+"\n2.录入收入"+"\n3.录入支出"+"\n4.退出"+"\n请选择(1-4):");
        Scanner keyin = new Scanner(System.in);
        int myInput = keyin.nextInt();

        ArrayList<account> a = new ArrayList<>();
        double allMoney = 0;

        while(myInput != 4){

            if(myInput == 2){
                String type = "收入";

                System.out.println("本次收入金额:");
                double thisMoney = keyin.nextDouble();

                String block = keyin.nextLine();
                System.out.println("本次收入说明:");
                String description = keyin.nextLine();

                allMoney = allMoney + thisMoney;


                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String createTime  = simpleDateFormat.format(new Date());

                account account_in = new account(type,allMoney,thisMoney,description,createTime);
                a.add(account_in);
            }
            else if(myInput == 3){
                String type = "支出";

                System.out.println("本次支出金额:");
                double thisMoney = keyin.nextDouble();

                String block = keyin.nextLine();
                System.out.println("本次支出说明:");
                String description = keyin.nextLine();

                allMoney = allMoney - thisMoney;

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String createTime  = simpleDateFormat.format(new Date());

                account account_out = new account(type,allMoney,thisMoney,description,createTime);
                a.add(account_out);
            }
            else if(myInput == 1){
                System.out.println("-------------当前收支明细记录---------------");
                System.out.println("收支\t\t"+"账户金额\t\t"+"收支金额\t\t"+"说明\t\t"+"时间");

                for(int i = 0; i < a.size(); i++){
                    System.out.println(a.get(i).toString());
                }
            }
            System.out.println("-----------------家庭收支记账软件-----------------"
                    +"\n1.显示收支明细"+"\n2.录入收入"+"\n3.录入支出"+"\n4.退出"+"\n请选择(1-4):");
            myInput = keyin.nextInt();
        }

        if(myInput == 4){
            System.out.println("确认是否退出(Y/N):");
            String block = keyin.nextLine();
            char choose = keyin.nextLine().charAt(0);
            if(choose == 'N'){
                System.out.println("-----------------家庭收支记账软件-----------------"
                        +"\n1.显示收支明细"+"\n2.录入收入"+"\n3.录入支出"+"\n4.退出"+"\n请选择(1-4):");
                myInput = keyin.nextInt();
            }
        }
    }


}


