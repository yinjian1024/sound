package com.util;

import com.config.FtpProperties;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class FTPUtil {


    @Autowired
    @Qualifier("FtpProperties")
    private FtpProperties ftpProperties;

    /**
     * 文件上传
     * @param filePath
     * @param fileName
     * @param uploadFile
     * @return
     * @throws IOException
     */
    public Boolean uploadFile(MultipartFile uploadFile) throws IOException {
        //创建FTPClient对象（对于连接ftp服务器，以及上传和上传都必须要用到一个对象）
        FTPClient ftp = new FTPClient();
        try {
            //定义返回的状态码
            int reply;
            //连接ftp(当前项目所部署的服务器和ftp服务器之间可以相互通讯，表示连接成功)
            ftp.connect(ftpProperties.getHost(), ftpProperties.getPort());
            //输入账号和密码进行登录
            ftp.login(ftpProperties.getUsername(), ftpProperties.getPassword());
            //接受状态码(如果成功，返回230，如果失败返回503)
            reply = ftp.getReplyCode();
            //根据状态码检测ftp的连接，调用isPositiveCompletion(reply)-->如果连接成功返回true，否则返回false
            if (!FTPReply.isPositiveCompletion(reply)) {
                //说明连接失败，需要断开连接
                ftp.disconnect();
                return false;
            }
            //changWorkingDirectory(linux上的文件夹)：检测所传入的目录是否存在，如果存在返回true，否则返回false
            ftp.changeWorkingDirectory(ftpProperties.getBasePath());
            //把文件转换为二进制字符流的形式进行上传
            ftp.setFileType(FTP.BINARY_FILE_TYPE);


            String fileName = new String(uploadFile.getOriginalFilename().getBytes("gbk"), "iso-8859-1");
            FTPFile[] fs = ftp.listFiles(fileName);
            if (fs.length==0) {
                System.out.println("this file not exist ftp");
            }else if(fs.length==1){
                System.out.println("this file  exist ftp");
                ftp.deleteFile(fs[0].getName());
            }

            //这才是真正上传方法storeFile(filename,input),返回Boolean雷类型，上传成功返回true
            InputStream inputStream = uploadFile.getInputStream();
            if (!ftp.storeFile(fileName, inputStream)) {
                return false;
            }
            //关闭输入流
            inputStream.close();
            //退出ftp
            ftp.logout();
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException(e);
        } finally {
            if (ftp.isConnected()) {
                try {
                    // 20.断开ftp的连接
                    ftp.disconnect();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
        return true;
    }


    /**
     * 文件下载
     * @param fileName
     * @param response
     * @return
     * @throws IOException
     */
    public Boolean downloadFile(String fileName, HttpServletResponse response) throws IOException {
        //创建FTPClient对象（对于连接ftp服务器，以及上传和上传都必须要用到一个对象）
        FTPClient ftp = new FTPClient();
        try {
            //定义返回的状态码
            int reply;
            //连接ftp(当前项目所部署的服务器和ftp服务器之间可以相互通讯，表示连接成功)
            ftp.connect(ftpProperties.getHost(), ftpProperties.getPort());
            //输入账号和密码进行登录
            ftp.login(ftpProperties.getUsername(), ftpProperties.getPassword());
            //接受状态码(如果成功，返回230，如果失败返回503)
            reply = ftp.getReplyCode();
            //根据状态码检测ftp的连接，调用isPositiveCompletion(reply)-->如果连接成功返回true，否则返回false
            if (!FTPReply.isPositiveCompletion(reply)) {
                //说明连接失败，需要断开连接
                ftp.disconnect();
                return false;
            }
            //changWorkingDirectory(linux上的文件夹)：检测所传入的目录是否存在，如果存在返回true，否则返回false
            ftp.changeWorkingDirectory(ftpProperties.getBasePath());
            FTPFile[] ftpFiles = ftp.listFiles(new String(fileName.getBytes("gbk"), "iso-8859-1"));
            if (ftpFiles.length==1) {
                response.setHeader("Content-Disposition","attachment;fileName=" + ftpFiles[0].getName());
                OutputStream os = response.getOutputStream();
                ftp.retrieveFile(ftpFiles[0].getName(), os);
                os.flush();
                os.close();
            }
            //退出ftp
            ftp.logout();
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException(e);
        } finally {
            if (ftp.isConnected()) {
                try {
                    // 20.断开ftp的连接
                    ftp.disconnect();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
        return true;
    }
}
