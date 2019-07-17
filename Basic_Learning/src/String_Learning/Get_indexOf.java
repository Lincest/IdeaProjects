package String_Learning;

public class Get_indexOf {
    public static void main(String[] args) {
        String str = "We are the world";
        //从前往后找
        int index = str.indexOf("e");
        System.out.println(index);
        int index1 = str.indexOf("e",3);
        System.out.println(index1);

        //从后往前找
        int lastindex = str.lastIndexOf("e");
        System.out.println(lastindex);
        int lastindex1 = str.lastIndexOf("e",11);
        System.out.println(lastindex1);
    }

}

