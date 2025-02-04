public class Main {
    public Main(){
        Requester r = new Requester();
        String resp = r.makeWebRequest("https://google.com");
        System.out.println(resp);
    }
    public static void main(String[] args) {
        new Main();
    }
}
