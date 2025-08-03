package org.SOLIDprinciples.LiskovSubstitutionPrinciple.LSP;

public class Whatsapp extends SocialMedia{
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPOst(Object post) {
//Not applicable
    }

    @Override
    public void sendPhotoAndVideo() {

    }

    @Override
    public void groupVideoCall(String... users) {

    }
}
