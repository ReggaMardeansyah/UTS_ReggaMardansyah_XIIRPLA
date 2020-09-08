package UTS;

public class substring {
    public static void main(String[] args) {
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ:-";

        System.out.println(alfabet);
        System.out.println("" + alfabet.substring(27,28));
        System.out.println("" + alfabet.substring(13,14)+ alfabet.substring(0,1)+ alfabet.substring(12,13)
                + alfabet.substring(0,1)+ alfabet.substring(26,27) + alfabet.substring(17,18)+ alfabet.substring(4,5)
                + alfabet.substring(6,7) + alfabet.substring(6,7) + alfabet.substring(0,1)+ alfabet.substring(27,28)
                + alfabet.substring(12,13)+ alfabet.substring(0,1)+ alfabet.substring(17,18)+ alfabet.substring(3,4)
                + alfabet.substring(4,5)+ alfabet.substring(0,1)+ alfabet.substring(13,14)+ alfabet.substring(18,19)
                + alfabet.substring(24,25)+ alfabet.substring(0,1)+ alfabet.substring(7,8));
        System.out.println("" + alfabet.substring(27,28));
        System.out.println("" + alfabet.substring(10,11)+ alfabet.substring(4,5)+ alfabet.substring(11,12)
                + alfabet.substring(0,1)+ alfabet.substring(18,19)+ alfabet.substring(26,27)+ alfabet.substring(23,24)
                + alfabet.substring(8,9)+ alfabet.substring(8,9)+ alfabet.substring(27,28)+ alfabet.substring(17,18)
                + alfabet.substring(15,16)+ alfabet.substring(11,12)+ alfabet.substring(27,28)+ alfabet.substring(0,1));
        System.out.println("" + alfabet.substring(27,28));
        System.out.println("" + alfabet.substring(15,16)+ alfabet.substring(1,2)+ alfabet.substring(14,15));
    }
}
