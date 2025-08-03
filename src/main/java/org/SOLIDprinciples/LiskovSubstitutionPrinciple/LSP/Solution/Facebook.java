package org.SOLIDprinciples.LiskovSubstitutionPrinciple.LSP.Solution;

public class Facebook implements SocialMedia,PostMediaManager{
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
    //implementation require
    }
}
