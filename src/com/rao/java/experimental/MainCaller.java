package com.rao.java.experimental;

import com.rao.java.experimental.apiServices.RandomPostCode;

import java.io.IOException;

/**
 To test selected APIs
 */

public class MainCaller {

    public static void main(String args[]) throws IOException {
        System.out.println("\n Random Post code is ====> "+ RandomPostCode.postCodeUK());

    }
}
