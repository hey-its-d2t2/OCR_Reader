package com.OCR.Reader.util;

import lombok.extern.slf4j.Slf4j;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@Slf4j
public class ConvertFileFormat {
    public static File convertToCommonFormat(File imageFile) {
        try {
            // Read the original image
            BufferedImage originalImage = ImageIO.read(imageFile);
            if (originalImage == null) {
                log.error("Failed to read the image file: {}", imageFile.getAbsolutePath());
                return null;
            }

            // Create a new file with the same name but with .png extension
            File convertedFile = new File(imageFile.getParent(),
                    imageFile.getName().substring(0, imageFile.getName().lastIndexOf('.')) + ".png");

            // Write the image as a PNG file
            ImageIO.write(originalImage, "png", convertedFile);
            return convertedFile; // Return the path of the converted image file
        } catch (IOException e) {
            log.error("IOException during image conversion: {}", e.getMessage(), e);
            return null;
        }
    }
}
