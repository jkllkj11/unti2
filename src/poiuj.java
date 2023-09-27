import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/*public class poiuj {
    public static void main(String[] args) {
        System.out.println("s");
        Scanner reader=new Scanner(System.in);
    }
}*/
/*public class poiuj {
    public static void main(String args[]) {
        String s1="hollo world";
        String s2="1010101";
        int a=1,b=32;
        System.out.println(a+b+s1+s2);
        String c=3.5f+"assa";
        System.out.println(c);
        String f=123+"";
        System.out.println(f);
    }
}*/
/*public class poiuj {
    public static void main(String args[]) {
        int mun1=100;
        int num2=0b1110;
        int num3=0754;
        int num4=0x456f;
        System.out.println("num1="+mun1);
        System.out.println("num2="+num2);
        System.out.println("num3="+num3);
        System.out.println("num4="+num4);
        char g='\u0021';
        System.out.println(g);
    }
}
*/
/*public class poiuj {
    public static void main(String args[]) {
        int a=10,b=8;
        System.out.println(a/b*b);
         double c=(double)a/b;
        System.out.println(c);
        byte r=126;
        r++;
        System.out.println(r);
    }
}8
 */
/*public class poiuj {
    public static void main(String[] args){
        StringBuffer s=new StringBuffer();
        s.append("大家好");
        System.out.println("s :"+s);
        System.out.println("length: "+s.length());
        System.out.println("capacity :"+s.capacity());
        s.setCharAt(0,'w');
        s.setCharAt(1,'e');
        System.out.println("s  :"+s);
        s.insert(2,"are all");
        System.out.println(s);
        int index=s.indexOf("好");
        System.out.println(index);
        System.out.println(s.length());
        s.replace(index,s.length(),"right");
        System.out.println(s);
    }
}*/
//public class poiuj {
//    public static void main(String[] args) {
//        //String s="aa dd sw er vds";
//        /*String []w=s.split(" ");
//        StringBuffer t=new StringBuffer();
//        StringBuffer l=new StringBuffer();
//        for(int i=0;i<w.length;i++){
//            t=t.append(w[i]);
//            l=l.append(t.reverse());
//            int x=w[i].length();
//            t=t.delete(0,x);
//            System.out.print(l+" ");
//            l=l.delete(0,x);
//        }*/
//
//
//        String s="we de af gh ju it";
//        String name[]=s.split(" ");
//        StringBuffer ans=new StringBuffer();
//        for(int i=0;i<name.length;i++){
//            StringBuffer t=new StringBuffer();
//            t=t.append(name[i]);
//            ans=ans.append(t.reverse());
//            ans=ans.append(" ");
//            //System.out.print(t.reverse()+" ");
//        }
//        System.out.println(ans);
//    }
//}


/*public class poiuj {
    public static void main(String[] args) {
        String s="我嗨李四各位哦给李四复位后发我肥沃李四放我访问后李樊红伟四分嚄嚄嚄范围李四佛为红包蓝色配个好玩李四";
        String name="李四";
        int count=0;
        int x=s.indexOf(name);
        while(x!=-1){
            System.out.println(x+count);
            count=count+x+name.length();
            s=s.substring(x+name.length());
            x=s.indexOf(name);
        }
        StringBuffer e=new StringBuffer("d");
        StringBuffer we=new StringBuffer("d");
        String s1="a";
        String s2="a";
        System.out.println(e.equals(we));
        System.out.println(s1.equals(s2));
    }
}*/


//public class poiuj {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int aa = 100;
//        String bb = "100";
//        int c = 100;
//        //String str11 = sc.next();
//        //String str22 = sc.next();
//        // 包装类中“==”与equals的用法比较
//        // 值得注意的是，包装类中的equals方法和String类一样，都是重写了Object类中的equals方法，因此比较的是内容而不是地址，
//        // 而“==”比较的依然是引用变量的地址，只是当包装类型和与之相对应的基本类型进行“==”比较时会先做自动拆箱处理。
//
//        Integer a=new Integer(aa);
//        Integer b=new Integer();
//        if(a==b){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }
//        if(a==c){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }
//        if(b==c){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }
//    }
//}
//包装类中“==”与equals的用法比较
// 值得注意的是，包装类中的equals方法和String类一样，都是重写了Object类中的equals方法，因此比较的是内容而不是地址，

//public class poiuj {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        String s=scanner.next();
//        if(s.length()<1){
//            return;
//        }
//        String str1,str2,str="";
//        int start=0,end=0,df=0;
//        for(int i=0;i<s.length();i++){
//            str1=center(s,i,i);
//            str2=center(s,i,i+1);
//            int len1=str1.length();
//            int len2=str2.length();
//            int len=Math.max(len1,len2);
//            if(len==len1&&df<len){
//                  str=str1;
//                   df=len;
//            }else {
//                  str=str2;
//                   df=len;
//            }
//        //    System.out.println(str);
//        }
//        System.out.println(str);
//    }
//    public static String center(String s,int left,int right){
//        while(left>=0&&right< s.length()&&s.charAt(left)==s.charAt(right)){
//            --left;
//            ++right;
//        }
//        return s.substring(left+1,right);
//    }
//
//}


public class poiuj {
    public static void main(String[] args) {

//        int prices[]={7,1,5,3,6,4};
//        int n=prices.length;
//        int [][]dp=new int[n][2];
//        dp[0][0]=0;
//        dp[0][1]=-prices[0];
//        for(int i=1;i<n;i++){
//            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
//            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
//        }
//        System.out.println(dp[n-1][0]);
       int prices[]={7,1,5,3,6,4};
       int n=prices.length;
       int res=0;
       //int [][]dp=new int[n][2];
        for(int i=0;i<n-1;i++){
            int tem=prices[i+1]-prices[i];
            if(tem>0){
                res+=tem;
            }
            System.out.println(res);
        }

    }
}