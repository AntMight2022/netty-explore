package xyz.zerotone.explore.bio.client;

import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class BioClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.0.19", 4455);
            System.out.println("maloong bio client start done.");
            BioClientHandler bioClientHandler = new BioClientHandler(socket, StandardCharsets.UTF_8);
            bioClientHandler.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
