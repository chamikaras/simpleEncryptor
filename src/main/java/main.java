public class main {


    public static void main(String[] args){
        SimpleEncryptor simpleEncryptor = new SimpleEncryptor(10);
        simpleEncryptor.simpleEncryptData("abcd");
        System.out.println("Encrypt Data - " + simpleEncryptor.getEncryptedData());
        System.out.println("Key - "+ simpleEncryptor.getStringDecryptKey());
        System.out.println(simpleEncryptor.getDecryptData(simpleEncryptor.getEncryptedData(),simpleEncryptor.getRawDecryptKey()));


    }
}
