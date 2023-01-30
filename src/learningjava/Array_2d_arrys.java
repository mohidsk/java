package learningjava;

public class Array_2d_arrys {
    public static void main(String[] args) {
        int [][]mohid = new int[2][3] ;
        mohid[0][0] = 4;
        mohid[0][1] = 5;
        mohid[0][2] = 6;
        mohid[1][0] = 7;
        mohid[1][1] = 8;
        mohid[1][2] = 9;
        for(int i=0;i<mohid.length;i++){
            for(int j=0;j < mohid[i].length;j++){
                System.out.print(mohid[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
