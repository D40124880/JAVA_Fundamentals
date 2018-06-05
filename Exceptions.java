// trying and catching methods are being used to "try" a certain code
// and if it does not work then it will "catch" something else in case of an error


// It is a little like if you were to ask a friend if they could deliver a message 
// for you, and they said, "sure, but my car might run out of gas - if it does, I'll 
// call you and tell you." In that scenario, your friend delivering the message 
// is the risky operation, the car running out of gas is the exceptional situation, 
// and their calling you is the throwing of the exception - which is the message that they ran out of gas!

// In this scenario, the letter might be important enough that it must be delivered. 
// If the message must be delivered, then once your friend alerts you to the situation, 
// you can figure out how to deal with the situation, rather than letting everything fall apart.

// What about our program, how can we make sure that it continues to run?

import java.util.Random;
class OutOfGasException extends Exception{}
class UnreliableFriend {
    public boolean deliverMessage() throws OutOfGasException{
        Random r = new Random();
        boolean hasGas = r.nextBoolean();
        if (hasGas){
            return true;
        }
        throw new OutOfGasException();
    }
}

class DeliverMessage{
    public static void main(String[] args){
        UnreliableFriend friend = new UnreliableFriend();
        try{
            friend.deliverMessage();
            System.out.println("The message was delivered!");
        } catch (OutOfGasException e){
            System.out.println("Hey, uh, so, I ran out of gas...");
            //back-up plan here.
        }
    }
}