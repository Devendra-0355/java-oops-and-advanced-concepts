class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

class CustomException {
    static void checkAge(int age) throws AgeException {
        if (age < 18)
            throw new AgeException("Not eligible");
        else
            System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
