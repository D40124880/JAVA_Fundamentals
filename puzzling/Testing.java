public class Testing {
    public static void main(String[] args) {
        Puzzling pi = new Puzzling();

        int[] myArray = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
        System.out.println(pi.greaterThanTen(myArray));

        String[] myArray2 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        System.out.println(pi.shuffleArr(myArray2));

        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        pi.alphaShuffle(alphabet);
        System.out.println(pi.randNum());
        System.out.println(pi.randArrayFun());
        pi.randString();
        pi.randStringArr();
    }
}
