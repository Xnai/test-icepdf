package com.local.testicepdf;

import org.icepdf.core.pobjects.Document;
import org.icepdf.core.util.GraphicsRenderingHints;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

public class Test {

    @org.junit.Test
    public void test1() {
        try {
            String filePath = "C:/Users/Administrator/Desktop/test1.pdf";
            System.out.println("获取路径");
            Document document = new Document();
            document.setFile(filePath);
            float scale = 2.5f;//缩放比例
            float rotation = 0f;//旋转角度

            for (int i = 0; i < document.getNumberOfPages(); i++) {
                System.out.println("进入循环");
                BufferedImage image = (BufferedImage)
                        document.getPageImage(i, GraphicsRenderingHints.SCREEN, org.icepdf.core.pobjects.Page.BOUNDARY_CROPBOX, rotation, scale);
                RenderedImage rendImage = image;
                try {
                    File file = new File("C:/Users/Administrator/Desktop/test_" + i + ".png");
                    ImageIO.write(rendImage, "png", file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                image.flush();
            }
            document.dispose();
            System.out.println("绘制结束");
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
