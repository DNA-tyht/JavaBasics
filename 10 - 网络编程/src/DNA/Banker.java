package DNA;

import java.util.Scanner;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/7/1 14:38
 */
public class Banker {
    //可利用的资源
    int[] available = new int[] {3, 3, 2};
    //每个进程的最大的资源数
    int[][] max = new int[][]{{7, 5, 3}, {3, 2, 2}, {9, 0, 2}, {2, 2, 2}, {4, 3, 3}};
    //每个进程目前拥有的资源数
    int[][] allocation = new int[][]{{7, 4, 1}, {1, 0, 1}, {0, 0, 2}, {1, 1, 2}, {2, 1, 1}};
    //每个进程需要的资源数
    int[][] need = new int[][]{{0, 1, 2}, {2, 2, 1}, {9, 0, 0}, {1, 1, 0}, {2, 2, 2}};

    //展示数据输出的每个进程的数据
    void showData () {
        System.out.print("可利用的资源:");
        for (int i = 0; i < 3; i++) {
            System.out.print(available[i] + " ");
        }
        System.out.println();
        System.out.println("进程号   Max           ALL         Need");
        System.out.println("      A  B  C       A  B  C       A  B  C");
        for (int i = 0; i < 5; i++) {
            System.out.print("  " + i + "   ");
            for (int j = 0; j < 3; j++)
                System.out.print(max[i][j] + "  ");
            System.out.print("     ");
            for (int j = 0; j < 3; j++)
                System.out.print(allocation[i][j] + "  ");
            System.out.print("     ");
            for (int j = 0; j < 3; j++)
                System.out.print(need[i][j] + "  ");
            System.out.println();
        }
    }

    //分配数据
    private void change (int inRequestNum, int[] inRequest) {
        if (inRequest[0] > need[inRequestNum][0] || inRequest[1] > need[inRequestNum][1] || inRequest[2] > need[inRequestNum][2]) {
            System.out.println("请求的资源超过了所需要的最大值，分配错误！");
            return;
        }
        if (inRequest[0] > available[0] || inRequest[1] > available[1] || inRequest[2] > available[2]) {
            System.out.println("可分配资源不足，请等待！");
            return;
        }
        //分配数据给请求的线程
        for (int i = 0; i < 3; i++) {
            //资源池中的资源减少
            available[i] = available[i] - inRequest[i];
            //当前线程资源增加
            allocation[inRequestNum][i] = allocation[inRequestNum][i] + inRequest[i];
            //当前线程需要的数量减少
            need[inRequestNum][i] = need[inRequestNum][i] - inRequest[i];
        }
        //进行安全性检查
        boolean flag = checkSafe(available[0], available[1], available[2]);
        if (flag) {
            System.out.println("能够安全分配！");
            //进程结束还回资源
            if (need[inRequestNum][0] == 0 && need[inRequestNum][1] == 0 && need[inRequestNum][2] == 0) {
                for (int i = 0; i < 3; i++) {
                    available[i] += max[inRequestNum][i];
                    max[inRequestNum][i] = 0;
                    allocation[inRequestNum][i] = 0;
                }
            }
        } else {
            System.out.println("不能安全分配！");
            for (int i = 0; i < 3; i++) {
                //还原
                available[i] = available[i] + inRequest[i];
                allocation[inRequestNum][i] = allocation[inRequestNum][i] - inRequest[i];
                need[inRequestNum][i] = need[inRequestNum][i] + inRequest[i];
            }
        }
    }

    private boolean checkSafe(int a, int b, int c) {
        int[] work = new int [3];
        work[0] = a;
        work[1] = b;
        work[2] = c;
        boolean[] finish = new boolean[5];
        int i = 0;
        while (i < 5) {
            if (!finish[i] && need[i][0] <= work[0] && need[i][1] <= work[1] && need[i][2] <= work[2]) {
                //System.out.println("分配成功的是" + i);
                for (int j = 0; j < 3; j++) {
                    work[j] += allocation[i][j];
                    finish[i] = true;
                    i = 0;
                }
            } else {
                i++;
            }
        }
        for (int j = 0; j < 5; j++) {
            if (!finish[j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Banker bank = new Banker();
        int[] request = new int[3];
        int requestNum;
        String[] source = new String[] {"A", "B", "C"};
        Scanner in = new Scanner(System.in);
        String choice;
        do {
            bank.showData();
            System.out.println("------------------------------------------------");
            System.out.print("请输入请求的进程号(0 - 4): ");
            requestNum = in.nextInt();
            System.out.println("请输入请求的资源数目: ");
            for (int i = 0; i < 3; i++) {
                System.out.print(source[i] + "资源数目: ");
                request[i] = in.nextInt();
            }
            bank.change(requestNum, request);
            System.out.print("是否退出(Y/N): ");
            choice = in.next();
        } while (!choice.equalsIgnoreCase("Y"));
    }
}