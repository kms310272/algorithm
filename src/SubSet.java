package src;

public class SubSet {
    public static void main(String[] args) {
        SubSet subSet = new SubSet();

        int[] base = new int[]{1, 2, 3, 4, 5};
        int[] sample = new int[]{1, 3};
        boolean output = subSet.isSubsetOf(base, sample);
        System.out.println(output); // --> true

        sample = new int[]{6, 7};
        output = subSet.isSubsetOf(base, sample);
        System.out.println(output); // --> false

        base = new int[]{10, 99, 123, 7};
        sample = new int[]{11, 100, 99, 123};
        output = subSet.isSubsetOf(base, sample);
        System.out.println(output); // --> false
    }
    public boolean isSubsetOf(int[] base, int[] sample) {
        for(int i = 0; i<base.length; i++){
            for(int j = 0; j<sample.length; j++){
               if(base[i] == sample[j]){
                   return true;
               }
            }
        }
        return false;
    }
}
