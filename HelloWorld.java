import java.util.Arrays;

public class HelloWorld {
  // 凯哥把我的分支弄脏了
  // 菲尼克斯测试下GUI提交操作
    // 添加个备注
    //完成 main 方法
    public static void main(String[] args) 
    {
        int[] scores = {89, -23, 64, 91, 119, 52, 73};
        HelloWorld topThree = new HelloWorld();
        topThree.outpTop3(scores);
    }
    
    //定义方法完成成绩排序并输出前三名的功能
    public void outpTop3( int[] scores)
    {
       // 给数组排序
       Arrays.sort(scores);

       // 判断成绩的有效性，如果成绩小于 0 或大于 100 ，则使用 continue 忽略此成绩
       int vaildSco = 0;
       
       for (int i = 0; i < scores.length; i++ )
       {
           
           if ( scores[i] < 0 || scores[i] > 100)
           {
               continue;
           }
           vaildSco ++;   
       }

       // 判断有效成绩的个数，如果有效成绩数大于 3 ，则输出成绩的前三名
       if (vaildSco > 3)
       {
              System.out.println("考试成绩的前三名为:");
              for (int j = scores.length-1; j >= scores.length-3; j--)
              {
                 if ( scores[i] < 0 || scores[i] > 100)
           {
               continue;
           }
                 System.out.println(scores[j]);  
              }
       }
       else 
       {
               System.out.println("有效成绩小于3个aa");
       }
    }
    
    
    
    
    
    
    
    
    
}