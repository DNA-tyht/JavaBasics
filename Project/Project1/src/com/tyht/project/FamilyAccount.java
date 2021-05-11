package com.tyht.project;

public class FamilyAccount extends Utility{
    
    public static void main(String [] args){
        
        boolean IsFlag = true;
        String details = "收支\t账户金额\t收支金额\t说    明\n";
        //初始金额
        int balance = 10000;
        int money;
        String info;
        
        while(IsFlag){
            
            System.out.println("-----------------家庭收支记账软件----------------");
            System.out.println("                   1 收支明细");
            System.out.println("                   2 登记收入");
            System.out.println("                   3 登记支出");
            System.out.println("                   4 退   出");
            System.out.println("");
            System.out.println("                   清选择(1-4)  ");
            
            //获取用户的选择
            char Selection = Utility.readMenuSelection();
            switch(Selection){
            
                case '1':
                    System.out.println("-----------------当前收支明细记录----------------");
                    System.out.println(details);
                    System.out.println("----------------------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额: ");
                    money = Utility.readNumber();
                    System.out.print("本次收入说明: ");
                    info = Utility.readString();
                    
                    //处理balance
                    balance += money;
                    //处理details
                    details += "收入\t" + balance + "\t" + money + "\t" + info;
                    
                    System.out.println("--------------------登记完成-------------------\n");
                    break;
                case '3':
                    System.out.print("本次支出金额: ");
                    money = Utility.readNumber();
                    System.out.print("本次支出说明: ");
                    info = Utility.readString();
                    
                    //处理balance
                    if(balance >= money){
                        balance -= money;
                    }
                    else{
                        System.out.println("支出超过账户额度");
                    }
                    //处理details
                    details += details += "收入\t" + balance + "\t" + money + "\t" + info;
                    
                    System.out.println("--------------------登记完成-------------------\n");
                    break;
                case '4':
                    System.out.print("确认是否退出(Y/N): ");
                    char IsExit = Utility.readConfirmSelection();
                    if(IsExit == 'Y'){
                        IsFlag = false;
                    }
            }
        }
    }
}

