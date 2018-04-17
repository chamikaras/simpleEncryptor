# simpleEncryptor
This is authored by chamikara samarasekara


1.you can simply encrypt your String with random genarated key
2.you can't decrypt to string without your decrypt key
3.This is only simple encryptor


 usage
================

1.copy SimpleEncryptor.class to java main folder

2.encrypt data

SimpleEncryptor se = SimpleEncryptor(MAXIMUM_LENTH_OF_STRING);
se.simpleencryptdata(TEXT_YOU_WANT_TO_ENCRYPT);
string encrypeddata = se.simpleEncryptor.getEncryptedData; //encrypted data
string key = se.getStringDecryptKey; //decrypted data
//if you want to get interger array of key use 
//se.getRawDecryptKey;

3.decrypt data

SimpleEncryptor se = SimpleEncryptor(MAXIMUM_LENTH_OF_STRING);
string decrypted data = se.getDecryptData(ENCRYPTED_TEXT,DECRYPT_KEY);


4