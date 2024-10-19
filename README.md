# OCR and Document Search Web Application
The OCR and Document Search Web Application is designed to extract text from uploaded images using Optical Character Recognition (OCR) and provide a keyword-based search within the extracted text. This tool helps users quickly scan documents and search for specific information. This project leverages the Tesseract OCR engine to provide accurate text extraction capabilities, supporting multiple languages, including Hindi and English. The application is built to enhance image quality before processing, ensuring better recognition accuracy through DPI adjustments and format conversions.

### Features
- Upload images and extract text via OCR.
- Perform keyword-based search in the extracted text.
- Simple, user-friendly interface.
 -Copy extracted text to clipboard.
### Technologies Used
- Frontend: HTML, CSS (Bootstrap), JavaScript
- Backend: Java (Spring Boot), OCR Library (Tesseract)
- Libraries:
  - Tesseract for OCR.
  - Spring Boot for backend services.
  - Apache PDFBox for handling image files and adjusting DPI.
  - Lombok to reduce boilerplate code and improve readability.
  - SLF4J for logging purposes.
  - Thymeleaf for rendering frontend.
  - IntelliJ IDEA for Development enviroment.
### Prerequisites
Ensure you have the following installed:
- Java 8 or higher, this is built on Java 17 and Spring boot version 3.3.4
- Maven (for dependency management)
- Tesseract OCR (Install locally for OCR functionality)

### Setup Instructions

1. Clone the Repository

   ```
     git clone https://github.com/hey-its-d2t2/OCR_Reader.git
     cd OCR_Reader
   ```
2. Install Tesseract OCR
 - The first step is to download the Tess4J API from the link
    ```https://sourceforge.net/projects/tess4j/```
 - Extract the Files from the downloaded file 
 - Open your IDE and make a new project
 - Link the jar file with your project. Refer this link .
    ```https://www.edureka.co/community/4028/how-to-import-a-jar-file-in-eclipse```   
 - Please migrate via this path “..\Tess4J-3.4.8-src\Tess4J\dist”.
 ### OR
  - Read the Article from link
     ````https://www.geeksforgeeks.org/tesseract-ocr-with-java-with-examples/````
 ### OR
  - Simple extract the folder
  - Go to this path ```C:\Program Files\Tess4J-3.4.8-src\Tess4J\tessdata"``` || slected folder `tessdata` /path_to_tessdata_folder
  - select ```"C:\Program Files\Tess4J-3.4.8-src\Tess4J\tessdata"``` || path_to_tessdata_folder
  - 
 
