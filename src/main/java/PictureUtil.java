public class PictureUtil {    
	/*// 默认格式  
    private static final String FORMAT_NAME = "JPG";  
    // 默认 宽度  
    private static final int WIDTH = 720;  
    // 默认 高度  
    private static final int HEIGHT = 1280;  
    
    private static final String AUTHORITY_PICTURE = "d://test/authority.png";
	*//** 
     * 创建图片 
     * @param content 内容 
     * @param font  字体 
     * @param width 宽 
     * @param height 高 
     * @return 
     *//*  
   private static BufferedImage createImage(Font font,Integer width,Integer height){
          BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
          Graphics2D g2 = (Graphics2D)bi.getGraphics();
          g2.setBackground(Color.WHITE);
          g2.clearRect(0, 0, width, height);
          g2.setPaint(Color.BLACK);
          g2.setFont(font);
          //FontRenderContext context = g2.getFontRenderContext();
          //double x = (width - bounds.getWidth()) / 2;
          //double y = (height - bounds.getHeight()) / 2;
          int y = 200;
          int x = 80;
          
          g2.drawString("催款授权委托书", 300, 150);
          g2.drawString("委托人（甲方）：达飞云贷", x, y);
          g2.drawString("受托人（乙方）：文鹏，身份证号码： 430223199404123514", x, y+30);
          g2.drawString("委托事项及权限：", x, y+60);
          g2.drawString("经双方协商一致，甲方委托乙方依法向债务人黄成祖（身份证号：350524198106151558）", x, y+90);
          g2.drawString("催讨债权（包括但不限于本金、利息、违约金及罚金等），要求债务人及时还清款项，乙方", x, y+120);
          g2.drawString("同意接受上述委托。甲方承诺债权信息真实有效，甲方依法享有对债务人的合法债权。", x, y+150);
          g2.drawString("截止2017年-09月-02日，委托人向债务人享有的债权总额为人民币90287.5元。", x, y+180);
          g2.drawString("乙方的义务和责任：", x, y+210);
          g2.drawString("1、乙方应敦促债务人要求其及时偿还欠款，以维护委托人的合法权益；", x, y+240);
          g2.drawString("2、乙方应在法律及本授权书允许的范围内合法履行受托职务，若在催收过程中有任何", x, y+270);
          g2.drawString("违法行为的，其产生的法律后果由乙方自行承担；", x, y+300);
          g2.drawString("3、乙方在催收过程中严禁向债务人收取现金；", x, y+330);
          g2.drawString("4、未经委托人书面同意，乙方不得与债务人自行调解或和解，不得代为进行债务减免", x, y+360);
          g2.drawString("等其他一切损害委托人权益的行为；", x, y+390);
          g2.drawString("5、受托人应亲自完成本委托事务，未经委托人书面同意，受托人不得转委托。", x, y+420);
          g2.drawString("委托期间：自本授权委托函签发之日起至 2017年-09月-09日。若债务清收事项在上述", x, y+450);
          g2.drawString("期限内完成，则委托事项完成之日，本授权委托书自行失效。", x, y+480);
          g2.drawString("特此委托！", x, y+530);
          g2.drawString("委托人：达飞云贷", 480, y+560);
          g2.drawString("2017-09-02", 500, y+590);
          
          File coverFile = new File(AUTHORITY_PICTURE); //覆盖层
          BufferedImage coverImg = null;
		try {
			coverImg = ImageIO.read(coverFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
        try {
		    bi = coverImage(bi, coverImg, 380, y+430, 204, 204);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return bi;
   } 
   *//**
    * 图片覆盖（覆盖图压缩到width*height大小，覆盖到底图上）
    *
    * @param baseBufferedImage 底图
    * @param coverBufferedImage 覆盖图
    * @param x 起始x轴
    * @param y 起始y轴
    * @param width 覆盖宽度
    * @param height 覆盖长度度
    * @return
    * @throws Exception
    *//*
   public static BufferedImage coverImage(BufferedImage baseBufferedImage, BufferedImage coverBufferedImage, int x, int y, int width, int height) throws Exception{
        
       // 创建Graphics2D对象，用在底图对象上绘图
       Graphics2D g2d = baseBufferedImage.createGraphics();
       // 绘制
       g2d.drawImage(coverBufferedImage, x, y, 300, 300, null);
       g2d.dispose();// 释放图形上下文使用的系统资源
        
       return baseBufferedImage;
   }
   *//** 
    * 获取 图片  
    * @param content 内容 
    * @param font  字体 
    * @param width 宽 
    * @param height 高 
    * @return 
    *//*  
   public static BufferedImage getImage(Font font,Integer width,Integer height){  
      width=width==null?WIDTH:width;  
      height=height==null?HEIGHT:height;  
      if(null==font)  
          font = new Font("宋体", Font.PLAIN, 15);     
       return createImage(font, width, height);  
   }  
   *//** 
    * 获取 图片 
    * @param content 内容 
    * @param width 宽 
    * @param height 高 
    * @return 
    *//*  
   public static BufferedImage getImage(Integer width,Integer height){  

       return getImage(null,width, height);  
   }  
   *//** 
    *  获取图片 
    * @param content 内容 
    * @param font 字体 
    * @param width 宽 
    * @param height 高 
    * @param destPath 输出路径 
    * @throws IOException  
    *//*  
   public static void getImage(Font font ,Integer width,Integer height,String destPath) throws IOException{  
       mkdirs(destPath);  
       String file = UUID.randomUUID().toString()+".jpg";  
       ImageIO.write(getImage(font,width,height),FORMAT_NAME, new File(destPath+"/"+file));    
   } 
   *//** 
    * 获取图片 
    * @param content 内容 
    * @param width 宽 
    * @param height 高 
    * @param destPath 输出路径 
    * @throws IOException 
    *//*  
   public static void getImage(Integer width,Integer height,String destPath) throws IOException{  
      getImage(null, width, height, destPath);  
   }  
   *//** 
    * 创建 目录 
    * @param destPath 
    *//*  
   public static void mkdirs(String destPath) {  
        File file =new File(destPath);     
        //当文件夹不存在时，mkdirs会自动创建多层目录，区别于mkdir．(mkdir如果父目录不存在则会抛出异常)  
        if (!file.exists() && !file.isDirectory()) {  
            file.mkdirs();  
        }  
    }  
    public static void main(String[] args)throws Exception {
    	 getImage(720, 1280, "d:/test");  
	}*/
    
}