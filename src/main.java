import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String userName, password, answer, newpassword;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız:");
        userName = inp.nextLine();
        System.out.print("Şifreniz:");
        password = inp.nextLine();
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş Yapıldı");
        }
        else {
            System.out.println("Yanlış Şifre Girdiniz");

        System.out.println("Şifrenizi yenilemek ister misiniz?");
        System.out.print("evet,hayır:");}
        answer = inp.nextLine();
        if (answer.equals("evet")) {
            System.out.print("Yeni Şifre Girişi:");
            newpassword = inp.nextLine();
            if (newpassword.equals("java123")) {
                System.out.println("Yeni şifreniz,eski şifrelerinizden biriyle aynı olamaz. Tekrar deneyiniz.");
            } else {
                System.out.print("Şifreniz başarıyla değiştirildi.");
            }
        }
    }
}
