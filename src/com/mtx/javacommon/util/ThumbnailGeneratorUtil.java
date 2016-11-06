package com.mtx.javacommon.util;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * 其中有一些java.awt包中的内容，只适合java环境，不适合Android环境
 * 生成缩略图类
 */
public class ThumbnailGeneratorUtil {
    private ThumbnailGeneratorUtil() {
    }

    /**
     * @param originalFile  原图片路径
     * @param thumbnailFile 生成缩略图路径
     * @param thumbWidth    生成缩略图宽度最大尺寸
     * @param thumbHeight   生成缩略图高度最大尺寸
     * @throws Exception
     */
    public static void transform(String originalFile, String thumbnailFile, int thumbWidth, int thumbHeight) throws Exception {
        Image image = javax.imageio.ImageIO.read(new File(originalFile));

        double thumbRatio = (double) thumbWidth / (double) thumbHeight;
        int imageWidth = image.getWidth(null);
        int imageHeight = image.getHeight(null);
        double imageRatio = (double) imageWidth / (double) imageHeight;
        if (thumbRatio < imageRatio) {
            thumbHeight = (int) (thumbWidth / imageRatio);
        } else {
            thumbWidth = (int) (thumbHeight * imageRatio);
        }

        if (imageWidth < thumbWidth && imageHeight < thumbHeight) {
            thumbWidth = imageWidth;
            thumbHeight = imageHeight;
        } else if (imageWidth < thumbWidth)
            thumbWidth = imageWidth;
        else if (imageHeight < thumbHeight)
            thumbHeight = imageHeight;

        BufferedImage thumbImage = new BufferedImage(thumbWidth, thumbHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = thumbImage.createGraphics();
        graphics2D.setBackground(Color.WHITE);
        graphics2D.setPaint(Color.WHITE);
        graphics2D.fillRect(0, 0, thumbWidth, thumbHeight);
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage(image, 0, 0, thumbWidth, thumbHeight, null);

        javax.imageio.ImageIO.write(thumbImage, "JPG", new File(thumbnailFile));
    }
}
