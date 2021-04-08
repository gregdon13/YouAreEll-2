package controllers;

import org.apache.http.impl.client.CloseableHttpClient;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TransactionController {
    private String rootURL = "http://zipcode.rocks:8085";
    private MessageController msgCtrl;
    private IdController idCtrl;
    private CloseableHttpClient callClient;
    private Socket socket;

    public TransactionController() {}

    public TransactionController(MessageController m, IdController j) {
        this.msgCtrl = m;
        this.idCtrl = j;
    }

    //Connects to server
    public void getConnection() {
        try{
            InetAddress address;
            socket = new Socket(rootURL, 80);
            address = socket.getInetAddress();
            System.out.println("Connected to " + address);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //closes connection to server
    public void closeConnection() throws IOException {
        socket.close();
    }



//    public List<Id> getIds() {
//        return null;
//    }
//
//    public String postId(String idtoRegister, String githubName) {
//        Id tid = new Id(idtoRegister, githubName);
//        tid = idCtrl.postId(tid);
//        return ("Id registered.");
//    }


}
