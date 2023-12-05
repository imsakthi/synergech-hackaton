package program;
public class EmailValidator {

    static boolean isValidEmail(String email) {
 
        if (!Character.isLetter(email.charAt(0))) {
            return false;
        }       
        int atCount = 0;
        int dotCount = 0;

        for (char c : email.toCharArray()) {
            if (c == '@') {
                atCount++;
            } else if (c == '.') {
                dotCount++;
            }
        }
       if (atCount != 1 || dotCount != 1 || email.indexOf('@') > email.indexOf('.')) {
            return false;
        }
        int atIndex = email.indexOf('@');
        int dotIndex = email.indexOf('.');
        if (dotIndex - atIndex <= 1) {
            return false;
        }

        if (!email.endsWith("com")) {
            return false;
        }

       
        return true;
    }

    public static void main(String[] args) {
        
        System.out.println(isValidEmail("abcd@xyz.com"));     
            
    }
}


