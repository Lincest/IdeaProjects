package Exception_Learning;

public class demo {
    public static void main(String[] args) {
        try{
            int a=1/0;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
    }

}
