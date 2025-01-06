public class FlipInvert {
    public static void main(String[] args) {
        int ans [][]= {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
    }
    static int[][] flipAndInvertImage(int[][] image) {
        //  first reverse the row

        for (int i = 0; i <image.length ; i++) {
           int start =0;
            int end = image[i].length-1;
            while(start<=end){
                int temp = image[i][start];
                image[i][start]= image[i][end] & 0;
                image[i][end] = temp &0;
                start++;
                end--;
            }

        }


        return image;
    }
}
