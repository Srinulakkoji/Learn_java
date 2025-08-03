package org.SOLIDprinciples.LiskovSubstitutionPrinciple.LSP.Solution;

public class Instagram implements PostMediaManager,SocialMedia{
    @Override
    public void sendPhotoAndVideo() {
        //implementation required
    }

    @Override
    public void chatWithFriend() {
    //implementation required
    }

    @Override
    public void publishPOst(Object post) {
    //implementation required
    }
}
