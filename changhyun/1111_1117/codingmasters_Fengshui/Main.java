import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        String[] maps = new String[n];

        for (int i=0; i<n; i++){
            maps[i] = br.readLine();
        }

        for(int x =0; x<n; x++){
            for(int y=0; y<m; y++){
                for(int ex =x; ex<n; ex++){
                    for(int ey=y; ey<m; ey++){


                        

                    }
                }
            }
        }
    }
}