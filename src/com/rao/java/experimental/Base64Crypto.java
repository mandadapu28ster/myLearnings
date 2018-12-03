package com.rao.java.experimental;

import org.apache.commons.codec.binary.Base64;

import java.io.File;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Base64Crypto {

    static int newTimeMin=0,newTimeHr=0;

    public static void main(String args[]) throws Exception {

        //String password = "mi11eNium";
        //String nonce = "S0RFTEdES0dMMUAzXzVB";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter below parameters,No values supplied means default values are replaced as respective ... Password is mandatory " );
        System.out.println("Password to convert base64  = " );
        String password = scanner.nextLine();
        System.out.println("If interested to supply Nonce (Usually valid for 1 day, but once used it will expire, if interested to create more than 1 Digest input will be discarded) = " );
        String nonce = scanner.nextLine();
        System.out.println("Any interest to supply start time ? update as 2018-11-27T14:40:00.00Z format = " );
        String created = scanner.nextLine();

        System.out.println("How many base64 passwords required and time gap ? Example 10 with time gap 2 mins; maximum 5 mins gap preferred" );
        int i = scanner.nextInt();
        int j =scanner.nextInt();

        if (password.isEmpty())
            System.exit(0);
        if (nonce.isEmpty())
            nonce = generateNonce();
        if (created.isEmpty())
        {
            DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            dateFormatter.setTimeZone(TimeZone.getTimeZone("GMT"));
            Date today = Calendar.getInstance().getTime();
            created = dateFormatter.format(today);
        }
        String date[] = new String[1];
        String dateHr[] = new String[1];
        if(j!=1) {
            date = created.split(":");
            dateHr=date[0].split("T");
        }

        PrintStream o = new PrintStream(new File("OutPut.txt"));
        PrintStream console = System.out;
        System.setOut(o);


        for (int k=0;k<i;k++) {

            if (i!=1) {
                nonce = generateNonce();
                if(k!=0){
                    newTimeMin = Integer.parseInt(date[1]) + j;
                    if (newTimeMin <= 60){
                        if(newTimeMin<10)
                            created = date[0] + ":0" + newTimeMin + ":" + date[2];
                        else created = date[0] + ":" + newTimeMin + ":" + date[2];
                    }
                    else {
                        newTimeMin = newTimeMin - 60;
                        if (newTimeHr >= 24) {
                            System.out.println("Time stamp reached 24 hr clock limit; re run with limited time range/iteration before midnight 12:00  ");
                            System.exit(0);
                        }
                        date[0] = dateHr[0] + "T" +newTimeHr;
                        if(newTimeMin<10)
                            created = date[0] + ":0" +newTimeMin + ":" +date[2];
                        else
                            created = date[0] + ":" +newTimeMin + ":" +date[2];
                    }
                    date = created.split(":");
                }
            }
            System.out.println("Nonce = " + nonce);


            System.out.println("Created = " + created);

            String passwordDigest = buildPasswordDigest(nonce, created, password);
            System.out.println("Password Digest = " + passwordDigest);
            System.out.println("");
        }
    }

    private static String buildPasswordDigest(String nonce, String created, String password) throws NoSuchAlgorithmException, UnsupportedEncodingException
    {
        MessageDigest sha1;
        String passwordDigest = null;

        try
        {
            sha1 = MessageDigest.getInstance("SHA-1");
            sha1.update(Base64.decodeBase64(nonce));
            sha1.update(created.getBytes("UTF-8"));
            passwordDigest = new String(Base64.encodeBase64(sha1.digest(password.getBytes("UTF-8"))));
            sha1.reset();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }

        return passwordDigest;
    }

    private static String generateNonce() throws NoSuchAlgorithmException, NoSuchProviderException, UnsupportedEncodingException
    {
        String dateTimeString = Long.toString(new Date().getTime());
        byte[] nonceByte = dateTimeString.getBytes();
        return Base64.encodeBase64String(nonceByte);
    }
}
