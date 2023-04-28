class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int [] img : image){
            for(int i=0; i*2<n; i++){
                if(img[i] == img[n-i-1])
                    img[i] = img[n-i-1]^=1;
            }
        }
        return image;
    }
}

  