package LoginPage01tek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    private List<String> emails = new ArrayList<>();
    private List<String> passwords = new ArrayList<>();

    public void register() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ad ve Soyad giriniz");
        String name = input.nextLine();

        String email;
        boolean isValid;
        boolean isExistEmail;

        do {
            System.out.println("E-mail giriniz");
            email = input.nextLine().trim();
            isValid = validateEmail(email);
            isExistEmail = this.emails.contains(email);

            if (isExistEmail) {
                System.out.println("Bu email ile kayıtlı kullanıcı var");
                isValid = false;
            }
        } while (!isValid);

        String password;
        boolean isValidPassword;

        do {
            System.out.println("Lütfen şifrenizi oluşturunuz");
            password = input.nextLine().trim();
            isValidPassword = isValidPassword(password);
        } while (!isValidPassword);

        User user = new User(name, email, password);

        this.emails.add(user.getEmail());
        this.passwords.add(user.getPassword());

        System.out.println("Tebrikler kayıt işleminiz tamamlandı");
        System.out.println("Email ve şifrenizi kullanarak sisteme giriş yapabilirsiniz");
    }

    public void login() {
        Scanner input = new Scanner(System.in);

        System.out.println("Email giriniz");
        String email = input.nextLine().trim();

        boolean existsEmail = this.emails.contains(email);

        if (existsEmail) {
            boolean isWrong = true;

            while (isWrong) {
                System.out.println("Şifrenizi giriniz");
                String password = input.nextLine().trim();
                int index = this.emails.indexOf(email);

                if (this.passwords.get(index).equals(password)) {
                    System.out.println("Sisteme hoş geldiniz");
                    isWrong = false;
                } else {
                    System.out.println("Şifreniz yanlış, tekrar deneyiniz");
                }
            }
        } else {
            System.out.println("Sisteme kayıtlı kullanıcı bulunamadı");
            System.out.println("Üye iseniz bilgilerinizi kontrol ediniz, değilseniz üye olunuz");
        }
    }

    private boolean validateEmail(String email) {
        // Email validation logic here
        // Return true if email is valid, otherwise false
        return true;
    }

    private boolean isValidPassword(String password) {
        // Password validation logic here
        // Return true if password is valid, otherwise false
        return true;
    }
}