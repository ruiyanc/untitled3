package com.rui.web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author Administrator
 */
public class UploadAction extends ActionSupport {
    private File myFile;
    private String myFileContentType;
    private String myFileFileName;

    @Override
    public String execute()
    {
        /* Copy file to a safe location */
        String destPath = "D:\\apache-tomcat-9.0.19\\work";

        try{
            System.out.println("Src File name: " + myFile);
            System.out.println("Dst File name: " + myFileFileName);

            File destFile  = new File(destPath, myFileFileName);
            FileUtils.copyFile(myFile, destFile);

        }catch(IOException e){
            e.printStackTrace();
            return ERROR;
        }

        return SUCCESS;
    }
    public File getMyFile() {
        return myFile;
    }
    public void setMyFile(File myFile) {
        this.myFile = myFile;
    }
    public String getMyFileContentType() {
        return myFileContentType;
    }
    public void setMyFileContentType(String myFileContentType) {
        this.myFileContentType = myFileContentType;
    }
    public String getMyFileFileName() {
        return myFileFileName;
    }
    public void setMyFileFileName(String myFileFileName) {
        this.myFileFileName = myFileFileName;
    }

}
