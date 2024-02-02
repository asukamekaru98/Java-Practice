import java.util.Arrays;

class Obj2 {
    public int value;
}

public class Java08_12_2 {
    public static void main(String args[]) {
        Obj2 obj[] = new Obj2[3];

        // Arrays.fill()メソッドを使用して初期化
        Arrays.fill(obj, new Obj()); // 要素を新しいObjオブジェクトで埋める

        // 初期化後の値を確認
        for (Obj2 o : obj) {
            System.out.println(o.value); // 0 0 0
        }
    }
}