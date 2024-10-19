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

### Sample Inputs and Outputs
- Input 1: Image Upload (OCR)
  - Uploaded Image: Image with text such as a scanned document.
  - Extracted Text: The text extracted from the uploaded image will appear in the text area.
- Input 2: Search Keyword
  - Keyword: "Invoice"
  - Search Result: Found || Not Found
### Screenshots
1. Home Page
 
   ![OCR and Document Search - localhost](https://github.com/user-attachments/assets/b038aee9-ec7d-48b7-9e1c-9410547c8abf)

2. Upload Image and Extract Text, Extracted Text Display

 - Hindi
   ![FireShot Capture 036 - OCR and Document Search - localhost](https://github.com/user-attachments/assets/9b3004ce-5a54-49c4-9cc6-e395fa59edbf)

 - English
 
 ![FireShot Capture 037 - OCR and Document Search - localhost](https://github.com/user-attachments/assets/ab8103d7-1aa6-4f2e-a0e3-ca1c3c5ad1e0)

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

3. Set the TESSDATA_PREFIX Environment Variable
 
 Ensure you set the TESSDATA_PREFIX to the directory containing the tessdata folder. Here’s how you can do it:

 1. Windows Command Prompt:
  ```
   set TESSDATA_PREFIX=D:\path\to\tessdata\
  ```
2. Linux/Mac Terminal:
  ```
  export TESSDATA_PREFIX=/path/to/tessdata/
  ```
3. List Available Languages
 
  - You can list the available languages supported by Tesseract using the following command in the terminal or command prompt:
  ```
   tesseract --list-langs
  ```
 - This will display the languages that are installed and recognized by Tesseract.

3.1  To set the TESSDATA_PREFIX environment variable on Windows, you can follow these steps:

Setting `TESSDATA_PREFIX` in Windows

- Open System Properties:
  - Right-click on the This PC or My Computer icon on your desktop or in File Explorer.
  - Select Properties.
  - Click on Advanced system settings on the left side.
  - In the System Properties window, go to the Advanced tab.
  - Environment Variables:
    - Click on the Environment Variables button at the bottom of the window.
    - Create a New `System Variable`:
      - In the System variables section, click on New.
      - In the Variable name field, enter `TESSDATA_PREFIX`.
      - In the Variable value field, enter the path to your tessdata directory. For example:
       ```"C:\Program Files\Tess4J-3.4.8-src\Tess4J\tessdata"```
      - Click OK to save the new variable.
      - Close All Windows:

  - Click OK in the Environment Variables window and in the System Properties window to apply your changes.
- Verify the Variable:
- Open a new Command Prompt window and type:
  
   ```
   echo %TESSDATA_PREFIX%
   ```
   - This should display the path you set.
      
4. Backend Setup
   
a. Update path in `AppConstants.java` according to your path of `tessdata`
      Example: 
      
       public static final String PATH ="C:\\MyProj\\ORC-Reader\\Tess4J-3.4.8-src\\Tess4J\\tessdata"; //path_to_tessdata_folder
b. Install Java dependencies
  Navigate to the project directory and run:
   ```
     mvn clean install   
  ```
c. Start the Spring Boot Application
 Run the application with:
   ``` 
     mvn spring-boot:run
   ```
d. Access the application by navigating to `http://localhost:8080 `in your web browser.

### Use Cases
1. Upload Image and Extract Text
 Users can upload an image, and the OCR system will extract text from the image and display it in a text area.
2. Keyword Search in Extracted Text
 After the text is extracted, users can search for specific keywords in the extracted text. The matching words will be highlighted in the search results section.
3. Copy Extracted Text
 Users can click the “Copy” button to copy the entire extracted text to their clipboard for further use.
### API Endpoints
- Image Upload and OCR Extraction
   - Method: `POST`
   - Endpoint: `/api/ocr/upload`
   - Request Body: Image file
   - Response: Extracted text in JSON format.
- Search in Extracted Text
   - Method: `POST`
   - Endpoint: `/api/ocr/search`
   - Request Body: keyword (string) and extractedText (string)
   - Response: Search results (text)

 
