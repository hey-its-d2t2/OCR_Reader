package com.OCR.Reader.util;

import com.OCR.Reader.constants.AppConstants;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;
import java.io.IOException;

@Slf4j
public class OCRProcessor {
    public String extractTextFromImage(File imageFile) {

        // Change the DPI of the image
        File highDPIImage = null;
        try {
            highDPIImage = ImageDPIUtil.changeDPI(imageFile, 300); // Set DPI to 300
        } catch (IOException e) {
            log.error("Failed to change DPI: {}", e.getMessage(), e);
            return null;
        }

        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath(AppConstants.PATH); //path_to_tessdata_folder
        tesseract.setLanguage(AppConstants.LANGUAGE);  // Support both Hindi and English

        File convertedImageFile = ConvertFileFormat.convertToCommonFormat(highDPIImage);

        if (convertedImageFile == null) {
            log.error("Failed to convert the image to a common format.");
            return null; // or return an empty string
        }

        if (!imageFile.exists()) {
            log.error("The image file does not exist: {}", imageFile.getAbsolutePath());
            return null; // or return an empty string
        }

        /*File trainedDataFile = new File(AppConstants.PATH, "hin.traineddata");
        if (!trainedDataFile.exists()) {
            log.error("The trained data file does not exist: {}", trainedDataFile.getAbsolutePath());
            return null; // or return an empty string
        }*/

        try {
            return tesseract.doOCR(convertedImageFile);
        } catch (TesseractException e) {
            log.error("TesseractException: {}", e.getMessage(), e);
        } catch (RuntimeException e) {
            log.error("RuntimeException: {}", e.getMessage(), e);
        }

        return null;
    }
}
