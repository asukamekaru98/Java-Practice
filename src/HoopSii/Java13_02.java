package HoopSii;

public class Java13_02{
  public static void main(String args[]){
      try{
          System.out.println("main処理開始");
          meth1();
          System.out.println("main処理終了");
      }catch(Exception e){
          System.out.println("mainで例外発生:"+e);
      } finally{
          System.out.println("mainの例外チェック終了");
      }
  }
   
   
  static void meth1(){
      try{
          System.out.println("meth1処理開始");
          meth2();
          System.out.println("meth1処理終了");
      }catch(ArrayIndexOutOfBoundsException e){
          System.out.println("配列の要素外にアクセス:"+e);
      } finally{
          System.out.println("meth1の例外チェック終了");
      }
  }
   
  static void meth2(){
      try{
          System.out.println("meth2処理開始");
          meth3();
          System.out.println("meth2処理終了");
      }catch(NullPointerException e){
          System.out.println("空のインスタンスにアクセス:"+e);
      } finally{
          System.out.println("meth2の例外チェック終了");
      }
  }
   
  static void meth3(){
      try{
          System.out.println("meth3処理開始");
          int array[] = new int[3];
          array[4] = 10;
           
          meth4();
           
          System.out.println("meth3処理終了");
      }catch(ArithmeticException e){
          System.out.println("計算の例外が発生:"+e);
      } finally{
          System.out.println("meth3の例外チェック終了");
      }
  }
   
  static void meth4(){
      System.out.println("meth4の実行");
  }
}
