package com.example.djf.observermodel.javaobserver;

/**
 * Created by djf on 2016/6/16 13:17.
 * 工程名称： ObserverModel
 * 包名称：   com.example.djf.observermodel.javaobserver
 * 文件名称： Test
 */
public class Test {
    public static void main(String[] args)
    {
        SubjectFor3d subjectFor3d = new SubjectFor3d() ;
        SubjectForSSQ subjectForSSQ = new SubjectForSSQ() ;

        Observer1 observer1 = new Observer1();
        observer1.registerSubject(subjectFor3d);
        observer1.registerSubject(subjectForSSQ);


        subjectFor3d.setMsg("hello 3d'nums : 110 ");
        subjectForSSQ.setMsg("ssq'nums : 12,13,31,5,4,3 15");

        int n=1;
        System.out.println(n+"级台阶有"+getCount(n)+"种方法");

       getTheNum(1343427);

    }

    public static int getCount(int n){
        if(n<=0){
            return -1;
        }else if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else{
            return getCount(n-1)+getCount(n-2);
        }
    }

    /**
     * 获得数字的位数
     * @param x
     * @return
     */
   static int getWeiShu(int x){
      return String.valueOf(x).length();
   }

    /**
     * 获得数字去掉任意一位数字得到的数字的数组
     * @param x
     * @return
     */
    static int[] getAfter(int x){
        int count=getWeiShu(x);
        int[] arr = new int[count];
        for(int i=0;i<count;i++){
            arr[i]= (int) ((int)(x/Math.pow(10,i+1))*Math.pow(10,i)+x%Math.pow(10,i));
            System.out.println(arr[i]);
        }
        return arr;
    }

    /**
     * 获得去掉数字后得到的最小数在数组中的位置
     *  @param arr
     * @return
     */
    static int  getLoca(int[] arr){
        int min=arr[0];
        int l=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
                l=i;
            }
        }

        return l;
    }

    static void getTheNum(int x){
        int m=0;
        int w=getWeiShu(x);
        int[] arr=getAfter(x);
        int l=getLoca(arr);
        int v =x %(int) Math.pow(10, l + 1) /(int)Math.pow(10, l);
        System.out.println("去掉从右向左第"+(l+1)+"个数字"+v+"得到最小数"+arr[l]);
    }
}
