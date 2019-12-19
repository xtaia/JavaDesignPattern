package com.xtaia.gof;

public class PictureStorage implements IPictureStorage {

    @java.lang.Override
    public void savePicture(Picture picture) {
        System.out.println("我们的测试");
    }

    @java.lang.Override
    public Image getPicture(String pictureId) {
        return null;
    }

    @java.lang.Override
    public void deletePicture(String pictureId) {

    }

    @java.lang.Override
    public void modifyMetaInfo(String pictureId, PictureMetaInfo metaInfo) {

    }
}
