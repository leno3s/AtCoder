package abc068;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MainC {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int target, num;
    String str = br.readLine();
    StringTokenizer st = new StringTokenizer(str);
    target = Integer.parseInt(st.nextToken());
    num = Integer.parseInt(st.nextToken());

    boolean[] to = new boolean[200000];
    boolean[] from = new boolean[200000];

    for (int i = 0; i < num; i++) {
      str = br.readLine();
      st = new StringTokenizer(str);
      to[Integer.parseInt(st.nextToken())] = true;
      from[Integer.parseInt(st.nextToken())] = true;
    }

    boolean flag = false;
    for (int i = 0; i < 200000 && flag == false; i++) {
      for (int j = 0; j < 200000 && flag == false; j++) {
        if (to[i] == true && from[j] == true) {
          System.out.println("POSSIBLE");
          flag = true;
          break;
        }
      }
    }

    if (!flag) {
      System.out.println("IMPOSSIBLE");
    }
  }

}
