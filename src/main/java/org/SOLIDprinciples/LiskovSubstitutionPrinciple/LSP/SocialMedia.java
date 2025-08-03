package org.SOLIDprinciples.LiskovSubstitutionPrinciple.LSP;

public abstract class SocialMedia {

    public abstract void chatWithFriend();

    public abstract void publishPOst(Object post);

    public abstract void sendPhotoAndVideo();

    public abstract void groupVideoCall(String ... users);
}
