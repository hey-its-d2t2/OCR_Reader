package com.OCR.Reader.util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Graphics2D;

public class ImageDPIUtil {

    public static File changeDPI(File file, float dpi) throws IOException {
        return changeDPIForImage(file, dpi);
    }

    private static File changeDPIForImage(File imageFile, float dpi) throws IOException {
        BufferedImage image = ImageIO.read(imageFile);

        if (image == null) {
            throw new IOException("Failed to read image file.");
        }

        int width = image.getWidth();
        int height = image.getHeight();

        float scalingFactor = dpi / 72f;  // Assuming the image has an initial 72 DPI
        int newWidth = Math.round(width * scalingFactor);
        int newHeight = Math.round(height * scalingFactor);

        BufferedImage newImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = newImage.createGraphics();

        g2d.drawImage(image, 0, 0, newWidth, newHeight, null);
        g2d.dispose();  // Release the graphics context

        File outputFile = new File(imageFile.getParent(), "output_image_with_new_dpi.png");

        // Save the new image to the output file
        ImageIO.write(newImage, "png", outputFile);

        return outputFile;
    }
}
