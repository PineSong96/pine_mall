package com.mall.common.util;

import com.drew.imaging.ImageMetadataReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;

import java.io.File;

/**
 * @vlog: My code, I understand
 * @desc: 读取照片信息
 * @author: pine
 * @createDate: 2020/8/31
 * @version: 1.0
 */
public class SampleUsageUtil {


    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Administrator\\Pictures\\2.jpg");
        printImageTags(file);
    }

    /**
     * 读取照片里面的信息
     */
    private static void printImageTags(File file) throws Exception {
        Metadata metadata = ImageMetadataReader.readMetadata(file);
        for (Directory directory : metadata.getDirectories()) {
            for (Tag tag : directory.getTags()) {
                String tagName = tag.getTagName();  //标签名
                String desc = tag.getDescription(); //标签信息
                if (tagName.equals("Image Height")) {
                    System.out.println("图片高度: " + desc);
                } else if (tagName.equals("Image Width")) {
                    System.out.println("图片宽度: " + desc);
                } else if (tagName.equals("Date/Time Original")) {
                    System.out.println("拍摄时间: " + desc);
                } else if (tagName.equals("GPS Latitude")) {
                    System.err.println("纬度 : " + desc);
//                    System.err.println("纬度(度分秒格式) : "+pointToLatlong(desc));
                } else if (tagName.equals("GPS Longitude")) {
                    System.err.println("经度: " + desc);
//                    System.err.println("经度(度分秒格式): "+pointToLatlong(desc));
                }
            }

        }
    }

    /**
     * 经纬度格式  转换为  度分秒格式 ,如果需要的话可以调用该方法进行转换
     *
     * @param point 坐标点
     * @return
     */
    public static String pointToLatlong(String point) {
        Double du = Double.parseDouble(point.substring(0, point.indexOf("°")).trim());
        Double fen = Double.parseDouble(point.substring(point.indexOf("°") + 1, point.indexOf("'")).trim());
        Double miao = Double.parseDouble(point.substring(point.indexOf("'") + 1, point.indexOf("\"")).trim());
        Double duStr = du + fen / 60 + miao / 60 / 60;
        return duStr.toString();
    }
}
