package com.offcn;


import java.io.EOFException;
import java.io.FileNotFoundException;
import java.util.*;

public class demo {
    public static void main(String[] args) throws FileNotFoundException {
        ATM(123,2);
    }
    public static void ATM(int password,double money) throws FileNotFoundException {
      //  try {
            System.out.println("请插卡...");
            System.out.println("插卡成功...");
            System.out.println("请输入密码:");
            System.out.println("输入密码正确,请输入取钱金额");
            if (money>1) {
                throw new FileNotFoundException("取钱金额过大异常");
            }
            System.out.println("请取钱");
      //  } catch (FileNotFoundException e) {
            System.out.println("你个傻叉!!");
      //  }finally {
            System.out.println("退卡");
      //  }
    }
}
