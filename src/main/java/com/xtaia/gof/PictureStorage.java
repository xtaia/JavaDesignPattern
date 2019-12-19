package com.xtaia.gof;

public class PictureStorage implements IPictureStorage {

    @java.lang.Override
    public void savePicture(Picture picture) {
        int i = 11;
        System.out.println("我们的测试" + i);
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
