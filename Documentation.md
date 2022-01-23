# Ciphers Java

---
### Collection of simple ciphers implemented in Java

###Code can be compiled & run with:
```bash
javac Test.java XOR.java Cesar.java
java Test
```
---

The XOR Cipher works with any characters, the cesar cipher only with the following alphabet:
"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.,:;!\"§$%&/()=? "
---

##XOR
Input: either two char Arrays or two Strings.
The Key String must be equally long to the input or longer!



##Cesar

Input: String for input and int for the key.
To decrypt, negative keys can produce falsified results, so use the formula Cesar.a.length-(keylenght) to get the inverse key to decrypt the message.


