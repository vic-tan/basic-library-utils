
    
  basic-library-utils 项目简介
  ---
  
  Android Common Utils or Helper.
   
  ##使用方法
  
  build.gradle文件中添加:
  
      dependencies {
          ...
          compile 'com.vic-tan:basic-library-utils:1.0.0'
      }
  
  ##详细介绍
  
  basic-library-utils是一系列通用类、辅助类、工具类的集合，有以下特点：
  - **1. 通用性强**：只有常用、通用才集入。
  - **2. 纯  纯  纯**：类间独立，单挑大梁，极少耦合，就是单纯！
  
  其中包括bitmap处理，文件操作，加密存储器，计数器，吐司，日志，校验，提示，等基础功能，以及一些Base64、MD5、等工具类。
  

   1. io包：文件与IO
  -----
  - **ByteArrayOutputStream**：         byte 数组流类
  - **ClosedInputStream**：    关闭流工具类
  - **StringBuilderWriter**：        通用文件操作工具类
  - **Charsets**：          文件编码操作工具类
  - **FilenameUtils**：文件重命名工具类
  - **FileUtils**：         文件流操作辅助类
  - **IOUtils**：         IO流操作辅助类
  - **StringCodingUtils**：         IO流操作辅助类
  -
  
  
  2. coder：加/解密和编码
  -----
  - **Base64Coder**：    base64编码/解码
  - **FileCoder**：      文件头部加密。
  - **MD5Coder**：        md5编码工具。
  - **AESCoder**：        对称加密算法。
  - **DES3Coder**：       对称加密算法 ,提供加密，解密，生成密钥对等方法。
  - **DESCoder**：        对称加密算法 ,提供加密，解密，生成密钥对等方法。
  - **HexCoder**：        16进制编码。
  - **RSACoder**：        非对称加密算法,RSA 工具类。提供加密，解密，生成密钥对等方法。
  -
  

  3. utils包：常用工具类
  -----
  - **ActivityManager**：     Activity堆栈管理类,完全退出App
  - **AppCacheUtils**：         数据缓冲/配置信息存储工具类 多进程访问
  - **AppUtils**：      应用安装,版本号等工具类
  - **BitmapUtils**：      位图操作， 拍照，裁剪，圆角，byte、string互转，压缩，放缩，保存等
  - **ArrayUtils**：        数组工具类
  - **CornerUtils**：       列表圆角工具等
  - **CountDownTimer**：      定时器 ,解决系统的CountDownTimer cancel失效问题
  - **DateFormatUtils**：       String 时间格式化工具类等
  - **DateUtils**：        日期工具类
  - **InflaterUtils**：         InflaterView 工具
  - **InputMethodManagerUtils**：         键盘工具类
  - **ListUtils**：List 判断空,排序,合并等
  - **Logger**：      日志输出工具
  - **MapUtils**：     map 判断空,排序,合并等
  - **NetUtils**：      网络判断等
  - **ObjectUtils**：       map 判断空,排序,合并等
  - **StartActUtils**：   电话工具类，手机号、运营商、IMEI、IMSI等信息
  - **StorageUtils**：     缓冲目录工具类
  - **StringUtils**：     String 判断空,排序,合并等
  - **ToastUtils**：     自定义Toast 显示view
  - **ViewFindUtils**：     findById 快捷工具类
 
  

  ####BitmapUtils 
  * drawable bitmap互转
  * 获取图片在相册中的方向
  * Bitmap比例缩放
  * 圆形Bitmap
  * Bitmap缩略图
  * Bitmap保存到指定路径
  * ...
  
  
  ####StringUtils
  * 字符串空判断
  * 获取字符串长度
  * 字符串UTF8编码
  * 字符串HTML转换
  * 数据库字符转义
  * ...
  

  
  ####ActivityManager
  * Activity堆栈
  * finish指定Activity
  * finish所有Activity
  * 获取堆某个Activity
  * 退出App
  
  ```java
  //在BaseActivity中添加
  //onCreate
  ActivityManager.getActivityManager().addActivity(this);
  //onDestory
  ActivityManager.getActivityManager().finishActivity(this);
  
  //finish所有页面
  ActivityManager.getActivityManager().finishAllActivity(this);
  //finish所有页面和kill app
  ActivityManager.getActivityManager().appExit(this);
  ```
  
  ####AppCacheUtils
  * 数据缓冲/配置信息存储工具类
  * 多进程访问
  * ...
  
  ```java
  //存储
  AppCacheUtils.getInstance(context).put(key, int);
  AppCacheUtils.getInstance(context).put(key, String);
  AppCacheUtils.getInstance(context).put(key, char);
  AppCacheUtils.getInstance(context).put(key, float);
  AppCacheUtils.getInstance(context).put(key, double);
  AppCacheUtils.getInstance(context).put(key, boolean);
  AppCacheUtils.getInstance(context).put(key, byte[]);
  AppCacheUtils.getInstance(context).put(key, JSONObject);
  AppCacheUtils.getInstance(context).put(key, Serializable);
  ...
  ```
  ```java
  //获取
  AppCacheUtils.getInstance(context).getInt(key, intDefault);
  AppCacheUtils.getInstance(context).getString(key, stringDefault);
  AppCacheUtils.getInstance(context).getChar(key, charDefault);
  AppCacheUtils.getInstance(context).getFloat(key, floatDefault);
  AppCacheUtils.getInstance(context).getDouble(key, doubleDefault);
  AppCacheUtils.getInstance(context).getBoolean(key, booleanDefault);
  AppCacheUtils.getInstance(context).getJSONObject(key);
  AppCacheUtils.getInstance(context).getObject(key);
  ...
  ```
  ```java
  //清除所有缓冲
  AppCacheUtils.get(context).clear();
  //移除某个缓存
  AppCacheUtils.get(context).remove(key);
  ``` 
  
  ####DateUtils
  * 根据String构建一个Date
  * 指定format构建
  * 根据Date格式化
  * 获取Date 年、月、日、时、分、秒、毫秒
  * 获取一个月最后一天
  * 获取一个月第一天
  * 根据Date获取星期
  * 时间友好显示
  * ...
  
  ####DeviceUtils
  * 判断是否有内存卡
  * 获取本机IP
  * 多个内存卡时获取外置内存卡
  * 获取内存卡总大小、使用大小和剩余多少
  * 判断网络是否可以用
  * 判断某个服务是否在运行
  * 判断某个进程是否在运行
  * 获取IMEI、IMSI、MAC、UUID
  * 执行震动
  * 获取相机最后一次拍照的图片
  * 获取屏幕大小
  * copy到剪切板
  * 获取所有应用程序
  * 判断某个app是否安装了
  * dp px转换
  * 获取system bar高度
  * 获取navigation bar高度
  * 输入法隐藏和显示
  * 启动某个应用下的Activity
  * 返回Home
  * 获取网络类型
  * 拨打电话
  * 发送短信
  * ...
  
  ####FileUtils
  * 读取某个文件内容
  * 将某个文本写入到指定文件
  * 文件移动
  * 文件拷贝
  * 获取文件扩展名
  * 获取URL扩展名
  * 获取文件名
  * 获取文件大小
  * 创建文件夹以及父文件夹
  * ...
  
  ```java
   FileUtils.readFile(String, String)//read file
   FileUtils.readFileToList(String, String)// read file to string list
   FileUtils.writeFile(String, String, boolean)// write file from String
   FileUtils.writeFile(String, String)// write file from String
   FileUtils.writeFile(String, List, boolean)// write file from String List
   FileUtils.writeFile(String, List)// write file from String List
   FileUtils.writeFile(String, InputStream)// write file
   FileUtils.writeFile(String, InputStream, boolean)// write file
   FileUtils.writeFile(File, InputStream)// write file
   FileUtils.writeFile(File, InputStream, boolean)// write file
  
   FileUtils.moveFile(File, File)// or FileUtils.moveFile(String, String)
   FileUtils.copyFile(String, String)
   FileUtils.getFileExtension(String)
   FileUtils.getFileName(String)
   FileUtils.getFileNameWithoutExtension(String)
   FileUtils.getFileSize(String)
   FileUtils.deleteFile(String)
   FileUtils.isFileExist(String)
   FileUtils.isFolderExist(String)
   FileUtils.makeFolders(String)
   FileUtils.makeDirs(String)
  ```
  
  ####StorageUtils
  * 缓冲目录工具类
  
  ```java
  File cacheDir = StorageUtils.getCacheDirectory(context);///Android/data/packageName/cache
  ....
  ```
  
  ####ExternalStorage
  * 如果一个手机中有多个sdcard卡可以用到此工具
  
  ```java
  Map<String, File> storageMap = ExternalStorage.getAllStorageLocations();
  ```
  
  ####ManifestUtils
  * 获取app版本号
  * 获取Meta Data数据
  * 获取app版本名称
  * 获取app渠道名
  
  ```java
  ManifestUtils.getMetaData(context, metaKey);
  ManifestUtils.getChannelNo(context, channelKey);
  ManifestUtils.getVersionName(context);
  ManifestUtils.getVersionCode(context);
  ```
  


  
  ####定时器
  解决系统的CountDownTimer cancel失效问题
  
  ```java
      new CountdownTimer(30000, 1000) {
           public void onTick(long millisUntilFinished) {
              mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
           }
           public void onFinish() {
              mTextField.setText("done!");
           }
       }.start();
  ```
  

  ---
  ###加/解密和编码
  ####MD5Coder
  * md5编码工具
  
  ```java
  String result = MD5Coder.getMD5Code(source);
  ```
  
  ####Base64Coder
  * base64编码/解码
  
  ```java
  //解码
  byte[] srcBytes = Base64Coder.decode(byte[] decodeBytes, flag)
  byte[] srcBytes = Base64Coder.decode(String decodeString, flag)
  byte[] srcBytes = Base64Coder.decode(byte[] decodeBytes, int offset, int len, int flags)
  ...
  //编码
  byte[] decodeBytes = Base64Coder.encode(byte[] src, flag)
  byte[] decodeBytes = Base64Coder.encode(String src, flag)
  String decodeString = Base64Coder.encodeToString(byte[] src, flag)
  byte[] decodeBytes = Base64Coder.encode(byte[] src, int offset, int len, int flags)
  ...
  ```
  
  ###AESCoder
  * 对称加密算法
  
  ```java
  //加密
  String password = "password";
  String message = "hello world"; 
  try {
      String encryptedMsg = AESCoder.encrypt(password, message);
  }catch (GeneralSecurityException e){
    //handle error
  }
  
  //解密
  String password = "password";
  String encryptedMsg = "2B22cS3UC5s35WBihLBo8w==";
  try {
      String messageAfterDecrypt = AESCoder.decrypt(password, encryptedMsg);
  }catch (GeneralSecurityException e){
   //handle error - could be due to incorrect password or tampered encryptedMsg
  }
  ```
  
  ####DESCoder
  * 对称加密算法
  
  ```java
  //加密
  byte[] encrypt = DESCoder.encrypt("Hello World".getBytes(), "password");
  Logger.d("encrypt=" + HexCoder.encodeHexString(encrypt));
  //解密
  byte[] decrypt = DESCoder.decrypt(encrypt, "password");
  Logger.d("decrypt=" + new String(decrypt));
  ```
  
  ####DES3Coder
  * 对称加密算法
  
  ```java
  //加密
  byte[] encrypt = DES3Coder.encryptMode("Hello World".getBytes(), "password");
  Logger.d("encrypt=" + HexCoder.encodeHexString(encrypt));
  //解密
  byte[] decrypt = DES3Coder.decryptMode(encrypt, "password");
  Logger.d("decrypt=" + new String(decrypt));
  ```
  ####HexCoder
  * 16进制编码
  
  ```java
  //byte[]转16进制
  char[] encodeHex(byte[] data)
  //byte[]转16进制（大写）
  char[] encodeHex(byte[] data, boolean toLowerCase)
  //byte[]转16进制字符输出
  String encodeHexString(byte[] data)
  ....
  ```
      
 
  
  ####RSACoder
  * 非对称加密算法
  * RSA 工具类。提供加密，解密，生成密钥对等方法。
  
  ```java
  //生成密钥对
  KeyPair key = RSACoder.generateKeyPair()
  //生成公钥
  RSAPublicKey key = RSACoder.generateRSAPublicKey(byte[] modulus, byte[] publicExponent)
  //生成私钥
  RSAPrivateKey key = RSACoder.generateRSAPrivateKey(byte[] modulus, byte[] privateExponent)
  //加密
  byte[] result = RSACoder.encrypt(Key key, byte[] data,PADDING padding)
  //公钥加密
  byte[] result = RSACoder.encryptByPublicKey(byte[] publicKey, byte[] data,PADDING padding)
  //私钥加密
  byte[] result = RSACoder.encryptByPrivateKey(byte[] publicKey, byte[] privateKey, byte[] data,PADDING padding)
  //解密
  byte[] result = RSACoder.decrypt(Key key, byte[] data,PADDING padding)
  //公钥解密
  byte[] result = RSACoder.decryptByPublicKey(byte[] publicKey, byte[] data,PADDING padding)
  //私钥解密
  byte[] result = RSACoder.decryptByPrivateKey(byte[] publicKey, byte[] privateKey, byte[] data,PADDING padding)
  ```
  ---


#权限
大家根据自己使用了哪些工具，分别添加相关权限即可

```xml
	<!--在SDCard中创建与删除文件权限-->
    <uses-permission android:name="android.permission.MOUNT_UNMOUNT_FILESYSTEMS"/>
    <!--往SDCard写入数据权限-->
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
    <!--从SDCard读取数据权限-->
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
    <!--读取设备信息权限-->
    <uses-permission android:name="android.permission.READ_PHONE_STATE" />
    <!--获取WIFI权限-->
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
    <!--获取手机任务信息（进程,app列表）-->
    <uses-permission android:name="android.permission.GET_TASKS"/>
    <!--检查是否wifi网络 (CrashHanler保存日志信息用到)-->
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
```

