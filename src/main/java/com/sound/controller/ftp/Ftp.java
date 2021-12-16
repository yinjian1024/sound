package com.sound.controller.ftp;

import com.util.FTPUtil;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.apache.tomcat.util.http.fileupload.util.Streams;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@RestController
@RequestMapping("/file")
public class Ftp {

    //在文件操作中，不用/或者\最好，推荐使用File.separator
    private final static String  fileDir="files";
    private  final static String rootPath = System.getProperty("user.home")+File.separator+fileDir+File.separator;
    
    @RequestMapping("/upload")
    public Object uploadFile(@RequestParam("file") MultipartFile[] multipartFiles, final HttpServletResponse response, final HttpServletRequest request){
        File fileDir = new File(rootPath);
        if (!fileDir.exists() && !fileDir.isDirectory()) {
            fileDir.mkdirs();
        }
        try {
            if (multipartFiles != null && multipartFiles.length > 0) {
                for(int i = 0;i<multipartFiles.length;i++){

                    new FTPUtil().uploadFile(multipartFiles[i]);

//                    try {
//                        //以原来的名称命名,覆盖掉旧的
//                        String storagePath = rootPath+multipartFiles[i].getOriginalFilename();
//                        System.out.println("上传的文件：" + multipartFiles[i].getName() + "," + multipartFiles[i].getContentType() + "," + multipartFiles[i].getOriginalFilename()
//                                +"，保存的路径为：" + storagePath);
//                        Streams.copy(multipartFiles[i].getInputStream(), new FileOutputStream(storagePath), true);
//                        //或者下面的
//                        // Path path = Paths.get(storagePath);
//                        //Files.write(path,multipartFiles[i].getBytes());
//                    } catch (IOException e) {
//                        System.out.println(e.getMessage());
//                    }
                }
            }

        } catch (Exception e) {
            return ResultUtil.error(e.getMessage());
        }
        return ResultUtil.success("上传成功!");
    }


    @RequestMapping("/download")
    public Object downloadFile(@RequestParam String fileName, final HttpServletResponse response, final HttpServletRequest request){
        OutputStream os = null;
        InputStream is= null;
        try {
            // 取得输出流
            os = response.getOutputStream();
            // 清空输出流
            response.reset();
            response.setContentType("application/x-download;charset=GBK");
            response.setHeader("Content-Disposition", "attachment;filename="+ new String(fileName.getBytes("utf-8"), "iso-8859-1"));
            //读取流
            File f = new File(rootPath+fileName);
            is = new FileInputStream(f);
            if (is == null) {
                System.out.println("下载附件失败，请检查文件“" + fileName + "”是否存在");
                return ResultUtil.error("下载附件失败，请检查文件“" + fileName + "”是否存在");
            }
            //复制
            IOUtils.copy(is, response.getOutputStream());
            response.getOutputStream().flush();
        } catch (IOException e) {
            return ResultUtil.error("下载附件失败,error:"+e.getMessage());
        }
        //文件的关闭放在finally中
        finally
        {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }



//    /**
//     * 文件上传
//     * @param uploadFile
//     * @param request
//     */
//    @RequestMapping("/uploadFile")
//    public void upload(@RequestParam("file") MultipartFile uploadFile, HttpServletRequest request) {
//
//    }
//
//    /**
//     * 文件下载
//     * @param fileName
//     * @param request
//     * @param response
//     */
//    @RequestMapping(value = "/downloadFile")
//    public void downloadConfigFile(@RequestParam("fileName") String fileName, HttpServletRequest request, HttpServletResponse response) {
//    }
}
