package org.SOLIDprinciples.LiskovSubstitutionPrinciple.LSP;

public class Instagram extends SocialMedia{
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPOst(Object post) {

    }

    @Override
    public void sendPhotoAndVideo() {

    }

    @Override
    public void groupVideoCall(String... users) {
//not applicable for Instagram
    }
}
