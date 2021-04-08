package youareell;

import controllers.*;

public class YouAreEll {

    TransactionController tt;
    MessageController messageController;
    IdController idController;

    public YouAreEll (TransactionController t) {
        this.tt = t;
    }

    public YouAreEll(MessageController messageController, IdController idController, TransactionController t) {
        this.tt = t;
        this.idController = idController;
        this.messageController = messageController;
    }

    public TransactionController getTt() {
        return tt;
    }

    public void setTt(TransactionController tt) {
        this.tt = tt;
    }

    public MessageController getMessageController() {
        return messageController;
    }

    public void setMessageController(MessageController messageController) {
        this.messageController = messageController;
    }

    public IdController getIdController() {
        return idController;
    }

    public void setIdController(IdController idController) {
        this.idController = idController;
    }
//    public static void main(String[] args) {
//        // hmm: is this Dependency Injection?
//        YouAreEll urlhandler = new YouAreEll(
//            new TransactionController(
//                new MessageController(), new IdController()
//        ));
//        System.out.println(urlhandler.MakeURLCall("/ids", "GET", ""));
//        System.out.println(urlhandler.MakeURLCall("/messages", "GET", ""));
//    }
//

//    public String get_ids() {
//        return tt.makecall("/ids", "GET", "");
//    }
//
//    public String get_messages() {
//        return MakeURLCall("/messages", "GET", "");
//    }


}
