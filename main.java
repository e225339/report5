public class main {
    public static void main(String[] args) {
        String str = null; 

        try {
            System.out.println(str.length()); 
        } catch (NullPointerException e){
            System.out.println("NullPointerExceptionが発生しました");
            System.out.println("例外メッセージ: " + e.getMessage());
        }
    }
}