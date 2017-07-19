package com.sc.utils;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderBillSeqFactory {
	
    private static Object locker = new Object();
	 private static int sn = 0;
     
     public static String nextSequence(){
    	 synchronized (locker){
             if(sn == 99999999){
                 sn = 0;
             }else{
                 sn++;
    	 	}
    	 return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+new DecimalFormat("00000000").format(sn ++);
         }
     }
    // 防止创建类的实例
    private OrderBillSeqFactory(){}
 
    public Class<String> getObjectType() {
        return String.class;
    }
 
    public boolean isSingleton() {
        return false;
    }
}
