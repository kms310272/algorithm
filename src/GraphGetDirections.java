package src;

public class GraphGetDirections {

    public static void main(String[] args){

        GraphGetDirections gd = new GraphGetDirections();

        boolean result = gd.getDirections(new int[][]
                        {
                                {0, 1, 0, 0},
                                {0, 0, 1, 0},
                                {0, 0, 0, 1},
                                {0, 1, 0, 0}
                        },
                0,
                2
        );
        System.out.println("true?"+result); // true


        boolean result2 = gd.getDirections(new int[][]
                        {
                                {0, 1, 0, 0, 0},
                                {0, 0, 0, 1, 0},
                                {0, 1, 0, 0, 0},
                                {0, 1, 1, 0, 0},
                                {1, 1, 1, 1, 0}
                        },
                1,
                4
        );
        System.out.println("false?"+result); // true
        System.out.println(result); // false
    }

    public boolean getDirections(int[][] matrix, int from, int to) {
        //0 -> 2

        //0 -> 5

        //1. 0 -> 2

        //2. 2 -> 4

        //3. 4 -> 5

        if (from == to) {
            return matrix[from][to] == 1 ? true : false;

        } else if (from < to) { // from(0) < to(2)

            //matrix[i][j]가 true라면 i -> j
            for (int i = from; i < to; i++) {
                if (matrix[i][i + 1] != 1) {
                    return false;
                }
            }
            return true;

            //1. 0부터 1까지 있는지 검사
            //   if(matrix[0][1] == true){
            //     return true;
            //   }
            //   //1. 1부터 2까지 있는지 검사
            //   if(matrix[1][2] == true){
            //     return true;
            //   }
            // //1. 2부터 3까지 있는지 검사
            //   if(matrix[2][3] == true){
            //     return true;
            //   }


        } else { // from > to
            return false;
        }


        //1.  0 -> 1 확인

        //2. 1 -> 2 있는지 확인


        //from -> to

        //1. from -> from + 1
        //2. from+1 -> from +2
        //...

        // from + n -> to


    }
}
