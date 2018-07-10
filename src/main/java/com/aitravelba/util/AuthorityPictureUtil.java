package com.aitravelba.util;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("authorityPictureUtil")
public class AuthorityPictureUtil {    
	// 默认格式  
    private static final String FORMAT_NAME = "PNG";  
    // 默认 宽度  
    private static final int WIDTH = 720;  
    // 默认 高度  
    private static final int HEIGHT = 1280;  
    private static final String AUTHORITY_PICTURE = "/opt/server/OneCollection/template/authority.png";
    //private static final String AUTHORITY_PICTURE = "d://test/authority.png";
    private static Logger logger = LoggerFactory.getLogger(AuthorityPictureUtil.class);
    
	public String generateAuthorityPicture()throws Exception {
	    String cont = "";
	    cont += "7月6日简报微刊，星期五！";
		return getImage(null, null, null, null);
	}
	/**
	 * @desc 生成委托函
	 * @param font 字体
	 * @param width 宽度
	 * @param height 高度
	 * @return 
	 * @Author swiftwen
	 * @2018年3月14日 下午2:57:29
	 */
   private BufferedImage createImage(String cont,Font font,Integer width,Integer height){
          BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
          Graphics2D g2 = (Graphics2D)bi.getGraphics();
          g2.setBackground(Color.WHITE);
          g2.clearRect(0, 0, width, height);
          g2.setPaint(Color.BLACK);
          g2.setFont(font);
          int y = 200;
          int x = 30;
          
          g2.drawString("授权委托书", 310, 150);
          g2.drawString("委托人（甲方）："+"鑫诚达资产管理（北京）有限公司 ", x, y);
          
        return bi;
   } 
   /**
    * @desc 图片覆盖
    * @param baseBufferedImage
    * @param coverBufferedImage
    * @param x
    * @param y
    * @param width
    * @param height
    * @return
    * @throws Exception 
    * @Author swiftwen
    * @2018年3月14日 下午2:57:17
    */
   public BufferedImage coverImage(BufferedImage baseBufferedImage, BufferedImage coverBufferedImage, int x, int y, int width, int height) throws Exception{
       // 创建Graphics2D对象，用在底图对象上绘图
       Graphics2D g2d = baseBufferedImage.createGraphics();
       // 绘制
       g2d.drawImage(coverBufferedImage, x, y, 300, 300, null);
       g2d.dispose();// 释放图形上下文使用的系统资源
        
       return baseBufferedImage;
   }
   /**
    * @desc 获取委托函图片
    * @param font
    * @param width
    * @param height
    * @param destPath
    * @throws IOException 
    * @Author swiftwen
    * @2018年3月14日 下午2:56:50
    */
   public String getImage(String cont,Font font ,Integer width,Integer height) throws IOException{  
       String fileName = UUID.randomUUID().toString()+".png";  
       width=width==null?WIDTH:width;  
       height=height==null?HEIGHT:height; 
       logger.debug("width:"+width+",height:"+height);
       if(null == font) {
    	   font = new Font("宋体", Font.BOLD, 26); 
       }
       BufferedImage bi = createImage(cont,font, width, height);
       ByteArrayOutputStream os=new ByteArrayOutputStream();
       ImageIO.write(bi, "png", os);
      
       byte[] data= os.toByteArray();
       FileOutputStream fos = new FileOutputStream(new File("d://1.png"));
       fos.write(data);
       /*try {
    	   QiniuUtil.upload(data, fileName,namespaceTemplateFiles);
       }catch(Exception e) {
    	   logger.error("upload entrust file to QiNiu error",e);
       }*/
       return "";
   } 
   /**
    * @desc 创建目录
    * @param destPath 
    * @Author swiftwen
    * @2018年3月14日 下午2:56:40
    */
   public void mkdirs(String destPath) {  
        File file =new File(destPath);     
        //当文件夹不存在时，mkdirs会自动创建多层目录，区别于mkdir．(mkdir如果父目录不存在则会抛出异常)  
        if (!file.exists() && !file.isDirectory()) {  
            file.mkdirs();  
        }  
    }  
   
    public static void main(String[] args)throws Exception {
    	 String url = new AuthorityPictureUtil().generateAuthorityPicture();
    	 System.out.println(url);
	}
    
}